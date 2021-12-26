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

public class ExaminerLoginPage extends JFrame {


    private JFrame frame;

    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
                ExaminerLoginPage frame = new ExaminerLoginPage();
                frame.setVisible(true);
			}
		});
	}

    public ExaminerLoginPage() {
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

        JLabel headingLabel = new JLabel("EXAMINER LOGIN");
        headingLabel.setBounds(575, 0, 300, 100);
        headingLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel_1.add(headingLabel);
        
        JLabel logo = new JLabel("<html><img src='https://i.imgur.com/8I9vw2K.png' alt='logo'width='350' height='350'></html>");
        logo.setFont(new Font("Tahoma", Font.BOLD, 32));
        logo.setBounds(125, 150, 1000, 500);
        panel.add(logo);
        
        JLabel Link1 = new JLabel("<html><a href='https://cbseresults.nic.in/MarkRegistration'>Mark Registration portal is <br>open till 31/12/2021 <br> </a>");
        Link1.setFont(new Font("Tahoma", Font.BOLD, 18));
        Link1.setBounds(950, 270, 1000, 100);
        panel.add(Link1);
        JLabel Link2 = new JLabel("<html><a href='https://cbseresults.nic.in/StudentRegistration'>Student Verification/Updation <br>portal opened on 21/12/2021 </a>");
        Link2.setFont(new Font("Tahoma", Font.BOLD, 18));
        Link2.setBounds(950, 370, 1000, 100);
        panel.add(Link2);
        
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

        JButton loginButton = new JButton("LOGIN");
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
        
        setVisible(true);
        
        resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				userTextField.setText("");
				passwordField.setText("");
			}
		});
        
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
            	String ExaminarPass=String.valueOf(passwordField.getPassword()); 
                try {
      	    	  Class.forName("org.postgresql.Driver");
      	      	} catch(ClassNotFoundException err) {
      	         System.out.println("Class not found "+ err);
      	      	}
      	      	try {
      	      		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");
      	         
      	      		Statement stmt = connection.createStatement();
      	      		ResultSet rs = stmt.executeQuery("SELECT username,password FROM examinar");
      	      		//System.out.println("id  name    job");
      	      		ArrayList<String> EuserNames=new ArrayList<String>();
	      			ArrayList<String> EpassWords=new ArrayList<String>();
      	      		while (rs.next()) {
      	      			String username = rs.getString("username");
      	      			String password = rs.getString("password");
      	      			EuserNames.add(username);
      	      			EpassWords.add(password);
      	      		}
      	      		int flag = 0;
      	      			//System.out.println(username+"   "+password);
      	      		for (int i = 0; i < EuserNames.size(); i++) {
      	      			if (userTextField.getText().equals(EuserNames.get(i)) && ExaminarPass.equals(EpassWords.get(i)) ) {
      	      				flag = 1;
      	      				break;
      	      			}
      	      		}
      	      			if (flag==1) {
      	      				dispose();
      	      				ExaminerHomePage ExaminerHomePage = new ExaminerHomePage();
      	      				ExaminerHomePage.setVisible(true);
      	      			}
      	      		
      	      			else {
      	      				JOptionPane.showMessageDialog(frame, "Username or Password is incorrect!!",
      	      				      "Invalid credentials", JOptionPane.ERROR_MESSAGE);
      	      				ExaminerLoginPage ExaminerLoginPage = new ExaminerLoginPage();
      	      				ExaminerLoginPage.setVisible(true);
      	      				}
      	            
      	      		
      	      } catch(SQLException err) {
      	         System.out.println("SQL exception occured" + err);
      	      }
                
            }
                //String ExaminerPass=String.valueOf(passwordField.getPassword()); 
                //if (userTextField.getText().equals("admin") && ExaminerPass.equals("admin") ) {
                	//ExaminerHomePage ExaminerHomePage = new ExaminerHomePage();
                	//ExaminerHomePage.setVisible(true);}
                //else {
                 //	JOptionPane.showMessageDialog(frame, "Username or Password is incorrect!!",
                   //          "Invalid credentials", JOptionPane.ERROR_MESSAGE);
                 	//ExaminerLoginPage ExaminerLoginPage = new ExaminerLoginPage();
                 	//ExaminerLoginPage.setVisible(true);
                 //}
           // }
        });

     
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                HomePage homePage = new HomePage();
                homePage.setVisible(true);
            }
        });
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                HomePage homePage = new HomePage();
                homePage.setVisible(true);
            }
        });
    }
}