package HM;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login {
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.yt
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.setBackground(SystemColor.activeCaption);
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 838, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(Color.BLACK);
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblUsername.setBounds(56, 246, 85, 32);
		frame.getContentPane().add(lblUsername);

		textField = new JTextField();
		textField.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		textField.setForeground(Color.BLACK);
		textField.setBounds(137, 248, 281, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPassword.setBounds(56, 315, 90, 24);
		frame.getContentPane().add(lblPassword);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		passwordField.setBounds(137, 313, 281, 32);
		frame.getContentPane().add(passwordField);

		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLogin.setBackground(Color.RED);
		btnLogin.setBounds(120, 375, 208, 32);
		frame.getContentPane().add(btnLogin);

		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent g) {
				if (g.getSource() == btnLogin) {
					String dn = textField.getText();
					String da = passwordField.getText();
					if (dn.equals("hm") && da.equals("hms")) {
						homepage hp = new homepage();
						hp.mainNewScreen();
						frame.dispose();
					} else {
						JOptionPane.showMessageDialog(frame, "enter correct information");
					}
				}

			}

		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});

		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBounds(76, 108, 1, 1);
		frame.getContentPane().add(desktopPane_1);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(login.class.getResource("/HM/hm/IMG-20200120-WA0012.jpg")));
		lblNewLabel.setBounds(-66, 15, 446, 220);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(login.class.getResource("/HM/hm/IMG-20200120-WA0012.jpg")));
		lblNewLabel_1.setBounds(-199, 15, 721, 220);
		frame.getContentPane().add(lblNewLabel_1);

		JButton button = new JButton("cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button.setBackground(Color.RED);
		button.setBounds(353, 375, 208, 32);
		frame.getContentPane().add(button);
	}

	protected void exit() {
		// TODO Auto-generated method stub

	}

}