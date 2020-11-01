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
public class Fecha11 extends JFrame{
    public JPanel panel12;
       public Fecha11(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 12");	
        setVisible(true);
        setLocation(650,20);
        
        cosas12();
    }
        private void cosas12(){
        panel12();
        definicion12();
    }
        private void panel12(){
        panel12 = new JPanel();//crear un panel
                
        panel12.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel12);
    }
    
    private void definicion12(){
        ImageIcon imagen1 = new ImageIcon("1982.jpg");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel12.add(deca1);           
    }
}
