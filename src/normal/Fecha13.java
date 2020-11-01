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
public class Fecha13 extends JFrame{
    public JPanel panel14;
       public Fecha13(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 14");	
        setVisible(true);
        setLocation(650,20);
        
        cosas14();
    }
        private void cosas14(){
        panel14();
        definicion14();
    }
        private void panel14(){
        panel14 = new JPanel();//crear un panel
                
        panel14.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel14);
    }
    
    private void definicion14(){
        ImageIcon imagen1 = new ImageIcon("1993.jpg");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel14.add(deca1);           
    }
}
