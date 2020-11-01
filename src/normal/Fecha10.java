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
public class Fecha10 extends JFrame{
     public JPanel panel11;
       public Fecha10(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 11");	
        setVisible(true);
        setLocation(650,20);
        
        cosas11();
    }
        private void cosas11(){
        panel11();
        definicion11();
    }
        private void panel11(){
        panel11 = new JPanel();//crear un panel
                
        panel11.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel11);
    }
    
    private void definicion11(){
        ImageIcon imagen1 = new ImageIcon("1981.jpg");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel11.add(deca1);           
    }
}
