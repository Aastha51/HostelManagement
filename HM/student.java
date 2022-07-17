package HM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class student {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student window = new student();
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
	public student() {
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
				addstu hp = new addstu();
				hp.mainNewScreen();
				frame.dispose();
			}
		});
		btnAdd.setBounds(72, 101, 89, 23);
		frame.getContentPane().add(btnAdd);

		JButton btnView = new JButton("view");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewstu hp = new viewstu();
				hp.mainNewScreen();
				frame.dispose();
			}
		});
		btnView.setBounds(72, 157, 89, 23);
		frame.getContentPane().add(btnView);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage hp = new homepage();
				hp.mainNewScreen();
				frame.dispose();
			}
		});
		btnCancel.setBounds(72, 206, 89, 23);
		frame.getContentPane().add(btnCancel);

		JLabel lblStudents = new JLabel("students");
		lblStudents.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblStudents.setBounds(72, 54, 110, 36);
		frame.getContentPane().add(lblStudents);
	}

}
