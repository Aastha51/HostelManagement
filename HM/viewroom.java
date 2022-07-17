package HM;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class viewroom {

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
					viewroom window = new viewroom();
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
	public viewroom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 921, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				room m = new room();
				m.mainNewScreen();
				frame.dispose();
			}
		});
		btnCancel.setBounds(265, 375, 89, 23);
		frame.getContentPane().add(btnCancel);

		JLabel lblViewRoom = new JLabel("view room");
		lblViewRoom.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblViewRoom.setBounds(154, 25, 132, 23);
		frame.getContentPane().add(lblViewRoom);

		table = new JTable();

		table.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "studentid", "studentname", "parentname", "blockgrand", "blockstatus", "selectfloor",
						"floorstatus", "selectroom", "roomstatus", "totalbeds", "totalrent", "status" }));
		table.setBounds(10, 33, 423, 80);
		frame.getContentPane().add(table);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(20, 63, 875, 110);
		frame.getContentPane().add(scrollPane);

		JLabel lblClickYesTo = new JLabel("Click yes to view all room details :");
		lblClickYesTo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClickYesTo.setBounds(44, 205, 264, 23);
		frame.getContentPane().add(lblClickYesTo);

		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent g) {
				java.sql.Connection con = MydbConnectionClass.getConnection();

				try {
					java.sql.Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from addroomdetails");
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});
		btnYes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnYes.setBounds(318, 205, 86, 23);
		frame.getContentPane().add(btnYes);

		JLabel lblSearchWithBlock = new JLabel("Search with student id :");
		lblSearchWithBlock.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSearchWithBlock.setBounds(107, 267, 201, 14);
		frame.getContentPane().add(lblSearchWithBlock);

		JLabel label = new JLabel("Search with student name:");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(85, 309, 201, 14);
		frame.getContentPane().add(label);

		textField = new JTextField();
		textField.setBounds(320, 266, 128, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(320, 308, 128, 20);
		frame.getContentPane().add(textField_1);

		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent g) {
				try {
					java.sql.Connection con = MydbConnectionClass.getConnection();
					String sql = "select * from addroomdetails where studentid=?";
					java.sql.PreparedStatement pdt = con.prepareStatement(sql);
					pdt.setString(1, textField.getText());
					ResultSet rs = pdt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					JOptionPane.showConfirmDialog(btnOk, "null", "not", 0);
				}
			}
		});
		btnOk.setBounds(462, 265, 89, 23);
		frame.getContentPane().add(btnOk);

		JButton button_1 = new JButton("ok");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent g) {
				try {
					java.sql.Connection con = MydbConnectionClass.getConnection();
					String sql = "select * from addroomdetails where studentname=?";
					java.sql.PreparedStatement pdt = con.prepareStatement(sql);
					pdt.setString(1, textField_1.getText());
					ResultSet rs = pdt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					JOptionPane.showConfirmDialog(btnOk, "null", "not", 0);
				}

			}
		});
		button_1.setBounds(462, 307, 89, 23);
		frame.getContentPane().add(button_1);

		JButton button = new JButton("ok");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					java.sql.Connection con = MydbConnectionClass.getConnection();
					String sql = "select * from addroomdetails where studentname=?";
					java.sql.PreparedStatement pdt = con.prepareStatement(sql);
					pdt.setString(1, textField_1.getText());
					ResultSet rs = pdt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					JOptionPane.showConfirmDialog(button, "null", "not", 0);
				}
			}
		});
	}
}
