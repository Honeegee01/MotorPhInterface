/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorphappinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Homepage {

    JFrame frame;
    JPanel panel;
    JLabel titleLabel, empLabel, invLabel, Logout;

    Homepage() {
        // Initialize the frame and panel
        frame = new JFrame("Homepage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);

        // Initialize the title label
        titleLabel = new JLabel("Welcome to MotorPH!");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(20, 30, 500, 25);
        titleLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        panel.add(titleLabel);

        // Initialize the employee label
        empLabel = new JLabel("Employee Management System");
        empLabel.setBounds(100, 100, 500, 25);
        empLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        empLabel.setForeground(Color.BLUE);
        
        empLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        empLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Open the employee management page
                EmployeeManagement emp = new EmployeeManagement();
                
            }
        });
        panel.add(empLabel);

        // Initialize the inventory label
        invLabel = new JLabel("Inventory Management System");
        invLabel.setBounds(100, 140, 500, 25);
        invLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        invLabel.setForeground(Color.BLUE);
        invLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        invLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Inventory inv = new Inventory();
            }
        });
        panel.add(invLabel);
        
        Logout = new JLabel("Logout");
        Logout.setBounds(100, 180, 500, 25);
        Logout.setForeground(Color.BLUE);
        Logout.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        Logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Logout.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               System.exit(0);
            }
        });
        panel.add(Logout);

        // Add the panel to the frame and set the frame visible
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Homepage();
    }
}
