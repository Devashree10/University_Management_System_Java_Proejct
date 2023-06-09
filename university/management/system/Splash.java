
package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    
    Thread t;
    
    Splash() {
        
        getContentPane().setBackground(new Color(204,204,204));
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/University_8.png"));
        Image i2 = i1.getImage().getScaledInstance(900,600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        
        t = new Thread(this);
        t.start();
        
        setVisible(true);
        
        int x=1;
        for (int i=2; i<=500; i+=4, x+=1) {
            setLocation(550 - ((i + x)/2),300 - (i/2));
            setSize(i +3*x, i + x/2);
            
            try {
                Thread.sleep(10);
                
            }catch (Exception e) {}
                
            
        }                
            
    }
    
    public void run() {
        try {
            
            Thread.sleep(7000);
            setVisible(false);
            
            new Login();
            
        }catch(Exception e) {
            
        }
    }
    
    public static void main(String [] args) {
        new Splash();
        
    }
    
}
