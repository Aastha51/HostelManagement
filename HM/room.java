package HM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class room {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					room window = new room();
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
	public room() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnAdd = new JButton("add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addroomde hp = new addroomde();
				hp.mainNewScreen();
				frame.dispose();
			}
		});
		btnAdd.setBounds(56, 89, 89, 23);
		frame.getContentPane().add(btnAdd);

		JButton btnView = new JButton("view");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewroom hp = new viewroom();
				hp.mainNewScreen();
				frame.dispose();
			}
		});
		btnView.setBounds(56, 135, 89, 23);
		frame.getContentPane().add(btnView);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage hp = new homepage();
				hp.mainNewScreen();
				frame.dispose();
			}
		});
		btnCancel.setBounds(56, 185, 89, 23);
		frame.getContentPane().add(btnCancel);

		JLabel lblRoom = new JLabel("room");
		lblRoom.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblRoom.setBounds(74, 41, 119, 23);
		frame.getContentPane().add(lblRoom);
	}

}
