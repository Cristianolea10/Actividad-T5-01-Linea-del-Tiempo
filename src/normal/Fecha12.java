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
public class Fecha12 extends JFrame{
    public JPanel panel13;
       public Fecha12(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 13");	
        setVisible(true);
        setLocation(650,20);
        
        cosas13();
    }
        private void cosas13(){
        panel13();
        definicion13();
    }
        private void panel13(){
        panel13 = new JPanel();//crear un panel
                
        panel13.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel13);
    }
    
    private void definicion13(){
        ImageIcon imagen1 = new ImageIcon("1991 .jpg");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel13.add(deca1);           
    }
}
