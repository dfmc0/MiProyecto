


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
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
public class Fin extends JFrame {
    // VENTANA AÑADE CANCION
    private JLabel Titulo1;
    private JTabbedPane Panel1;
    private JPanel panelIni;
    public static JTextArea textNom; 
    public static JButton Enviar;
    private JLabel etiAutor;
    public static JTextArea textautor; 
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
    // VENTANA BUSCA CANCION
    private JLabel tituloMed;
    public static JTextArea textoBuscar;
    public static JButton Busca;
    public static JButton Eliminar;
    private JPanel medCont;
    public static JTextField output;
    private JPanel panelMed;
    // VENTANA CANTIDAD DE CANCIONES
    public static JLabel TituloFin;
    private JPanel panelFin;
    public static JLabel textFin;
    public static JTextArea outputFin; 
    private JScrollPane scrollFin; 
    //COMPLEMENTOS
    public static String formato;
    
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
       
        Boton1 = new JRadioButton("mp3");
        Boton2 = new JRadioButton("wav"); //Boton6
        Boton3 = new JRadioButton("mov");
        Boton4 = new JRadioButton("mov",true);
        Boton5 = new JRadioButton("midi");
        Boton6 = new JRadioButton("wav");

        
        etiGene = new JLabel();
        generos = new JComboBox<>(new String[]{"Rock", "Pop", "Funky", "Reggae", "Salsa"});
        Enviar = new JButton("Enviar");
        
        // INICIALIZA PESTAÑA DEL MEDIO
        panelMed = new JPanel();
        medCont = new JPanel();
        tituloMed = new JLabel();
        etiNom2 = new JLabel();
        textoBuscar = new JTextArea(); 
        output = new JTextField();
        Busca = new JButton("Buscar");
        Eliminar = new JButton("Eliminar");
        
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
        generos.setPreferredSize(null);
        GestorEventos oye = new GestorEventos(textFin);
        Enviar.addActionListener(oye);
        oye.actualizarListaCancionesEnFin(); // Actualiza el JTextArea con las canciones cargadas
        Panel1.addTab("Añadir", panelIni);

        
        tituloMed.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tituloMed.setText("Buscar Canción");
        etiNom2.setText("Nombre de Canción: ");
        textoBuscar.setSize(20,5);
        Busca.addActionListener(oye);
        Eliminar.addActionListener(oye);
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
        
        PosicionesPanelIni();
        PosicionesPanelMed();
        PosicionesPanelFin();
        cargarDesdeArchivo(outputFin);
    }
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
    }
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
    private void PosicionesPanelFin(){
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

    }
    public static String getFormatoSeleccionado() {
    // Recorre todos los botones de formato para encontrar el seleccionado
    for (Enumeration<AbstractButton> buttons = grupo.getElements(); buttons.hasMoreElements();) {
        AbstractButton button = buttons.nextElement();
        if (button.isSelected()) {
            return button.getText();
        }
    }
    // Si ningún botón está seleccionado, devuelve null o un valor predeterminado
    return null;
}
    public static void main(String args[]) {
        Fin ventana = new Fin();
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    public static void cargarDesdeArchivo(JTextArea espacio) {
        BufferedReader lector= null;
        try  {
            lector = new BufferedReader(new FileReader("datos_canciones.txt"));
            String linea= lector.readLine();
            while (linea != null) {
                espacio.append(linea);
                linea=lector.readLine();
                espacio.append("\n");
            } 
        } catch (IOException e) {
            System.out.println("Error de Lectura");
        }finally{
            try {
                lector.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar");
            }
        }
    }
} 


