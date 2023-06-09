
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener{
    
    
    JButton login, cancel;
    JTextField tfusername, tfpassword;
    Login() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40,30,100,20);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(150,30,150,20);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40,80,100,20);
        add(lblpassword);
        
        tfpassword = new JPasswordField();
        tfpassword.setBounds(150,80,150,20);
        add(tfpassword);
        
        login = new JButton("Login");
        login.setBounds(40,180,120,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setFont(new Font("Times New Roman", Font.BOLD, 16));
        login.addActionListener(this);
        add(login);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(180,180,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/Login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 20, 200, 200);
        add(image);

         
        setSize(600,350);
        setLocation(400,200);
        setVisible(true);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()== login) {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            String query = "select * from login where username = '"+username+ "'and password = '"+password+"'";
            
            
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                
                if (rs.next()) {
                    setVisible(false);
                    new Project();
                    
                }else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    
                }
                
            }catch(Exception e) {
            }
            
            
        }else if (ae.getSource()== cancel) {
            setVisible(false);
        }
    }
    
    
    
    public static void main(String [] args) {
        new Login();
    }
    
}
