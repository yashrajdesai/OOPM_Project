package Mart;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class SignUp {

	private JFrame frame;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JPasswordField text4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
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
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("NAME");
		label1.setFont(new Font("Tahoma", Font.BOLD, 24));
		label1.setBounds(427, 121, 152, 55);
		frame.getContentPane().add(label1);
		
		text1 = new JTextField();
		text1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text1.setBounds(598, 133, 247, 43);
		frame.getContentPane().add(text1);
		text1.setColumns(10);
		
		JLabel label2 = new JLabel("EMAIL ID");
		label2.setFont(new Font("Tahoma", Font.BOLD, 24));
		label2.setBounds(427, 208, 130, 46);
		frame.getContentPane().add(label2);
		
		text2 = new JTextField();
		text2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text2.setBounds(598, 208, 282, 46);
		frame.getContentPane().add(text2);
		text2.setColumns(10);
		
		JLabel label3 = new JLabel("PHONE NO");
		label3.setFont(new Font("Tahoma", Font.BOLD, 24));
		label3.setBounds(427, 292, 130, 43);
		frame.getContentPane().add(label3);
		
		text3 = new JTextField();
		text3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text3.setBounds(598, 292, 241, 43);
		frame.getContentPane().add(text3);
		text3.setColumns(10);
		
		JLabel label4 = new JLabel("ADDRESS");
		label4.setFont(new Font("Tahoma", Font.BOLD, 24));
		label4.setBounds(427, 374, 130, 31);
		frame.getContentPane().add(label4);
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setColumns(10);
		textArea1.setWrapStyleWord(true);
		textArea1.setLineWrap(true);
		textArea1.setForeground(Color.BLACK);
		textArea1.setBackground(new Color(255, 255, 255));
		textArea1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea1.setBounds(598, 374, 287, 124);
		Border border = BorderFactory.createLineBorder(Color.GRAY, 1);
		textArea1.setBorder(border);
		frame.getContentPane().add(textArea1);
		
		JLabel label5 = new JLabel("PASSWORD");
		label5.setFont(new Font("Tahoma", Font.BOLD, 24));
		label5.setBounds(427, 546, 142, 31);
		frame.getContentPane().add(label5);
		
		text4 = new JPasswordField();
		text4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text4.setBounds(598, 546, 193, 43);
		frame.getContentPane().add(text4);
		
		JLabel label6 = new JLabel("(MIN 8 CHARACTERS)");
		label6.setFont(new Font("Tahoma", Font.BOLD, 10));
		label6.setBounds(427, 576, 130, 13);
		frame.getContentPane().add(label6);
		
		JLabel label7 = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/signup-icon.png")).getImage();
		label7.setIcon(new ImageIcon(img1));
		label7.setBounds(117, 180, 268, 317);
		frame.getContentPane().add(label7);
		
		
		JButton button1 = new JButton("");
		button1.setForeground(Color.BLACK);
		Image img3=new ImageIcon(this.getClass().getResource("/submit.jpg")).getImage();
		button1.setIcon(new ImageIcon(img3));
		button1.setBackground(Color.WHITE);
		button1.setFont(new Font("Tahoma", Font.BOLD, 24));
		button1.setBounds(760, 611, 137, 85);
		frame.getContentPane().add(button1);
		
		JLabel label8 = new JLabel("");
		label8.setBounds(0, 0, 1301, 728);
		Image img2=new ImageIcon(this.getClass().getResource("/background.png")).getImage();
		label8.setIcon(new ImageIcon(img2));
		frame.getContentPane().add(label8);
		frame.setBounds(100, 100, 1325, 775);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
