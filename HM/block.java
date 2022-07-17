package HM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class block {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					block window = new block();
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
	public block() {
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
				addblock k = new addblock();
				k.mainNewScreen();
				frame.dispose();
			}
		});
		btnAdd.setBounds(55, 81, 89, 23);
		frame.getContentPane().add(btnAdd);

		JButton btnView = new JButton("view");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewblock k = new viewblock();
				k.mainNewScreen();
				frame.dispose();
			}
		});
		btnView.setBounds(55, 140, 89, 23);
		frame.getContentPane().add(btnView);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage k = new homepage();
				k.mainNewScreen();
				frame.dispose();
			}
		});
		btnCancel.setBounds(55, 202, 89, 23);
		frame.getContentPane().add(btnCancel);

		JLabel lblBlock = new JLabel("block");
		lblBlock.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblBlock.setBounds(73, 42, 71, 28);
		frame.getContentPane().add(lblBlock);
	}

}
