/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorphappinterface;


import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Payroll {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payroll window = new Payroll();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Payroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
            
            frame = new JFrame("MotorPH");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(0, 0, 700, 600);
            frame.setLocationRelativeTo(null);
            
         
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.BLACK);
            frame.add(panel);
            frame.setVisible(true);
		
		JButton btnNewButton = new JButton("Employee");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				details d = new details();
				d.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(110, 110, 220, 95);
		frame.getContentPane().setLayout(null);
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		panel.add(btnNewButton);
		
		JButton btnTimesheet = new JButton("Timesheet");
		btnTimesheet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timesheet t = new timesheet();
				t.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnTimesheet.setBounds(110, 225, 220, 95);
		btnTimesheet.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		panel.add(btnTimesheet);
		
		JButton btnSalary = new JButton("Salary");
		btnSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salary s = new salary();
				s.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnSalary.setBounds(110, 340, 220, 95);
		btnSalary.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		panel.add(btnSalary);
		
		JButton btnBenefits = new JButton("Benefits");
		btnBenefits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				benefits b = new benefits();
				b.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnBenefits.setBounds(355, 110, 220, 95);
		btnBenefits.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		panel.add(btnBenefits);
		
		JButton btnDeductions = new JButton("Deductions");
		btnDeductions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deductions de = new deductions();
				de.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnDeductions.setBounds(355, 225, 220, 95);
		btnDeductions.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		panel.add(btnDeductions);
		
		JButton btnAbsences = new JButton("Absences");
		btnAbsences.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				absences a = new absences();
				a.frame.setVisible(true);
				frame.dispose();
			}
			
		});
		btnAbsences.setBounds(355, 340, 220, 94);
		btnAbsences.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		panel.add(btnAbsences);
                
                JButton btnNewButton1 = new JButton("BACK");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeManagement E = new EmployeeManagement();
				
			}
		});
		btnNewButton1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		btnNewButton1.setBounds(500, 490, 122, 32);
		panel.add(btnNewButton1);
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE PAYROLL MANAGEMENT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblNewLabel.setBounds(150, 35, 400, 33);
                lblNewLabel.setForeground(Color.BLUE);
		panel.add(lblNewLabel);
                
               
		
		
		
	}
}