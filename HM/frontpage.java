package HM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frontpage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frontpage window = new frontpage();
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
	public frontpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 785, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblHostel = new JLabel("HOSTEL");
		lblHostel.setForeground(new Color(0, 0, 128));
		lblHostel.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblHostel.setBounds(214, 35, 174, 46);
		frame.getContentPane().add(lblHostel);

		JLabel lblManagement = new JLabel("MANAGEMENT");
		lblManagement.setForeground(new Color(0, 0, 139));
		lblManagement.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblManagement.setBounds(291, 92, 255, 46);
		frame.getContentPane().add(lblManagement);

		JLabel lblSystem = new JLabel("SYSTEM");
		lblSystem.setForeground(new Color(0, 0, 128));
		lblSystem.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblSystem.setBounds(430, 159, 116, 30);
		frame.getContentPane().add(lblSystem);

		JButton btnGo = new JButton("GO");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login a = new login();
				a.mainNewScreen();
				frame.dispose();
			}
		});
		btnGo.setBackground(new Color(250, 240, 230));
		btnGo.setForeground(new Color(0, 100, 0));
		btnGo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnGo.setBounds(641, 445, 89, 23);
		frame.getContentPane().add(btnGo);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(frontpage.class.getResource("/HM/hm/IMG-20200120-WA0010.jpg")));
		lblNewLabel.setBounds(10, -30, 749, 523);
		frame.getContentPane().add(lblNewLabel);
	}
}
