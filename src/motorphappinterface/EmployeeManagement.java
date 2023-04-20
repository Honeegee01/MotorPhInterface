/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorphappinterface;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EmployeeManagement implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JLabel profileLabel, salaryLabel, timesheetLabel, leaveLabel, backLabel, title;

    public EmployeeManagement() {
        frame = new JFrame("MotorPH");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        
        
        title = new JLabel("Welcome to Employee Management System!");
        title.setBounds(70,25,500,25);    
        title.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        title.setForeground(Color.BLUE);
        panel.add(title);
        

        profileLabel = new JLabel("MY PROFILE");
        profileLabel.setBounds(100, 100, 150, 30);
        profileLabel.setForeground(Color.BLUE);
        profileLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
        profileLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Myprofile prof = new Myprofile();
                frame.dispose();
            }
            });

        salaryLabel = new JLabel("PAYROLL");
        salaryLabel.setBounds(100, 150, 200, 30);
        salaryLabel.setForeground(Color.BLUE);
        salaryLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
        salaryLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Payroll p = new Payroll ();
                p.frame.setVisible(true);
                frame.dispose();
                
             
				
            }
            });
        
        timesheetLabel = new JLabel("TIMESHEET");
        timesheetLabel.setBounds(100, 200, 150, 30);
        timesheetLabel.setForeground(Color.BLUE);
        timesheetLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
        timesheetLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                timesheet time = new timesheet(); 
                time.frame.setVisible(true);
                frame.dispose();
            }
            });
        
        leaveLabel = new JLabel("LEAVE");
        leaveLabel.setBounds(100, 250, 150, 30);
        leaveLabel.setForeground(Color.BLUE);
        leaveLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
        leaveLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                LeavePage leave = new LeavePage();
                //leave.frame.setVisible(true);
                frame.dispose();
            }
            });

        backLabel = new JLabel("BACK");
        backLabel.setBounds(100, 300, 150, 30);
        backLabel.setForeground(Color.BLUE);
        backLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
        backLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Homepage hpage = new Homepage();
                  
            }
            });

        panel.add(profileLabel);
        panel.add(salaryLabel);
        panel.add(timesheetLabel);
        panel.add(leaveLabel);
        panel.add(backLabel);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new EmployeeManagement();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == profileLabel) {
              
        } else if (e.getSource() == salaryLabel) {
                
        } else if (e.getSource() == timesheetLabel) {
                
        } else if (e.getSource() == leaveLabel) {
               
        } else if (e.getSource() == backLabel) {
                
        }
    }
}
