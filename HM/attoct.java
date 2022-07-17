package HM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class attoct {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					attoct window = new attoct();
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
	public attoct() {
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
				addoctatt b12 = new addoctatt();
				b12.mainNewScreen();
				frame.dispose();
			}
		});
		btnAdd.setBounds(90, 84, 89, 23);
		frame.getContentPane().add(btnAdd);

		JButton btnView = new JButton("view");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewoctatt b12 = new viewoctatt();
				b12.mainNewScreen();
				frame.dispose();
			}
		});
		btnView.setBounds(90, 135, 89, 23);
		frame.getContentPane().add(btnView);

		JButton btnExit = new JButton("exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				att b12 = new att();
				b12.mainNewScreen();
				frame.dispose();
			}
		});
		btnExit.setBounds(90, 191, 89, 23);
		frame.getContentPane().add(btnExit);

		JLabel lblAttendence = new JLabel("Attendence");
		lblAttendence.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblAttendence.setBounds(77, 29, 148, 30);
		frame.getContentPane().add(lblAttendence);
	}
}
