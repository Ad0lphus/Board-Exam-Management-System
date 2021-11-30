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

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SchoolRegistration frame = new SchoolRegistration();
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

    public SchoolRegistration() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
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
        for (int i = 10000; i <= 99999; ++i) {
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

       
        
        String[] cityOptionsToChoose = {"Delhi", "Mumbai", "Kolkāta", "Bangalore", "Chennai", "Hyderābād", "Pune", "Ahmedabad", "Sūrat", "Lucknow", "Jaipur", "Cawnpore", "Mirzāpur", "Nāgpur", "Ghāziābād", "Indore", "Vadodara", "Vishākhapatnam", "Bhopāl", "Chinchvad", "Patna", "Ludhiāna", "Āgra", "Kalyān", "Madurai", "Jamshedpur", "Nāsik", "Farīdābād", "Aurangābād", "Rājkot", "Meerut", "Jabalpur", "Thāne", "Dhanbād", "Allahābād", "Vārānasi", "Srīnagar", "Amritsar", "Alīgarh", "Bhiwandi", "Gwalior", "Bhilai", "Hāora", "Rānchi", "Bezwāda", "Chandīgarh", "Mysore", "Raipur", "Kota", "Bareilly", "Jodhpur", "Coimbatore", "Dispur", "Guwāhāti", "Solāpur", "Trichinopoly", "Hubli", "Jalandhar", "Bhubaneshwar", "Bhayandar", "Morādābād", "Kolhāpur", "Thiruvananthapuram", "Sahāranpur", "Warangal", "Salem", "Mālegaon", "Kochi", "Gorakhpur", "Shimoga", "Tiruppūr", "Guntūr", "Raurkela", "Mangalore", "Nānded", "Cuttack", "Chānda", "Dehra", "Dūn", "Durgāpur", "Āsansol", "Bhāvnagar", "Amrāvati", "Nellore", "Ajmer", "Tinnevelly", "Bīkaner", "Agartala", "Ujjain", "Jhānsi", "Ulhāsnagar", "Davangere", "Jammu", "Belgaum", "Gulbarga", "Jamnagar", "Dhūlia", "Gaya", "Jalgaon", "Kurnool", "Udaipur", "Bellary", "Sāngli", "Tuticorin", "Calicut", "Akola", "Bhāgalpur", "Sīkar", "Tumkūr", "Quilon", "Muzaffarnagar", "Bhīlwāra", "Nizāmābād", "Bhātpāra", "Kākināda", "Parbhani", "Pānihāti", "Lātūr", "Rohtak", "Rājapālaiyam", "Ahmadnagar", "Cuddapah", "Rājahmundry", "Alwar", "Muzaffarpur", "Bilāspur", "Mathura", "Kāmārhāti", "Patiāla", "Saugor", "Bijāpur", "Brahmapur", "Shāhjānpur", "Trichūr", "Barddhamān", "Kulti", "Sambalpur", "Purnea", "Hisar", "Fīrozābād", "Bīdar", "Rāmpur", "Shiliguri", "Bāli", "Pānīpat", "Karīmnagar", "Bhuj", "Ichalkaranji", "Tirupati", "Hospet", "Āīzawl", "Sannai", "Bārāsat", "Ratlām", "Handwāra", "Drug", "Imphāl", "Anantapur", "Etāwah", "Rāichūr", "Ongole", "Bharatpur", "Begusarai", "Sonīpat", "Rāmgundam", "Hāpur", "Uluberiya", "Porbandar", "Pāli", "Vizianagaram", "Puducherry", "Karnāl", "Nāgercoil", "Tanjore", "Sambhal", "Naihāti", "Secunderābād", "Kharagpur", "Dindigul", "Shimla", "Ingrāj", "Bāzār", "Ellore", "Puri", "Haldia", "Nandyāl", "Bulandshahr", "Chakradharpur", "Bhiwāni", "Gurgaon", "Burhānpur", "Khammam", "Madhyamgram", "Ghāndīnagar", "Baharampur", "Mahbūbnagar", "Mahesāna", "Ādoni", "Rāiganj", "Bhusāval", "Bahraigh", "Shrīrāmpur", "Tonk", "Sirsa", "Jaunpur", "Madanapalle", "Hugli", "Vellore", "Alleppey", "Cuddalore", "Deo", "Chīrāla", "Machilīpatnam", "Medinīpur", "Bāramūla", "Chandannagar", "Fatehpur", "Udipi", "Tenāli", "Sitalpur", "Conjeeveram", "Proddatūr", "Navsāri", "Godhra", "Budaun", "Chittoor", "Harīpur", "Saharsa", "Vidisha", "Pathānkot", "Nalgonda", "Dibrugarh", "Bālurghāt", "Krishnanagar", "Fyzābād", "Silchar", "Shāntipur", "Hindupur", "Erode", "Jāmuria", "Hābra", "Ambāla", "Mauli", "Kolār", "Shillong", "Bhīmavaram", "New", "Delhi", "Mandsaur", "Kumbakonam", "Tiruvannāmalai", "Chicacole", "Bānkura", "Mandya", "Hassan", "Yavatmāl", "Pīlibhīt", "Pālghāt", "Abohar", "Pālakollu", "Kānchrāpāra", "Port", "Blair", "Alīpur", "Duār", "Hāthras", "Guntakal", "Navadwīp", "Basīrhat", "Hālīsahar", "Rishra", "Dharmavaram", "Baidyabāti", "Darjeeling", "Sopur", "Gudivāda", "Adilābād", "Titāgarh", "Chittaurgarh", "Narasaraopet", "Dam", "Dam", "Vālpārai", "Osmānābād", "Champdani", "Bangaon", "Khardah", "Tādpatri", "Jalpāiguri", "Suriāpet", "Tādepallegūdem", "Bānsbāria", "Negapatam", "Bhadreswar", "Chilakalūrupet", "Kalyani", "Gangtok", "Kohīma", "Khambhāt", "Aurangābād", "Emmiganūr", "Rāyachoti", "Kāvali", "Mancherāl", "Kadiri", "Ootacamund", "Anakāpalle", "Sirsilla", "Kāmāreddipet", "Pāloncha", "Kottagūdem", "Tanuku", "Bodhan", "Karūr", "Mangalagiri", "Kairāna", "Mārkāpur", "Malaut", "Bāpatla", "Badvel", "Jorhāt", "Koratla", "Pulivendla", "Jaisalmer", "Tādepalle", "Armūr", "Jatani", "Gadwāl", "Nagari", "Wanparti", "Ponnūru", "Vinukonda", "Itānagar", "Tezpur", "Narasapur", "Kothāpet", "Mācherla", "Kandukūr", "Sāmalkot", "Bobbili", "Sattenapalle", "Vrindāvan", "Mandapeta", "Belampalli", "Bhīmunipatnam", "Nāndod", "Pithāpuram", "Punganūru", "Puttūr", "Jalor", "Palmaner", "Dholka", "Jaggayyapeta", "Tuni", "Amalāpuram", "Jagtiāl", "Vikārābād", "Venkatagiri", "Sihor", "Jangaon", "Mandamāri", "Metpalli", "Repalle", "Bhainsa", "Jasdan", "Jammalamadugu", "Rāmeswaram", "Addanki", "Nidadavole", "Bodupāl", "Rājgīr", "Rajaori", "Naini", "Tal", "Channarāyapatna", "Maihar", "Panaji", "Junnar", "Amudālavalasa", "Damān", "Kovvūr", "Solan", "Dwārka", "Pathanāmthitta", "Kodaikānal", "Udhampur", "Giddalūr", "Yellandu", "Shrīrangapattana", "Angamāli", "Umaria", "Fatehpur", "Sīkri", "Mangūr", "Pedana", "Uran", "Chimākurti", "Devarkonda", "Bandipura", "Silvassa", "Pāmidi", "Narasannapeta", "Jaynagar-Majilpur", "Khed", "Brahma", "Khajurāho", "Koilkuntla", "Diu", "Kulgam", "Gauripur", "Abu", "Curchorem", "Kavaratti", "Panchkula", "Kagaznāgār"}; 
        JComboBox <String> citySchoolChoose = new JComboBox<>(cityOptionsToChoose);
        citySchoolChoose.setBounds(707, 235, 228, 50);
        contentPane.add(citySchoolChoose);
        citySchoolChoose.setFont(new Font("Tahoma", Font.PLAIN, 25));
        
        pinCode = new JTextField();
        pinCode.setFont(new Font("Tahoma", Font.PLAIN, 32));
        pinCode.setBounds(707, 320, 228, 50);
        contentPane.add(pinCode);
        pinCode.setColumns(10);
        
        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String schoolN = schoolName.getText();
                String schoolid = schoolIDComboBox.getSelectedItem().toString();
                String emailId = email.getText();
                String stateOfSchool = stateSchoolChoose.getSelectedItem().toString();
                String cityOfSchool = citySchoolChoose.getSelectedItem().toString();

                String msg = "" + schoolN;
                msg += " \n";


                try {
                	Class.forName("org.postgresql.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/invention_management_system\", \"postgres\", \"prabithgupta");

                    String query = "INSERT INTO account values('" + schoolN + "','" + schoolid + "','" + stateOfSchool + "','" + "','" + emailId + "','" + cityOfSchool + "')";

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
        btnNewButton.setBounds(399, 447, 259, 74);
        contentPane.add(btnNewButton);
    }
}