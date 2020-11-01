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
public class Fhecha1 extends JFrame{
     public JPanel panel2;
       public Fhecha1(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 2");	
        setVisible(true);
        setLocation(650,20);
        
        cosas2();
    }
        private void cosas2(){
        panel2();
        definicion2();
    }
        private void panel2(){
        panel2 = new JPanel();//crear un panel
                
        panel2.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel2);
    }
    
    private void definicion2(){
        ImageIcon imagen1 = new ImageIcon("1940.jpg");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel2.add(deca1);           
    }
}
