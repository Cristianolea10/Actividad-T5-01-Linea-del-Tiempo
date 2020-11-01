/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package normal;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author oscar abad garica
 */
public class Fecha4 extends JFrame{
    public JPanel panel5;
       public Fecha4(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 5");	
        setVisible(true);
        setLocation(650,20);
        
        cosas5();
    }
        private void cosas5(){
        panel5();
        definicion5();
    }
        private void panel5(){
        panel5 = new JPanel();//crear un panel
                
        panel5.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel5);
    }
    
    private void definicion5(){
        ImageIcon imagen1 = new ImageIcon("1962.jpg");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel5.add(deca1);           
    }
}
