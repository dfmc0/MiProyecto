import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.JLabel;


public class GestorEventos implements ActionListener {
    private SortedSet<Pistas> listaCanciones;
    private String formato;
    private JLabel cantidadLabel;

    public GestorEventos(JLabel cantidadLabel) {
        this.listaCanciones = new TreeSet<>(Comparator.comparing(Pistas::getTitulo));
        this.cantidadLabel = cantidadLabel;
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
            Pistas cancion = new Pistas(nombre, autor, formato, genero);
            listaCanciones.add(cancion);
            // Actualizar el JTextArea en el último panel
            // Guardar en el archivo datos_canciones.txt
            guardarEnArchivo(cancion);
            // Actualizar la cantidad de canciones
            actualizarCantidadCanciones();
        } else if (e.getSource() == Fin.Busca) {
            // Buscar la canción por el título ingresado
            String tituloABuscar = Fin.textoBuscar.getText();
            Pistas cancionEncontrada = buscarCancionPorTitulo(tituloABuscar);
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
            
        }
    }

    public Pistas buscarCancionPorTitulo(String titulo) {
        for (Pistas cancion : listaCanciones) {
            if (cancion.getTitulo().equals(titulo)) {
                return cancion;
            }
        }
        return null;
    }

    public boolean eliminarCancionPorTitulo(String titulo) {
        for (Pistas cancion : listaCanciones) {
            if (cancion.getTitulo().equals(titulo)) {
                listaCanciones.remove(cancion);
                return true;
            }
        }
        return false;
    }

    public void guardarEnArchivo(Pistas cancion) {
        BufferedWriter writer;
        try  {
            writer = new BufferedWriter(new FileWriter("datos_canciones.txt", true));
            writer.write(cancion.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void actualizarListaCancionesEnFin() {
        String cancionesConcatenadas = new String();
        for (Pistas c : listaCanciones) {
            cancionesConcatenadas="Titulo: "+c.getTitulo()+", Autor: "+c.getAutor()+", Formato: "+Fin.getFormatoSeleccionado()+", Genero: "+c.getGenero();
        }
        Fin.outputFin.append(cancionesConcatenadas);
    }

    public void actualizarCantidadCanciones() {
        int cantidad = listaCanciones.size();
        cantidadLabel.setText("Se han introducido " + cantidad + " canciones al sistema");
    }
    
}