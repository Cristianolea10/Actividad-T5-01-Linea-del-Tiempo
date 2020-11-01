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
public class Fecha6 extends JFrame{
    public JPanel panel7;
       public Fecha6(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 7");	
        setVisible(true);
        setLocation(650,20);
        
        cosas7();
    }
        private void cosas7(){
        panel7();
        definicion7();
    }
        private void panel7(){
        panel7 = new JPanel();//crear un panel
                
        panel7.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel7);
    }
    
    private void definicion7(){
        ImageIcon imagen1 = new ImageIcon("1969.jpg");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel7.add(deca1);           
    }
}
