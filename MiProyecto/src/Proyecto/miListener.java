/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JRadioButton;

/**
 *
 * @author DAW6W
 */
public class miListener implements ActionListener{
    String formato;
    public miListener(String f){
        formato = f;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JRadioButton boton= (JRadioButton)e.getSource();
        formato = boton.getText();
    }
    public String getFor(){
        return formato;
    }
    
}
