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
  public class E3G_MAIN {

    public static void main(String[] args) {

        LISTAMULTIMEDIA ListaMultimedia = new LISTAMULTIMEDIA(10);

            Cancion Rihanna = new Cancion("Diamonds", "Rihanna", formatoCan.mp3, "4",Generos.Pop);
            Cancion MagodeOz = new Cancion("Fiesta Pagana", "Mago de Oz", formatoCan.mp3, "5",Generos.Rock );
            Cancion DavidGuetta = new Cancion("The World is mine", "Davig Guetta", formatoCan.mp3, "4", Generos.Pop);

         
            ListaMultimedia.add(Rihanna);
            ListaMultimedia.add(MagodeOz);
            ListaMultimedia.add(DavidGuetta);

      
        System.out.println(ListaMultimedia);



      
            Cancion prueba = new Cancion("Mendoza", "Prueba", null, null, null);
            ListaMultimedia.add(prueba);

          
            System.out.println("Posición: " + ListaMultimedia.indexOf(prueba));

            System.out.println(ListaMultimedia.get(ListaMultimedia.indexOf(prueba)));


    }
}
