// package swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class HomePage extends JFrame {
     
    private JPanel contentPane;

    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

    public HomePage(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1360, 800);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setBounds(10, 10, 1338, 750);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(26, 26, 1280, 95);
		panel.add(panel_1);


		

        JLabel lblNewLabel = new JLabel("Board Exam Management System");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
        lblNewLabel.setBounds(250, 11, 847, 61);
        panel_1.add(lblNewLabel);


        JLabel lblNewLabel_1 = new JLabel("Login Page");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
        lblNewLabel_1.setBounds(550, 211, 847, 61);
        // lblNewLabel_1.setText("Welcome to the CBSE Board Exam Management System!"+ "\n" + "This system is for examiners to store and evaluate a student’s answer sheets." + "\n" + " Students can register for the exams and view their results.");
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Welcome to the CBSE Board Exam Management System!");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2.setBounds(450, 270, 1000, 100);
        // lblNewLabel_2.setText("Welcome to the CBSE Board Exam Management System!");
        panel.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Click on any of the buttons below to login.");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_3.setBounds(500, 300, 1000, 100);
        // lblNewLabel_2.setText("Welcome to the CBSE Board Exam Management System!");
        panel.add(lblNewLabel_3);
        
       

        JButton btnNewButton = new JButton("Student");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton.setBounds(460, 502, 190, 50);
        panel.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Examiner");
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_1.setBounds(680, 502, 200, 50);
        panel.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("State Head Examiner");
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_2.setBounds(460, 600, 190, 50);
        panel.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Central Head Examiner");
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_3.setBounds(680, 600, 200, 50);
        panel.add(btnNewButton_3);

        
        
    }



    
}
