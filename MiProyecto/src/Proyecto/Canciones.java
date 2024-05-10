/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author DAW6W
 */
public class Canciones extends Object {
    private String titulo, autor, duracion,formato, genero;
    //private formatoCan formato;

    public Canciones(String titulo, String autor, String formato, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String toString() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nFormato: " + 
                formato + "\nGenero: " + genero + "\n";
    }

    public boolean equals(Canciones m) {
        boolean igual = false;

        if (m.getTitulo().equalsIgnoreCase(this.getTitulo()) && 
                m.getAutor().equalsIgnoreCase(this.getAutor())) {
            igual = true;
        } 
        return igual;
    }
}
