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
import javax.swing.*;
/**
 * Student Registration using Swing
 * @author Project_go_brr_team
 *
 */
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
import javax.swing.*;
/**
 * Student Registration using Swing
 * @author Project_go_brr_team
 *
 */

public class ExaminerRegistration extends JFrame {
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
    private JTextField examID;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ExaminerRegistration frame = new ExaminerRegistration();
                    frame.getContentPane().setBackground(new Color(176, 224, 230));
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

    public ExaminerRegistration() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewExaminerRegister = new JLabel("New Examiner Registeration");
        lblNewExaminerRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewExaminerRegister.setBounds(302, 32, 500, 50);
        contentPane.add(lblNewExaminerRegister);

        JLabel lblExaminerNumber = new JLabel("<HTML>Examiner<BR>NO:</HTML>");
        lblExaminerNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblExaminerNumber.setBounds(58, 100, 110, 43);
        contentPane.add(lblExaminerNumber);
        
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
        
        JLabel lblIsChecker = new JLabel("Checker");
        lblIsChecker.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblIsChecker.setBounds(58, 270, 99, 43);
        contentPane.add(lblIsChecker);

        JLabel lblIsSupervisor = new JLabel("Supervisor");
        lblIsSupervisor.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblIsSupervisor.setBounds(58, 305, 110, 43);
        contentPane.add(lblIsSupervisor);
        
        JLabel lblIsSetter = new JLabel("Setter");
        lblIsSetter.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblIsSetter.setBounds(58, 340, 110, 43);
        contentPane.add(lblIsSetter);
        
        JLabel lblQualification = new JLabel("Qualification");
        lblQualification.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblQualification.setBounds(58, 375, 124, 45);
        contentPane.add(lblQualification);
        
        JLabel lblExamId = new JLabel("Exam ID");
        lblExamId.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblExamId.setBounds(58, 410, 124, 45);
        contentPane.add(lblExamId);
        
        JLabel lblSchool = new JLabel("Center");
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
        
        JLabel lblStream = new JLabel("Stream");
        lblStream.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblStream.setBounds(542, 360, 139, 26);
        contentPane.add(lblStream);
        
        enrollNum = new JTextField();
        enrollNum.setFont(new Font("Tahoma", Font.PLAIN, 22));
        enrollNum.setBounds(214, 111, 228, 25);
        contentPane.add(enrollNum);
        enrollNum.setColumns(10);
        
        firstname = new JTextField();
        firstname.setFont(new Font("Tahoma", Font.PLAIN, 22));
        firstname.setBounds(214, 161, 228, 25);
        contentPane.add(firstname);
        firstname.setColumns(10);

        lastname = new JTextField();
        lastname.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lastname.setBounds(214, 200, 228, 25);
        contentPane.add(lastname);
        lastname.setColumns(10);

        email = new JTextField();
        email.setFont(new Font("Tahoma", Font.PLAIN, 22));
        email.setBounds(214, 240, 228, 25);
        contentPane.add(email);
        email.setColumns(10);
        
        JRadioButton yesCheckRadio = new JRadioButton("Yes");
        JRadioButton noCheckRadio = new JRadioButton("No");
        yesCheckRadio.setBounds(214, 280, 100, 25);
        yesCheckRadio.setFont(new Font("Tahoma", Font.PLAIN, 18));
        yesCheckRadio.setBackground(new Color(176, 224, 230));
        contentPane.add(yesCheckRadio);
        noCheckRadio.setBounds(350, 280, 100, 25);
        noCheckRadio.setFont(new Font("Tahoma", Font.PLAIN, 18));
        noCheckRadio.setBackground(new Color(176, 224, 230));
        contentPane.add(noCheckRadio);

        JRadioButton yesSuperRadio = new JRadioButton("Yes");
        JRadioButton noSuperRadio = new JRadioButton("No");
        yesSuperRadio.setBounds(214, 315, 100, 25);
        yesSuperRadio.setFont(new Font("Tahoma", Font.PLAIN, 18));
        yesSuperRadio.setBackground(new Color(176, 224, 230));
        contentPane.add(yesSuperRadio);
        noSuperRadio.setBounds(350, 315, 100, 25);
        noSuperRadio.setFont(new Font("Tahoma", Font.PLAIN, 18));
        noSuperRadio.setBackground(new Color(176, 224, 230));
        contentPane.add(noSuperRadio);
        
        JRadioButton yesSetterRadio = new JRadioButton("Yes");
        JRadioButton noSetterRadio = new JRadioButton("No");
        yesSetterRadio.setBounds(214, 350, 100, 25);
        yesSetterRadio.setFont(new Font("Tahoma", Font.PLAIN, 18));
        yesSetterRadio.setBackground(new Color(176, 224, 230));
        contentPane.add(yesSetterRadio);
        noSetterRadio.setBounds(350, 350, 100, 25);
        noSetterRadio.setFont(new Font("Tahoma", Font.PLAIN, 18));
        noSetterRadio.setBackground(new Color(176, 224, 230));
        contentPane.add(noSetterRadio);
        
        String[] qualificationOptionsToChoose = {"BBA- Bachelor of Business Administration", "BMS- Bachelor of Management Science", "BFA- Bachelor of Fine Arts", "BEM- Bachelor of Event Management", "Integrated Law Course- BA + LL.B", "BJMC- Bachelor of Journalism and Mass Communication", "BFD- Bachelor of Fashion Designing", "BSW- Bachelor of Social Work", "BBS- Bachelor of Business Studies", "BTTM- Bachelor of Travel and Tourism Management", "Aviation Courses", "B.Sc- Interior Design", "B.Sc.- Hospitality and Hotel Administration", "Bachelor of Design (B. Design)", "Bachelor of Performing Arts", "BA- Bachelor of Arts", "BE/B.Tech- Bachelor of Technology", "B.Arch- Bachelor of Architecture", "BCA- Bachelor of Computer Applications", "B.Sc.- Information Technology", "B.Sc- Nursing", "BPharma- Bachelor of Pharmacy", "B.Sc- Interior Design", "BDS- Bachelor of Dental Surgery", "Animation, Graphics and Multimedia", "B.Sc. – Nutrition & Dietetics", "BPT- Bachelor of Physiotherapy", "B.Sc- Applied Geology", "BA/B.Sc. Liberal Arts", "B.Sc.- Physics", "B.Sc. Chemistry", "B.Sc. Mathematics", "B.Com- Bachelor of Commerce", "BBA- Bachelor of Business Administration", "B.Com (Hons.)", "BA (Hons.) in Economics", "Integrated Law Program- B.Com LL.B.", "Integarted Law Program- BBA LL.B"}; 
        JComboBox <String> qualificationComboBox = new JComboBox<>(qualificationOptionsToChoose);
        qualificationComboBox.setBounds(214, 390, 230, 25);
        contentPane.add(qualificationComboBox);

        examID = new JTextField();
        examID.setFont(new Font("Tahoma", Font.PLAIN, 22));
        examID.setBounds(214, 425, 228, 25);
        contentPane.add(examID);
        examID.setColumns(10);
        
        int ii=0;
        try {
        	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");
        	Statement stmt = connection.createStatement();
        	ResultSet rs = stmt.executeQuery("SELECT schoolid FROM school ;");
        	while (rs.next()) {
        		ii=ii+1;
        	}
        }catch(SQLException err) {
 	         System.out.println("SQL exception occured" + err);
 	      }
        String[] schoolOptionsToChoose = new String[ii];
        try {
        	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");
        	Statement stmt = connection.createStatement();
        	ResultSet rs = stmt.executeQuery("SELECT schoolid FROM school ;");
        	int i=0;
        	while (rs.next()) {
        		String sd = rs.getString("schoolid");
        		schoolOptionsToChoose[i]= sd;
        		i=i+1;

        	}
        }catch(SQLException err) {
 	         System.out.println("SQL exception occured" + err);
 	      }
        //String[] schoolOptionsToChoose = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        JComboBox <String> schoolComboBox = new JComboBox<>(schoolOptionsToChoose);
        schoolComboBox.setBounds(700, 120, 230, 25);
        contentPane.add(schoolComboBox);
        
        username = new JTextField();
        username.setFont(new Font("Tahoma", Font.PLAIN, 22));
        username.setBounds(707, 160, 228, 25);
        contentPane.add(username);
        username.setColumns(10);
        
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 22));
        passwordField.setBounds(707, 200, 228, 25);
        contentPane.add(passwordField);
        
        mob = new JTextField();
        mob.setFont(new Font("Tahoma", Font.PLAIN, 22));
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
        
        JRadioButton genderRadioM = new JRadioButton("Male");
        JRadioButton genderRadioF = new JRadioButton("Female");
        JRadioButton genderRadioO = new JRadioButton("Others");
        genderRadioM.setBounds(707, 320, 95, 25);
        genderRadioM.setFont(new Font("Tahoma", Font.PLAIN, 18));
        genderRadioM.setBackground(new Color(176, 224, 230));
        contentPane.add(genderRadioM);
        genderRadioF.setBounds(800, 320, 95, 25);
        genderRadioF.setFont(new Font("Tahoma", Font.PLAIN, 18));
        genderRadioF.setBackground(new Color(176, 224, 230));
        contentPane.add(genderRadioF);
        genderRadioO.setBounds(900, 320, 95, 25);
        genderRadioO.setFont(new Font("Tahoma", Font.PLAIN, 18));
        genderRadioO.setBackground(new Color(176, 224, 230));
        contentPane.add(genderRadioO);
        
        int iii=0;
        try {
        	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");
        	Statement stmt = connection.createStatement();
        	ResultSet rs = stmt.executeQuery("SELECT sid FROM stream ;");
        	while (rs.next()) {
        		iii=iii+1;
        	}
        }catch(SQLException err) {
 	         System.out.println("SQL exception occured" + err);
 	      }
        String[] streamOptionsToChoose = new String[iii];
        try {
        	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");
        	Statement stmt = connection.createStatement();
        	ResultSet rs = stmt.executeQuery("SELECT sid FROM stream ;");
        	int i=0;
        	while (rs.next()) {
        		String std = rs.getString("sid");
        		streamOptionsToChoose[i]= std;
        		i=i+1;

        	}
        }catch(SQLException err) {
 	         System.out.println("SQL exception occured" + err);
 	      }
        
        //String[] streamOptionsToChoose = {"1","2","3","4"};
        JComboBox <String> streamComboBox = new JComboBox<>(streamOptionsToChoose);
        streamComboBox.setBounds(707, 360, 228, 25);
        contentPane.add(streamComboBox);
        
        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String EID = enrollNum.getText();
                String firstName = firstname.getText();
                String lastName = lastname.getText();
                String FullName = firstName+" "+lastName;
                String isSettr = "null";
                if(yesSetterRadio.isSelected()) { isSettr = "true";}
                if(noSetterRadio.isSelected()) { isSettr = "false";}
                String isCheckr = "null";
                if(yesCheckRadio.isSelected()) { isCheckr = "true";}
                if(yesCheckRadio.isSelected()) { isCheckr = "false";}
                String isSuper = "null";
                if(yesSuperRadio.isSelected()) { isSuper = "true";}
                if(noSuperRadio.isSelected()) { isSuper = "false";}
                String emailID = email.getText();
                String userName = username.getText();
                String PassWord = String.valueOf(passwordField.getPassword());
                String Qualification = qualificationComboBox.getSelectedItem().toString();
                String ExamID = examID.getText();
                String centerID = schoolComboBox.getSelectedItem().toString();
                String state = jComboBox.getSelectedItem().toString();
                String city = jiComboBox.getSelectedItem().toString();
                String stream = streamComboBox.getSelectedItem().toString();
                String mobile = mob.getText();
                int mobLen = mobile.length();
                String gender_ = "null";
                if(genderRadioM.isSelected()) { gender_ = "male";}
                if(genderRadioF.isSelected()) { gender_ = "female";}
                if(genderRadioO.isSelected()) { gender_ = "others";}
                //int aadharLen = aadhar.getText().length();
                //String password =String.valueOf( passwordField.getPassword());
                
                String msg = "" + FullName;
                msg += " \n";
                if (mobLen != 10) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
                }
                
                try {
                	Class.forName("org.postgresql.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");

                    String query = "INSERT INTO examinar values(" + EID + ",'" + firstName + "','" + lastName + "'," +mobile+",'"+emailID+"','"+Qualification+"','"+gender_+"',"+stream+","+isCheckr+","+
                    	isSuper+","+isSettr+","+centerID+","+ExamID+",'"+state+"','"+city+"','"+userName+"','"+PassWord+"');";
                    System.out.print(query);
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "Examiner already exists");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Welcome, " + msg + "Examiner has been registered sucessfully !");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        backButton.setBounds(199, 480, 259, 50);
        contentPane.add(backButton);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (JOptionPane.showConfirmDialog(contentPane, "Confirm if you want to logout",
						"Examinar Registration Systems",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            				dispose();
            				HomePage HomePage = new HomePage();
            				HomePage.setVisible(true);
            	}
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(699, 480, 259, 50);
        contentPane.add(btnNewButton);
        getContentPane().setBackground(new Color(176, 224, 230));
    }
}
