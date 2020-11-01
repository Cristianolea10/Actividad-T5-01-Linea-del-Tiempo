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
public class Fecha15 extends JFrame{
    public JPanel panel16;
       public Fecha15(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 16");	
        setVisible(true);
        setLocation(650,20);
        
        cosas16();
    }
        private void cosas16(){
        panel16();
        definicion16();
    }
        private void panel16(){
        panel16 = new JPanel();//crear un panel
                
        panel16.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel16);
    }
    
    private void definicion16(){
        ImageIcon imagen1 = new ImageIcon("2000.jpg");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel16.add(deca1);           
    }
}
