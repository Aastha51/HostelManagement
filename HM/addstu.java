package HM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class addstu {

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
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addstu window = new addstu();
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
	public addstu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 793, 775);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblStudentDetails = new JLabel("student details");
		lblStudentDetails.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblStudentDetails.setBounds(151, 55, 198, 19);
		frame.getContentPane().add(lblStudentDetails);

		JLabel lblStudentId = new JLabel("student id");
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStudentId.setBounds(56, 114, 88, 14);
		frame.getContentPane().add(lblStudentId);

		JLabel lblStudentName = new JLabel("student name");
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStudentName.setBounds(56, 157, 112, 14);
		frame.getContentPane().add(lblStudentName);

		JLabel lblGender = new JLabel("gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGender.setBounds(56, 195, 65, 27);
		frame.getContentPane().add(lblGender);

		JLabel lblDob = new JLabel("D.O.B");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDob.setBounds(56, 252, 46, 14);
		frame.getContentPane().add(lblDob);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddress.setBounds(56, 292, 65, 14);
		frame.getContentPane().add(lblAddress);

		JLabel lblPhoneNo = new JLabel("phone no.");
		lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhoneNo.setBounds(56, 332, 83, 27);
		frame.getContentPane().add(lblPhoneNo);

		JLabel lblEmail = new JLabel("email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(56, 387, 46, 14);
		frame.getContentPane().add(lblEmail);

		JLabel lblFathersName = new JLabel("father's name");
		lblFathersName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFathersName.setBounds(56, 436, 112, 19);
		frame.getContentPane().add(lblFathersName);

		JLabel lblMothersName = new JLabel("mother's name");
		lblMothersName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMothersName.setBounds(56, 485, 112, 14);
		frame.getContentPane().add(lblMothersName);

		JLabel lblFathersPhoneNo = new JLabel("father's phone no.");
		lblFathersPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFathersPhoneNo.setBounds(56, 534, 136, 19);
		frame.getContentPane().add(lblFathersPhoneNo);

		JLabel lblMothersPhoneNo = new JLabel("mother's phone no.");
		lblMothersPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMothersPhoneNo.setBounds(56, 571, 136, 25);
		frame.getContentPane().add(lblMothersPhoneNo);

		JButton btnAdd = new JButton("add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent g) {
				if (g.getSource() == btnAdd) {
					String dn = textField.getText();
					String dn1 = textField_1.getText();
					String dn2 = textField_2.getText();
					String dn3 = textField_3.getText();
					String dn4 = textField_4.getText();
					String dn5 = textField_5.getText();
					String dn6 = textField_6.getText();
					String dn7 = textField_7.getText();
					String dn8 = textField_8.getText();
					String dn9 = textField_9.getText();
					String dn10 = textField_10.getText();

					java.sql.Connection con = MydbConnectionClass.getConnection();
					try {

						java.sql.PreparedStatement ps = con.prepareStatement(
								"insert into addstudent(studentid,studentname,gender,dob,address,phoneno,email,fathername,mothername,fathersphone,motherphone) values(?,?,?,?,?,?,?,?,?,?,?)");
						ps.setString(1, dn);
						ps.setString(2, dn1);
						ps.setString(3, dn2);
						ps.setString(4, dn3);
						ps.setString(5, dn4);
						ps.setString(6, dn5);
						ps.setString(7, dn6);
						ps.setString(8, dn7);
						ps.setString(9, dn8);
						ps.setString(10, dn9);
						ps.setString(11, dn10);
						ps.execute();
						JOptionPane.showMessageDialog(frame, "you are succesful");
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAdd.setBounds(151, 638, 89, 23);
		frame.getContentPane().add(btnAdd);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				student b12 = new student();
				b12.mainNewScreen();
				frame.dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBounds(287, 640, 89, 23);
		frame.getContentPane().add(btnCancel);

		textField = new JTextField();
		textField.setBounds(213, 337, 148, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(213, 156, 148, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(213, 200, 148, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(213, 251, 148, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(213, 291, 148, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(213, 575, 148, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(213, 386, 148, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(213, 437, 148, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setBounds(213, 484, 148, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setBounds(213, 535, 148, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setBounds(213, 113, 148, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
	}
}
