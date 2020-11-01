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
public class Fecha24 extends JFrame{
    public JPanel panel25;
       public Fecha24(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 25");	
        setVisible(true);
        setLocation(650,20);
        
        cosas25();
    }
        private void cosas25(){
        panel25();
        definicion25();
    }
        private void panel25(){
        panel25 = new JPanel();//crear un panel
                
        panel25.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel25);
    }
    
    private void definicion25(){
        ImageIcon imagen1 = new ImageIcon("2020.png");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel25.add(deca1);           
    }
}
