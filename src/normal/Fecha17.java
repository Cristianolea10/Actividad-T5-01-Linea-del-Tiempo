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
public class Fecha17 extends JFrame{
    public JPanel panel18;
       public Fecha17(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 18");	
        setVisible(true);
        setLocation(650,20);
        
        cosas18();
    }
        private void cosas18(){
        panel18();
        definicion18();
    }
        private void panel18(){
        panel18 = new JPanel();//crear un panel
                
        panel18.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel18);
    }
    
    private void definicion18(){
        ImageIcon imagen1 = new ImageIcon("2004.jpg");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel18.add(deca1);           
    }
}
