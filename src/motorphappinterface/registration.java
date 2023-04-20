/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorphappinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class registration extends JFrame implements ActionListener {

    private JTextField nameField;
    private JTextField emailField;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JTextField employeeNumberField;
    private JButton registerButton;
    private JPanel panel;
    private JLabel title;

    public registration() {
        setTitle("MotorPH");
        setSize(450, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);
        
        title = new JLabel("Please Register an account!");
        title.setBounds(70,25,300,25);    
        title.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        title.setForeground(Color.BLUE);
        panel.add(title);


        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50,100,300,25);
        nameLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        nameLabel.setForeground(Color.WHITE);
        panel.add(nameLabel);

        

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50,150,300,25);
        emailLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        emailLabel.setForeground(Color.WHITE);
        panel.add(emailLabel);

       

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50,200,300,25);
        usernameLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        usernameLabel.setForeground(Color.WHITE);
        panel.add(usernameLabel);

        

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50,250,300,25);
        passwordLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        passwordLabel.setForeground(Color.WHITE);
        panel.add(passwordLabel);

        

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setBounds(50,300,300,25);
        confirmPasswordLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        confirmPasswordLabel.setForeground(Color.WHITE);
        panel.add(confirmPasswordLabel);

        

        JLabel employeeNumberLabel = new JLabel("Employee Number:");
        employeeNumberLabel.setBounds(50,350,300,25);
        employeeNumberLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        employeeNumberLabel.setForeground(Color.WHITE);
        panel.add(employeeNumberLabel);

        
        
        
        
        
        nameField = new JTextField(20);
        nameField.setBounds(200,100,200,25);
        nameField.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        nameField.setForeground(Color.WHITE);
        panel.add(nameField);
        
        emailField = new JTextField(20);
        emailField.setBounds(200,150,200,25);
        emailField.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        emailField.setForeground(Color.WHITE);
        panel.add(emailField);
        
        usernameField = new JTextField(20);
        usernameField.setBounds(200,200,200,25);
        usernameField.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        usernameField.setForeground(Color.WHITE);
        panel.add(usernameField);
        
        passwordField = new JPasswordField(20);
        passwordField.setBounds(200,250,200,25);
        passwordField.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        passwordField.setForeground(Color.WHITE);
        panel.add(passwordField);
        
        confirmPasswordField = new JPasswordField(20);
        confirmPasswordField.setBounds(200,300,200,25);
        confirmPasswordField.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        confirmPasswordField.setForeground(Color.WHITE);
        panel.add(confirmPasswordField);
        
        employeeNumberField = new JTextField(20);
        employeeNumberField.setBounds(200,350,200,25);
        employeeNumberField.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        employeeNumberField.setForeground(Color.WHITE);
        panel.add(employeeNumberField);

        registerButton = new JButton("Register");
        registerButton.setBounds(200,400,100,25);
        registerButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(Color.GRAY);
        registerButton.addActionListener(this);
        registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(registerButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(200,450,100,25);
        cancelButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setBackground(Color.GRAY);
        cancelButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        panel.add(cancelButton);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle register button click event
        String name = nameField.getText();
        String email = emailField.getText();
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());
        String employeeNumber = employeeNumberField.getText();

        // Validate the user input
        if (name.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || employeeNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Registration successful.", "Success", JOptionPane.INFORMATION_MESSAGE);

        // Code to save user data in a database or file can be added here

        dispose();
    }

    public static void main(String[] args) {
        new registration();
    }
}

