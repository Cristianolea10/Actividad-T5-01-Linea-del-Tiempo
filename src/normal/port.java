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
public class port extends JFrame {
    public JPanel panel1;
       public port(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 1");	
        setVisible(true);
        setLocation(650,20);
        
        cosas1();
    }
        private void cosas1(){
        panel1();
        definicion1();
    }
        private void panel1(){
        panel1 = new JPanel();//crear un panel
                
        panel1.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel1);
    }
    
    private void definicion1(){
        ImageIcon imagen1 = new ImageIcon("portada.png");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel1.add(deca1);           
    }
}

