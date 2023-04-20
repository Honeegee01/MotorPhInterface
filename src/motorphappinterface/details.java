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
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class details {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					details window = new details();
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
	public details() {
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
        
		
		/*JLabel lblNewLabel = new JLabel("TIMESHEET");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
                lblNewLabel.setForeground(Color.BLUE);
               
		lblNewLabel.setBounds(193, 20, 224, 40);
		panel.add(lblNewLabel);*/
		
		JLabel lblNewLabel = new JLabel("Employee Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(24, 48, 176, 59);
		panel.add(lblNewLabel);
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		lblEmployeeId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmployeeId.setBounds(24, 86, 176, 59);
		panel.add(lblEmployeeId);
		
		JLabel lblBirrhday = new JLabel("Birthday:");
		lblBirrhday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBirrhday.setBounds(24, 125, 176, 48);
		panel.add(lblBirrhday);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress.setBounds(24, 166, 176, 37);
		panel.add(lblAddress);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payroll p = new Payroll();
				p.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(24, 509, 122, 32);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Information");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(233, 10, 204, 48);
		panel.add(lblNewLabel_1);
		
		JTextArea txtrJadaza = new JTextArea();
		txtrJadaza.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJadaza.setEditable(false);
		txtrJadaza.setBounds(192, 69, 176, 22);
		panel.add(txtrJadaza);
		
		JTextArea txtrJadaza_1 = new JTextArea();
		txtrJadaza_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJadaza_1.setEditable(false);
		txtrJadaza_1.setBounds(192, 107, 176, 22);
		panel.add(txtrJadaza_1);
		
		JTextArea txtrJadaza_1_1 = new JTextArea();
		txtrJadaza_1_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJadaza_1_1.setEditable(false);
		txtrJadaza_1_1.setBounds(192, 141, 176, 22);
		panel.add(txtrJadaza_1_1);
		
		JTextArea txtrJadaza_1_2 = new JTextArea();
		txtrJadaza_1_2.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrJadaza_1_2.setEditable(false);
		txtrJadaza_1_2.setBounds(192, 176, 176, 22);
		panel.add(txtrJadaza_1_2);
	}
}

