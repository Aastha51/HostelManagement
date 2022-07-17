package HM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class att {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					att window = new att();
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
	public att() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblAttendence = new JLabel(" Attendence");
		lblAttendence.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblAttendence.setBounds(120, 32, 233, 30);
		frame.getContentPane().add(lblAttendence);

		JButton btnJanuary = new JButton("january");
		btnJanuary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attjan a = new attjan();
				a.mainNewScreen();
				frame.dispose();

			}
		});
		btnJanuary.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnJanuary.setBounds(43, 84, 116, 23);
		frame.getContentPane().add(btnJanuary);

		JButton btnFebruary = new JButton("february");
		btnFebruary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				attfeb a = new attfeb();
				a.mainNewScreen();
				frame.dispose();

			}
		});
		btnFebruary.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFebruary.setBounds(43, 129, 116, 23);
		frame.getContentPane().add(btnFebruary);

		JButton btnMarch = new JButton("march");
		btnMarch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attmar a = new attmar();
				a.mainNewScreen();
				frame.dispose();

			}
		});
		btnMarch.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMarch.setBounds(43, 170, 116, 23);
		frame.getContentPane().add(btnMarch);

		JButton btnApril = new JButton("april");
		btnApril.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				attapril a = new attapril();
				a.mainNewScreen();
				frame.dispose();
			}
		});
		btnApril.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnApril.setBounds(43, 214, 116, 23);
		frame.getContentPane().add(btnApril);

		JButton btnMay = new JButton("may");
		btnMay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				attmay a = new attmay();
				a.mainNewScreen();
				frame.dispose();
			}
		});
		btnMay.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMay.setBounds(43, 258, 116, 23);
		frame.getContentPane().add(btnMay);

		JButton btnJuly = new JButton("july");
		btnJuly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attjuly a = new attjuly();
				a.mainNewScreen();
				frame.dispose();

			}
		});
		btnJuly.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnJuly.setBounds(237, 84, 116, 23);
		frame.getContentPane().add(btnJuly);

		JButton btnJune = new JButton("june");
		btnJune.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attjune a = new attjune();
				a.mainNewScreen();
				frame.dispose();

			}
		});
		btnJune.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnJune.setBounds(43, 300, 116, 23);
		frame.getContentPane().add(btnJune);

		JButton btnAugust = new JButton("august");
		btnAugust.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attaug a = new attaug();
				a.mainNewScreen();
				frame.dispose();

			}
		});
		btnAugust.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAugust.setBounds(237, 131, 116, 23);
		frame.getContentPane().add(btnAugust);

		JButton btnSeptember = new JButton("september");
		btnSeptember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				attsept a = new attsept();
				a.mainNewScreen();
				frame.dispose();
			}
		});
		btnSeptember.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSeptember.setBounds(237, 172, 116, 23);
		frame.getContentPane().add(btnSeptember);

		JButton btnOctober = new JButton("october");
		btnOctober.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				attoct a = new attoct();
				a.mainNewScreen();
				frame.dispose();
			}
		});
		btnOctober.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOctober.setBounds(237, 216, 116, 23);
		frame.getContentPane().add(btnOctober);

		JButton btnNovember = new JButton("november");
		btnNovember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attnov a = new attnov();
				a.mainNewScreen();
				frame.dispose();

			}
		});
		btnNovember.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNovember.setBounds(237, 260, 116, 23);
		frame.getContentPane().add(btnNovember);

		JButton btnDecember = new JButton("december");
		btnDecember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attdec a = new attdec();
				a.mainNewScreen();
				frame.dispose();

			}
		});
		btnDecember.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDecember.setBounds(237, 302, 116, 23);
		frame.getContentPane().add(btnDecember);

		JButton btnExit = new JButton("exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage a = new homepage();
				a.mainNewScreen();
				frame.dispose();

			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setBounds(160, 352, 89, 23);
		frame.getContentPane().add(btnExit);

	}
}
