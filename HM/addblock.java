package HM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.sql.*;

import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class addblock {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtYn;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addblock window = new addblock();
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
	public addblock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 538, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblAddblock = new JLabel("Add block");
		lblAddblock.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblAddblock.setBounds(159, 49, 229, 31);
		frame.getContentPane().add(lblAddblock);

		JLabel lblBid = new JLabel("BId");
		lblBid.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBid.setBounds(59, 127, 52, 14);
		frame.getContentPane().add(lblBid);

		JLabel lblBno = new JLabel("Block no.");
		lblBno.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBno.setBounds(59, 169, 73, 14);
		frame.getContentPane().add(lblBno);

		JLabel lblblockName = new JLabel("Block name");
		lblblockName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblblockName.setBounds(59, 209, 92, 14);
		frame.getContentPane().add(lblblockName);

		JLabel lblblockStatus = new JLabel("Block status");
		lblblockStatus.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblblockStatus.setBounds(59, 252, 92, 14);
		frame.getContentPane().add(lblblockStatus);

		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent g) {

				if (g.getSource() == btnOk) {
					try {

						Connection con = MydbConnectionClass.getConnection();
						String dn = textField.getText();
						String dn1 = textField_1.getText();
						String dn2 = textField_2.getText();
						String dn3 = txtYn.getText();

						java.sql.PreparedStatement ps = con.prepareStatement(
								"insert into addblock(bid,blockno,blockname,blockstatus) values(?,?,?,?)");
						ps.setString(1, dn);
						ps.setString(2, dn1);
						ps.setString(3, dn2);
						ps.setString(4, dn3);
						ps.execute();
						JOptionPane.showMessageDialog(frame, "you are succesful");
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnOk.setBounds(107, 299, 89, 23);
		frame.getContentPane().add(btnOk);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				block b12 = new block();
				b12.mainNewScreen();
				frame.dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBounds(238, 300, 89, 23);
		frame.getContentPane().add(btnCancel);

		textField = new JTextField();
		textField.setBounds(159, 126, 107, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(159, 168, 107, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(159, 208, 107, 20);
		frame.getContentPane().add(textField_2);

		txtYn = new JTextField();
		txtYn.setText("Y/N");
		txtYn.setColumns(10);
		txtYn.setBounds(159, 251, 107, 20);
		frame.getContentPane().add(txtYn);
	}

}
