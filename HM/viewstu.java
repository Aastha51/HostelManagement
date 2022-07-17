package HM;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class viewstu {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewstu window = new viewstu();
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
	public viewstu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1141, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblViewStudentDetails = new JLabel("view student details");
		lblViewStudentDetails.setBounds(185, 24, 247, 29);
		lblViewStudentDetails.setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.getContentPane().add(lblViewStudentDetails);

		JLabel lblToViewDetails = new JLabel("To view details about  all students :");
		lblToViewDetails.setBounds(168, 283, 247, 14);
		lblToViewDetails.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(lblToViewDetails);

		JButton btnYes = new JButton("yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				java.sql.Connection con = MydbConnectionClass.getConnection();

				try {
					java.sql.Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from addstudent");
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});
		btnYes.setBounds(425, 278, 89, 23);
		btnYes.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(btnYes);

		table = new JTable();

		table.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "studentid", "studentname", "gender", "dob", "address", "phoneno", "email", "fathername",
						"mothername", "fathersphone", "mothersphone" }));
		table.setBounds(20, 31, 404, 216);
		frame.getContentPane().add(table);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(20, 63, 1071, 104);
		frame.getContentPane().add(scrollPane);

		JLabel lblSearchStudentWith = new JLabel("search student with name :");
		lblSearchStudentWith.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSearchStudentWith.setBounds(137, 357, 169, 14);
		frame.getContentPane().add(lblSearchStudentWith);

		JButton btnSearch = new JButton("search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					java.sql.Connection con = MydbConnectionClass.getConnection();
					String sql = "select * from addstudent where studentname=?";
					java.sql.PreparedStatement pdt = con.prepareStatement(sql);
					pdt.setString(1, textField.getText());
					ResultSet rs = pdt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					JOptionPane.showConfirmDialog(btnSearch, "null", "not", 0);
				}
			}
		});
		btnSearch.setBounds(469, 354, 89, 23);
		frame.getContentPane().add(btnSearch);

		textField = new JTextField();
		textField.setBounds(316, 355, 121, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblSearchStudentWith_1 = new JLabel("search student with id :");
		lblSearchStudentWith_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSearchStudentWith_1.setBounds(137, 404, 169, 14);
		frame.getContentPane().add(lblSearchStudentWith_1);

		textField_1 = new JTextField();
		textField_1.setBounds(316, 402, 121, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton button = new JButton("search");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					java.sql.Connection con = MydbConnectionClass.getConnection();
					String sql = "select * from addstudent where studentid=?";
					java.sql.PreparedStatement pdt = con.prepareStatement(sql);
					pdt.setString(1, textField_1.getText());
					ResultSet rs = pdt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					JOptionPane.showConfirmDialog(btnSearch, "null", "not", 0);
				}
			}
		});
		button.setBounds(469, 401, 89, 23);
		frame.getContentPane().add(button);

		JButton btnExit = new JButton("exit");
		btnExit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				student hp = new student();
				hp.mainNewScreen();
				frame.dispose();
			}
		});
		btnExit.setBounds(621, 374, 89, 23);
		frame.getContentPane().add(btnExit);
	}
}
