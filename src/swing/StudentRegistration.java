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

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
/**
 * Student Registration using Swing
 * @author Project_go_brr_team
 *
 */
public class StudentRegistration extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField firstname;
    private JTextField fathersname;
    private JTextField mothersname;
    private JTextField dob;
    private JTextField gender;
    private JTextField enrollNum;
    private JTextField aadhar;
    private JTextField lastname;
    private JTextField email;
    private JTextField username;
    private JTextField lblStream;
    private JTextField mob;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StudentRegistration frame = new StudentRegistration();
                    frame.getContentPane().setBackground(new Color(153, 255, 255));
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

    public StudentRegistration() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("New Student Registeration");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(302, 32, 500, 50);
        contentPane.add(lblNewUserRegister);

        JLabel lblEnrollNumber = new JLabel("<HTML>Enrollment<BR>NO:</HTML>");
        lblEnrollNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblEnrollNumber.setBounds(58, 100, 110, 43);
        contentPane.add(lblEnrollNumber);
        
        JLabel lblName = new JLabel("First name");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblName.setBounds(58, 150, 99, 43);
        contentPane.add(lblName);

        JLabel lblNewLabel = new JLabel("Last name");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel.setBounds(58, 200, 110, 29);
        contentPane.add(lblNewLabel);

        JLabel lblEmailAddress = new JLabel("Email\r\n address");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblEmailAddress.setBounds(58, 235, 124, 36);
        contentPane.add(lblEmailAddress);
        
        JLabel lblfName = new JLabel("<html>Father's name</html>");
        lblfName.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblfName.setBounds(58, 280, 99, 43);
        contentPane.add(lblfName);

        JLabel lblmName = new JLabel("<html>Mothers's name</html>");
        lblmName.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblmName.setBounds(58, 340, 110, 43);
        contentPane.add(lblmName);

        JLabel lblDOB = new JLabel("<HTML>DOB<BR>(DD/MM/YYYY)</HTML>");
        lblDOB.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblDOB.setBounds(58, 390, 124, 45);
        contentPane.add(lblDOB);

        JLabel lblSchool = new JLabel("School");
        lblSchool.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblSchool.setBounds(542, 120, 99, 29);
        contentPane.add(lblSchool);
        
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblUsername.setBounds(542, 159, 99, 29);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPassword.setBounds(542, 200, 99, 24);
        contentPane.add(lblPassword);

        JLabel lblMobileNumber = new JLabel("Mobile number");
        lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblMobileNumber.setBounds(542, 240, 139, 26);
        contentPane.add(lblMobileNumber);
        
        JLabel lblStateAndCity = new JLabel("State & City");
        lblStateAndCity.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblStateAndCity.setBounds(542, 280, 139, 26);
        contentPane.add(lblStateAndCity);
        
        JLabel lblGender = new JLabel("Gender");
        lblGender.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblGender.setBounds(542, 320, 139, 26);
        contentPane.add(lblGender);
        
        JLabel lblAadhar = new JLabel("Aadhar");
        lblAadhar.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblAadhar.setBounds(542, 360, 139, 26);
        contentPane.add(lblAadhar);
        
        JLabel lblStream = new JLabel("Stream");
        lblStream.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblStream.setBounds(542, 400, 139, 26);
        contentPane.add(lblStream);
        
        enrollNum = new JTextField();
        enrollNum.setFont(new Font("Tahoma", Font.PLAIN, 32));
        enrollNum.setBounds(214, 111, 228, 25);
        contentPane.add(enrollNum);
        enrollNum.setColumns(10);
        
        firstname = new JTextField();
        firstname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        firstname.setBounds(214, 161, 228, 25);
        contentPane.add(firstname);
        firstname.setColumns(10);

        lastname = new JTextField();
        lastname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        lastname.setBounds(214, 200, 228, 25);
        contentPane.add(lastname);
        lastname.setColumns(10);

        email = new JTextField();
        email.setFont(new Font("Tahoma", Font.PLAIN, 32));
        email.setBounds(214, 240, 228, 25);
        contentPane.add(email);
        email.setColumns(10);
        
        fathersname = new JTextField();
        fathersname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        fathersname.setBounds(214, 290, 228, 25);
        contentPane.add(fathersname);
        fathersname.setColumns(10);

        mothersname = new JTextField();
        mothersname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        mothersname.setBounds(214, 350, 228, 25);
        contentPane.add(mothersname);
        mothersname.setColumns(10);
        
        ArrayList<Integer> days = new ArrayList<Integer>();
        for (int i = 1; i <= 31; ++i) {
        	days.add(i);
        }
        JComboBox dayComboBox = new JComboBox(days.toArray());
        dayComboBox.setBounds(214, 410, 50, 25);
        contentPane.add(dayComboBox);
        String[] monthOptionsToChoose = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; 
        JComboBox <String> monthComboBox = new JComboBox<>(monthOptionsToChoose);
        monthComboBox.setBounds(270, 410, 90, 25);
        contentPane.add(monthComboBox);
        ArrayList<Integer> year = new ArrayList<Integer>();
        for (int i = 1998; i <= 2025; ++i) {
        	year.add(i);
        }
        JComboBox yearComboBox = new JComboBox(year.toArray());
        yearComboBox.setBounds(370, 410, 70, 25);
        contentPane.add(yearComboBox);
        
        String[] schoolOptionsToChoose = {"school1","school2"}; 
        JComboBox <String> schoolComboBox = new JComboBox<>(schoolOptionsToChoose);
        schoolComboBox.setBounds(707, 120, 225, 25);
        contentPane.add(schoolComboBox);
        
        username = new JTextField();
        username.setFont(new Font("Tahoma", Font.PLAIN, 32));
        username.setBounds(707, 160, 228, 25);
        contentPane.add(username);
        username.setColumns(10);
        
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(707, 200, 228, 25);
        contentPane.add(passwordField);
        
        mob = new JTextField();
        mob.setFont(new Font("Tahoma", Font.PLAIN, 32));
        mob.setBounds(707, 240, 228, 25);
        contentPane.add(mob);
        mob.setColumns(10);
        
        String[] stateOptionsToChoose = {"Andhra Pradesh","Arunachal Pradesh ","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu and Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal","Andaman and Nicobar Islands","Chandigarh","Dadra and Nagar Haveli","Daman and Diu","Lakshadweep","National Capital Territory of Delhi","Puducherry"}; 
        JComboBox <String> jComboBox = new JComboBox<>(stateOptionsToChoose);
        jComboBox.setBounds(707, 280, 114, 25);
        contentPane.add(jComboBox);

        String[] cityOptionsToChoose = {"Delhi", "Mumbai", "Kolkāta", "Bangalore", "Chennai", "Hyderābād", "Pune", "Ahmedabad", "Sūrat", "Lucknow", "Jaipur", "Cawnpore", "Mirzāpur", "Nāgpur", "Ghāziābād", "Indore", "Vadodara", "Vishākhapatnam", "Bhopāl", "Chinchvad", "Patna", "Ludhiāna", "Āgra", "Kalyān", "Madurai", "Jamshedpur", "Nāsik", "Farīdābād", "Aurangābād", "Rājkot", "Meerut", "Jabalpur", "Thāne", "Dhanbād", "Allahābād", "Vārānasi", "Srīnagar", "Amritsar", "Alīgarh", "Bhiwandi", "Gwalior", "Bhilai", "Hāora", "Rānchi", "Bezwāda", "Chandīgarh", "Mysore", "Raipur", "Kota", "Bareilly", "Jodhpur", "Coimbatore", "Dispur", "Guwāhāti", "Solāpur", "Trichinopoly", "Hubli", "Jalandhar", "Bhubaneshwar", "Bhayandar", "Morādābād", "Kolhāpur", "Thiruvananthapuram", "Sahāranpur", "Warangal", "Salem", "Mālegaon", "Kochi", "Gorakhpur", "Shimoga", "Tiruppūr", "Guntūr", "Raurkela", "Mangalore", "Nānded", "Cuttack", "Chānda", "Dehra", "Dūn", "Durgāpur", "Āsansol", "Bhāvnagar", "Amrāvati", "Nellore", "Ajmer", "Tinnevelly", "Bīkaner", "Agartala", "Ujjain", "Jhānsi", "Ulhāsnagar", "Davangere", "Jammu", "Belgaum", "Gulbarga", "Jamnagar", "Dhūlia", "Gaya", "Jalgaon", "Kurnool", "Udaipur", "Bellary", "Sāngli", "Tuticorin", "Calicut", "Akola", "Bhāgalpur", "Sīkar", "Tumkūr", "Quilon", "Muzaffarnagar", "Bhīlwāra", "Nizāmābād", "Bhātpāra", "Kākināda", "Parbhani", "Pānihāti", "Lātūr", "Rohtak", "Rājapālaiyam", "Ahmadnagar", "Cuddapah", "Rājahmundry", "Alwar", "Muzaffarpur", "Bilāspur", "Mathura", "Kāmārhāti", "Patiāla", "Saugor", "Bijāpur", "Brahmapur", "Shāhjānpur", "Trichūr", "Barddhamān", "Kulti", "Sambalpur", "Purnea", "Hisar", "Fīrozābād", "Bīdar", "Rāmpur", "Shiliguri", "Bāli", "Pānīpat", "Karīmnagar", "Bhuj", "Ichalkaranji", "Tirupati", "Hospet", "Āīzawl", "Sannai", "Bārāsat", "Ratlām", "Handwāra", "Drug", "Imphāl", "Anantapur", "Etāwah", "Rāichūr", "Ongole", "Bharatpur", "Begusarai", "Sonīpat", "Rāmgundam", "Hāpur", "Uluberiya", "Porbandar", "Pāli", "Vizianagaram", "Puducherry", "Karnāl", "Nāgercoil", "Tanjore", "Sambhal", "Naihāti", "Secunderābād", "Kharagpur", "Dindigul", "Shimla", "Ingrāj", "Bāzār", "Ellore", "Puri", "Haldia", "Nandyāl", "Bulandshahr", "Chakradharpur", "Bhiwāni", "Gurgaon", "Burhānpur", "Khammam", "Madhyamgram", "Ghāndīnagar", "Baharampur", "Mahbūbnagar", "Mahesāna", "Ādoni", "Rāiganj", "Bhusāval", "Bahraigh", "Shrīrāmpur", "Tonk", "Sirsa", "Jaunpur", "Madanapalle", "Hugli", "Vellore", "Alleppey", "Cuddalore", "Deo", "Chīrāla", "Machilīpatnam", "Medinīpur", "Bāramūla", "Chandannagar", "Fatehpur", "Udipi", "Tenāli", "Sitalpur", "Conjeeveram", "Proddatūr", "Navsāri", "Godhra", "Budaun", "Chittoor", "Harīpur", "Saharsa", "Vidisha", "Pathānkot", "Nalgonda", "Dibrugarh", "Bālurghāt", "Krishnanagar", "Fyzābād", "Silchar", "Shāntipur", "Hindupur", "Erode", "Jāmuria", "Hābra", "Ambāla", "Mauli", "Kolār", "Shillong", "Bhīmavaram", "New", "Delhi", "Mandsaur", "Kumbakonam", "Tiruvannāmalai", "Chicacole", "Bānkura", "Mandya", "Hassan", "Yavatmāl", "Pīlibhīt", "Pālghāt", "Abohar", "Pālakollu", "Kānchrāpāra", "Port", "Blair", "Alīpur", "Duār", "Hāthras", "Guntakal", "Navadwīp", "Basīrhat", "Hālīsahar", "Rishra", "Dharmavaram", "Baidyabāti", "Darjeeling", "Sopur", "Gudivāda", "Adilābād", "Titāgarh", "Chittaurgarh", "Narasaraopet", "Dam", "Dam", "Vālpārai", "Osmānābād", "Champdani", "Bangaon", "Khardah", "Tādpatri", "Jalpāiguri", "Suriāpet", "Tādepallegūdem", "Bānsbāria", "Negapatam", "Bhadreswar", "Chilakalūrupet", "Kalyani", "Gangtok", "Kohīma", "Khambhāt", "Aurangābād", "Emmiganūr", "Rāyachoti", "Kāvali", "Mancherāl", "Kadiri", "Ootacamund", "Anakāpalle", "Sirsilla", "Kāmāreddipet", "Pāloncha", "Kottagūdem", "Tanuku", "Bodhan", "Karūr", "Mangalagiri", "Kairāna", "Mārkāpur", "Malaut", "Bāpatla", "Badvel", "Jorhāt", "Koratla", "Pulivendla", "Jaisalmer", "Tādepalle", "Armūr", "Jatani", "Gadwāl", "Nagari", "Wanparti", "Ponnūru", "Vinukonda", "Itānagar", "Tezpur", "Narasapur", "Kothāpet", "Mācherla", "Kandukūr", "Sāmalkot", "Bobbili", "Sattenapalle", "Vrindāvan", "Mandapeta", "Belampalli", "Bhīmunipatnam", "Nāndod", "Pithāpuram", "Punganūru", "Puttūr", "Jalor", "Palmaner", "Dholka", "Jaggayyapeta", "Tuni", "Amalāpuram", "Jagtiāl", "Vikārābād", "Venkatagiri", "Sihor", "Jangaon", "Mandamāri", "Metpalli", "Repalle", "Bhainsa", "Jasdan", "Jammalamadugu", "Rāmeswaram", "Addanki", "Nidadavole", "Bodupāl", "Rājgīr", "Rajaori", "Naini", "Tal", "Channarāyapatna", "Maihar", "Panaji", "Junnar", "Amudālavalasa", "Damān", "Kovvūr", "Solan", "Dwārka", "Pathanāmthitta", "Kodaikānal", "Udhampur", "Giddalūr", "Yellandu", "Shrīrangapattana", "Angamāli", "Umaria", "Fatehpur", "Sīkri", "Mangūr", "Pedana", "Uran", "Chimākurti", "Devarkonda", "Bandipura", "Silvassa", "Pāmidi", "Narasannapeta", "Jaynagar-Majilpur", "Khed", "Brahma", "Khajurāho", "Koilkuntla", "Diu", "Kulgam", "Gauripur", "Abu", "Curchorem", "Kavaratti", "Panchkula", "Kagaznāgār"}; 
        JComboBox <String> jiComboBox = new JComboBox<>(cityOptionsToChoose);
        jiComboBox.setBounds(820, 280, 114, 25);
        contentPane.add(jiComboBox);

        String[] streamOptionsToChoose = {"PCMB-Hindi","PCMB-Sanskrit"}; 
        JComboBox <String> streamComboBox = new JComboBox<>(streamOptionsToChoose);
        streamComboBox.setBounds(707, 400, 225, 25);
        contentPane.add(streamComboBox);
        
        JRadioButton genderRadioM = new JRadioButton("Male");
        JRadioButton genderRadioF = new JRadioButton("Female");
        JRadioButton genderRadioO = new JRadioButton("Others");
        genderRadioM.setBounds(707, 320, 95, 25);
        genderRadioM.setFont(new Font("Tahoma", Font.PLAIN, 18));
        genderRadioM.setBackground(new Color(153, 255, 255));
        contentPane.add(genderRadioM);
        genderRadioF.setBounds(800, 320, 95, 25);
        genderRadioF.setFont(new Font("Tahoma", Font.PLAIN, 18));
        genderRadioF.setBackground(new Color(153, 255, 255));
        contentPane.add(genderRadioF);
        genderRadioO.setBounds(900, 320, 95, 25);
        genderRadioO.setFont(new Font("Tahoma", Font.PLAIN, 18));
        genderRadioO.setBackground(new Color(153, 255, 255));
        contentPane.add(genderRadioO);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Tahoma", Font.PLAIN, 32));
        aadhar.setBounds(707, 360, 228, 25);
        contentPane.add(aadhar);
        
        
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
                    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/invention_management_system\", \"postgres\", \"prabithgupta");

                    String query = "INSERT INTO student values('" + firstName + "','" + lastName + "','" + userName + "','" +
                        password + "','" + emailId + "','" + mobileNumber + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Welcome, " + msg + "Student has registered sucessfully ! ");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(399, 480, 259, 50);
        contentPane.add(btnNewButton);
    }
}
