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

/**
 * User Registration using Swing
 * @author javaguides.net
 *
 */
public class SchoolRegistration extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField schoolID;
    private JTextField schoolName;
    private JTextField email;
    private JTextField pinCode;
    private JButton btnNewButton;
    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SchoolRegistration frame = new SchoolRegistration();
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

    public SchoolRegistration() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(176, 224, 230));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblSchoolUserRegister = new JLabel("School Registration");
        lblSchoolUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblSchoolUserRegister.setBounds(362, 52, 400, 50);
        contentPane.add(lblSchoolUserRegister);

        JLabel lblSchoolID = new JLabel("School ID");
        lblSchoolID.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblSchoolID.setBounds(58, 152, 99, 43);
        contentPane.add(lblSchoolID);

        JLabel lblSchoolName = new JLabel("<HTML>School<BR>Name</HTML>");
        lblSchoolName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblSchoolName.setBounds(58, 243, 110, 50);
        contentPane.add(lblSchoolName);

        JLabel lblEmailAddress = new JLabel("Email\r\n address");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEmailAddress.setBounds(58, 324, 124, 36);
        contentPane.add(lblEmailAddress);
        
        
        JLabel lblUsername = new JLabel("State");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUsername.setBounds(542, 159, 99, 29);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("City");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(542, 245, 99, 24);
        contentPane.add(lblPassword);

        JLabel lblMobileNumber = new JLabel("Pincode");
        lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblMobileNumber.setBounds(542, 329, 139, 26);
        contentPane.add(lblMobileNumber);
        
        ArrayList<Integer> schoolID = new ArrayList<Integer>();
        for (int i = 0; i <= 100; ++i) {
        	schoolID.add(i);
        }
        JComboBox schoolIDComboBox = new JComboBox(schoolID.toArray());
        schoolIDComboBox.setBounds(214, 151, 228, 50);
        schoolIDComboBox.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        contentPane.add(schoolIDComboBox);
        
        schoolName = new JTextField();
        schoolName.setFont(new Font("Tahoma", Font.PLAIN, 32));
        schoolName.setBounds(214, 235, 228, 50);
        contentPane.add(schoolName);
        schoolName.setColumns(10);

        email = new JTextField();
        email.setFont(new Font("Tahoma", Font.PLAIN, 32));
        email.setBounds(214, 320, 228, 50);
        contentPane.add(email);
        email.setColumns(10);
        
        String[] stateOptionsToChoose = {"Andhra Pradesh","Arunachal Pradesh ","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu and Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal","Andaman and Nicobar Islands","Chandigarh","Dadra and Nagar Haveli","Daman and Diu","Lakshadweep","National Capital Territory of Delhi","Puducherry"}; 
        JComboBox <String> stateSchoolChoose = new JComboBox<>(stateOptionsToChoose);
        stateSchoolChoose.setBounds(707, 151, 228, 50);
        contentPane.add(stateSchoolChoose);
        stateSchoolChoose.setFont(new Font("Tahoma", Font.PLAIN, 25));

       
        
        String[] cityOptionsToChoose = {"Delhi", "Mumbai", "Kolk??ta", "Bangalore", "Chennai", "Hyder??b??d", "Pune", "Ahmedabad", "S??rat", "Lucknow", "Jaipur", "Cawnpore", "Mirz??pur", "N??gpur", "Gh??zi??b??d", "Indore", "Vadodara", "Vish??khapatnam", "Bhop??l", "Chinchvad", "Patna", "Ludhi??na", "??gra", "Kaly??n", "Madurai", "Jamshedpur", "N??sik", "Far??d??b??d", "Aurang??b??d", "R??jkot", "Meerut", "Jabalpur", "Th??ne", "Dhanb??d", "Allah??b??d", "V??r??nasi", "Sr??nagar", "Amritsar", "Al??garh", "Bhiwandi", "Gwalior", "Bhilai", "H??ora", "R??nchi", "Bezw??da", "Chand??garh", "Mysore", "Raipur", "Kota", "Bareilly", "Jodhpur", "Coimbatore", "Dispur", "Guw??h??ti", "Sol??pur", "Trichinopoly", "Hubli", "Jalandhar", "Bhubaneshwar", "Bhayandar", "Mor??d??b??d", "Kolh??pur", "Thiruvananthapuram", "Sah??ranpur", "Warangal", "Salem", "M??legaon", "Kochi", "Gorakhpur", "Shimoga", "Tirupp??r", "Gunt??r", "Raurkela", "Mangalore", "N??nded", "Cuttack", "Ch??nda", "Dehra", "D??n", "Durg??pur", "??sansol", "Bh??vnagar", "Amr??vati", "Nellore", "Ajmer", "Tinnevelly", "B??kaner", "Agartala", "Ujjain", "Jh??nsi", "Ulh??snagar", "Davangere", "Jammu", "Belgaum", "Gulbarga", "Jamnagar", "Dh??lia", "Gaya", "Jalgaon", "Kurnool", "Udaipur", "Bellary", "S??ngli", "Tuticorin", "Calicut", "Akola", "Bh??galpur", "S??kar", "Tumk??r", "Quilon", "Muzaffarnagar", "Bh??lw??ra", "Niz??m??b??d", "Bh??tp??ra", "K??kin??da", "Parbhani", "P??nih??ti", "L??t??r", "Rohtak", "R??jap??laiyam", "Ahmadnagar", "Cuddapah", "R??jahmundry", "Alwar", "Muzaffarpur", "Bil??spur", "Mathura", "K??m??rh??ti", "Pati??la", "Saugor", "Bij??pur", "Brahmapur", "Sh??hj??npur", "Trich??r", "Barddham??n", "Kulti", "Sambalpur", "Purnea", "Hisar", "F??roz??b??d", "B??dar", "R??mpur", "Shiliguri", "B??li", "P??n??pat", "Kar??mnagar", "Bhuj", "Ichalkaranji", "Tirupati", "Hospet", "????zawl", "Sannai", "B??r??sat", "Ratl??m", "Handw??ra", "Drug", "Imph??l", "Anantapur", "Et??wah", "R??ich??r", "Ongole", "Bharatpur", "Begusarai", "Son??pat", "R??mgundam", "H??pur", "Uluberiya", "Porbandar", "P??li", "Vizianagaram", "Puducherry", "Karn??l", "N??gercoil", "Tanjore", "Sambhal", "Naih??ti", "Secunder??b??d", "Kharagpur", "Dindigul", "Shimla", "Ingr??j", "B??z??r", "Ellore", "Puri", "Haldia", "Nandy??l", "Bulandshahr", "Chakradharpur", "Bhiw??ni", "Gurgaon", "Burh??npur", "Khammam", "Madhyamgram", "Gh??nd??nagar", "Baharampur", "Mahb??bnagar", "Mahes??na", "??doni", "R??iganj", "Bhus??val", "Bahraigh", "Shr??r??mpur", "Tonk", "Sirsa", "Jaunpur", "Madanapalle", "Hugli", "Vellore", "Alleppey", "Cuddalore", "Deo", "Ch??r??la", "Machil??patnam", "Medin??pur", "B??ram??la", "Chandannagar", "Fatehpur", "Udipi", "Ten??li", "Sitalpur", "Conjeeveram", "Proddat??r", "Navs??ri", "Godhra", "Budaun", "Chittoor", "Har??pur", "Saharsa", "Vidisha", "Path??nkot", "Nalgonda", "Dibrugarh", "B??lurgh??t", "Krishnanagar", "Fyz??b??d", "Silchar", "Sh??ntipur", "Hindupur", "Erode", "J??muria", "H??bra", "Amb??la", "Mauli", "Kol??r", "Shillong", "Bh??mavaram", "New", "Delhi", "Mandsaur", "Kumbakonam", "Tiruvann??malai", "Chicacole", "B??nkura", "Mandya", "Hassan", "Yavatm??l", "P??libh??t", "P??lgh??t", "Abohar", "P??lakollu", "K??nchr??p??ra", "Port", "Blair", "Al??pur", "Du??r", "H??thras", "Guntakal", "Navadw??p", "Bas??rhat", "H??l??sahar", "Rishra", "Dharmavaram", "Baidyab??ti", "Darjeeling", "Sopur", "Gudiv??da", "Adil??b??d", "Tit??garh", "Chittaurgarh", "Narasaraopet", "Dam", "Dam", "V??lp??rai", "Osm??n??b??d", "Champdani", "Bangaon", "Khardah", "T??dpatri", "Jalp??iguri", "Suri??pet", "T??depalleg??dem", "B??nsb??ria", "Negapatam", "Bhadreswar", "Chilakal??rupet", "Kalyani", "Gangtok", "Koh??ma", "Khambh??t", "Aurang??b??d", "Emmigan??r", "R??yachoti", "K??vali", "Mancher??l", "Kadiri", "Ootacamund", "Anak??palle", "Sirsilla", "K??m??reddipet", "P??loncha", "Kottag??dem", "Tanuku", "Bodhan", "Kar??r", "Mangalagiri", "Kair??na", "M??rk??pur", "Malaut", "B??patla", "Badvel", "Jorh??t", "Koratla", "Pulivendla", "Jaisalmer", "T??depalle", "Arm??r", "Jatani", "Gadw??l", "Nagari", "Wanparti", "Ponn??ru", "Vinukonda", "It??nagar", "Tezpur", "Narasapur", "Koth??pet", "M??cherla", "Kanduk??r", "S??malkot", "Bobbili", "Sattenapalle", "Vrind??van", "Mandapeta", "Belampalli", "Bh??munipatnam", "N??ndod", "Pith??puram", "Pungan??ru", "Putt??r", "Jalor", "Palmaner", "Dholka", "Jaggayyapeta", "Tuni", "Amal??puram", "Jagti??l", "Vik??r??b??d", "Venkatagiri", "Sihor", "Jangaon", "Mandam??ri", "Metpalli", "Repalle", "Bhainsa", "Jasdan", "Jammalamadugu", "R??meswaram", "Addanki", "Nidadavole", "Bodup??l", "R??jg??r", "Rajaori", "Naini", "Tal", "Channar??yapatna", "Maihar", "Panaji", "Junnar", "Amud??lavalasa", "Dam??n", "Kovv??r", "Solan", "Dw??rka", "Pathan??mthitta", "Kodaik??nal", "Udhampur", "Giddal??r", "Yellandu", "Shr??rangapattana", "Angam??li", "Umaria", "Fatehpur", "S??kri", "Mang??r", "Pedana", "Uran", "Chim??kurti", "Devarkonda", "Bandipura", "Silvassa", "P??midi", "Narasannapeta", "Jaynagar-Majilpur", "Khed", "Brahma", "Khajur??ho", "Koilkuntla", "Diu", "Kulgam", "Gauripur", "Abu", "Curchorem", "Kavaratti", "Panchkula", "Kagazn??g??r"}; 
        JComboBox <String> citySchoolChoose = new JComboBox<>(cityOptionsToChoose);
        citySchoolChoose.setBounds(707, 235, 228, 50);
        contentPane.add(citySchoolChoose);
        citySchoolChoose.setFont(new Font("Tahoma", Font.PLAIN, 25));
        
        pinCode = new JTextField();
        pinCode.setFont(new Font("Tahoma", Font.PLAIN, 32));
        pinCode.setBounds(707, 320, 228, 50);
        contentPane.add(pinCode);
        pinCode.setColumns(10);
        
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        backButton.setBounds(200, 447, 259, 74);
        contentPane.add(backButton);
        
        backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to logout",
						"School Registration Systems",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					 dispose();
					 HomePage HomePage = new HomePage();
					 HomePage.setVisible(true);
				}

			}
		});
        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String schoolN = schoolName.getText();
                String schoolid = schoolIDComboBox.getSelectedItem().toString();
                String emailId = email.getText();
                String stateOfSchool = stateSchoolChoose.getSelectedItem().toString();
                String cityOfSchool = citySchoolChoose.getSelectedItem().toString();
                String pin_code = pinCode.getText();
                String msg = "" + schoolN;
                msg += " \n";


                try {
                	Class.forName("org.postgresql.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Board-Exam-Management-System", "postgres", "prabithgupta");

                    String query = "INSERT INTO school values(" + schoolid + ",'" + schoolN + "','" + cityOfSchool + "','" +stateOfSchool+ "'," + pin_code + ")";
                    System.out.print(query);
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Welcome, " + msg + "School has registered sucessfully !");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(490, 447, 259, 74);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        contentPane.add(btnNewButton);
    }
}