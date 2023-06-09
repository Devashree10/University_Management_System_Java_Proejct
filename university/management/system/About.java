package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>University<br/> Management<br/>  System</html>");
        heading.setForeground(Color.BLUE);
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        add(heading);
        
        JLabel branch = new JLabel("Branch: Computer Science Engineering");
        branch.setBounds(70, 290, 700, 60);
        branch.setFont(new Font("Century Schoolbook", Font.ITALIC, 22));
        add(branch);
        
        
        JLabel contact = new JLabel("Contact: xyz@email.com");
        contact.setBounds(70, 340, 550, 40);
        contact.setFont(new Font("Century Schoolbook", Font.ITALIC, 22));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
        
    public static void main(String[] args) {
        new About();
    }
}
