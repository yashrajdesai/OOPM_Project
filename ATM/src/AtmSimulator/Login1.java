package AtmSimulator;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Login1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login1 window = new Login1();
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
	public Login1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 833, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("USERNAME");
		l1.setFont(new Font("Tahoma", Font.BOLD, 20));
		l1.setBounds(335, 134, 178, 53);
		frame.getContentPane().add(l1);
		
		textField = new JTextField();
		textField.setBounds(523, 134, 205, 53);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("PASSWORD");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(335, 239, 205, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel l2 = new JLabel("        ");
		Image img=new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		l2.setIcon(new ImageIcon(img));
		l2.setBounds(75, 116, 158, 263);
		frame.getContentPane().add(l2);
		
		JButton b1 = new JButton("LOGIN");
		img=new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		b1.setIcon(new ImageIcon(img));
		b1.setFont(new Font("Tahoma", Font.BOLD, 20));
		b1.setBounds(302, 434, 238, 53);
		frame.getContentPane().add(b1);
	}
}
