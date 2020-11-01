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
public class Fecha14 extends JFrame{
    public JPanel panel15;
       public Fecha14(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 15");	
        setVisible(true);
        setLocation(650,20);
        
        cosas15();
    }
        private void cosas15(){
        panel15();
        definicion15();
    }
        private void panel15(){
        panel15 = new JPanel();//crear un panel
                
        panel15.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel15);
    }
    
    private void definicion15(){
        ImageIcon imagen1 = new ImageIcon("1995.jpg");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel15.add(deca1);           
    }
}
