
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAW6W
 * @author dfmc3
 * ENUNCIADO
 * Tendremos una interfaz gráfica donde el usuario, ya puede ser un cliente o un dependiente de alguna 
 * tienda que pueda introducir una canción con sus respectivos datos, como el título de esta y unos datos extra más.
De esto se podrá consultar cuantas canciones o pistas y sus datos que se han introducido al sistema, buscar y eliminar
* una canción todo esto mediante el uso de ventanas y formularios en java.

La primera ventana mostrará un menú con las opciones de añadir canción, buscar, una opción que nos dará el conteo 
* de la cantidad de canciones o pistas introducidas y en el final un botón de salida que termina el programa..

En la primera opción de “añadir una canción o pista” aparecerá una ventana al entrar a la opción, solicitando los 
* datos de la canción siendo el título, el nombre del artista y el formato obligatorios y el resto de datos pudiendo no ser introducidos	

En la segunda opción podremos buscar canciones en el sistema mediante una ventana con un espacio para rellenar y 
* un espacio para mensajes donde luego podremos ver o eliminar las canciones, para buscar las canciones el usuario deberá introducir el título de la misma.

En la tercera opción podremos ver un conteo de las canciones y los datos de las mismas para hacer una revisión.

Y una última opción que servirá para salir de la ventana principal del menú y finalizar todo el proceso.
* 
* Todo esto estará almacenado en un fichero llamado datos_canciones.txt(Añadí este ultimo apartado pero no quedo en el enunciado de aules)

 * 
 * 
 */
public class PistasApp {
    public static void main(String args[]) {
        Contenido ventana = new Contenido();
        ventana.setTitle("Gestor de Canciones");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
