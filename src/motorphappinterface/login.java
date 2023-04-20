/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorphappinterface;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;

public class login implements ActionListener {
    
    HashMap<String,String> logininfo = new HashMap<String,String>();
    
    login(HashMap<String, String> loginInfoOriginal){
        
        logininfo = loginInfoOriginal;
    
    }
    
    private JFrame frame;
    private JPanel panel;
    private JLabel title;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JTextField userText;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JLabel registerButton;
    
    
    public login() {
        
        
        
        frame = new JFrame("MotorPH");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
       
        panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);
       
        
        
        title = new JLabel("Welcome, Please Login!");
        title.setBounds(70,25,300,25);    
        title.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        title.setForeground(Color.BLUE);
        panel.add(title);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(50,100,100,25);
        userLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        userLabel.setForeground(Color.WHITE);
        
        
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50,150,100,25);
        passwordLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        passwordLabel.setForeground(Color.WHITE);
        

        userText = new JTextField(20);
        userText.setBounds(150,100,200,25);
        passwordText = new JPasswordField(20);
        passwordText.setBounds(150,150,200,25);

        loginButton = new JButton("Login");
        loginButton.setBounds(200,200,75,25);
        loginButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(Color.GRAY);
        loginButton.addActionListener(this);
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        
        registerButton = new JLabel("Create an account!");
        registerButton.setForeground(Color.BLUE);
        registerButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        registerButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                registration reg = new registration();    
            }
            });
        registerButton.setBounds(170,250,150,25);
        registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        

        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(new JLabel(""));
        panel.add(loginButton);
        panel.add(registerButton);

        frame.add(panel);
        frame.setVisible(true);    
        
    }
    
    
    public void actionPerformed(ActionEvent ae) {
        String username = userText.getText();
        String password = new String(passwordText.getPassword());
        
        logininfo = new HashMap<>();
        logininfo.put("Crisostomo","10001" );
        logininfo.put("Mata","10002" );
        logininfo.put("Salcedo","10004" );
                
                 
                 if (logininfo.containsKey(username) && logininfo.get(username).equals(password)) {
                
                frame.dispose();
                Homepage hpage = new Homepage();
                
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
                
                
    
        
        
             
    public static void main(String[] args) {
        new login();
    }
}


    
