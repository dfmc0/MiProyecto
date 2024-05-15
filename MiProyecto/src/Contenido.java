import java.awt.event.*;
import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAW6W
 * @author dfmc3
 */
public class Contenido extends JFrame {
    //Definimos los componenetes y elementos a usarse en el programa
    public static JTabbedPane Panel1;
    
    //Componenetes del primer panel
    private JLabel Titulo1;
    public static JPanel panelIni;
    public static JTextField textNom; 
    public static JButton Enviar;
    private JLabel etiAutor;
    public static JTextField textautor; 
    private JLabel etiFormat;
    private JLabel etiGene;
    private JLabel etiNom;
    private JLabel etiNom2;
    public static JComboBox<String> generos;
    public static ButtonGroup grupo;
    public static JRadioButton Boton1;
    public static JRadioButton Boton2;
    public static JRadioButton Boton3;
    public static JRadioButton Boton4;
    public static JRadioButton Boton5;
    public static JRadioButton Boton6;
    //Componenetes del segundo panel
    public JPanel panelMed;
    private JLabel tituloMed;
    public static JTextField textoBuscar;
    public static JButton Busca;
    public static JButton Eliminar;
    private JPanel medCont;
    public static JTextField output;
    
    //Componentes del tercer y ultimo panel
    private JPanel panelFin;
    public static JLabel TituloFin;
    public static JLabel textFin;
    public static JButton Actualizar;
    public static JTextArea outputFin; 

    // Mi clase escuchadora por así decirlo el que controlara los botones 
    // y metodos más complejos para el sistema y el manejo del fichero
    public GestorEventos oye;

    //Inicializamos los componentes
    public Contenido() {
    //Inicializando y dando valores a los componentes del primer panel
    Panel1 = new JTabbedPane();
    panelIni = new JPanel();
    Titulo1 = new JLabel();
    etiNom = new JLabel();
    textNom = new JTextField(); 
    etiAutor = new JLabel(); 
    textautor = new JTextField(); 
    etiFormat = new JLabel("Formato:");
    grupo = new ButtonGroup();
    Boton1 = new JRadioButton("mp3");
    Boton2 = new JRadioButton("wav"); 
    Boton3 = new JRadioButton("mov");
    Boton4 = new JRadioButton("mov",true);
    Boton5 = new JRadioButton("midi");
    Boton6 = new JRadioButton("wav");
    grupo.add(Boton1);
    grupo.add(Boton2);
    grupo.add(Boton3);
    grupo.add(Boton4);
    grupo.add(Boton5);
    grupo.add(Boton6);
    etiGene = new JLabel("Genero:");
    generos = new JComboBox<>(new String[]{"Rock", "Pop", "Funky", "Reggae", "Salsa"});
    Enviar = new JButton("Enviar");
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    Titulo1.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
    Titulo1.setText("Añadir Cancion");
    etiNom.setText("Nombre de la Canción:");
    etiAutor.setText("Autor/ra:");
    Panel1.addTab("Añadir", panelIni);
    Panel1.setMnemonicAt(0,'A');
    
    //Inicializando y dando valores a los componentes del segundo panel
    panelMed = new JPanel();
    medCont = new JPanel();
    tituloMed = new JLabel();
    etiNom2 = new JLabel();
    textoBuscar = new JTextField(); 
    output = new JTextField();
    Busca = new JButton("Buscar");
    Eliminar = new JButton("Eliminar");
    tituloMed.setText("Buscar Canción");
    tituloMed.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
    etiNom2.setText("Nombre de Canción: ");
    output.setEditable(false);
    Panel1.addTab("Buscar", panelMed);
    
    //Inicializando y dando valores a los componentes del tercer y último panel
    panelFin = new JPanel();
    TituloFin = new JLabel();
    textFin = new JLabel();
    outputFin = new JTextArea();
    Actualizar = new JButton("Actualizar");
    TituloFin.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
    TituloFin.setText("Cuantas canciones hay?");
    textFin.setText("Se han introducido N° canciones al sistema:");
    outputFin.setColumns(20);
    outputFin.setRows(5);
    outputFin.setEditable(false);
    
    // Inicializando el gestor de eventos para la interacción que pueda tener el usuario
    oye = new GestorEventos(outputFin, textFin);
    Enviar.addActionListener(oye);
    Busca.addActionListener(oye);
    Eliminar.addActionListener(oye);
    
    
    //Usamos los metodos para los componentes
    PosicionesPanelIni();
    PosicionesPanelMed();
    PosicionesPanelFin();
    
    Actualizar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            oye.actualizarListaCancionesEnFin();
        }
    });
}
    
    //Metodo para las posiciones de los componentes y elementos del primer panel
    private void PosicionesPanelIni(){
        javax.swing.GroupLayout panelIniLayout = new javax.swing.GroupLayout(panelIni);
        panelIni.setLayout(panelIniLayout);
        panelIniLayout.setHorizontalGroup(
            panelIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIniLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(panelIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(etiFormat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiNom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addComponent(textNom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(panelIniLayout.createSequentialGroup()
                        .addGroup(panelIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(panelIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIniLayout.createSequentialGroup()
                        .addGroup(panelIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(textautor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(126, Short.MAX_VALUE))
                    .addGroup(panelIniLayout.createSequentialGroup()
                        .addGroup(panelIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(generos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiGene))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelIniLayout.createSequentialGroup() 
                .addGap(221, 221, 221)
                .addGroup(panelIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 257, Short.MAX_VALUE))
        );

        panelIniLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Boton3, Boton5, Boton6});
        panelIniLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Boton1, Boton2, Boton4});

        panelIniLayout.setVerticalGroup(
            panelIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIniLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(panelIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIniLayout.createSequentialGroup()
                        .addComponent(textautor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(panelIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIniLayout.createSequentialGroup()
                                .addComponent(etiFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(199, Short.MAX_VALUE))
                            .addGroup(panelIniLayout.createSequentialGroup()
                                .addComponent(etiGene)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(generos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelIniLayout.createSequentialGroup()
                        .addComponent(textNom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelIniLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {etiNom, textNom});

    }
    //Metodo para las posiciones de los componentes y elementos del segundo panel
    private void PosicionesPanelMed(){                     
        javax.swing.GroupLayout medContLayout = new javax.swing.GroupLayout(medCont);
        medCont.setLayout(medContLayout);
        medContLayout.setHorizontalGroup(
            medContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medContLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(medContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(medContLayout.createSequentialGroup()
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(medContLayout.createSequentialGroup()
                        .addGroup(medContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiNom2)
                            .addGroup(medContLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(Eliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(medContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(Busca)
                            .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(medContLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(tituloMed, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(242, Short.MAX_VALUE))))
        );
        medContLayout.setVerticalGroup(
            medContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medContLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(tituloMed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(medContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiNom2)
                    .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(medContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Busca)
                    .addComponent(Eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout panelMedLayout = new javax.swing.GroupLayout(panelMed);
        panelMed.setLayout(panelMedLayout);
        panelMedLayout.setHorizontalGroup(
            panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(medCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMedLayout.setVerticalGroup(
            panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(medCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
    //Metodo para las posiciones de los componentes y elementos del tercer panel
    private void PosicionesPanelFin(){
        javax.swing.GroupLayout panelFinLayout = new javax.swing.GroupLayout(panelFin);
        panelFin.setLayout(panelFinLayout);
        panelFinLayout.setHorizontalGroup(
            panelFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFinLayout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(panelFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(outputFin, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFin, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TituloFin)
                    .addComponent(Actualizar))
                .addGap(91, 91, 91))
        );
        panelFinLayout.setVerticalGroup(
            panelFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFinLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(TituloFin)
                .addGap(76, 76, 76)
                .addComponent(textFin)
                .addGap(56, 56, 56)
                .addComponent(outputFin, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Actualizar)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        Panel1.addTab("Cantidad", panelFin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pack();
    }
}
