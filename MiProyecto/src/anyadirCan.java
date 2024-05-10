/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
/**
 *
 * @author dfmc3
 */
public class anyadirCan extends JFrame{
     public JLabel titulo;
     public JPanel panel;
     public JPanel panelFor;
     public ButtonGroup grupo;
     public anyadirCan(){
        getContentPane().setLayout(new BorderLayout());
        setTitle("Añadir Canción");
        titulo= new JLabel("Añadir Canción");
        titulo.setFont(new Font("Bold", Font.BOLD, 25));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(titulo, BorderLayout.NORTH);
        
        panel = new JPanel(new GridLayout(4, 2, 40, 40));
        JLabel nomCan=new JLabel("Nombre de Cancion");
        JTextField etiCan = new JTextField("");
        JLabel nomAut=new JLabel("Nombre del Autor");
        JTextField etiAuto = new JTextField("");
        
        // HACER UNA CLASE QUE GENERE UN GRUPO DE BOTONES CON SUS RESPECTIVOS 
        // NOMBRES Y SI ESTA ENCENDIDO O NO
        grupo = new ButtonGroup();
         JRadioButton b1= new JRadioButton("mp3", true);
         JRadioButton b2= new JRadioButton("wav", false);
         JRadioButton b3= new JRadioButton("midi", false);
         JRadioButton b4= new JRadioButton("mov", false);
         JRadioButton b5= new JRadioButton("mpg", false);
         JRadioButton b6= new JRadioButton("cdAudio", false);
         grupo.add(b1);
         grupo.add(b2);
         grupo.add(b3);
         grupo.add(b4);
         grupo.add(b5);
         grupo.add(b6);
        JLabel formato=new JLabel("Formato");
        panelFor = new JPanel(new GridLayout(1, 5));
        panelFor.add(b1);
        panelFor.add(b2);
        panelFor.add(b3);
        panelFor.add(b4);
        panelFor.add(b5);
        panelFor.add(b6);
        
        JLabel genero=new JLabel("Genero");
        panel.add(nomCan);
        panel.add(etiCan);
        panel.add(nomAut);
        panel.add(etiAuto);
        panel.add(formato);
        panel.add(panelFor);
        panel.add(genero);
        
        
        add(panel, BorderLayout.CENTER);
        
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        
        
     }
     public static void main(String[] args) {
        anyadirCan ventana = new anyadirCan();
        
    }
}
