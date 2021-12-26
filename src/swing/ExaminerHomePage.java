package swing;


import java.awt.BorderLayout;
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
import java.awt.BorderLayout;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.*;


public class ExaminerHomePage extends JFrame {
	private JFrame frame;
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
                ExaminerHomePage frame = new ExaminerHomePage();
                frame.setVisible(true);
			}
		});
	}

    public ExaminerHomePage(){
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

        JLabel HeadingLabel = new JLabel("Examiner Home Page");
        HeadingLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        HeadingLabel.setBounds(475, 0, 500, 100);
        panel_1.add(HeadingLabel);       
       
        panel.add(new ClockPane());
        panel.add(new TimePane());
        
        JLabel logo = new JLabel("<html><img src='https://i.imgur.com/wvbZSJc.png' alt='cbse_loho' width='200' height='200'></html>");
        logo.setFont(new Font("Tahoma", Font.BOLD, 32));
        logo.setBounds(535, 320, 1000, 500);
        panel.add(logo);
        JLabel logo1 = new JLabel("<html><img src='https://i.imgur.com/tXc4oJN.png' alt='cbse_loho'></html>");
        logo1.setFont(new Font("Tahoma", Font.BOLD, 32));
        logo1.setBounds(555, 15, 1000, 500);
        panel.add(logo1);

        JButton marksDisplayButton = new JButton("Marks Display");
        marksDisplayButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        marksDisplayButton.setBounds(100, 400, 300, 50);
        panel.add(marksDisplayButton);

        JButton studRegButton = new JButton("Student Registration");
        studRegButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        studRegButton.setBounds(500, 400, 300, 50);
        panel.add(studRegButton);

        JButton markRegButton = new JButton("Marks Registration");
        markRegButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        markRegButton.setBounds(900, 400, 300, 50);
        panel.add(markRegButton);
        
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        backButton.setBounds(1000, 600, 200, 50);
        panel.add(backButton);
        
        setVisible(true);
        
        backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to logout",
						"Student Management Systems",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					 dispose();
					 HomePage HomePage = new HomePage();
					 HomePage.setVisible(true);
				}

			}
		});
        
        marksDisplayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                StudentMarkSheet marksDisplayPage = new StudentMarkSheet();
                marksDisplayPage.setVisible(true);
            }
        });

        studRegButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                StudentRegistration studRegPage = new StudentRegistration();
                studRegPage.setVisible(true);
            }
        });

        markRegButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                StudentMarks markRegPage = new StudentMarks();
                markRegPage.setVisible(true);
            }
        });
    }   
}
