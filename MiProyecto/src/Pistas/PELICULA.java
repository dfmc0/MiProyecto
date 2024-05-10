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
public class PELICULA extends MULTIMEDIA {

    private String actorPrincipal, actrizPrincipal;

    public PELICULA(String titulo, String autor, formatoCan formato, String duracion, 
            String actorPrincipal, String actrizPrincipal) throws Exception {
        
        super(titulo, autor, formato, duracion);
        if ((actorPrincipal == null && actrizPrincipal == null)
                || (actorPrincipal.isEmpty() && actrizPrincipal.length()==0)) {
            throw new Exception("Datos incorrectos. pelicula no creada");
        } else {
            this.actorPrincipal = actorPrincipal;
            this.actrizPrincipal = actrizPrincipal;
        }
    }
    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    public String toString() {
        return super.toString()+ "\nActor Principal: " + actorPrincipal 
                + "\nActriz Principal: " + actrizPrincipal;
    }
}
