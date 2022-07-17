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
import java.awt.Color;

public class addmarchatt {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addmarchatt window = new addmarchatt();
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
	public addmarchatt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 747, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblStudentId = new JLabel("student id :");
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudentId.setBounds(133, 174, 83, 22);
		frame.getContentPane().add(lblStudentId);

		JLabel lblStudentName = new JLabel("student name :");
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudentName.setBounds(133, 209, 105, 22);
		frame.getContentPane().add(lblStudentName);

		JLabel lblDay = new JLabel("day :");
		lblDay.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDay.setBounds(133, 242, 83, 22);
		frame.getContentPane().add(lblDay);

		JLabel lblYear = new JLabel("year :");
		lblYear.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblYear.setBounds(133, 277, 83, 22);
		frame.getContentPane().add(lblYear);

		JLabel lblStatuspa = new JLabel("status(P/A) :");
		lblStatuspa.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStatuspa.setBounds(133, 310, 105, 22);
		frame.getContentPane().add(lblStatuspa);

		textField = new JTextField();
		textField.setBounds(246, 176, 125, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(246, 211, 125, 20);
		frame.getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(246, 244, 125, 20);
		frame.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(248, 311, 125, 22);
		frame.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(246, 279, 125, 20);
		frame.getContentPane().add(textField_4);

		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnOk) {
					String dn = textField.getText();
					String dn1 = textField_1.getText();
					String dn2 = textField_2.getText();
					String dn3 = textField_3.getText();
					String dn4 = textField_4.getText();

					java.sql.Connection con = MydbConnectionClass.getConnection();
					try {

						java.sql.PreparedStatement ps = con.prepareStatement(
								"insert into addmaratt(studentid,studentname,day,year,status) values(?,?,?,?,?)");
						ps.setString(1, dn);
						ps.setString(2, dn1);
						ps.setString(3, dn2);
						ps.setString(4, dn3);
						ps.setString(5, dn4);
						ps.execute();
						JOptionPane.showMessageDialog(frame, "you are succesful");
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOk.setBounds(178, 377, 89, 23);
		frame.getContentPane().add(btnOk);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attmar a = new attmar();
				a.mainNewScreen();
				frame.dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancel.setBounds(282, 378, 89, 23);
		frame.getContentPane().add(btnCancel);

		JLabel lblAddAttendence = new JLabel("add attendence");
		lblAddAttendence.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAddAttendence.setForeground(new Color(0, 0, 0));
		lblAddAttendence.setBounds(153, 82, 260, 54);
		frame.getContentPane().add(lblAddAttendence);

	}
}
