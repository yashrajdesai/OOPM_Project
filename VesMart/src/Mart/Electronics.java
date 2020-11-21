package Mart;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Electronics extends JFrame {

	private JPanel contentPane;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Electronics frame = new Electronics();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Electronics() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1325, 775);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Electronics_title = new JLabel("Electronics");
		Electronics_title.setForeground(new Color(0, 0, 255));
		Electronics_title.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 55));
		Electronics_title.setBounds(441, 10, 453, 58);
		contentPane.add(Electronics_title);
		
		JLabel Laptop_img = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/Laptop.png")).getImage();
		Laptop_img.setIcon(new ImageIcon(img1));
		Laptop_img.setBounds(55, 60, 319, 183);
		contentPane.add(Laptop_img);
		
		JLabel e4 = new JLabel("Img 4");
		e4.setBounds(55, 414, 319, 183);
		contentPane.add(e4);
		
		JLabel e2 = new JLabel("Img 2");
		e2.setBounds(496, 60, 319, 183);
		contentPane.add(e2);
		
		JLabel lblNewLabel_3 = new JLabel("Img 5");
		lblNewLabel_3.setBounds(496, 414, 319, 183);
		contentPane.add(lblNewLabel_3);
		
		JLabel e3 = new JLabel("Img 3");
		e3.setBounds(943, 60, 319, 183);
		contentPane.add(e3);
		
		JLabel lblNewLabel_5 = new JLabel("Img 6");
		lblNewLabel_5.setBounds(943, 414, 319, 183);
		contentPane.add(lblNewLabel_5);
		
		JButton back = new JButton("Back");
		back.setFont(new Font("Tahoma", Font.BOLD, 20));
		back.setBounds(0, 0, 150, 50);
		contentPane.add(back);
		
		JButton cart = new JButton("Cart");
		cart.setFont(new Font("Tahoma", Font.BOLD, 20));
		cart.setBounds(1162, 0, 150, 50);
		contentPane.add(cart);
		
		JLabel Laptop_name = new JLabel("Lenovo Ideapad Slim 3i");
		Laptop_name.setFont(new Font("Tahoma", Font.BOLD, 18));
		Laptop_name.setBounds(55, 252, 319, 36);
		contentPane.add(Laptop_name);
		
		JLabel Laptop_Price = new JLabel("Price: Rs 40,000");
		Laptop_Price.setFont(new Font("Dialog", Font.BOLD, 14));
		Laptop_Price.setBounds(55, 285, 319, 36);
		contentPane.add(Laptop_Price);
		
		JComboBox e1combo = new JComboBox();
		e1combo.setBounds(55, 331, 159, 40);
		contentPane.add(e1combo);
		
		JButton e1_button = new JButton("New button");
		e1_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		e1_button.setBounds(215, 331, 159, 40);
		contentPane.add(e1_button);
		
		JLabel e2_label = new JLabel("New label");
		e2_label.setFont(new Font("Tahoma", Font.BOLD, 18));
		e2_label.setBounds(496, 252, 319, 36);
		contentPane.add(e2_label);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(943, 253, 319, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2.setBounds(496, 287, 319, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_4.setBounds(943, 287, 319, 36);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(494, 331, 159, 40);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(656, 331, 159, 40);
		contentPane.add(btnNewButton_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(943, 331, 159, 40);
		contentPane.add(comboBox_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(1103, 331, 159, 40);
		contentPane.add(btnNewButton_3);
		
		JLabel e4_label = new JLabel("New label");
		e4_label.setFont(new Font("Tahoma", Font.BOLD, 18));
		e4_label.setBounds(55, 607, 319, 36);
		contentPane.add(e4_label);
		
		JLabel e4_label_2 = new JLabel("New label");
		e4_label_2.setFont(new Font("Dialog", Font.BOLD, 14));
		e4_label_2.setBounds(55, 647, 319, 36);
		contentPane.add(e4_label_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(215, 693, 159, 40);
		contentPane.add(btnNewButton_1);
		
		JComboBox e4combo = new JComboBox();
		e4combo.setBounds(55, 693, 159, 40);
		contentPane.add(e4combo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(496, 607, 319, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_6.setBounds(496, 647, 319, 36);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setBounds(943, 607, 319, 36);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_8.setBounds(943, 647, 319, 36);
		contentPane.add(lblNewLabel_8);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(496, 693, 159, 40);
		contentPane.add(comboBox);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(656, 693, 159, 40);
		contentPane.add(btnNewButton_4);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(943, 693, 159, 40);
		contentPane.add(comboBox_3);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(1103, 693, 159, 40);
		contentPane.add(btnNewButton_5);
	}
}
