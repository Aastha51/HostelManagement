package HM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class floor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					floor window = new floor();
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
	public floor() {
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
				addfloor hp = new addfloor();
				hp.mainNewScreen();
				frame.dispose();
			}
		});
		btnAdd.setBounds(43, 92, 89, 23);
		frame.getContentPane().add(btnAdd);

		JButton btnView = new JButton("view");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewfloor hp = new viewfloor();
				hp.mainNewScreen();
				frame.dispose();
			}
		});
		btnView.setBounds(43, 147, 89, 23);
		frame.getContentPane().add(btnView);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage hp = new homepage();
				hp.mainNewScreen();
				frame.dispose();
			}
		});
		btnCancel.setBounds(43, 211, 89, 23);
		frame.getContentPane().add(btnCancel);

		JLabel lblFloor = new JLabel("floor");
		lblFloor.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblFloor.setBounds(63, 40, 108, 41);
		frame.getContentPane().add(lblFloor);
	}

}
