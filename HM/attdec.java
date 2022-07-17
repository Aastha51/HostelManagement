package HM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class attdec {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					attdec window = new attdec();
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
	public attdec() {
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
				adddecatt b12 = new adddecatt();
				b12.mainNewScreen();
				frame.dispose();
			}
		});
		btnAdd.setBounds(90, 84, 89, 23);
		frame.getContentPane().add(btnAdd);

		JButton btnView = new JButton("view");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewdecatt b12 = new viewdecatt();
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
