/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pistas;

import Proyecto.formatoCan;

/**
 *
 * @author dfmc3
 */
public class MULTIMEDIA extends Object {
    private String titulo, autor, duracion;
    private formatoCan formato;

    public MULTIMEDIA(String titulo, String autor, formatoCan formato, String duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
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

    public formatoCan getFormato() {
        return formato;
    }

    public void setFormato(formatoCan formato) {
        this.formato = formato;
    }

    public String toString() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nFormato: " + 
                formato + "\nDuración: " + duracion + "\n";
    }

    public boolean equals(MULTIMEDIA m) {
        boolean igual = false;

        if (m.getTitulo().equalsIgnoreCase(this.getTitulo()) && 
                m.getAutor().equalsIgnoreCase(this.getAutor())) {
            igual = true;
        } 
        return igual;
    }
}
