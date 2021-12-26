package swing;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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
        
        String[] schoolOptionsToChoose = {"1","2"}; //{"school1","school2"}; 
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

        String[] cityOptionsToChoose = { "Abohar", "Abu", "Addanki", "Adilābād", "Agartala", "Ahmadnagar", "Ahmedabad",
                "Ajmer", "Akola", "Allahābād", "Alleppey", "Alwar", "Alīgarh", "Alīpur", "Amalāpuram", "Ambāla",
                "Amritsar", "Amrāvati", "Amudālavalasa", "Anakāpalle", "Anantapur", "Angamāli", "Armūr", "Aurangābād",
                "Aurangābād", "Badvel", "Baharampur", "Bahraigh", "Baidyabāti", "Bandipura", "Bangalore", "Bangaon",
                "Barddhamān", "Bareilly", "Basīrhat", "Begusarai", "Belampalli", "Belgaum", "Bellary", "Bezwāda",
                "Bhadreswar", "Bhainsa", "Bharatpur", "Bhayandar", "Bhilai", "Bhiwandi", "Bhiwāni", "Bhopāl",
                "Bhubaneshwar", "Bhuj", "Bhusāval", "Bhāgalpur", "Bhātpāra", "Bhāvnagar", "Bhīlwāra", "Bhīmavaram",
                "Bhīmunipatnam", "Bijāpur", "Bilāspur", "Blair", "Bobbili", "Bodhan", "Bodupāl", "Brahma", "Brahmapur",
                "Budaun", "Bulandshahr", "Burhānpur", "Bāli", "Bālurghāt", "Bānkura", "Bānsbāria", "Bāpatla",
                "Bāramūla", "Bārāsat", "Bāzār", "Bīdar", "Bīkaner", "Calicut", "Cawnpore", "Chakradharpur", "Champdani",
                "Chandannagar", "Chandīgarh", "Channarāyapatna", "Chennai", "Chicacole", "Chilakalūrupet", "Chimākurti",
                "Chinchvad", "Chittaurgarh", "Chittoor", "Chānda", "Chīrāla", "Coimbatore", "Conjeeveram", "Cuddalore",
                "Cuddapah", "Curchorem", "Cuttack", "Dam", "Dam", "Damān", "Darjeeling", "Davangere", "Dehra", "Delhi",
                "Deo", "Devarkonda", "Dhanbād", "Dharmavaram", "Dholka", "Dhūlia", "Dibrugarh", "Dindigul", "Dispur",
                "Diu", "Drug", "Durgāpur", "Duār", "Dwārka", "Dūn", "Ellore", "Emmiganūr", "Erode", "Etāwah",
                "Farīdābād", "Fatehpur", "Fatehpur", "Fyzābād", "Fīrozābād", "Gadwāl", "Gangtok", "Gauripur", "Gaya",
                "Ghāndīnagar", "Ghāziābād", "Giddalūr", "Godhra", "Gorakhpur", "Gudivāda", "Gulbarga", "Guntakal",
                "Guntūr", "Gurgaon", "Guwāhāti", "Gwalior", "Haldia", "Handwāra", "Harīpur", "Hassan", "Hindupur",
                "Hisar", "Hospet", "Hubli", "Hugli", "Hyderābād", "Hābra", "Hālīsahar", "Hāora", "Hāpur", "Hāthras",
                "Ichalkaranji", "Imphāl", "Indore", "Ingrāj", "Itānagar", "Jabalpur", "Jaggayyapeta", "Jagtiāl",
                "Jaipur", "Jaisalmer", "Jalandhar", "Jalgaon", "Jalor", "Jalpāiguri", "Jammalamadugu", "Jammu",
                "Jamnagar", "Jamshedpur", "Jangaon", "Jasdan", "Jatani", "Jaunpur", "Jaynagar-Majilpur", "Jhānsi",
                "Jodhpur", "Jorhāt", "Junnar", "Jāmuria", "Kadiri", "Kagaznāgār", "Kairāna", "Kalyani", "Kalyān",
                "Kandukūr", "Karnāl", "Karīmnagar", "Karūr", "Kavaratti", "Khajurāho", "Khambhāt", "Khammam",
                "Kharagpur", "Khardah", "Khed", "Kochi", "Kodaikānal", "Kohīma", "Koilkuntla", "Kolhāpur", "Kolkāta",
                "Kolār", "Koratla", "Kota", "Kothāpet", "Kottagūdem", "Kovvūr", "Krishnanagar", "Kulgam", "Kulti",
                "Kumbakonam", "Kurnool", "Kākināda", "Kāmāreddipet", "Kāmārhāti", "Kānchrāpāra", "Kāvali", "Lucknow",
                "Ludhiāna", "Lātūr", "Machilīpatnam", "Madanapalle", "Madhyamgram", "Madurai", "Mahbūbnagar",
                "Mahesāna", "Maihar", "Malaut", "Mancherāl", "Mandamāri", "Mandapeta", "Mandsaur", "Mandya",
                "Mangalagiri", "Mangalore", "Mangūr", "Mathura", "Mauli", "Medinīpur", "Meerut", "Metpalli", "Mirzāpur",
                "Morādābād", "Mumbai", "Muzaffarnagar", "Muzaffarpur", "Mysore", "Mācherla", "Mālegaon", "Mārkāpur",
                "Nagari", "Naihāti", "Naini", "Nalgonda", "Nandyāl", "Narasannapeta", "Narasapur", "Narasaraopet",
                "Navadwīp", "Navsāri", "Negapatam", "Nellore", "New", "Nidadavole", "Nizāmābād", "Nāgercoil", "Nāgpur",
                "Nānded", "Nāndod", "Nāsik", "Ongole", "Ootacamund", "Osmānābād", "Palmaner", "Panaji", "Panchkula",
                "Parbhani", "Pathanāmthitta", "Pathānkot", "Patiāla", "Patna", "Pedana", "Pithāpuram", "Ponnūru",
                "Porbandar", "Port", "Proddatūr", "Puducherry", "Pulivendla", "Pune", "Punganūru", "Puri", "Purnea",
                "Puttūr", "Pālakollu", "Pālghāt", "Pāli", "Pāloncha", "Pāmidi", "Pānihāti", "Pānīpat", "Pīlibhīt",
                "Quilon", "Raipur", "Rajaori", "Ratlām", "Raurkela", "Repalle", "Rishra", "Rohtak", "Rāichūr",
                "Rāiganj", "Rājahmundry", "Rājapālaiyam", "Rājgīr", "Rājkot", "Rāmeswaram", "Rāmgundam", "Rāmpur",
                "Rānchi", "Rāyachoti", "Saharsa", "Sahāranpur", "Salem", "Sambalpur", "Sambhal", "Sannai",
                "Sattenapalle", "Saugor", "Secunderābād", "Shiliguri", "Shillong", "Shimla", "Shimoga",
                "Shrīrangapattana", "Shrīrāmpur", "Shāhjānpur", "Shāntipur", "Sihor", "Silchar", "Silvassa", "Sirsa",
                "Sirsilla", "Sitalpur", "Solan", "Solāpur", "Sonīpat", "Sopur", "Srīnagar", "Suriāpet", "Sāmalkot",
                "Sāngli", "Sīkar", "Sīkri", "Sūrat", "Tal", "Tanjore", "Tanuku", "Tenāli", "Tezpur",
                "Thiruvananthapuram", "Thāne", "Tinnevelly", "Tirupati", "Tiruppūr", "Tiruvannāmalai", "Titāgarh",
                "Tonk", "Trichinopoly", "Trichūr", "Tumkūr", "Tuni", "Tuticorin", "Tādepalle", "Tādepallegūdem",
                "Tādpatri", "Udaipur", "Udhampur", "Udipi", "Ujjain", "Ulhāsnagar", "Uluberiya", "Umaria", "Uran",
                "Vadodara", "Vellore", "Venkatagiri", "Vidisha", "Vikārābād", "Vinukonda", "Vishākhapatnam",
                "Vizianagaram", "Vrindāvan", "Vālpārai", "Vārānasi", "Wanparti", "Warangal", "Yavatmāl", "Yellandu",
                "Ādoni", "Āgra", "Āsansol", "Āīzawl", "Delhi"}; 
        JComboBox <String> jiComboBox = new JComboBox<>(cityOptionsToChoose);
        jiComboBox.setBounds(820, 260, 114, 25);
        contentPane.add(jiComboBox);

        String[] streamOptionsToChoose = {"1","2"}; //{"PCMB-Hindi","PCMB-Sanskrit"}; 
        JComboBox <String> streamComboBox = new JComboBox<>(streamOptionsToChoose);
        streamComboBox.setBounds(707, 380, 225, 25);
        contentPane.add(streamComboBox);
        
        JRadioButton genderRadioM = new JRadioButton("Male");
        JRadioButton genderRadioF = new JRadioButton("Female");
        JRadioButton genderRadioO = new JRadioButton("Others");
        genderRadioM.setBounds(707, 300, 95, 25);
        genderRadioM.setFont(new Font("Tahoma", Font.PLAIN, 22));
        genderRadioM.setBackground(new Color(153, 255, 255));
        contentPane.add(genderRadioM);
        genderRadioF.setBounds(800, 300, 95, 25);
        genderRadioF.setFont(new Font("Tahoma", Font.PLAIN, 22));
        genderRadioF.setBackground(new Color(153, 255, 255));
        contentPane.add(genderRadioF);
        genderRadioO.setBounds(900, 300, 95, 25);
        genderRadioO.setFont(new Font("Tahoma", Font.PLAIN, 22));
        genderRadioO.setBackground(new Color(153, 255, 255));
        contentPane.add(genderRadioO);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Tahoma", Font.PLAIN, 22));
        aadhar.setBounds(707, 340, 228, 25);
        contentPane.add(aadhar);
        
        String[] centerOptionsToChoose = {"1","2"}; //{"Center-1","Center-2"}; 
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
        getContentPane().setBackground(new Color(153, 255, 255));
        setVisible(true);
    }
}
