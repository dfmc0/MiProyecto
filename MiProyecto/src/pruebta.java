
import java.awt.FlowLayout;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAW6W
 */
public class pruebta extends JPanel{
    JTextArea texto;
    JLabel dato;
    JScrollPane scrol;
    public pruebta(){
        
        dato = new JLabel("Dato");
        JFrame cosa= new JFrame("DATOS DATOSOS");
        
        texto= new JTextArea(25, 25);
        
        cosa.add(dato);
        scrol = new JScrollPane(texto);
        cosa.add(texto);
        cosa.add(scrol);
        int opcion = JOptionPane.showConfirmDialog(cosa, "desea salir?", "Seleccione si desea salir", JOptionPane.YES_NO_OPTION);
        int opcion2 = JOptionPane.showConfirmDialog(cosa, "Esta seguro/a de eliminar la canción", "Seleccione si desea salir", JOptionPane.CANCEL_OPTION,JOptionPane.CANCEL_OPTION);
        JOptionPane.showMessageDialog(cosa, "BIENVENIDO/A \nEn este menú podras intereactuar con el sistema\ncon las 3 ventanas de arriba", "Seleccione si desea salir", JOptionPane.INFORMATION_MESSAGE);
        //int opcion2 = JOptionPane.showMessageDialog(cosa, "desea salir?", "Seleccione si desea salir", JOptionPane.DEFAULT_OPTION);
        
        
        cosa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cosa.setLayout(new FlowLayout());
        cosa.setVisible(true);
        cosa.pack();

        
    }
    public static void main(String[] args) {
        pruebta ventana = new pruebta();
    }
}
