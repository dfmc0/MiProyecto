/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author DAW6W
 */
public class Pistas implements Comparable<Pistas> {
    private String titulo, autor,formato, genero;
    //private formatoCan formato;

    public Pistas(String titulo, String autor, String formato, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.genero = genero;
    }

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
    
    public String toString() {
        return "Titulo: " + titulo + "| Autor: " + autor + "| Formato: " +formato + "| Genero: " + genero;
    }

    @Override
    public int compareTo(Pistas otraCancion) {
        // Comparar por el título de la canción
        return this.titulo.compareTo(otraCancion.getTitulo());
    }
}
