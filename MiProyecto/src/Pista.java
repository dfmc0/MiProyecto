/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DAW6W
 * @author dfmc3
 */

/*Contenido a almacenar de cada Cancion/pista a almacenar en el sistema*/
public class Pista implements Comparable<Pista> {
    private String titulo, autor,formato, genero;

    public Pista(String titulo, String autor, String formato, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.genero = genero;
    }
// Metodos para sacar la información del sistema para usarlas en metodos de otras clases
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getFormato() {
        return formato;
    }
    public String getGenero(){
        return genero;
    }
    
    //Metodo para una impresión igual y un formato para introducirse en el fichero
    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Formato: " +formato + ", Genero: " + genero;
    }
    // Metodo reescrito para comparar los titulos y así ordenarlos por el titulo de estos tanto 
    // tanto en el fichero como en la salida gráfica
    @Override
    public int compareTo(Pista otraCancion) {
        // Comparar por el título de la canción
        return this.titulo.compareTo(otraCancion.getTitulo());
    }
}
