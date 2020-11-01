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
public class Fecha20 extends JFrame{
    public JPanel panel21;
       public Fecha20(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 21");	
        setVisible(true);
        setLocation(650,20);
        
        cosas21();
    }
        private void cosas21(){
        panel21();
        definicion21();
    }
        private void panel21(){
        panel21 = new JPanel();//crear un panel
                
        panel21.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel21);
    }
    
    private void definicion21(){
        ImageIcon imagen1 = new ImageIcon("2012.png");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel21.add(deca1);           
    }
}
