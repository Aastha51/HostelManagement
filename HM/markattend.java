package HM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class markattend {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					markattend window = new markattend();
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
	public markattend() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 540, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblMarkAttendence = new JLabel("mark attendence");
		lblMarkAttendence.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblMarkAttendence.setForeground(Color.BLACK);
		lblMarkAttendence.setBounds(154, 62, 223, 35);
		frame.getContentPane().add(lblMarkAttendence);

		JLabel lblStudentName = new JLabel("student name");
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStudentName.setBounds(68, 136, 109, 14);
		frame.getContentPane().add(lblStudentName);

		textField = new JTextField();
		textField.setBounds(187, 135, 134, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblStudentId = new JLabel("student id");
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStudentId.setBounds(68, 190, 109, 14);
		frame.getContentPane().add(lblStudentId);

		textField_1 = new JTextField();
		textField_1.setBounds(187, 189, 134, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblStatus = new JLabel("status");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStatus.setBounds(68, 239, 58, 14);
		frame.getContentPane().add(lblStatus);

		textField_2 = new JTextField();
		textField_2.setBounds(187, 238, 134, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblDay = new JLabel("day");
		lblDay.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDay.setBounds(68, 284, 46, 19);
		frame.getContentPane().add(lblDay);

		textField_3 = new JTextField();
		textField_3.setBounds(187, 283, 134, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JLabel lblMonth = new JLabel("month");
		lblMonth.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMonth.setBounds(68, 329, 46, 14);
		frame.getContentPane().add(lblMonth);

		textField_4 = new JTextField();
		textField_4.setBounds(187, 328, 134, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JLabel lblYear = new JLabel("year");
		lblYear.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYear.setBounds(68, 369, 46, 20);
		frame.getContentPane().add(lblYear);

		textField_5 = new JTextField();
		textField_5.setBounds(187, 371, 134, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);

		JButton btnSubmit = new JButton("submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent g) {
				if (g.getSource() == btnSubmit) {
					String dn = textField.getText();
					String dn1 = textField_1.getText();
					String dn2 = textField_2.getText();
					String dn3 = textField_3.getText();
					String dn4 = textField_4.getText();
					String dn5 = textField_5.getText();
					java.sql.Connection con = MydbConnectionClass.getConnection();
					try {

						java.sql.PreparedStatement ps = con.prepareStatement(
								"insert into markatt(sname,sid,status,day,month,year) values(?,?,?,?,?,?)");
						ps.setString(1, dn);
						ps.setString(2, dn1);
						ps.setString(3, dn2);
						ps.setString(4, dn3);
						ps.setString(5, dn4);
						ps.setString(6, dn5);
						ps.execute();
						JOptionPane.showMessageDialog(frame, "you are succesful");
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		});

		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSubmit.setBounds(101, 434, 89, 23);
		frame.getContentPane().add(btnSubmit);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				att hp = new att();
				hp.mainNewScreen();
				frame.dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancel.setBounds(231, 436, 89, 23);
		frame.getContentPane().add(btnCancel);
	}
}
