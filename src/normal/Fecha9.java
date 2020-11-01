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
public class Fecha9 extends JFrame{
    public JPanel panel10;
       public Fecha9(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 10");	
        setVisible(true);
        setLocation(650,20);
        
        cosas10();
    }
        private void cosas10(){
        panel10();
        definicion10();
    }
        private void panel10(){
        panel10 = new JPanel();//crear un panel
                
        panel10.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel10);
    }
    
    private void definicion10(){
        ImageIcon imagen1 = new ImageIcon("1977s.jpg");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel10.add(deca1);           
    }
}
