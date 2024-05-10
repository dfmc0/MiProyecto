/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


/**
 *
 * @author dfmc3
 */
public class principal extends JFrame{
    public JLabel titulo;
    public JButton boton1;
    public JButton boton2;
    public JButton boton3;
    public JButton salir;
    public JPanel panel;
    public principal(){
        getContentPane().setLayout(new BorderLayout());
         titulo= new JLabel("MENU PRINCIPAL");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(titulo, BorderLayout.NORTH);
        
        
        
        
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(40, -250, 40, 10); // Espacio entre componentes

        boton1 = new JButton("Añadir canción");
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 new anyadirCan();
            }
        });
        boton2 = new JButton("Cuantas canciones hay?");
        boton3 = new JButton("Buscar canción");

        // Ajustar tamaño de los botones centrales
        

        panel.add(boton1, gbc);
        panel.add(boton2, gbc);
        panel.add(boton3, gbc);
       
        
       
        add(panel, BorderLayout.CENTER);
        
        salir= new JButton("Salir");
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(salir, BorderLayout.SOUTH);
        
        setTitle("Menu Principal");
        setSize(600,600);
        setDefaultCloseOperation(2);
        setLocationRelativeTo(null);
        setVisible(true);
                
    }   
    public static void main(String[] args) {
        principal ventana= new principal();
    }
}
