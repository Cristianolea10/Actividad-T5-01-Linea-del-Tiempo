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
public class Fecha21 extends JFrame{
    public JPanel panel22;
       public Fecha21(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 22");	
        setVisible(true);
        setLocation(650,20);
        
        cosas22();
    }
        private void cosas22(){
        panel22();
        definicion22();
    }
        private void panel22(){
        panel22 = new JPanel();//crear un panel
                
        panel22.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel22);
    }
    
    private void definicion22(){
        ImageIcon imagen1 = new ImageIcon("2013.png");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel22.add(deca1);           
    }
}
