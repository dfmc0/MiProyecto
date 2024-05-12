import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class GestorEventos implements ActionListener {
    private SortedSet<Cancion> listaCanciones;
    private String formato;
    private JLabel cantidadLabel;

    public GestorEventos(JLabel cantidadLabel) {
        this.listaCanciones = new TreeSet<>(Comparator.comparing(Cancion::getTitulo));
        this.cantidadLabel = cantidadLabel;
        actualizarCantidadCanciones();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Fin.Enviar) {
            // Obtener los datos de la canción
            String nombre = Fin.textNom.getText();
            String autor = Fin.textautor.getText();
            formato = Fin.getFormatoSeleccionado();
            String genero = (String) Fin.generos.getSelectedItem();

            // Crear la canción y agregarla a la lista
            Cancion cancion = new Cancion(nombre, autor, formato, genero);
            listaCanciones.add(cancion);

            // Actualizar el JTextArea en el último panel
            actualizarListaCancionesEnFin();

            // Actualizar la cantidad de canciones
            actualizarCantidadCanciones();
        } else if (e.getSource() == Fin.Busca) {
            // Buscar la canción por el título ingresado
            String tituloABuscar = Fin.textoBuscar.getText();
            Cancion cancionEncontrada = buscarCancionPorTitulo(tituloABuscar);
            if (cancionEncontrada != null) {
                Fin.output.setText(cancionEncontrada.toString());
            } else {
                Fin.output.setText("Canción no encontrada");
            }

        } else if (e.getSource() == Fin.Eliminar) {
            // Eliminar la canción por el título ingresado
            String tituloAEliminar = Fin.textoBuscar.getText();
            boolean eliminada = eliminarCancionPorTitulo(tituloAEliminar);
            if (eliminada) {
                Fin.output.setText("Canción eliminada: " + tituloAEliminar);
            } else {
                Fin.output.setText("La canción '" + tituloAEliminar + "' no existe en la lista");
            }

            // Actualizar la cantidad de canciones
            actualizarCantidadCanciones();
        }
    }

    private Cancion buscarCancionPorTitulo(String titulo) {
        for (Cancion cancion : listaCanciones) {
            if (cancion.getTitulo().equals(titulo)) {
                return cancion;
            }
        }
        return null;
    }

    private boolean eliminarCancionPorTitulo(String titulo) {
        for (Cancion cancion : listaCanciones) {
            if (cancion.getTitulo().equals(titulo)) {
                listaCanciones.remove(cancion);
                return true;
            }
        }
        return false;
    }

    public void actualizarListaCancionesEnFin() {
        StringBuilder cancionesConcatenadas = new StringBuilder();
        for (Cancion c : listaCanciones) {
            cancionesConcatenadas.append("Titulo: ").append(c.getTitulo())
                    .append(", Autor: ").append(c.getAutor())
                    .append(", Formato: ").append(c.getFormato())
                    .append(", Genero: ").append(c.getGenero())
                    .append("\n");
        }
        Fin.outputFin.setText(cancionesConcatenadas.toString());
    }

    public void actualizarCantidadCanciones() {
        int cantidad = listaCanciones.size();
        cantidadLabel.setText("Se han introducido " + cantidad + " canciones al sistema");
    }
}
