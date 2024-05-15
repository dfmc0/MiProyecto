import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class GestorEventos implements ActionListener {
    private Set<Pista> conjuntoCanciones;
    private JTextArea outputFin;
    private JLabel labelCantCanciones;
    
    //Constructor que recibe como parametro el JtextArea y el label del tercer Panel
    public GestorEventos(JTextArea outputFin, JLabel labelCantCanciones) {
        this.outputFin = outputFin;
        this.labelCantCanciones = labelCantCanciones;
        this.conjuntoCanciones = new TreeSet<>(); // Usar treeSet para mantener el orden
        cargarDesdeArchivo();
        actualizarListaCancionesEnFin();
        mostrarMensajeBienvenida();
    }
    
    //Controlador de los botones que se van a utilizar
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Contenido.Enviar) {
            String nombre = Contenido.textNom.getText();
            String autor = Contenido.textautor.getText();
            String formato = getFormatoSeleccionado();
            String genero = (String) Contenido.generos.getSelectedItem();
            Pista cancion = new Pista(nombre, autor, formato, genero);
            if (conjuntoCanciones.contains(cancion)) {
                mostrarMensaje("La canción ya existe en la lista.");
            } else {
                agregarCancion(cancion);
            }
        } else if (e.getSource() == Contenido.Busca) {
            String tituloABuscar = Contenido.textoBuscar.getText();
            buscarCancionPorTitulo(tituloABuscar);
        } else if (e.getSource() == Contenido.Eliminar) {
            String tituloAEliminar = Contenido.textoBuscar.getText();
            if (confirmarEliminarCancion()) {
                eliminarCancionPorTitulo(tituloAEliminar);
            }
        } else if (e.getSource() == Contenido.Actualizar) {
            actualizarListaCancionesEnFin();
        }
    }
    
    // Lector del fichero para almacenarlo internamente para el manejo de los datos
    public void cargarDesdeArchivo() {
        BufferedReader lector = null;
        try {
            lector = new BufferedReader(new FileReader("datos_canciones.txt"));
            String linea;
            while ((linea = lector.readLine()) != null) {
                Pista cancion = parsearLinea(linea);
                if (cancion != null) {
                    conjuntoCanciones.add(cancion);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (lector != null) {
                try {
                    lector.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    // Metodo que se encarga escribir los datos del fichero que son introducidos por el usuario
    // o que son eliminados por el
    public void guardarEnArchivo() {
        BufferedWriter escritor = null;
        try {
            escritor = new BufferedWriter(new FileWriter("datos_canciones.txt"));
            for (Pista cancion : conjuntoCanciones) {
                escritor.write(cancion.toString());
                escritor.newLine(); // Agregar un salto de línea después de cada canción
            }
            // No es necesario agregar la canción al conjunto aquí para evitar duplicados
            // La lógica de evitar duplicados se maneja automáticamente en TreeSet
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (escritor != null) {
                try {
                    escritor.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    //Metodo simple de enviar un mensaje a la hora de abrir la aplicacion
    private void mostrarMensajeBienvenida() {
        JOptionPane.showMessageDialog(Contenido.Panel1, "Bienvenido/a a la aplicación de gestión de canciones.");
    }
    
    //Metodo que manda un mensaje al usuario mediante un optionPane
    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    //Metodo que envia un mensaje en busca de un confimación de que si esta seguro de eliminar la canción
    private boolean confirmarEliminarCancion() {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar la canción?", "Confirmar Eliminar", JOptionPane.YES_NO_OPTION);
        return opcion == JOptionPane.YES_OPTION;
    }
    
    //Metodo que se encarga de actualizar el JtextArea final para ver los datos de canciones introducidas
    //y actualiza la acnttidad de canciones que se muestra en el apnel final
    public void actualizarListaCancionesEnFin() {
        StringBuilder cancionesConcatenadas = new StringBuilder();
        for (Pista c : conjuntoCanciones) {
            cancionesConcatenadas.append("Titulo: ").append(c.getTitulo()).append(", Autor: ").append(c.getAutor())
                    .append(", Formato: ").append(c.getFormato()).append(", Genero: ").append(c.getGenero())
                    .append("\n");
        }
        outputFin.setText(cancionesConcatenadas.toString());
        actualizarCantidadCanciones();
    }
    
    //MEtodo que se encarga de la introducción de las cancinoes creada y actualiza la canttidad de 
    //canciones que se muestra en el panel final
    public void agregarCancion(Pista cancion) {
        conjuntoCanciones.add(cancion);
        guardarEnArchivo();
        actualizarListaCancionesEnFin();
    }
    
    //Metodo para buscar canciones en el segundo panel mediante el titulo y muestra 
    // esta en el textArea que tiene debajo
    public void buscarCancionPorTitulo(String titulo) {
    for (Pista cancion : conjuntoCanciones) {
        if (cancion.getTitulo().equals(titulo)) {
            Contenido.output.setText(cancion.toString());
            return;
        }
    }
    Contenido.output.setText("Canción no encontrada");
}
    
    //MEtodo que se encarga de eliminar cancinoes creada y actualiza la canttidad de 
    //canciones que se muestra en el panel final
    public void eliminarCancionPorTitulo(String titulo) {
        cargarDesdeArchivo(); // Cargar datos del archivo en el conjunto
        Iterator<Pista> iterator = conjuntoCanciones.iterator();
        while (iterator.hasNext()) {
            Pista cancion = iterator.next();
            if (cancion.getTitulo().equals(titulo)) {
                iterator.remove();
                guardarEnArchivo();
                actualizarListaCancionesEnFin();
                Contenido.output.setText("La canción '" + titulo + "' ha sido eliminada");
                return;
            }
        }
        Contenido.output.setText("La canción '" + titulo + "' no existe en la lista");
        actualizarCantidadCanciones();
    }
    
    //Metodo que se encarga de separar las líneas que se leen del fichero que estan separados por comas
    //que ayuda a crear un objeto Pista devolviendolo
    private Pista parsearLinea(String linea) {
        String[] partes = linea.split(",");
        if (partes.length == 4) {
            String titulo = partes[0].substring(partes[0].indexOf(":") + 1).trim();
            String autor = partes[1].substring(partes[1].indexOf(":") + 1).trim();
            String formato = partes[2].substring(partes[2].indexOf(":") + 1).trim();
            String genero = partes[3].substring(partes[3].indexOf(":") + 1).trim();
            return new Pista(titulo, autor, formato, genero);
        }
        return null;
    }
    
    //Metodo que se encraga de ver que radioButton esta activo en la clase  Contenido
    //para extraer el formato deseado por el usuario para usarlo
    private String getFormatoSeleccionado() {
        for (Enumeration<AbstractButton> buttons = Contenido.grupo.getElements(); buttons.hasMoreElements(); ) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }
    
    //Metodo que se encarga de actualizar de actualizar el JLabel del panel final para tener el número de 
    // pistas que se han introducido al sistema
    private void actualizarCantidadCanciones() {
        labelCantCanciones.setText("Se han introducido " + conjuntoCanciones.size() + " canciones al sistema.");
    }
}
