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
public class Fecha8 extends JFrame{
    public JPanel panel9;
       public Fecha8(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 9");	
        setVisible(true);
        setLocation(650,20);
        
        cosas9();
    }
        private void cosas9(){
        panel9();
        definicion9();
    }
        private void panel9(){
        panel9 = new JPanel();//crear un panel
                
        panel9.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel9);
    }
    
    private void definicion9(){
        ImageIcon imagen1 = new ImageIcon("1977.jpg");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel9.add(deca1);           
    }
}
