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
public class Fecha18 extends JFrame{
    public JPanel panel19;
       public Fecha18(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 19");	
        setVisible(true);
        setLocation(650,20);
        
        cosas19();
    }
        private void cosas19(){
        panel19();
        definicion19();
    }
        private void panel19(){
        panel19 = new JPanel();//crear un panel
                
        panel19.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel19);
    }
    
    private void definicion19(){
        ImageIcon imagen1 = new ImageIcon("2006.png");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel19.add(deca1);           
    }
}
