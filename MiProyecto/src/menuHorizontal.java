
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.LIGHT_GRAY;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAW6W
 */
public class menuHorizontal extends JFrame  {
   
    public menuHorizontal(){
        //TITULO DE LA VENTANA GENERAL
       setTitle("Menú Principal");
       
        JTabbedPane pestañas = new JTabbedPane();
        
        //CONTENIDO DE LA PESTAÑA 1
        JPanel panelAnyadir = new JPanel(new FlowLayout());
        JLabel titulo;
        JPanel panel;
        JPanel panelFor;
        ButtonGroup grupo;

        titulo= new JLabel("Añadir Canción");
        titulo.setFont(new Font("Bold", Font.BOLD, 25));
        
        panelAnyadir.add(titulo,TOP_ALIGNMENT);
        
        panel = new JPanel(new GridLayout(4, 2, 10, 0));
        JLabel nomCan=new JLabel("Nombre de Cancion:");
        JTextField texCan = new JTextField();
        JLabel nomAut=new JLabel("Nombre del Autor:");
        JTextField texAuto = new JTextField();

        
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
        panelFor = new JPanel(new GridLayout(2, 3,0,0));
        panelFor.add(b1);
        panelFor.add(b2);
        panelFor.add(b3);
        panelFor.add(b4);
        panelFor.add(b5);
        panelFor.add(b6);
        
        JLabel genero=new JLabel("Genero");
        String[] generos={"Rock", "Pop","Funky", "Reggae", "Salsa"};
        JComboBox <String> listGeneros= new JComboBox <String>(generos);
        
        JButton enviar= new JButton("Enviar");
        enviar.setHorizontalAlignment(SwingConstants.SOUTH_EAST);
        
        
        
        panel.add(nomCan);
        panel.add(nomAut);
        panel.add(texCan);
        panel.add(texAuto);
        panel.add(formato);
        panel.add(genero);
        panel.add(panelFor);
        panel.add(listGeneros);
        panelAnyadir.add(panel, FlowLayout.CENTER);
        panelAnyadir.add(enviar);
      pestañas.addTab("Añadir canción", null, panelAnyadir, "Menú para añadir una canción"); 
      
      // Contenido de la pestaña 2
      JPanel panelBuscar = new JPanel(); 
      titulo= new JLabel("Buscar Canción");
      JLabel mensaje= new JLabel("Introduce el nombre de tu canción:");
      JTextArea entra= new JTextArea();
      JTextArea salida=new JTextArea(10,30);
      salida.setBackground(LIGHT_GRAY); // REVISAR UN GRIS MÁS CLARO
      JButton muestra= new JButton("Buscar");
        titulo.setFont(new Font("Bold", Font.BOLD, 25));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        JPanel panelCont = new JPanel(new GridLayout(2, 2,20,20));
        
        panelCont.add(mensaje);
        panelCont.add(entra);
        panelCont.add(muestra);
        
        
        panelBuscar.add(titulo);
        panelBuscar.add(panelCont);
        panelBuscar.add(salida);
        
      pestañas.addTab("Buscar canción", null, panelBuscar, "Menú para buscar una cancíon"); 

      
      
      
      //  Contenido de la pestaña 3
      JPanel panelContar = new JPanel();
      salida= new JTextArea();
      
      mensaje= new JLabel("Hay "+1+" Canciones introducidas en el sistema");
      muestra= new JButton("Mostrar");
         titulo= new JLabel("Cuantas canciones hay?");
        titulo.setFont(new Font("Bold", Font.BOLD, 25));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        panelContar.add(titulo, TOP_ALIGNMENT);
        
        panelContar.add(mensaje, CENTER_ALIGNMENT);
        panelContar.add(muestra);
      pestañas.addTab("Cuantas canciones hay?", null, panelContar, "Menu para saber el Nº de canciones y visualizarlas");

      add(pestañas);
      setVisible(true);
      setSize(600,600);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
       
   }
    public static void main(String[] args) {
        menuHorizontal ventana = new menuHorizontal();
    }
}
