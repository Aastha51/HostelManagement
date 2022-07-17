package HM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class searchvis {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchvis window = new searchvis();
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
	public searchvis() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 539, 583);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblSearchVisitor = new JLabel("search visitor");
		lblSearchVisitor.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblSearchVisitor.setBounds(152, 53, 216, 29);
		frame.getContentPane().add(lblSearchVisitor);

		JButton btnJanuary = new JButton("january");
		btnJanuary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnJanuary.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnJanuary.setBounds(56, 125, 113, 23);
		frame.getContentPane().add(btnJanuary);

		JButton btnFebruary = new JButton("february");
		btnFebruary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnFebruary.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFebruary.setBounds(56, 191, 113, 23);
		frame.getContentPane().add(btnFebruary);

		JButton btnMarch = new JButton("march");
		btnMarch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnMarch.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMarch.setBounds(56, 262, 113, 23);
		frame.getContentPane().add(btnMarch);

		JButton btnApril = new JButton("april");
		btnApril.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnApril.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnApril.setBounds(56, 328, 113, 23);
		frame.getContentPane().add(btnApril);

		JButton btnMay = new JButton("may");
		btnMay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnMay.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMay.setBounds(56, 390, 113, 23);
		frame.getContentPane().add(btnMay);

		JButton btnJune = new JButton("june");
		btnJune.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnJune.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnJune.setBounds(56, 448, 113, 23);
		frame.getContentPane().add(btnJune);

		JButton btnJuly = new JButton("july");
		btnJuly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnJuly.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnJuly.setBounds(279, 127, 113, 23);
		frame.getContentPane().add(btnJuly);

		JButton btnAugust = new JButton("august");
		btnAugust.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnAugust.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAugust.setBounds(279, 193, 113, 23);
		frame.getContentPane().add(btnAugust);

		JButton btnSeptember = new JButton("september");
		btnSeptember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnSeptember.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSeptember.setBounds(279, 264, 113, 23);
		frame.getContentPane().add(btnSeptember);

		JButton btnOctober = new JButton("october");
		btnOctober.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnOctober.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOctober.setBounds(279, 330, 113, 23);
		frame.getContentPane().add(btnOctober);

		JButton btnNovember = new JButton("november");
		btnNovember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNovember.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNovember.setBounds(279, 392, 113, 23);
		frame.getContentPane().add(btnNovember);

		JButton btnDecember = new JButton("december");
		btnDecember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnDecember.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDecember.setBounds(279, 450, 113, 23);
		frame.getContentPane().add(btnDecember);

		JButton btnExit = new JButton("exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visitor b12 = new visitor();
				b12.mainNewScreen();
				frame.dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(186, 489, 89, 23);
		frame.getContentPane().add(btnExit);
	}
}
