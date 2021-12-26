package swing;

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

// import StudentLoginPage.StudentLoginPage;
// import StateHeadLoginPage.StateHeadLoginPage;
// import CentralHeadLoginPage.CentralHeadLoginPage;
// import ExaminerLoginPage.ExaminerLoginPage;

public class HomePage extends JFrame {
     
    private JPanel contentPane;

    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
                HomePage frame = new HomePage();
                frame.setVisible(true);
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

        JLabel HeadingLabel = new JLabel("Board Exam Management System");
        HeadingLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
        HeadingLabel.setBounds(250, 11, 847, 61);
        panel_1.add(HeadingLabel);


        JLabel LoginLabel = new JLabel("Home Page");
        LoginLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
        LoginLabel.setBounds(525, 150, 847, 61);
        panel.add(LoginLabel);

        JLabel WelcomeLabel = new JLabel("<html><center>Welcome to the CBSE <br>Board Exam Management System!</center></html>");
        WelcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
        WelcomeLabel.setBounds(400, 270, 1000, 100);
        panel.add(WelcomeLabel);
        //JLabel Link1 = new JLabel("<html><a href='https://ciet.nic.in/pages.php?id=booklet-on-cyber-safetysecurity&In=en&In=en'>Booklets on Cyber Safety<br> & Security Developed <br>by NCERT in Collaboration <br>with UNESCO 17/12/2021</a>");
        //Link1.setFont(new Font("Tahoma", Font.BOLD, 18));
        //Link1.setBounds(50, 270, 1000, 100);
        //panel.add(Link1);
        JLabel logo = new JLabel("<html><img src='https://i.imgur.com/tXc4oJN.png' alt='cbse_loho'></html>");
        logo.setFont(new Font("Tahoma", Font.BOLD, 32));
        logo.setBounds(150, 200, 1000, 500);
        panel.add(logo);
        // https://i.imgur.com/i7zKAdo.png
        JLabel logo1 = new JLabel("<html><img src='https://i.imgur.com/i7zKAdo.png' alt='cbse_loho' width='300' height='350'></html>");
        logo1.setFont(new Font("Tahoma", Font.BOLD, 32));
        logo1.setBounds(1000, 200, 1000, 500);
        panel.add(logo1);
        JLabel DescriptionLabel = new JLabel("Click on any of the buttons below to login.");
        DescriptionLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        DescriptionLabel.setBounds(500, 400, 1000, 100);
        panel.add(DescriptionLabel);       
       

        JButton StudentButton = new JButton("Student");
        StudentButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        StudentButton.setBounds(460, 502, 190, 50);
        panel.add(StudentButton);

        JButton ExaminerButton = new JButton("Examiner");
        ExaminerButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        ExaminerButton.setBounds(680, 502, 200, 50);
        panel.add(ExaminerButton);

        JButton SHeadButton = new JButton("State Head Examiner");
        SHeadButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        SHeadButton.setBounds(460, 600, 190, 50);
        panel.add(SHeadButton);

        JButton CHeadButton = new JButton("Central Head Examiner");
        CHeadButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        CHeadButton.setBounds(680, 600, 200, 50);
        panel.add(CHeadButton);

        // Add action listeners to Student button
        StudentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                StudentLoginPage studentLoginPage = new StudentLoginPage();
                studentLoginPage.setVisible(true);
            }
        });
        
        // Add action listeners to Examiner button
        ExaminerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ExaminerLoginPage examinerLoginPage = new ExaminerLoginPage();
                examinerLoginPage.setVisible(true);
            }
        });

        // Add action listeners to State Head Examiner button
        SHeadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                StateHeadLoginPage stateHeadLoginPage = new StateHeadLoginPage();
                stateHeadLoginPage.setVisible(true);
            }
        });

        // Add action listeners to Central Head Examiner button
        CHeadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                CentralHeadLoginPage centralHeadLoginPage = new CentralHeadLoginPage();
                centralHeadLoginPage.setVisible(true);
            }
        });
    }   
}
