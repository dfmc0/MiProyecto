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
public class Cancion extends MULTIMEDIA {
	
    private Generos genero;

    public Cancion(String titulo, String autor, formatoCan formato, String duracion, 
    		Generos genero)  {
     
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public String toString() {
        return super.toString()+ "\nGénero: " + genero + "\n";
    }
}
