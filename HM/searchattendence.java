package HM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class searchattendence {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchattendence window = new searchattendence();
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
	public searchattendence() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 541, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblSearchAttendence = new JLabel("Search ATTENDENCE");
		lblSearchAttendence.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblSearchAttendence.setBounds(121, 61, 251, 27);
		frame.getContentPane().add(lblSearchAttendence);

		JButton btnJanuary = new JButton("JANUARY");
		btnJanuary.setBounds(74, 117, 89, 23);
		frame.getContentPane().add(btnJanuary);

		JButton btnFebruary = new JButton("FEBRUARY");
		btnFebruary.setBounds(74, 169, 89, 23);
		frame.getContentPane().add(btnFebruary);

		JButton btnMarch = new JButton("MARCH");
		btnMarch.setBounds(74, 227, 89, 23);
		frame.getContentPane().add(btnMarch);

		JButton btnApril = new JButton("APRIL");
		btnApril.setBounds(74, 283, 89, 23);
		frame.getContentPane().add(btnApril);

		JButton btnMay = new JButton("MAY");
		btnMay.setBounds(74, 337, 89, 23);
		frame.getContentPane().add(btnMay);

		JButton btnJune = new JButton("JUNE");
		btnJune.setBounds(74, 391, 89, 23);
		frame.getContentPane().add(btnJune);

		JButton btnJuly = new JButton("JULY");
		btnJuly.setBounds(270, 117, 89, 23);
		frame.getContentPane().add(btnJuly);

		JButton btnAugust = new JButton("AUGUST");
		btnAugust.setBounds(270, 169, 89, 23);
		frame.getContentPane().add(btnAugust);

		JButton btnSeptember = new JButton("SEPTEMBER");
		btnSeptember.setBounds(270, 227, 89, 23);
		frame.getContentPane().add(btnSeptember);

		JButton btnOctober = new JButton("OCTOBER");
		btnOctober.setBounds(270, 283, 89, 23);
		frame.getContentPane().add(btnOctober);

		JButton btnNovember = new JButton("NOVEMBER");
		btnNovember.setBounds(270, 337, 89, 23);
		frame.getContentPane().add(btnNovember);

		JButton btnDecember = new JButton("DECEMBER");
		btnDecember.setBounds(270, 391, 89, 23);
		frame.getContentPane().add(btnDecember);

		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				att b12 = new att();
				b12.mainNewScreen();
				frame.dispose();
			}
		});
		btnExit.setBounds(185, 434, 89, 23);
		frame.getContentPane().add(btnExit);
	}
}
