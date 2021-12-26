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

/**
 * Student Registration using Swing
 * 
 * @author Project_go_brr_team
 *
 */

public class StudentMarks extends JFrame {
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
	private JTextField jtxtSurname;
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
					StudentMarks frame = new StudentMarks();
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

	public StudentMarks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 255));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setBounds(10, 10, 1338, 850);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(new Color(153, 255, 255));
		panel_1.setBounds(26, 26, 1280, 95);
		panel.add(panel_1);

		JLabel lblMembershipRegistrationSystem = new JLabel("Student Marks Registration");
		lblMembershipRegistrationSystem.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblMembershipRegistrationSystem.setBounds(210, 11, 847, 61);
		panel_1.add(lblMembershipRegistrationSystem);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_2.setBackground(new Color(153, 255, 255));
		panel_2.setBounds(26, 132, 518, 481);
		panel.add(panel_2);

		JLabel lblNewLabel = new JLabel("Roll Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(28, 30, 150, 25);
		panel_2.add(lblNewLabel);

		JLabel lblFirstname = new JLabel("Name");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFirstname.setBounds(28, 60, 150, 25);
		panel_2.add(lblFirstname);

		jtxtRollNo = new JTextField();
		jtxtRollNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtRollNo.setColumns(10);
		jtxtRollNo.setBounds(245, 25, 218, 27);
		panel_2.add(jtxtRollNo);

		jtxtName = new JTextField();
		jtxtName.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtName.setColumns(10);
		jtxtName.setBounds(245, 57, 218, 26);
		panel_2.add(jtxtName);

		SpinnerModel value = new SpinnerNumberModel(0, 0, 100, 1);

		jtxtPhysics = new JSpinner(value);
		jtxtPhysics.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtPhysics.setBounds(245, 123, 218, 26);
		panel_2.add(jtxtPhysics);

		jtxtChemistry = new JSpinner();
		jtxtChemistry.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtChemistry.setBounds(245, 152, 218, 26);
		panel_2.add(jtxtChemistry);

		jtxtMaths = new JSpinner();
		jtxtMaths.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtMaths.setBounds(245, 182, 218, 26);
		panel_2.add(jtxtMaths);

		jtxtEnglish = new JSpinner();
		jtxtEnglish.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtEnglish.setBounds(245, 212, 218, 26);
		panel_2.add(jtxtEnglish);

		jtxtBiology = new JSpinner();
		jtxtBiology.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtBiology.setBounds(245, 242, 218, 26);
		panel_2.add(jtxtBiology);

		jtxtComp = new JSpinner();
		jtxtComp.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtComp.setBounds(245, 272, 218, 26);
		panel_2.add(jtxtComp);

		jtxtBS = new JSpinner();
		jtxtBS.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtBS.setBounds(245, 302, 218, 26);
		panel_2.add(jtxtBS);

		jtxtGeography = new JSpinner();
		jtxtGeography.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtGeography.setBounds(245, 332, 218, 26);
		panel_2.add(jtxtGeography);

		jtxtHistory = new JSpinner();
		jtxtHistory.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtHistory.setBounds(245, 362, 218, 26);
		panel_2.add(jtxtHistory);

		JLabel label = new JLabel("Stream");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(28, 90, 154, 25);
		panel_2.add(label);

		JComboBox streamList = new JComboBox();
		streamList.setModel(
				new DefaultComboBoxModel(new String[] { "Make a Selection", "PCMB", "PCM", "Commerce", "Humanities" }));
		streamList.setFont(new Font("Tahoma", Font.BOLD, 20));
		streamList.setBounds(245, 92, 218, 26);
		panel_2.add(streamList);

		JLabel label_1 = new JLabel("Physics");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(28, 120, 154, 25);
		panel_2.add(label_1);

		JLabel label_2 = new JLabel("Chemistry");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBounds(28, 150, 154, 25);
		panel_2.add(label_2);

		JLabel label_3 = new JLabel("Maths");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_3.setBounds(28, 180, 154, 25);
		panel_2.add(label_3);

		JLabel label_4 = new JLabel("English");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_4.setBounds(28, 210, 154, 25);
		panel_2.add(label_4);

		JLabel label_5 = new JLabel("Biology");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_5.setBounds(28, 240, 154, 25);
		panel_2.add(label_5);

		JLabel label_6 = new JLabel("Comp. Science");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_6.setBounds(28, 270, 187, 25);
		panel_2.add(label_6);

		JLabel label_7 = new JLabel("Business Studies");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_7.setBounds(28, 300, 154, 25);
		panel_2.add(label_7);

		JLabel label_8 = new JLabel("Geography");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_8.setBounds(28, 330, 154, 25);
		panel_2.add(label_8);

		JLabel label_9 = new JLabel("History");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_9.setBounds(28, 360, 154, 25);
		panel_2.add(label_9);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_3.setBackground(new Color(153, 255, 255));
		panel_3.setBounds(26, 624, 1280, 105);
		panel.add(panel_3);

		JButton button = new JButton("Add Record");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
						jtxtRollNo.getText(),
						jtxtName.getText(),
						streamList.getSelectedItem().toString(),
						
						//jtxtSurname.getText(),
						jtxtPhysics.getValue(),
						jtxtChemistry.getValue(),
						jtxtMaths.getValue(),
						jtxtEnglish.getValue(),
						jtxtBiology.getValue(),
						jtxtComp.getValue(),
						jtxtBS.getValue(),
						jtxtGeography.getValue(),
						jtxtHistory.getValue(),
						//streamList.getSelectedItem(),
				});
				String msg = jtxtName.getText()+"\n";
				try {
                	Class.forName("org.postgresql.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");

                    String query = "INSERT INTO marks values(" + jtxtRollNo.getText() + ",'" + jtxtName.getText() + "','" + streamList.getSelectedItem().toString() + "',"
                    +jtxtPhysics.getValue()+","+jtxtChemistry.getValue()+","+jtxtMaths.getValue()+","+jtxtEnglish.getValue()+","+jtxtBiology.getValue()+","+jtxtComp.getValue()+","+
                    jtxtBS.getValue()+","+jtxtGeography.getValue()+","+jtxtHistory.getValue()+");";
                    System.out.print(query);
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "Marks already exists");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Welcome,\nMarks has been registered sucessfully for"+msg+"!");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Marks Update confirmed",
								"Marks  Management System",
								JOptionPane.OK_OPTION);
					}
				}

			}

		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(43, 23, 179, 33);
		panel_3.add(button);

		JButton button_1 = new JButton("Reset");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jtxtRollNo.setText("");
				jtxtName.setText("");
				//jtxtSurname.setText("");
				jtxtPhysics.setValue(0);
				jtxtChemistry.setValue(0);
				jtxtMaths.setValue(0);
				jtxtEnglish.setValue(0);
				jtxtBiology.setValue(0);
				jtxtComp.setValue(0);
				jtxtBS.setValue(0);
				jtxtGeography.setValue(0);
				jtxtHistory.setValue(0);
				streamList.setSelectedItem("");
			}
			
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(260, 23, 179, 33);
		panel_3.add(button_1);

		JButton button_2 = new JButton("Delete");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {

						JOptionPane.showMessageDialog(null, "No data to delete ",
								"Membership Management System", JOptionPane.OK_OPTION);
					} else {

						JOptionPane.showMessageDialog(null, "Select a row to delete ",
								"Membership Management System", JOptionPane.OK_OPTION);
					}
				} else {
					try {
	                	Class.forName("org.postgresql.Driver");
	                    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");

	                    String query = "DELETE FROM marks WHERE (enrollno = "+table.getModel().getValueAt(table.getSelectedRow(), 0) + ");";
	                    System.out.print(query);
	                    Statement sta = connection.createStatement();
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) {
	                        JOptionPane.showMessageDialog(btnNewButton, "Marks already deleted");
	                    } else {
	                        JOptionPane.showMessageDialog(btnNewButton,
	                            "Welcome,\nMarks has been deleted sucessfully for "+table.getModel().getValueAt(table.getSelectedRow(), 1)+"!");
	                    }
	                    connection.close();
	                } catch (Exception exception) {
	                    exception.printStackTrace();
	                }
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Marks Update confirmed",
									"Marks  Management System",
									JOptionPane.OK_OPTION);
						}
					}
					System.out.println(table.getModel().getValueAt(0, 0));
					model.removeRow(table.getSelectedRow());
				}

			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2.setBounds(740, 23, 179, 33);
		panel_3.add(button_2);

		JButton exitButton = new JButton("Back");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to logout",
						"Marks Registration Systems",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					 dispose();
					 HomePage HomePage = new HomePage();
					 HomePage.setVisible(true);
				}

			}
		});
		exitButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		exitButton.setBounds(1000, 23, 179, 33);
		panel_3.add(exitButton);

		JButton printButton = new JButton("Print");
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No Printer found", e.getMessage());
				}
			}
		});
		printButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		printButton.setBounds(501, 23, 179, 33);
		panel_3.add(printButton);

		// add submit button
		JButton submitButton = new JButton("Submit");
		submitButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		submitButton.setBounds(1000, 23, 179, 33);
		panel_3.add(submitButton);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_4.setBackground(new Color(153, 255, 255));
		panel_4.setBounds(562, 132, 744, 381);
		panel.add(panel_4);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 24, 681, 333);
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

		btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = firstname.getText();
				String lastName = lastname.getText();
				String emailId = email.getText();
				String userName = username.getText();
				String mobileNumber = mob.getText();
				int mobLen = mobileNumber.length();
				int aadharLen = aadhar.getText().length();
				String password = passwordField.getText();

				String msg = "" + firstName;
				msg += " \n";
				if (mobLen != 10) {
					JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
				}
				if (aadharLen != 12) {
					JOptionPane.showMessageDialog(btnNewButton, "Enter a valid Aadhar number");
				}
				try {
					Class.forName("org.postgresql.Driver");
					Connection connection = DriverManager.getConnection(
							"jdbc:postgresql://localhost:5432/invention_management_system\", \"postgres\", \"prabithgupta");

					String query = "INSERT INTO student values('" + firstName + "','" + lastName + "','" + userName
							+ "','" +
							password + "','" + emailId + "','" + mobileNumber + "')";

					Statement sta = connection.createStatement();
					int x = sta.executeUpdate(query);
					if (x == 0) {
						JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
					} else {
						JOptionPane.showMessageDialog(btnNewButton,
								"Welcome, " + msg + "Examiner has registerd sucessfully !");
					}
					connection.close();
				} catch (Exception exception) {
					exception.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(1000, 23, 179, 33);
		panel_3.add(btnNewButton);
	}
}
