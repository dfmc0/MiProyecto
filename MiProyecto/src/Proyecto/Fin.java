package Proyecto;


import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAW6W
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dfmc3
 */
public class Fin extends JFrame {
    // VENTANA AÑADE CANCION
    private JLabel Titulo1;
    private JTabbedPane Panel1;
    private JPanel panelIni;
    private JTextArea textNom; // textNom
    private JButton Enviar;
    private JLabel etiAutor;
    private JTextArea textautor; // textautor
    private JLabel etiFormat;
    private JLabel etiGene;
    private JLabel etiNom;
    private JLabel etiNom2;
    private JComboBox<String> generos;
    private ButtonGroup grupo;
    private JRadioButton Boton1;
    private JRadioButton Boton2;
    private JRadioButton Boton3;
    private JRadioButton Boton4;
    private JRadioButton Boton5;
    private JRadioButton Boton6;
    // VENTANA BUSCA CANCION
    private JLabel tituloMed;
    private JTextArea textoBuscar;
    private JButton Busca;
    private JButton Eliminar;
    private JPanel medCont;
    private JTextField output;
    private JPanel panelMed;
    // VENTANA CANTIDAD DE CANCIONES
    private JLabel TituloFin;
    private JPanel panelFin;
    private JLabel textFin;
    private JTextArea outputFin; // outputFin
    private JScrollPane scrollFin; // scrollFin
    //COMPLEMENTOS
    public String formato;
    public Fin () {
        // INICIALIZA PESTAÑA INICIAL
        Panel1 = new JTabbedPane();
        panelIni = new JPanel();
        Titulo1 = new JLabel();
        etiNom = new JLabel();
        textNom = new JTextArea(); // 
        etiAutor = new JLabel(); // textautor
        textautor = new JTextArea(); // 
        
        etiFormat = new JLabel();
        grupo= new ButtonGroup();
       
        Boton1 = new JRadioButton();
        Boton2 = new JRadioButton(); //Boton6
        Boton3 = new JRadioButton();
        Boton4 = new JRadioButton();
        Boton5 = new JRadioButton();
        Boton6 = new JRadioButton();
        
        
        etiGene = new JLabel();
        generos = new JComboBox<>();
        Enviar = new JButton();
        
        // INICIALIZA PESTAÑA DEL MEDIO
        panelMed = new JPanel();
        medCont = new JPanel();
        tituloMed = new JLabel();
        etiNom2 = new JLabel();
        textoBuscar = new JTextArea(); 
        output = new JTextField();
        Busca = new JButton();
        Eliminar = new JButton();
        
        // INICIALIZA PESTAÑA FINAL
        panelFin = new JPanel();
        TituloFin = new JLabel();
        textFin = new JLabel();
        scrollFin = new JScrollPane();
        outputFin = new JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Titulo1.setText("Añadir Cancion");

        etiNom.setText("Nombre de la Canción:");

        textNom.setSize(20, 30);
        etiAutor.setText("Autor/ra:");
        textautor.setSize(20, 30);

        

        generos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rock", "Pop", "Funky", "Reggae", "Salsa" }));
        generos.setPreferredSize(null);
        generos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generosActionPerformed(evt);
            }
        });

        Boton1.setText("mp3");
        Boton2.setText("wav");
        Boton3.setText("mov");
        Boton4.setText("midi");
        Boton5.setText("mp4");
        Boton6.setText("wav");
        miListener oyente = new miListener(formato);
        Boton1.addActionListener(oyente);
        Boton2.addActionListener(oyente);
        Boton3.addActionListener(oyente);
        Boton4.addActionListener(oyente);
        Boton5.addActionListener(oyente);
        Boton6.addActionListener(oyente);
        etiFormat.setText("Formato:");
        etiGene.setText("Genero:");
        
        Enviar.setText("Enviar");
        Enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Set <Canciones> can= new HashSet<Canciones>();
                Canciones can1= new Canciones(textNom.getText(),textautor.getText(),oyente.formato,generos.getSelectedItem().toString());
                can.add(can1);
                
                System.out.println(can.toString());
            }
        });
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
            .addGroup(panelIniLayout.createSequentialGroup() //textautor
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
                        .addComponent(textautor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(textNom, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        panelIniLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {etiNom, textNom});

        Panel1.addTab("Añadir", panelIni);

        tituloMed.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tituloMed.setText("Buscar Canción");

        etiNom2.setText("Nombre de Canción: ");


        textoBuscar.setSize(20,5);

        output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputActionPerformed(evt);
            }
        });

        Busca.setText("Buscar");
        Busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

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
        grupo.add(Boton1);
        grupo.add(Boton2);
        grupo.add(Boton3);
        grupo.add(Boton4);
        grupo.add(Boton5);
        grupo.add(Boton6);
        Panel1.addTab("Buscar", panelMed);

        TituloFin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TituloFin.setText("Cuantas canciones hay?");

        textFin.setText("Se han introducido N° canciones al sistema:");

        outputFin.setColumns(20);
        outputFin.setRows(5);
        scrollFin.setViewportView(outputFin);

        javax.swing.GroupLayout panelFinLayout = new javax.swing.GroupLayout(panelFin);
        panelFin.setLayout(panelFinLayout);
        panelFinLayout.setHorizontalGroup(
            panelFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFinLayout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(panelFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(scrollFin, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFin, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TituloFin))
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
                .addComponent(scrollFin, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }// </editor-fold>                        

    private void outputActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void BuscaActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void generosActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }
    public static void main(String args[]) {
        Fin ventana = new Fin();
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}


