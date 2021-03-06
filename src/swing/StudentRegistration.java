package swing;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    public StudentRegistration() {
        // setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        // setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("New Student Registration");
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
        lblSchool.setBounds(542, 100, 99, 29);
        contentPane.add(lblSchool);
        
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblUsername.setBounds(542, 139, 99, 29);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPassword.setBounds(542, 180, 99, 24);
        contentPane.add(lblPassword);

        JLabel lblMobileNumber = new JLabel("Mobile number");
        lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblMobileNumber.setBounds(542, 220, 139, 26);
        contentPane.add(lblMobileNumber);
        
        JLabel lblStateAndCity = new JLabel("State & City");
        lblStateAndCity.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblStateAndCity.setBounds(542, 260, 139, 26);
        contentPane.add(lblStateAndCity);
        
        JLabel lblGender = new JLabel("Gender");
        lblGender.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblGender.setBounds(542, 300, 139, 26);
        contentPane.add(lblGender);
        
        JLabel lblAadhar = new JLabel("Aadhar");
        lblAadhar.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblAadhar.setBounds(542, 340, 139, 26);
        contentPane.add(lblAadhar);
        
        JLabel lblStream = new JLabel("Stream");
        lblStream.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblStream.setBounds(542, 380, 139, 26);
        contentPane.add(lblStream);
        
        JLabel lblCenter = new JLabel("Center");
        lblCenter.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblCenter.setBounds(542, 420, 139, 26);
        contentPane.add(lblCenter);
        
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
        
        fathersname = new JTextField();
        fathersname.setFont(new Font("Tahoma", Font.PLAIN, 22));
        fathersname.setBounds(214, 290, 228, 25);
        contentPane.add(fathersname);
        fathersname.setColumns(10);

        mothersname = new JTextField();
        mothersname.setFont(new Font("Tahoma", Font.PLAIN, 22));
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
        ArrayList<String> year = new ArrayList<String>();
        for (int i = 1998; i <= 2025; ++i) {
        	year.add(String.valueOf(i));
        }
        JComboBox yearComboBox = new JComboBox(year.toArray());
        yearComboBox.setBounds(370, 410, 70, 25);
        contentPane.add(yearComboBox);
        
        int iiii=0;
        try {
        	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");
        	Statement stmt = connection.createStatement();
        	ResultSet rs = stmt.executeQuery("SELECT schoolid FROM school ;");
        	while (rs.next()) {
        		iiii=iiii+1;
        	}
        }catch(SQLException err) {
 	         System.out.println("SQL exception occured" + err);
 	      }
        String[] schoolOptionsToChoose = new String[iiii];
        try {
        	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");
        	Statement stmt = connection.createStatement();
        	ResultSet rs = stmt.executeQuery("SELECT schoolid FROM school ;");
        	int i=0;
        	while (rs.next()) {
        		String scd = rs.getString("schoolid");
        		schoolOptionsToChoose[i]= scd;
        		i=i+1;

        	}
        }catch(SQLException err) {
 	         System.out.println("SQL exception occured" + err);
 	      }
        
        //String[] schoolOptionsToChoose = {"1","2"}; //{"school1","school2"}; 
        JComboBox <String> schoolComboBox = new JComboBox<>(schoolOptionsToChoose);
        schoolComboBox.setBounds(707, 100, 225, 25);
        contentPane.add(schoolComboBox);
        
        username = new JTextField();
        username.setFont(new Font("Tahoma", Font.PLAIN, 22));
        username.setBounds(707, 140, 228, 25);
        contentPane.add(username);
        username.setColumns(10);
        
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 22));
        passwordField.setBounds(707, 180, 228, 25);
        contentPane.add(passwordField);
        
        mob = new JTextField();
        mob.setFont(new Font("Tahoma", Font.PLAIN, 22));
        mob.setBounds(707, 220, 228, 25);
        contentPane.add(mob);
        mob.setColumns(10);
        
        String[] stateOptionsToChoose = {"Andhra Pradesh","Arunachal Pradesh ","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu and Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal","Andaman and Nicobar Islands","Chandigarh","Dadra and Nagar Haveli","Daman and Diu","Lakshadweep","National Capital Territory of Delhi","Puducherry"}; 
        JComboBox <String> jComboBox = new JComboBox<>(stateOptionsToChoose);
        jComboBox.setBounds(707, 260, 114, 25);
        contentPane.add(jComboBox);

        String[] cityOptionsToChoose = { "Abohar", "Abu", "Addanki", "Adil??b??d", "Agartala", "Ahmadnagar", "Ahmedabad",
                "Ajmer", "Akola", "Allah??b??d", "Alleppey", "Alwar", "Al??garh", "Al??pur", "Amal??puram", "Amb??la",
                "Amritsar", "Amr??vati", "Amud??lavalasa", "Anak??palle", "Anantapur", "Angam??li", "Arm??r", "Aurang??b??d",
                "Aurang??b??d", "Badvel", "Baharampur", "Bahraigh", "Baidyab??ti", "Bandipura", "Bangalore", "Bangaon",
                "Barddham??n", "Bareilly", "Bas??rhat", "Begusarai", "Belampalli", "Belgaum", "Bellary", "Bezw??da",
                "Bhadreswar", "Bhainsa", "Bharatpur", "Bhayandar", "Bhilai", "Bhiwandi", "Bhiw??ni", "Bhop??l",
                "Bhubaneshwar", "Bhuj", "Bhus??val", "Bh??galpur", "Bh??tp??ra", "Bh??vnagar", "Bh??lw??ra", "Bh??mavaram",
                "Bh??munipatnam", "Bij??pur", "Bil??spur", "Blair", "Bobbili", "Bodhan", "Bodup??l", "Brahma", "Brahmapur",
                "Budaun", "Bulandshahr", "Burh??npur", "B??li", "B??lurgh??t", "B??nkura", "B??nsb??ria", "B??patla",
                "B??ram??la", "B??r??sat", "B??z??r", "B??dar", "B??kaner", "Calicut", "Cawnpore", "Chakradharpur", "Champdani",
                "Chandannagar", "Chand??garh", "Channar??yapatna", "Chennai", "Chicacole", "Chilakal??rupet", "Chim??kurti",
                "Chinchvad", "Chittaurgarh", "Chittoor", "Ch??nda", "Ch??r??la", "Coimbatore", "Conjeeveram", "Cuddalore",
                "Cuddapah", "Curchorem", "Cuttack", "Dam", "Dam", "Dam??n", "Darjeeling", "Davangere", "Dehra", "Delhi",
                "Deo", "Devarkonda", "Dhanb??d", "Dharmavaram", "Dholka", "Dh??lia", "Dibrugarh", "Dindigul", "Dispur",
                "Diu", "Drug", "Durg??pur", "Du??r", "Dw??rka", "D??n", "Ellore", "Emmigan??r", "Erode", "Et??wah",
                "Far??d??b??d", "Fatehpur", "Fatehpur", "Fyz??b??d", "F??roz??b??d", "Gadw??l", "Gangtok", "Gauripur", "Gaya",
                "Gh??nd??nagar", "Gh??zi??b??d", "Giddal??r", "Godhra", "Gorakhpur", "Gudiv??da", "Gulbarga", "Guntakal",
                "Gunt??r", "Gurgaon", "Guw??h??ti", "Gwalior", "Haldia", "Handw??ra", "Har??pur", "Hassan", "Hindupur",
                "Hisar", "Hospet", "Hubli", "Hugli", "Hyder??b??d", "H??bra", "H??l??sahar", "H??ora", "H??pur", "H??thras",
                "Ichalkaranji", "Imph??l", "Indore", "Ingr??j", "It??nagar", "Jabalpur", "Jaggayyapeta", "Jagti??l",
                "Jaipur", "Jaisalmer", "Jalandhar", "Jalgaon", "Jalor", "Jalp??iguri", "Jammalamadugu", "Jammu",
                "Jamnagar", "Jamshedpur", "Jangaon", "Jasdan", "Jatani", "Jaunpur", "Jaynagar-Majilpur", "Jh??nsi",
                "Jodhpur", "Jorh??t", "Junnar", "J??muria", "Kadiri", "Kagazn??g??r", "Kair??na", "Kalyani", "Kaly??n",
                "Kanduk??r", "Karn??l", "Kar??mnagar", "Kar??r", "Kavaratti", "Khajur??ho", "Khambh??t", "Khammam",
                "Kharagpur", "Khardah", "Khed", "Kochi", "Kodaik??nal", "Koh??ma", "Koilkuntla", "Kolh??pur", "Kolk??ta",
                "Kol??r", "Koratla", "Kota", "Koth??pet", "Kottag??dem", "Kovv??r", "Krishnanagar", "Kulgam", "Kulti",
                "Kumbakonam", "Kurnool", "K??kin??da", "K??m??reddipet", "K??m??rh??ti", "K??nchr??p??ra", "K??vali", "Lucknow",
                "Ludhi??na", "L??t??r", "Machil??patnam", "Madanapalle", "Madhyamgram", "Madurai", "Mahb??bnagar",
                "Mahes??na", "Maihar", "Malaut", "Mancher??l", "Mandam??ri", "Mandapeta", "Mandsaur", "Mandya",
                "Mangalagiri", "Mangalore", "Mang??r", "Mathura", "Mauli", "Medin??pur", "Meerut", "Metpalli", "Mirz??pur",
                "Mor??d??b??d", "Mumbai", "Muzaffarnagar", "Muzaffarpur", "Mysore", "M??cherla", "M??legaon", "M??rk??pur",
                "Nagari", "Naih??ti", "Naini", "Nalgonda", "Nandy??l", "Narasannapeta", "Narasapur", "Narasaraopet",
                "Navadw??p", "Navs??ri", "Negapatam", "Nellore", "New", "Nidadavole", "Niz??m??b??d", "N??gercoil", "N??gpur",
                "N??nded", "N??ndod", "N??sik", "Ongole", "Ootacamund", "Osm??n??b??d", "Palmaner", "Panaji", "Panchkula",
                "Parbhani", "Pathan??mthitta", "Path??nkot", "Pati??la", "Patna", "Pedana", "Pith??puram", "Ponn??ru",
                "Porbandar", "Port", "Proddat??r", "Puducherry", "Pulivendla", "Pune", "Pungan??ru", "Puri", "Purnea",
                "Putt??r", "P??lakollu", "P??lgh??t", "P??li", "P??loncha", "P??midi", "P??nih??ti", "P??n??pat", "P??libh??t",
                "Quilon", "Raipur", "Rajaori", "Ratl??m", "Raurkela", "Repalle", "Rishra", "Rohtak", "R??ich??r",
                "R??iganj", "R??jahmundry", "R??jap??laiyam", "R??jg??r", "R??jkot", "R??meswaram", "R??mgundam", "R??mpur",
                "R??nchi", "R??yachoti", "Saharsa", "Sah??ranpur", "Salem", "Sambalpur", "Sambhal", "Sannai",
                "Sattenapalle", "Saugor", "Secunder??b??d", "Shiliguri", "Shillong", "Shimla", "Shimoga",
                "Shr??rangapattana", "Shr??r??mpur", "Sh??hj??npur", "Sh??ntipur", "Sihor", "Silchar", "Silvassa", "Sirsa",
                "Sirsilla", "Sitalpur", "Solan", "Sol??pur", "Son??pat", "Sopur", "Sr??nagar", "Suri??pet", "S??malkot",
                "S??ngli", "S??kar", "S??kri", "S??rat", "Tal", "Tanjore", "Tanuku", "Ten??li", "Tezpur",
                "Thiruvananthapuram", "Th??ne", "Tinnevelly", "Tirupati", "Tirupp??r", "Tiruvann??malai", "Tit??garh",
                "Tonk", "Trichinopoly", "Trich??r", "Tumk??r", "Tuni", "Tuticorin", "T??depalle", "T??depalleg??dem",
                "T??dpatri", "Udaipur", "Udhampur", "Udipi", "Ujjain", "Ulh??snagar", "Uluberiya", "Umaria", "Uran",
                "Vadodara", "Vellore", "Venkatagiri", "Vidisha", "Vik??r??b??d", "Vinukonda", "Vish??khapatnam",
                "Vizianagaram", "Vrind??van", "V??lp??rai", "V??r??nasi", "Wanparti", "Warangal", "Yavatm??l", "Yellandu",
                "??doni", "??gra", "??sansol", "????zawl", "Delhi"}; 
        JComboBox <String> jiComboBox = new JComboBox<>(cityOptionsToChoose);
        jiComboBox.setBounds(820, 260, 114, 25);
        contentPane.add(jiComboBox);
        int ii=0;
        try {
        	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");
        	Statement stmt = connection.createStatement();
        	ResultSet rs = stmt.executeQuery("SELECT sid FROM stream ;");
        	while (rs.next()) {
        		ii=ii+1;
        	}
        }catch(SQLException err) {
 	         System.out.println("SQL exception occured" + err);
 	      }
        String[] streamOptionsToChoose = new String[ii];
        try {
        	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");
        	Statement stmt = connection.createStatement();
        	ResultSet rs = stmt.executeQuery("SELECT sid FROM stream ;");
        	int i=0;
        	while (rs.next()) {
        		String sd = rs.getString("sid");
        		streamOptionsToChoose[i]= sd;
        		i=i+1;

        	}
        }catch(SQLException err) {
 	         System.out.println("SQL exception occured" + err);
 	      }
    
        //String[] streamOptionsToChoose = {"1","2"}; //{"PCMB-Hindi","PCMB-Sanskrit"}; 
        JComboBox <String> streamComboBox = new JComboBox<>(streamOptionsToChoose);
        streamComboBox.setBounds(707, 380, 225, 25);
        contentPane.add(streamComboBox);
        
        JRadioButton genderRadioM = new JRadioButton("Male");
        JRadioButton genderRadioF = new JRadioButton("Female");
        JRadioButton genderRadioO = new JRadioButton("Others");
        genderRadioM.setBounds(707, 300, 95, 25);
        genderRadioM.setFont(new Font("Tahoma", Font.PLAIN, 22));
        genderRadioM.setBackground(new Color(176, 224, 230));
        contentPane.add(genderRadioM);
        genderRadioF.setBounds(800, 300, 95, 25);
        genderRadioF.setFont(new Font("Tahoma", Font.PLAIN, 22));
        genderRadioF.setBackground(new Color(176, 224, 230));
        contentPane.add(genderRadioF);
        genderRadioO.setBounds(900, 300, 95, 25);
        genderRadioO.setFont(new Font("Tahoma", Font.PLAIN, 22));
        genderRadioO.setBackground(new Color(176, 224, 230));
        contentPane.add(genderRadioO);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Tahoma", Font.PLAIN, 22));
        aadhar.setBounds(707, 340, 228, 25);
        contentPane.add(aadhar);
        int iii=0;
        try {
        	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");
        	Statement stmt = connection.createStatement();
        	ResultSet rs = stmt.executeQuery("SELECT centerid FROM centers ;");
        	while (rs.next()) {
        		iii=iii+1;
        	}
        }catch(SQLException err) {
 	         System.out.println("SQL exception occured" + err);
 	      }
        String[] centerOptionsToChoose = new String[iii];
        try {
        	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");
        	Statement stmt = connection.createStatement();
        	ResultSet rs = stmt.executeQuery("SELECT centerid FROM centers ;");
        	int i=0;
        	while (rs.next()) {
        		String cd = rs.getString("centerid");
        		centerOptionsToChoose[i]= cd;
        		i=i+1;

        	}
        }catch(SQLException err) {
 	         System.out.println("SQL exception occured" + err);
 	      }
        //String[] centerOptionsToChoose = {"1","2"}; //{"Center-1","Center-2"}; 
        JComboBox <String> centerComboBox = new JComboBox<>(centerOptionsToChoose);
        centerComboBox.setBounds(707, 420, 225, 25);
        contentPane.add(centerComboBox);
        
        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String enrollmentNo = enrollNum.getText();
                String f_Name = firstname.getText();
                String l_Name = lastname.getText();
                String emailId = email.getText();
                String fname = fathersname.getText();
                String mname = mothersname.getText();
                String dobday = dayComboBox.getSelectedItem().toString();
                String dobmonth = monthComboBox.getSelectedItem().toString();
                // dob month to month number, january = 1, february = 2, etc.
                int dobmonthnum = monthComboBox.getSelectedIndex() + 1;
                // int dobmonthnum to string
                String dobmonthnumstr = Integer.toString(dobmonthnum);
                String dobyear = yearComboBox.getSelectedItem().toString();
                String userName = username.getText();
                String StudentPass = String.valueOf(passwordField.getPassword()); 
                String mobileNumber = mob.getText();
                String schoolName = schoolComboBox.getSelectedItem().toString();
                String state = jComboBox.getSelectedItem().toString();
                String city = jiComboBox.getSelectedItem().toString();
                String gender_ = "null";
                if(genderRadioM.isSelected()) { gender_ = "male";}
                if(genderRadioF.isSelected()) { gender_ = "female";}
                if(genderRadioO.isSelected()) { gender_ = "others";}
                String aadharNo = aadhar.getText();
                String stream = streamComboBox.getSelectedItem().toString();
                String center = centerComboBox.getSelectedItem().toString();
                
                System.out.print("INSERT INTO student values("+enrollmentNo+",'" + f_Name + "','" + l_Name + "','" + fname + "','" +mname + "'," +
                    		aadharNo + "," + mobileNumber + ",'" + dobyear+"-"+ dobmonthnumstr+"-"+dobday+ "','" + city + "','" + state + "','" + gender_ + "','" + 
                    		emailId + "','"+userName+"','"+StudentPass+"'," + center + "," + stream + "," + schoolName + ");");
                int mobLen = mobileNumber.length();
                int aadharLen = aadhar.getText().length();

                String msg = "" + f_Name;
                msg += " \n";
                if (mobLen != 10) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
                }
                if (aadharLen != 12) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid Aadhar number");
                }
                Connection connection;
                try {
                	Class.forName("org.postgresql.Driver");
                    connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");
                    if (connection != null) {
                        System.out.println("Database Opened");
                    }
                    String query = "INSERT INTO student values("+enrollmentNo+",'" + f_Name + "','" + l_Name + "','" + fname + "','" +mname + "'," +
                    		aadharNo + "," + mobileNumber + ",'" + dobyear+"-"+ dobmonthnumstr+"-"+dobday+ "','" + city + "','" + state + "','" + gender_ + "','" +
                    		emailId + "','"+userName+"','"+StudentPass+"'," + center + "," + stream + "," + schoolName + ");";

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
        
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        backButton.setBounds(199, 480, 259, 50);
        contentPane.add(backButton);
        
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                ExaminerHomePage ExaminerHomePage = new ExaminerHomePage();
                ExaminerHomePage.setVisible(true);
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(699, 480, 259, 50);
        contentPane.add(btnNewButton);
        getContentPane().setBackground(new Color(176, 224, 230));
        setVisible(true);
    }
}
