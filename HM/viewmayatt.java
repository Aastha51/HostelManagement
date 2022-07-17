package HM;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

public class viewmayatt {

	private JFrame frame;
	private JTable table;
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
					viewmayatt window = new viewmayatt();
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
	public viewmayatt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 740, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attmay m = new attmay();
				m.mainNewScreen();
				frame.dispose();
			}
		});
		frame.getContentPane().setLayout(null);
		btnCancel.setBounds(452, 207, 89, 23);
		frame.getContentPane().add(btnCancel);

		JLabel lblViewFloor = new JLabel("view attendence");
		lblViewFloor.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblViewFloor.setBounds(113, 32, 187, 23);
		frame.getContentPane().add(lblViewFloor);
		table = new JTable();

		table.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "studentid", "studentname", "day", "year", "status(P/A)" }));
		table.setBounds(1, 26, 385, 80);
		frame.getContentPane().add(table);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(20, 63, 404, 105);
		frame.getContentPane().add(scrollPane);

		JLabel lblClickYesTo = new JLabel("Click yes to view all attendence details :");
		lblClickYesTo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClickYesTo.setBounds(20, 205, 308, 23);
		frame.getContentPane().add(lblClickYesTo);

		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent g) {
				java.sql.Connection con = MydbConnectionClass.getConnection();

				try {
					java.sql.Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from addmaatt");
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});
		btnYes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnYes.setBounds(338, 205, 86, 23);
		frame.getContentPane().add(btnYes);

		JLabel lblSearchWithBlock = new JLabel("Search with student id :");
		lblSearchWithBlock.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSearchWithBlock.setBounds(43, 267, 201, 14);
		frame.getContentPane().add(lblSearchWithBlock);

		JLabel label = new JLabel("Search with student name :");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(30, 309, 217, 14);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("Search with status:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(43, 347, 201, 14);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Search with day :");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(43, 382, 201, 23);
		frame.getContentPane().add(label_2);

		textField = new JTextField();
		textField.setBounds(238, 266, 128, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(238, 308, 128, 20);
		frame.getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(238, 346, 128, 20);
		frame.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(238, 385, 128, 20);
		frame.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(238, 424, 128, 20);
		frame.getContentPane().add(textField_4);

		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					java.sql.Connection con = MydbConnectionClass.getConnection();
					String sql = "select * from addmaatt where studentid=?";
					java.sql.PreparedStatement pdt = con.prepareStatement(sql);
					pdt.setString(1, textField.getText());
					ResultSet rs = pdt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					JOptionPane.showConfirmDialog(btnOk, "null", "not", 0);
				}
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOk.setBounds(376, 263, 74, 23);
		frame.getContentPane().add(btnOk);

		JButton button = new JButton("ok");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					java.sql.Connection con = MydbConnectionClass.getConnection();
					String sql = "select * from addmaatt where studentname=?";
					java.sql.PreparedStatement pdt = con.prepareStatement(sql);
					pdt.setString(1, textField_1.getText());
					ResultSet rs = pdt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					JOptionPane.showConfirmDialog(btnOk, "null", "not", 0);
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(376, 305, 74, 23);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("ok");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					java.sql.Connection con = MydbConnectionClass.getConnection();
					String sql = "select * from addmaatt where status=?";
					java.sql.PreparedStatement pdt = con.prepareStatement(sql);
					pdt.setString(1, textField_2.getText());
					ResultSet rs = pdt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					JOptionPane.showConfirmDialog(btnOk, "null", "not", 0);
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBounds(376, 343, 74, 23);
		frame.getContentPane().add(button_1);

		JButton button_2 = new JButton("ok");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					java.sql.Connection con = MydbConnectionClass.getConnection();
					String sql = "select * from addmaatt where day=?";
					java.sql.PreparedStatement pdt = con.prepareStatement(sql);
					pdt.setString(1, textField_3.getText());
					ResultSet rs = pdt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					JOptionPane.showConfirmDialog(btnOk, "null", "not", 0);
				}
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBounds(376, 382, 74, 23);
		frame.getContentPane().add(button_2);

		JButton button_3 = new JButton("ok");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					java.sql.Connection con = MydbConnectionClass.getConnection();
					String sql = "select * from addmaatt where year=?";
					java.sql.PreparedStatement pdt = con.prepareStatement(sql);
					pdt.setString(1, textField_4.getText());
					ResultSet rs = pdt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					JOptionPane.showConfirmDialog(btnOk, "null", "not", 0);
				}
			}

		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_3.setBounds(376, 423, 74, 23);
		frame.getContentPane().add(button_3);

		JLabel lblSearchWithYear = new JLabel("Search with year :");
		lblSearchWithYear.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSearchWithYear.setBounds(43, 416, 201, 23);
		frame.getContentPane().add(lblSearchWithYear);
	}

}
