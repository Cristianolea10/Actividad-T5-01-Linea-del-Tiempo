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
public class Fecha23 extends JFrame{
    public JPanel panel24;
       public Fecha23(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 24");	
        setVisible(true);
        setLocation(650,20);
        
        cosas24();
    }
        private void cosas24(){
        panel24();
        definicion24();
    }
        private void panel24(){
        panel24 = new JPanel();//crear un panel
                
        panel24.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel24);
    }
    
    private void definicion24(){
        ImageIcon imagen1 = new ImageIcon("2018a.png");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel24.add(deca1);           
    }
}
