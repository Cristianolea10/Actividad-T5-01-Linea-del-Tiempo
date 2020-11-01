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
public class Fecha19 extends JFrame{
    public JPanel panel20;
       public Fecha19(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 20");	
        setVisible(true);
        setLocation(650,20);
        
        cosas20();
    }
        private void cosas20(){
        panel20();
        definicion20();
    }
        private void panel20(){
        panel20 = new JPanel();//crear un panel
                
        panel20.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel20);
    }
    
    private void definicion20(){
        ImageIcon imagen1 = new ImageIcon("2009.png");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel20.add(deca1);           
    }
}
