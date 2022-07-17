package HM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class addroomde {

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
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addroomde window = new addroomde();
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
	public addroomde() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 792, 742);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblAddRoomDetail = new JLabel("add room detail");
		lblAddRoomDetail.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAddRoomDetail.setBounds(166, 59, 270, 32);
		frame.getContentPane().add(lblAddRoomDetail);

		JLabel lblSid = new JLabel("Student ID");
		lblSid.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSid.setBounds(50, 103, 111, 19);
		frame.getContentPane().add(lblSid);

		textField = new JTextField();
		textField.setBounds(225, 102, 139, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblSname = new JLabel("Student Name");
		lblSname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSname.setBounds(50, 145, 111, 14);
		frame.getContentPane().add(lblSname);

		textField_1 = new JTextField();
		textField_1.setBounds(225, 144, 139, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblParentName = new JLabel("Parent Name");
		lblParentName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblParentName.setBounds(50, 191, 111, 14);
		frame.getContentPane().add(lblParentName);

		JLabel lblSelectBolckTo = new JLabel("Select Block to grand");
		lblSelectBolckTo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSelectBolckTo.setBounds(50, 236, 156, 20);
		frame.getContentPane().add(lblSelectBolckTo);

		JLabel lblBlockStatus = new JLabel("Block status");
		lblBlockStatus.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBlockStatus.setBounds(50, 284, 98, 14);
		frame.getContentPane().add(lblBlockStatus);

		JLabel lblSelectFloor = new JLabel("Select floor");
		lblSelectFloor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSelectFloor.setBounds(50, 323, 98, 14);
		frame.getContentPane().add(lblSelectFloor);

		JLabel lblFloorStatus = new JLabel("Floor Status");
		lblFloorStatus.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFloorStatus.setBounds(50, 371, 98, 14);
		frame.getContentPane().add(lblFloorStatus);

		JLabel lblFloorStatus_1 = new JLabel("room status");
		lblFloorStatus_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFloorStatus_1.setBounds(50, 472, 98, 14);
		frame.getContentPane().add(lblFloorStatus_1);

		JLabel lblSelectRoom = new JLabel("select room ");
		lblSelectRoom.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSelectRoom.setBounds(50, 419, 98, 19);
		frame.getContentPane().add(lblSelectRoom);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(225, 190, 139, 19);
		frame.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(225, 238, 139, 19);
		frame.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(225, 283, 139, 19);
		frame.getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(225, 322, 139, 19);
		frame.getContentPane().add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(225, 370, 139, 19);
		frame.getContentPane().add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(225, 420, 139, 19);
		frame.getContentPane().add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(225, 471, 139, 19);
		frame.getContentPane().add(textField_8);

		JLabel lblNewLabel = new JLabel("Total number of beds");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(50, 516, 156, 14);
		frame.getContentPane().add(lblNewLabel);

		textField_9 = new JTextField();
		textField_9.setBounds(225, 515, 139, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);

		JLabel lblRoomRent = new JLabel("room rent");
		lblRoomRent.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRoomRent.setBounds(50, 561, 98, 14);
		frame.getContentPane().add(lblRoomRent);

		textField_10 = new JTextField();
		textField_10.setBounds(225, 560, 139, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);

		JLabel lblStatus = new JLabel("status");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStatus.setBounds(50, 606, 55, 14);
		frame.getContentPane().add(lblStatus);

		textField_11 = new JTextField();
		textField_11.setBounds(225, 605, 139, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);

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
					String dn6 = textField_6.getText();
					String dn7 = textField_7.getText();
					String dn8 = textField_8.getText();
					String dn9 = textField_9.getText();
					String dn10 = textField_10.getText();
					String dn11 = textField_11.getText();
					Connection con = MydbConnectionClass.getConnection();
					try {
						java.sql.PreparedStatement ps = con.prepareStatement(
								"insert into addroomdetails(studentid,studentname,parentname,blockgrand,blockstatus,selectfloor,floorstatus,selectroom,roomstatus,totalbeds,totalrent,status) values(?,?,?,?,?,?,?,?,?,?,?,?)");
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
						ps.setString(12, dn11);
						ps.execute();
						JOptionPane.showMessageDialog(frame, "you are succesful");
					} catch (SQLException e) {
						e.printStackTrace();
					}

				}

			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSubmit.setBounds(117, 669, 89, 23);
		frame.getContentPane().add(btnSubmit);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				room b12 = new room();
				b12.mainNewScreen();
				frame.dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancel.setBounds(236, 670, 89, 23);
		frame.getContentPane().add(btnCancel);
	}
}
