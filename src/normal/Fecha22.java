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
public class Fecha22 extends JFrame{
    public JPanel panel23;
       public Fecha22(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 23");	
        setVisible(true);
        setLocation(650,20);
        
        cosas23();
    }
        private void cosas23(){
        panel23();
        definicion23();
    }
        private void panel23(){
        panel23 = new JPanel();//crear un panel
                
        panel23.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel23);
    }
    
    private void definicion23(){
        ImageIcon imagen1 = new ImageIcon("2018.png");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel23.add(deca1);           
    }
}
