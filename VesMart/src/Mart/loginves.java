package Mart;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class loginves {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginves window = new loginves();
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
	public loginves() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(70, 130, 180));
		frame.setBounds(100, 100, 1325, 775);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel username = new JLabel("EMAIL ID");
		username.setFont(new Font("Tahoma", Font.BOLD, 20));
		username.setBounds(581, 221, 156, 40);
		frame.getContentPane().add(username);
		
		JLabel password = new JLabel("Password");
		password.setFont(new Font("Tahoma", Font.BOLD, 20));
		password.setBounds(581, 311, 156, 40);
		frame.getContentPane().add(password);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(747, 225, 272, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton login = new JButton("Log in");
		Image img1=new ImageIcon(this.getClass().getResource("/Login.png")).getImage();
		login.setIcon(new ImageIcon(img1));
		login.setBackground(new Color(0, 139, 139));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		login.setFont(new Font("Tahoma", Font.BOLD, 20));
		login.setBounds(604, 412, 164, 50);
		frame.getContentPane().add(login);
		
		JButton signup = new JButton("Sign up");
		Image img2=new ImageIcon(this.getClass().getResource("/Signup.png")).getImage();
		signup.setIcon(new ImageIcon(img2));
		signup.setBackground(new Color(0, 139, 139));
		signup.setFont(new Font("Tahoma", Font.BOLD, 20));
		signup.setBounds(832, 412, 164, 50);
		frame.getContentPane().add(signup);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(747, 315, 272, 34);
		frame.getContentPane().add(passwordField);
		
		JLabel lock = new JLabel("");
		Image img3=new ImageIcon(this.getClass().getResource("/Lock-icon.png")).getImage();
		lock.setIcon(new ImageIcon(img3));
		lock.setBounds(274, 132, 256, 418);
		frame.getContentPane().add(lock);
		
		JLabel background = new JLabel("");
		Image img4=new ImageIcon(this.getClass().getResource("/background.png")).getImage();
		background.setIcon(new ImageIcon(img4));
		background.setBounds(0, 0, 1311, 738);
		frame.getContentPane().add(background);
	}
}
