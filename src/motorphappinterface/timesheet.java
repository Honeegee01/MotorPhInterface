/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorphappinterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;

public class timesheet {

	 JFrame frame;
	 private JTable table;
	 private JTable table_1;
	 private JTable table_2;
	 private JTable table_3;
	 private JTable table_4;
	 private JTable table_5;
	 private JTable table_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					timesheet window = new timesheet();
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
	public timesheet() {
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
        
		
		JLabel lblNewLabel = new JLabel("TIMESHEET");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
                lblNewLabel.setForeground(Color.BLUE);
               
		lblNewLabel.setBounds(210, 20, 224, 40);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID:");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblNewLabel_1.setBounds(50, 75, 150, 30);
                lblNewLabel_1.setForeground(Color.WHITE);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Employee Name:");
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(50, 115, 150, 30);
                lblNewLabel_1_1.setForeground(Color.WHITE);
		panel.add(lblNewLabel_1_1);
		
		JTextField textArea = new JTextField();
		textArea.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		textArea.setBounds(200, 80, 200, 22);
		panel.add(textArea);
		
		JTextField txtrJasminPascual = new JTextField();
		txtrJasminPascual.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		txtrJasminPascual.setBounds(200, 120, 200, 22);
		panel.add(txtrJasminPascual);
                
                 JButton btnNewButton1 = new JButton("BACK");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payroll p = new Payroll();
				p.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		btnNewButton1.setBounds(500, 490, 122, 32);
		panel.add(btnNewButton1);
	
		
		JList list = new JList();
		list.setBounds(257, 296, 83, -17);
		panel.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(179, 364, 173, -28);
		panel.add(list_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Search by Month:");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(50, 157, 150, 30);
                lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		panel.add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"January", "February"}));
		comboBox.setBounds(210, 162, 120, 25);
               
                comboBox.setForeground(Color.white);
		panel.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("ENTER");
		btnNewButton_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
                btnNewButton_1.setBackground(Color.GRAY);
                btnNewButton_1.setForeground(Color.white);
		btnNewButton_1.setBounds(350, 162, 91, 25);
		panel.add(btnNewButton_1);
		
		table_2 = new JTable();
		table_2.setBackground(new Color(0, 128, 255));
		table_2.setBounds(502, 249, -99, -66);
		panel.add(table_2);
		
		table_3 = new JTable();
		table_3.setBounds(190, 394, 227, -66);
		panel.add(table_3);
		
		table_4 = new JTable();
		table_4.setBounds(131, 37, 1, 1);
		panel.add(table_4);
		
		table_5 = new JTable();
		table_5.setBounds(203, 296, 1, 1);
		panel.add(table_5);
		
		table_6 = new JTable();
		table_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
				{"Month", "Day", "Time-In", "Time-Out", "Total Hour(s)", "Overtime Hour(s)"},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, "", null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Month", "Day", "Time-In", "Time-Out", "Total Hour(s)", "Overtime Hour(s)"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_6.getColumnModel().getColumn(0).setResizable(false);
		table_6.getColumnModel().getColumn(5).setPreferredWidth(97);
		table_6.setBounds(28, 222, 626, 160);
		panel.add(table_6);

	}
}
