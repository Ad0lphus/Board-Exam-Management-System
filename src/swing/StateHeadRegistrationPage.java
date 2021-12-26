package swing;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StateHeadRegistrationPage extends JFrame {

    private JFrame frame;

    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				StateHeadRegistrationPage frame = new StateHeadRegistrationPage();
                frame.setVisible(true);
			}
		});
	}

    public StateHeadRegistrationPage() {
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
   
        JLabel headingLabel = new JLabel("State Head Registration");
        headingLabel.setBounds(500, 0, 400, 100);
        headingLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
        panel_1.add(headingLabel);
        JLabel Link1 = new JLabel("<html><a href='https://cbseresults.nic.in/class10/Class10th21.htm'>Secondary School Certificate<br>Examination ( Class X ) 2021 <br>Published </a>");
        Link1.setFont(new Font("Tahoma", Font.BOLD, 18));
        Link1.setBounds(950, 270, 1000, 100);
        panel.add(Link1);
        JLabel Link2 = new JLabel("<html><a href='https://cbseresults.nic.in/class12/Class12th21.htm'>Senior School Certificate Examination <br>(Class XII) Results 2021 Published </a>");
        Link2.setFont(new Font("Tahoma", Font.BOLD, 18));
        Link2.setBounds(950, 370, 1000, 100);
        panel.add(Link2);
        JLabel logo = new JLabel("<html><img src='https://i.imgur.com/Dk3kiJV.png' alt='logo'width='300' height='350'></html>");
        logo.setFont(new Font("Tahoma", Font.BOLD, 32));
        logo.setBounds(150, 100, 1000, 500);
        panel.add(logo);
        
        JLabel userLabel = new JLabel("USERNAME");
        userLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        userLabel.setBounds(550, 250, 100, 30);
        panel.add(userLabel);
   
        JLabel passwordLabel = new JLabel("PASSWORD");
        passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        passwordLabel.setBounds(550, 320, 100, 30);
        panel.add(passwordLabel);
   
        JTextField userTextField = new JTextField();
        userTextField.setBounds(650, 250, 150, 30);
        panel.add(userTextField);
   
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(650, 320, 150, 30);
        panel.add(passwordField);
   
        JButton loginButton = new JButton("REGISTER");
        loginButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        loginButton.setBounds(550, 400, 100, 30);
        panel.add(loginButton);
   
        JButton resetButton = new JButton("RESET");
        resetButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        resetButton.setBounds(700, 400, 100, 30);
        panel.add(resetButton);
   
        // JCheckBox showPassword = new JCheckBox("Show Password");
        // showPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
        // showPassword.setBounds(150, 250, 150, 30);
        // showPassword.setBackground(getForeground());
        // panel.add(showPassword);

        
        JButton backButton = new JButton("Back");
        backButton.setBounds(579, 506, 200, 30);
        panel.add(backButton);
        
        resetButton.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
   
                   userTextField.setText("");
                   passwordField.setText("");
               }
           });
        
        setVisible(true);
   
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String SHPass=String.valueOf(passwordField.getPassword()); 
                try {
      	    	  Class.forName("org.postgresql.Driver");
      	      	} catch(ClassNotFoundException err) {
      	         System.out.println("Class not found "+ err);
      	      	}
                // ResultSet rs = stmt.executeQuery("insert into table statehead values ("+userTextField.getText()+","+SHPass+");");
                
                String msg = "" + userTextField.getText();
                
                
                try {
                	Class.forName("org.postgresql.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");

                    String query = "INSERT INTO statehead values ('"+userTextField.getText()+"','"+SHPass+"');";
                    System.out.print(query);
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(loginButton, "State Head already exists");
                    } else {
                        JOptionPane.showMessageDialog(loginButton,
                            "Welcome, " + "State Head ("+msg+")has been registered sucessfully !");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
   
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (JOptionPane.showConfirmDialog(contentPane, "Confirm if you want to logout",
					"State Head Registration Systems",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            			dispose();
            			HomePage homePage = new HomePage();
            			homePage.setVisible(true);
            	}
            }
        });
    }
   }