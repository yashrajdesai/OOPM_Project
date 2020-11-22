package Mart;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		
		JLabel username = new JLabel("Email id");

		username.setFont(new Font("Tahoma", Font.BOLD, 20));
		username.setBounds(581, 303, 156, 40);
		frame.getContentPane().add(username);
		
		JLabel password = new JLabel("Password");
		password.setFont(new Font("Tahoma", Font.BOLD, 20));
		password.setBounds(581, 378, 156, 40);
		frame.getContentPane().add(password);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(747, 307, 272, 33);
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
		login.setBounds(607, 470, 164, 50);
		frame.getContentPane().add(login);
		
		//Verifying password from Database

		login.addActionListener(ae->{
			String uname = textField.getText();
			String pass=new String(passwordField.getPassword());
			
			System.out.println(uname);
			System.out.println(pass);
			
			String query = "select Pass from signup where EmailId = '"+uname+"'";
			Conn c2 = new Conn();
			try {
				ResultSet rs = c2.st.executeQuery(query);
				rs.next();
				String Pass = rs.getString("Pass");
				System.out.println(Pass);
				if(Pass.equals(pass)) {
					JOptionPane.showMessageDialog(null,"Signed in Successfully");
					new Home().frame.setVisible(true);
					frame.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null,"Password/Username entered is incorrect");
				}
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null,"Password/Username entered is incorrect");
			}
			
		});
			
		
		JButton signup = new JButton("Sign up");
		Image img2=new ImageIcon(this.getClass().getResource("/Signup.png")).getImage();
		signup.setIcon(new ImageIcon(img2));
		signup.setBackground(new Color(0, 139, 139));
		signup.setFont(new Font("Tahoma", Font.BOLD, 20));
		signup.setBounds(822, 470, 164, 50);
		frame.getContentPane().add(signup);

		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(747, 382, 272, 34);
		frame.getContentPane().add(passwordField);
		
		JLabel lock = new JLabel("");
		Image img3=new ImageIcon(this.getClass().getResource("/Lock-icon.png")).getImage();
		lock.setIcon(new ImageIcon(img3));
		lock.setBounds(294, 213, 256, 418);
		frame.getContentPane().add(lock);
		
		JLabel vesmartname = new JLabel("VesMart");
		vesmartname.setForeground(new Color(25, 25, 112));
		vesmartname.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 80));
		vesmartname.setBounds(450, 40, 441, 110);
		frame.getContentPane().add(vesmartname);
		
		JLabel basket1 = new JLabel("");
		Image img4=new ImageIcon(this.getClass().getResource("/shop.png")).getImage();
		basket1.setIcon(new ImageIcon(img4));
		basket1.setBounds(343, 3, 156, 147);
		frame.getContentPane().add(basket1);
		
		JLabel basket2 = new JLabel("");
		Image img5=new ImageIcon(this.getClass().getResource("/shop.png")).getImage();
		basket2.setIcon(new ImageIcon(img5));
		basket2.setBounds(858, 25, 128, 106);
		frame.getContentPane().add(basket2);		
		
		JLabel background = new JLabel("");
		Image img6=new ImageIcon(this.getClass().getResource("/background.png")).getImage();
		background.setIcon(new ImageIcon(img6));
		background.setBounds(0, 0, 1311, 738);
		frame.getContentPane().add(background);
		
	}
}
