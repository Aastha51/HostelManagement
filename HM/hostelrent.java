package HM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hostelrent {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hostelrent window = new hostelrent();
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
	public hostelrent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 752, 744);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblHostelRent = new JLabel("hostel Rent");
		lblHostelRent.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblHostelRent.setBounds(105, 44, 239, 45);
		frame.getContentPane().add(lblHostelRent);

		JLabel lblCurrentMessFee = new JLabel("current mess fee");
		lblCurrentMessFee.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrentMessFee.setBounds(44, 105, 130, 30);
		frame.getContentPane().add(lblCurrentMessFee);

		textField = new JTextField();
		textField.setBounds(209, 100, 145, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblSelectStudentId = new JLabel("select student id");
		lblSelectStudentId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSelectStudentId.setBounds(44, 156, 120, 20);
		frame.getContentPane().add(lblSelectStudentId);

		textField_1 = new JTextField();
		textField_1.setBounds(209, 153, 145, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblStudentName = new JLabel("student name");
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStudentName.setBounds(44, 203, 125, 20);
		frame.getContentPane().add(lblStudentName);

		textField_2 = new JTextField();
		textField_2.setBounds(209, 200, 145, 30);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblBlockName = new JLabel("block name");
		lblBlockName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBlockName.setBounds(44, 243, 112, 30);
		frame.getContentPane().add(lblBlockName);

		textField_3 = new JTextField();
		textField_3.setBounds(209, 241, 145, 30);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JLabel lblFloorNo = new JLabel("floor no.");
		lblFloorNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFloorNo.setBounds(44, 294, 122, 20);
		frame.getContentPane().add(lblFloorNo);

		textField_4 = new JTextField();
		textField_4.setBounds(209, 291, 145, 30);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JLabel lblRoomNo = new JLabel("room no.");
		lblRoomNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRoomNo.setBounds(44, 336, 112, 30);
		frame.getContentPane().add(lblRoomNo);

		textField_5 = new JTextField();
		textField_5.setBounds(209, 338, 145, 30);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);

		JLabel lblRoomFee = new JLabel("room fee");
		lblRoomFee.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRoomFee.setBounds(41, 383, 120, 30);
		frame.getContentPane().add(lblRoomFee);

		textField_6 = new JTextField();
		textField_6.setBounds(209, 385, 145, 30);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);

		JLabel lblSelectYear = new JLabel("select year");
		lblSelectYear.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSelectYear.setBounds(44, 435, 98, 20);
		frame.getContentPane().add(lblSelectYear);

		textField_7 = new JTextField();
		textField_7.setBounds(209, 432, 145, 30);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);

		JLabel lblSelectMonth = new JLabel("select month");
		lblSelectMonth.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSelectMonth.setBounds(41, 485, 101, 20);
		frame.getContentPane().add(lblSelectMonth);

		textField_8 = new JTextField();
		textField_8.setBounds(209, 485, 145, 30);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);

		JLabel lblOtherExpenses = new JLabel("other expenses if any");
		lblOtherExpenses.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOtherExpenses.setBounds(44, 527, 162, 30);
		frame.getContentPane().add(lblOtherExpenses);

		textField_9 = new JTextField();
		textField_9.setBounds(209, 529, 145, 30);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);

		JButton btnOk = new JButton("ok");
		btnOk.setBounds(105, 611, 89, 23);
		frame.getContentPane().add(btnOk);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage b12 = new homepage();
				b12.mainNewScreen();
				frame.dispose();
			}
		});
		btnCancel.setBounds(238, 611, 89, 23);
		frame.getContentPane().add(btnCancel);
	}
}
