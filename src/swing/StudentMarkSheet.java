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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

/**
 * Student Registration using Swing
 * 
 * @author Project_go_brr_team
 *
 */

public class StudentMarkSheet extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField firstname;
	private JTextField aadhar;
	private JTextField lastname;
	private JTextField email;
	private JTextField username;
	private JTextField lblStream;
	private JTextField mob;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JFrame frame;
	private JTable table;
	private JTextField jtxtRollNo;
	private JTextField jtxtName;
	private JTextField jtxtDOB;
	private JSpinner jtxtPhysics;
	private JSpinner jtxtChemistry;
	private JSpinner jtxtMaths;
	private JSpinner jtxtEnglish;
	private JSpinner jtxtBiology;
	private JSpinner jtxtComp;
	private JSpinner jtxtBS;
	private JSpinner jtxtGeography;
	private JSpinner jtxtHistory;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarkSheet frame = new StudentMarkSheet();
					// frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public StudentMarkSheet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setBounds(10, 10, 1338, 850);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(26, 26, 1280, 95);
		panel.add(panel_1);

		JLabel lblMembershipRegistrationSystem = new JLabel("Student Marksheet");
		lblMembershipRegistrationSystem.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblMembershipRegistrationSystem.setBounds(390, 11, 847, 61);
		panel_1.add(lblMembershipRegistrationSystem);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_2.setBackground(new Color(176, 224, 230));
		panel_2.setBounds(26, 152, 1280, 150);
		panel.add(panel_2);

		JLabel lblNewLabel = new JLabel("Roll Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(28, 30, 150, 25);
		panel_2.add(lblNewLabel);

		JLabel lblFirstname = new JLabel("School");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFirstname.setBounds(530, 30, 150, 25);
		panel_2.add(lblFirstname);

        JLabel lblDOB = new JLabel("DOB");
		lblDOB.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDOB.setBounds(930, 30, 150, 25);
		panel_2.add(lblDOB);

		jtxtRollNo = new JTextField();
		jtxtRollNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtRollNo.setColumns(10);
		jtxtRollNo.setBounds(205, 29, 218, 27);
		panel_2.add(jtxtRollNo);

		jtxtName = new JTextField();
		jtxtName.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtName.setColumns(10);
		jtxtName.setBounds(625, 29, 218, 27);
		panel_2.add(jtxtName);

        jtxtDOB = new JTextField();
		jtxtDOB.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtDOB.setColumns(10);
		jtxtDOB.setBounds(1000, 29, 218, 27);
		panel_2.add(jtxtDOB);

		


		
		JButton button_1 = new JButton("Reset");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jtxtRollNo.setText("");
				jtxtName.setText("");
                jtxtDOB.setText("");
				
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(500, 87, 179, 33);
		panel_2.add(button_1);


		// add submit button
		JButton submitButton = new JButton("Submit");
		submitButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		submitButton.setBounds(700, 87, 179, 33);
		panel_2.add(submitButton);
		
		submitButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
	      	    	  Class.forName("org.postgresql.Driver");
	      	      	} catch(ClassNotFoundException err) {
	      	         System.out.println("Class not found "+ err);
	      	      	}
	      	      	try {
	      	      		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");
	      	      		Statement stmt = connection.createStatement();
	      	      		ResultSet rs = stmt.executeQuery("SELECT * FROM marks WHERE (enrollno = "+jtxtRollNo.getText()+");");
	      	      		ArrayList<String> enroll=new ArrayList<String>();
		      			ArrayList<String> name=new ArrayList<String>();
		      			ArrayList<String> stream=new ArrayList<String>();
		      			ArrayList<String> phy=new ArrayList<String>();
		      			ArrayList<String> chem=new ArrayList<String>();
		      			ArrayList<String> mat=new ArrayList<String>();
		      			ArrayList<String> eng=new ArrayList<String>();
		      			ArrayList<String> bio=new ArrayList<String>();
		      			ArrayList<String> cs=new ArrayList<String>();
		      			ArrayList<String> bus=new ArrayList<String>();
		      			ArrayList<String> geo=new ArrayList<String>();
		      			ArrayList<String> hist=new ArrayList<String>();
	      	      		while (rs.next()) {
	      	      			String roll = rs.getString("enrollno");
	      	      			enroll.add(roll);
	      	      			String Name = rs.getString("name");
	      	      			name.add(Name);
	      	      			String Stream = rs.getString("stream");
	      	      			stream.add(Stream);
	      	      			String Phy = rs.getString("physics");
	      	      			phy.add(Phy);
	      	      			String Chem = rs.getString("chemistry");
	      	      			chem.add(Chem);
	      	      			String Mat = rs.getString("maths");
	      	      			mat.add(Mat);
	      	      			String Eng = rs.getString("english");
	      	      			eng.add(Eng);
	      	      			String Bio = rs.getString("biology");
	      	      			bio.add(Bio);
	      	      			String Cs = rs.getString("cs");
	      	      			cs.add(Cs);
	      	      			String Bus = rs.getString("business");
	      	      			bus.add(Bus);
	      	      			String Geo = rs.getString("geography");
	      	      			geo.add(Geo);
	      	      			String Hist = rs.getString("history");
	      	      			hist.add(Hist);
	      	      		
	      	      			//System.out.print(roll);
	      	      			//String password = rs.getString("shpassword");
	      	      			//SHuserNames.add(username);
	      	      			//SHpassWords.add(password);
	      	      		}
	      	      		DefaultTableModel model = (DefaultTableModel) table.getModel();
	      	      		for (int i = 0; i < enroll.size(); i++) {
	      	      			model.addRow(new Object[] {
	      	      					enroll.get(i),
	      	      					name.get(i),
	      	      					stream.get(i),
	      	      					phy.get(i),
	      	      					chem.get(i),
	      	      					mat.get(i),
	      	      					eng.get(i),
	      	      					bio.get(i),
	      	      					cs.get(i),
	      	      					bus.get(i),
	      	      					geo.get(i),
	      	      					hist.get(i),
	      	      					
								//streamList.getSelectedItem(),
	      	      			});
	      	      		}
	      	      		int flag = 0;
	      	      			
	      	      } catch(SQLException err) {
	      	         System.out.println("SQL exception occured" + err);
	      	      }
				
				

			}

		});
		JButton logoutButton = new JButton("Logout");
		logoutButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		logoutButton.setBounds(300, 87, 179, 33);
        panel_2.add(logoutButton);
        
        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (JOptionPane.showConfirmDialog(contentPane, "Confirm if you want to logout",
					"Marks Publication Systems",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            			dispose();
            			HomePage homePage = new HomePage();
            			homePage.setVisible(true);
            	}
            }
        });
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_4.setBackground(new Color(176, 224, 230));
		panel_4.setBounds(26, 332, 1280, 481);
		panel.add(panel_4);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 24, 1220, 430);
		panel_4.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Roll No", "Name", "Stream", "Physics", "Chemistry", "Maths", "English", "Biology",
						"Comp. Science", "Business Studies", "Geography", "History"
				}));
		table.getColumnModel().getColumn(0).setPreferredWidth(84);
		scrollPane.setViewportView(table);

		// btnNewButton = new JButton("Register");
		// btnNewButton.addActionListener(new ActionListener() {
		// 	public void actionPerformed(ActionEvent e) {
		// 		String firstName = firstname.getText();
		// 		String lastName = lastname.getText();
		// 		String emailId = email.getText();
		// 		String userName = username.getText();
		// 		String mobileNumber = mob.getText();
		// 		int mobLen = mobileNumber.length();
		// 		int aadharLen = aadhar.getText().length();
		// 		String password = passwordField.getText();

		// 		String msg = "" + firstName;
		// 		msg += " \n";
		// 		if (mobLen != 10) {
		// 			JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
		// 		}
		// 		if (aadharLen != 12) {
		// 			JOptionPane.showMessageDialog(btnNewButton, "Enter a valid Aadhar number");
		// 		}
		// 		try {
		// 			Class.forName("org.postgresql.Driver");
		// 			Connection connection = DriverManager.getConnection(
		// 					"jdbc:postgresql://localhost:5432/invention_management_system\", \"postgres\", \"prabithgupta");

		// 			String query = "INSERT INTO student values('" + firstName + "','" + lastName + "','" + userName
		// 					+ "','" +
		// 					password + "','" + emailId + "','" + mobileNumber + "')";

		// 			Statement sta = connection.createStatement();
		// 			int x = sta.executeUpdate(query);
		// 			if (x == 0) {
		// 				JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
		// 			} else {
		// 				JOptionPane.showMessageDialog(btnNewButton,
		// 						"Welcome, " + msg + "Examiner has registerd sucessfully !");
		// 			}
		// 			connection.close();
		// 		} catch (Exception exception) {
		// 			exception.printStackTrace();
		// 		}
		// 	}
		// });
		// btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		// btnNewButton.setBounds(1000, 23, 179, 33);
		
	}
}
