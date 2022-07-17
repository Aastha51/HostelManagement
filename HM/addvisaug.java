package HM;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class addvisaug {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addvisaug window = new addvisaug();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public addvisaug() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 793, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblAddVisitorDetails = new JLabel("add visitor details");
		lblAddVisitorDetails.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblAddVisitorDetails.setBounds(242, 59, 229, 35);
		frame.getContentPane().add(lblAddVisitorDetails);

		JLabel lblVisitorName = new JLabel("visitor name :");
		lblVisitorName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVisitorName.setBounds(137, 138, 109, 16);
		frame.getContentPane().add(lblVisitorName);

		JLabel lblVisitorPhoneNo = new JLabel("visitor phone no.:");
		lblVisitorPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVisitorPhoneNo.setBounds(137, 165, 120, 16);
		frame.getContentPane().add(lblVisitorPhoneNo);

		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudentName.setBounds(137, 192, 109, 16);
		frame.getContentPane().add(lblStudentName);

		JLabel lblRelationWithStudent = new JLabel("Relation with Student :");
		lblRelationWithStudent.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRelationWithStudent.setBounds(137, 219, 160, 16);
		frame.getContentPane().add(lblRelationWithStudent);

		JLabel lblDate = new JLabel("Day :");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDate.setBounds(137, 327, 109, 16);
		frame.getContentPane().add(lblDate);

		JLabel lblEntryTime = new JLabel("Entry Time :");
		lblEntryTime.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEntryTime.setBounds(137, 246, 109, 16);
		frame.getContentPane().add(lblEntryTime);

		JLabel lblLeavingTime = new JLabel("Leaving Time :");
		lblLeavingTime.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLeavingTime.setBounds(137, 273, 109, 16);
		frame.getContentPane().add(lblLeavingTime);

		JLabel lblVisitingPurpose = new JLabel("Visiting purpose:");
		lblVisitingPurpose.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVisitingPurpose.setBounds(137, 300, 109, 16);
		frame.getContentPane().add(lblVisitingPurpose);

		JLabel lblYear = new JLabel("Year:");
		lblYear.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblYear.setBounds(137, 354, 109, 16);
		frame.getContentPane().add(lblYear);

		textField = new JTextField();
		textField.setBounds(310, 137, 133, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(310, 164, 133, 20);
		frame.getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(310, 191, 133, 20);
		frame.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(310, 218, 133, 20);
		frame.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(310, 245, 133, 20);
		frame.getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(310, 272, 133, 20);
		frame.getContentPane().add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(310, 299, 133, 20);
		frame.getContentPane().add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(310, 326, 133, 20);
		frame.getContentPane().add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(310, 353, 133, 20);
		frame.getContentPane().add(textField_8);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visaug a = new visaug();
				a.mainNewScreen();
				frame.dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancel.setBounds(320, 387, 89, 23);
		frame.getContentPane().add(btnCancel);

		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnOk) {
					String dn = textField.getText();
					String dn1 = textField_1.getText();
					String dn2 = textField_2.getText();
					String dn3 = textField_3.getText();
					String dn4 = textField_4.getText();
					String dn5 = textField_5.getText();
					String dn6 = textField_6.getText();
					String dn7 = textField_7.getText();
					String dn8 = textField_8.getText();
					java.sql.Connection con = MydbConnectionClass.getConnection();
					try {

						java.sql.PreparedStatement ps = con.prepareStatement(
								"insert into addaugvis(visitorname,visitorphoneno,studentname,relation,entrytime,leavingtime,visitingpurpose,day,year) values(?,?,?,?,?,?,?,?,?)");
						ps.setString(1, dn);
						ps.setString(2, dn1);
						ps.setString(3, dn2);
						ps.setString(4, dn3);
						ps.setString(5, dn4);
						ps.setString(6, dn5);
						ps.setString(7, dn6);
						ps.setString(8, dn7);
						ps.setString(9, dn8);
						ps.execute();
						JOptionPane.showMessageDialog(frame, "you are succesful");
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}

			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnOk.setBounds(193, 388, 89, 23);
		frame.getContentPane().add(btnOk);
	}

}
