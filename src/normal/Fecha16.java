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
public class Fecha16 extends JFrame{
    public JPanel panel17;
       public Fecha16(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 17");	
        setVisible(true);
        setLocation(650,20);
        
        cosas17();
    }
        private void cosas17(){
        panel17();
        definicion17();
    }
        private void panel17(){
        panel17 = new JPanel();//crear un panel
                
        panel17.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel17);
    }
    
    private void definicion17(){
        ImageIcon imagen1 = new ImageIcon("2001.jpg");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel17.add(deca1);           
    }
}
