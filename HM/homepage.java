package HM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class homepage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage window = new homepage();
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
	public homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 759, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblAdministratorHome = new JLabel("Administrator Home");
		lblAdministratorHome.setForeground(new Color(0, 0, 128));
		lblAdministratorHome.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblAdministratorHome.setBounds(170, 22, 224, 40);
		frame.getContentPane().add(lblAdministratorHome);

		JButton btnAttendence = new JButton("Attendence");
		btnAttendence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				att b = new att();
				b.mainNewScreen();
				frame.dispose();
			}
		});
		btnAttendence.setBackground(new Color(233, 150, 122));
		btnAttendence.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAttendence.setBounds(29, 92, 140, 23);
		frame.getContentPane().add(btnAttendence);

		JButton btnVisitors = new JButton("visitors");
		btnVisitors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visitor b1 = new visitor();
				b1.mainNewScreen();
				frame.dispose();
			}
		});
		btnVisitors.setBackground(new Color(233, 150, 122));
		btnVisitors.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnVisitors.setBounds(29, 144, 140, 23);
		frame.getContentPane().add(btnVisitors);

		JButton btnStudents = new JButton("Students");
		btnStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				student b2 = new student();
				b2.mainNewScreen();
				frame.dispose();
			}
		});
		btnStudents.setBackground(new Color(233, 150, 122));
		btnStudents.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnStudents.setBounds(29, 200, 140, 23);
		frame.getContentPane().add(btnStudents);

		JButton btnRoomGrand = new JButton("Room Grand");
		btnRoomGrand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				room b12 = new room();
				b12.mainNewScreen();
				frame.dispose();
			}
		});
		btnRoomGrand.setBackground(new Color(233, 150, 122));
		btnRoomGrand.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnRoomGrand.setBounds(29, 258, 140, 23);
		frame.getContentPane().add(btnRoomGrand);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login b12 = new login();
				b12.mainNewScreen();
				frame.dispose();
			}
		});
		btnExit.setBackground(new Color(233, 150, 122));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnExit.setBounds(29, 426, 140, 23);
		frame.getContentPane().add(btnExit);

		JButton btnFloor = new JButton("Floor");
		btnFloor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				floor b12 = new floor();
				b12.mainNewScreen();
				frame.dispose();
			}
		});
		btnFloor.setBackground(new Color(233, 150, 122));
		btnFloor.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnFloor.setBounds(29, 318, 140, 23);
		frame.getContentPane().add(btnFloor);

		JButton btnBlock = new JButton("Block");
		btnBlock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				block b12 = new block();
				b12.mainNewScreen();
				frame.dispose();
			}
		});
		btnBlock.setBackground(new Color(233, 150, 122));
		btnBlock.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnBlock.setBounds(29, 372, 140, 23);
		frame.getContentPane().add(btnBlock);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(homepage.class.getResource("/HM/hm/IMG-20200120-WA0011.jpg")));
		lblNewLabel.setBounds(29, 22, 494, 440);
		frame.getContentPane().add(lblNewLabel);
	}
}
