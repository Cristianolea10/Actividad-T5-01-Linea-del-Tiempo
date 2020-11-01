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
public class Fecha7 extends JFrame{
    public JPanel panel8;
       public Fecha7(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 8");	
        setVisible(true);
        setLocation(650,20);
        
        cosas8();
    }
        private void cosas8(){
        panel8();
        definicion8();
    }
        private void panel8(){
        panel8 = new JPanel();//crear un panel
                
        panel8.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel8);
    }
    
    private void definicion8(){
        ImageIcon imagen1 = new ImageIcon("1976.jpg");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel8.add(deca1);           
    }
}
