/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package normal;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author oscar abad garica
 */
public class LineaArena extends JFrame {
    public JPanel panel;
    public JButton botonZ;
    public JButton botonY;
    public JButton botonX;
    public JButton botonW,botonH,botonG,botonF,botonE,botonD,botonC,botonB,botonA;
    public JButton botonV,botonU,botonT,botonS,botonR,botonQ,botonP,botonO,botonN,botonM,botonL,botonK,botonJ,botonI;
    
    public LineaArena(){
        setSize(1450,700);//tamaño
    	setTitle("linea del tiempo. graficacion");						
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        componentes();
}
    private void componentes(){
        colocarPanel();
        etiquetas();
        boton1();
        boton2();
        boton3();
        boton4();
        boton5();
        boton6();
        boton7();
        boton8();
        boton9();
        boton10();boton11();boton12();boton13();boton14();boton15();boton16();boton17();boton18();boton19();boton20();
        boton21();boton22();boton23();boton24();boton25(); boton100();
    }
    private void colocarPanel(){
        panel = new JPanel();//crear un panel
        
         //ImageIcon imagen2 = new ImageIcon("Fondos-de-pantalla-HD-portada.jpg");
         
         //JLabel deca2 = new JLabel();
         //panel.add(deca2);
         //deca2.setBounds(0,0,1200,500);
         //deca2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(1200,500,Image.SCALE_SMOOTH)));
               
        panel.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        
        panel.setBackground(Color.WHITE);
       
        this.getContentPane().add(panel);
        
    }
     private void etiquetas(){
         JLabel nombre = new JLabel();//creamos la etiqueta 
                nombre.setText("EVOLUCIÓN Y APLICACIÓN DE LA ANIMACIÓN POR COMPUTADORA");
                nombre.setBounds(230,20,950,50);//pocision de las etiquetas
                nombre.setForeground(Color.BLACK);//color de letra 
                nombre.setFont(new Font("Eras Bold ITC",Font.CENTER_BASELINE,25));
                panel.add(nombre);//agragamos la etiqueta para el panel
                
          ImageIcon imagen3 = new ImageIcon("flecha3.png");
          JLabel flecha = new JLabel();
            flecha.setBounds(1110,400,210,220);
            flecha.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(210,220,Image.SCALE_SMOOTH)));
            panel.add(flecha);
     }
     private void boton100(){
           botonA = new JButton("Portada");
        botonA.setBounds(600,95,120,50);
         panel.add(botonA);
         
          ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                port E1 = new port();
            }
        };
        
        botonA.addActionListener(oyenteDeAccion);
      }
     private void boton1(){
           botonB = new JButton("1940");
        botonB.setBounds(284,185,92,72);
         panel.add(botonB);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fhecha1 E2 = new Fhecha1();
            }
        };
        
        botonB.addActionListener(oyenteDeAccion);
      }
     private void boton2(){
          botonC = new JButton("1958");
        botonC.setBounds(376,185,92,72);
         panel.add(botonC);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha2 E3 = new Fecha2();
            }
        };
        
        botonC.addActionListener(oyenteDeAccion);
      } 
     private void boton3(){
         botonD = new JButton("1960");
        botonD.setBounds(468,185,92,72);
         panel.add(botonD);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha3 E4 = new Fecha3();
            }
        };
        
        botonD.addActionListener(oyenteDeAccion);
     }
     private void boton4(){
          botonE = new JButton("1962");
        botonE.setBounds(560,185,92,72);
         panel.add(botonE);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha4 E5 = new Fecha4();
            }
        };
        
        botonE.addActionListener(oyenteDeAccion);
      }
     private void boton5(){
          botonF = new JButton("1965");
        botonF.setBounds(652,185,92,72);
         panel.add(botonF);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha5 E6 = new Fecha5();
            }
        };
        
        botonF.addActionListener(oyenteDeAccion);
      } 
     private void boton6(){
          botonG = new JButton("1969");
        botonG.setBounds(744,185,92,72);
         panel.add(botonG);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha6 E7 = new Fecha6();
            }
        };
        
        botonG.addActionListener(oyenteDeAccion);
      } 
     private void boton7(){
          botonH = new JButton("1976");
        botonH.setBounds(836,185,92,72);
         panel.add(botonH);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha7 E8 = new Fecha7();
            }
        };
        
        botonH.addActionListener(oyenteDeAccion);
      } 
    private void boton8(){
           botonI = new JButton("1977");
        botonI.setBounds(928,185,92,72);
         panel.add(botonI);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha8 E9 = new Fecha8();
            }
        };
        
        botonI.addActionListener(oyenteDeAccion);
     }
    private void boton9(){
         botonJ = new JButton("1977s");
        botonJ.setBounds(284,330,92,72);
         panel.add(botonJ);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha9 E10 = new Fecha9();
            }
        };
        
        botonJ.addActionListener(oyenteDeAccion);
     }
    private void boton10(){
         botonK = new JButton("1981");
        botonK.setBounds(376,330,92,72);
         panel.add(botonK);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha10 E11 = new Fecha10();
            }
        };
        
        botonK.addActionListener(oyenteDeAccion);
     }
    private void boton11(){
          botonL = new JButton("1982");
        botonL.setBounds(468,330,92,72);
         panel.add(botonL);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha11 E12 = new Fecha11();
            }
        };
        
        botonL.addActionListener(oyenteDeAccion);
     }
    private void boton12(){
           botonM = new JButton("1991");
        botonM.setBounds(560,330,92,72);
         panel.add(botonM);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha12 E13 = new Fecha12();
            }
        };
        
        botonM.addActionListener(oyenteDeAccion);
    }
    private void boton13(){
           botonN = new JButton("1993");
        botonN.setBounds(652,330,92,72);
         panel.add(botonN); 
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha13 E14 = new Fecha13();
            }
        };
        
        botonN.addActionListener(oyenteDeAccion);
     }
    private void boton14(){
        botonO = new JButton("1995");
        botonO.setBounds(744,330,92,72);
         panel.add(botonO);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha14 E15 = new Fecha14();
            }
        };
        
        botonO.addActionListener(oyenteDeAccion);
    }
    private void boton15(){
         botonP = new JButton("2000");
        botonP.setBounds(836,330,92,72);
         panel.add(botonP);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha15 E16 = new Fecha15();
            }
        };
        
        botonP.addActionListener(oyenteDeAccion);
     }
    private void boton16(){
           botonQ = new JButton("2001");
        botonQ.setBounds(928,330,92,72);
         panel.add(botonQ);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha16 E17 = new Fecha16();
            }
        };
        
        botonQ.addActionListener(oyenteDeAccion);
    }
    private void boton17(){
         botonR = new JButton("2004");
        botonR.setBounds(284,475,92,72);
         panel.add(botonR);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha17 E18 = new Fecha17();
            }
        };
        
        botonR.addActionListener(oyenteDeAccion);
     }
   private void boton18(){
        botonS = new JButton("2006");
        botonS.setBounds(376,475,92,72);
         panel.add(botonS);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha18 E19 = new Fecha18();
            }
        };
        
        botonS.addActionListener(oyenteDeAccion);
     }
    private void boton19(){
         botonT = new JButton("2009");
        botonT.setBounds(468,475,92,72);
         panel.add(botonT);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha19 E20 = new Fecha19();
            }
        };
        
        botonT.addActionListener(oyenteDeAccion);
    }
     private void boton20(){
        botonU = new JButton("2012");
        botonU.setBounds(560,475,92,72);
         panel.add(botonU); 
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha20 E21 = new Fecha20();
            }
        };
        
        botonU.addActionListener(oyenteDeAccion);
     }
    private void boton21(){
         botonV = new JButton("2013");
        botonV.setBounds(652,475,92,72);
         panel.add(botonV); 
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha21 E22 = new Fecha21();
            }
        };
        
        botonV.addActionListener(oyenteDeAccion);
    }
    private void boton22(){
          botonW = new JButton("2018");
        botonW.setBounds(744,475,92,72);
         panel.add(botonW);  
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha22 E23 = new Fecha22();
            }
        };
        
        botonW.addActionListener(oyenteDeAccion);
     }
    private void boton23(){
            botonX = new JButton("2018a");
        botonX.setBounds(836,475,92,72);
         panel.add(botonX); 
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha23 E24 = new Fecha23();
            }
        };
        
        botonX.addActionListener(oyenteDeAccion);
      }
    private void boton24(){
             botonY = new JButton("2020");
        botonY.setBounds(928,475,92,72);
         panel.add(botonY);
         
         ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fecha24 E25 = new Fecha24();
            }
        };
        
        botonY.addActionListener(oyenteDeAccion);
      }
    private void boton25(){
         botonZ = new JButton("Fin");
        botonZ.setBounds(1020,475,92,72);
         panel.add(botonZ);
         
     }
}
