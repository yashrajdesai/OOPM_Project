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
import javax.swing.DefaultComboBoxModel;

@SuppressWarnings("serial")
public class Electronics extends JFrame {

	public JPanel contentPane;
 
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
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().frame.setVisible(true);
				setVisible(false);
			}
		});
		back.setBackground(new Color(0, 128, 128));
		back.setForeground(new Color(0, 0, 0));
		Image img9=new ImageIcon(this.getClass().getResource("/Back.png")).getImage();
		back.setIcon(new ImageIcon(img9));
		back.setFont(new Font("Tahoma", Font.BOLD, 20));
		back.setBounds(0, 0, 150, 50);
		contentPane.add(back);
		
		JButton cart = new JButton("Cart");
		cart.setBackground(new Color(0, 128, 128));
		Image img7=new ImageIcon(this.getClass().getResource("/Cart.png")).getImage();
		cart.setIcon(new ImageIcon(img7));
		cart.setFont(new Font("Tahoma", Font.BOLD, 20));
		cart.setBounds(1162, 0, 150, 50);
		contentPane.add(cart);
		
		
		JLabel Laptop_img = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/Laptop.png")).getImage();
		Laptop_img.setIcon(new ImageIcon(img1));
		Laptop_img.setBounds(55, 60, 319, 183);
		contentPane.add(Laptop_img);
		
		JLabel Laptop_name = new JLabel("Lenovo Ideapad Slim 3i");
		Laptop_name.setFont(new Font("Tahoma", Font.BOLD, 18));
		Laptop_name.setBounds(55, 252, 319, 36);
		contentPane.add(Laptop_name);
		

		JLabel Laptop_Price = new JLabel("Price: Rs 40,000");
		Laptop_Price.setFont(new Font("Dialog", Font.BOLD, 14));
		Laptop_Price.setBounds(55, 285, 319, 36);
		contentPane.add(Laptop_Price);
		
		JComboBox laptop_quantity = new JComboBox();
		laptop_quantity.setFont(new Font("Dialog", Font.BOLD, 14));
		laptop_quantity.setEditable(true);
		laptop_quantity.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		laptop_quantity.setSelectedItem("Select Quantity");
		laptop_quantity.setBounds(55, 331, 160, 40);
		contentPane.add(laptop_quantity);
		
		Image img8=new ImageIcon(this.getClass().getResource("/Cartsmall.png")).getImage();
		
		JButton Laptop_cart = new JButton("Add to Cart");
		Laptop_cart.setBackground(new Color(255, 140, 0));
		Laptop_cart.setIcon(new ImageIcon(img8));
		Laptop_cart.setFont(new Font("Tahoma", Font.BOLD, 14));
		Laptop_cart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Laptop_cart.setBounds(215, 331, 159, 40);
		contentPane.add(Laptop_cart);
		
		JLabel Fridge_img = new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/Fridge.png")).getImage();
		Fridge_img.setIcon(new ImageIcon(img2));
		Fridge_img.setBounds(577, 60, 140, 183);
		contentPane.add(Fridge_img);
		
		JLabel Fridge_name = new JLabel("Samsung 215 L Refridgerator");
		Fridge_name.setFont(new Font("Tahoma", Font.BOLD, 18));
		Fridge_name.setBounds(496, 252, 319, 36);
		contentPane.add(Fridge_name);
		
		JLabel Fridge_price = new JLabel("Price : Rs 16,626");
		Fridge_price.setFont(new Font("Dialog", Font.BOLD, 14));
		Fridge_price.setBounds(496, 287, 319, 36);
		contentPane.add(Fridge_price);
		
		JComboBox Fridge_quantity = new JComboBox();
		Fridge_quantity.setFont(new Font("Dialog", Font.BOLD, 14));
		Fridge_quantity.setEditable(true);
		Fridge_quantity.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		Fridge_quantity.setSelectedItem("Select Quantity");
		Fridge_quantity.setBounds(496, 331, 163, 40);
		contentPane.add(Fridge_quantity);
		
		JButton Fridge_cart = new JButton("Add to Cart");
		Fridge_cart.setBackground(new Color(255, 140, 0));
		Fridge_cart.setIcon(new ImageIcon(img8));
		Fridge_cart.setFont(new Font("Tahoma", Font.BOLD, 14));
		Fridge_cart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Fridge_cart.setBounds(656, 331, 159, 40);
		contentPane.add(Fridge_cart);
		
		
		JLabel earphone_img = new JLabel("");
		earphone_img.setForeground(new Color(128, 128, 128));
		earphone_img.setBackground(new Color(128, 128, 128));
		Image img3=new ImageIcon(this.getClass().getResource("/earphones.png")).getImage();
		earphone_img.setIcon(new ImageIcon(img3));
		earphone_img.setBounds(943, 60, 319, 183);
		contentPane.add(earphone_img);
		
		JLabel earphone_name = new JLabel("Boat Bassheads Wired Earphone");
		earphone_name.setFont(new Font("Tahoma", Font.BOLD, 18));
		earphone_name.setBounds(943, 253, 319, 36);
		contentPane.add(earphone_name);
		
		JLabel earphone_price = new JLabel("Price: Rs 999");
		earphone_price.setFont(new Font("Dialog", Font.BOLD, 14));
		earphone_price.setBounds(943, 287, 319, 36);
		contentPane.add(earphone_price);
		
		JComboBox earphones_quantity = new JComboBox();
		earphones_quantity.setFont(new Font("Dialog", Font.BOLD, 14));
		earphones_quantity.setEditable(true);
		earphones_quantity.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		earphones_quantity.setSelectedItem("Select Quantity");
		earphones_quantity.setBounds(943, 331, 163, 40);
		contentPane.add(earphones_quantity);
		
		JButton earphones_cart = new JButton("Add to Cart");
		earphones_cart.setBackground(new Color(255, 140, 0));
		earphones_cart.setIcon(new ImageIcon(img8));
		earphones_cart.setFont(new Font("Tahoma", Font.BOLD, 14));
		earphones_cart.setBounds(1103, 331, 159, 40);
		contentPane.add(earphones_cart);
		
		JLabel Washing_maching_img = new JLabel("");
		Image img4=new ImageIcon(this.getClass().getResource("/Washing machine.png")).getImage();
		Washing_maching_img.setIcon(new ImageIcon(img4));
		Washing_maching_img.setBounds(141, 414, 140, 183);
		contentPane.add(Washing_maching_img);
		
		JLabel washingmachine_name = new JLabel("Godrej 5 star Washing machine");
		washingmachine_name.setFont(new Font("Tahoma", Font.BOLD, 18));
		washingmachine_name.setBounds(55, 607, 319, 36);
		contentPane.add(washingmachine_name);
		
		JLabel washingmachine_price = new JLabel("Price: Rs 16,500");
		washingmachine_price.setFont(new Font("Dialog", Font.BOLD, 14));
		washingmachine_price.setBounds(55, 647, 319, 36);
		contentPane.add(washingmachine_price);
		
		JComboBox washing_machine_quantity = new JComboBox();
		washing_machine_quantity.setFont(new Font("Dialog", Font.BOLD, 14));
		washing_machine_quantity.setEditable(true);
		washing_machine_quantity.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		washing_machine_quantity.setSelectedItem("Select Quantity");
		washing_machine_quantity.setBounds(55, 693, 163, 40);
		contentPane.add(washing_machine_quantity);
		
		JButton washing_machine_cart = new JButton("Add to Cart");
		washing_machine_cart.setBackground(new Color(255, 140, 0));
		washing_machine_cart.setIcon(new ImageIcon(img8));
		washing_machine_cart.setFont(new Font("Tahoma", Font.BOLD, 14));
		washing_machine_cart.setBounds(215, 693, 159, 40);
		contentPane.add(washing_machine_cart);
		
		JLabel TV_img = new JLabel("");
		Image img5=new ImageIcon(this.getClass().getResource("/TV.png")).getImage();
		TV_img.setIcon(new ImageIcon(img5));
		TV_img.setBounds(496, 414, 319, 183);
		contentPane.add(TV_img);
		
		JLabel TV_name = new JLabel("LG 32 inches HD LED Smart TV");
		TV_name.setFont(new Font("Tahoma", Font.BOLD, 18));
		TV_name.setBounds(496, 607, 319, 36);
		contentPane.add(TV_name);
		
		JLabel TV_price = new JLabel("Price: Rs 21,000");
		TV_price.setFont(new Font("Dialog", Font.BOLD, 14));
		TV_price.setBounds(496, 647, 319, 36);
		contentPane.add(TV_price);
		
		JComboBox TV_quantity = new JComboBox();
		TV_quantity.setFont(new Font("Dialog", Font.BOLD, 14));
		TV_quantity.setEditable(true);
		TV_quantity.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		TV_quantity.setSelectedItem("Select Quantity");
		TV_quantity.setBounds(496, 693, 163, 40);
		contentPane.add(TV_quantity);
		
		JButton TV_cart = new JButton("Add to Cart");
		TV_cart.setBackground(new Color(255, 140, 0));
		TV_cart.setIcon(new ImageIcon(img8));
		TV_cart.setFont(new Font("Tahoma", Font.BOLD, 14));
		TV_cart.setBounds(656, 693, 159, 40);
		contentPane.add(TV_cart);
		
		JLabel smartphone_img = new JLabel("");
		Image img6=new ImageIcon(this.getClass().getResource("/smartphone.png")).getImage();
		smartphone_img.setIcon(new ImageIcon(img6));
		smartphone_img.setBounds(1030, 414, 159, 183);
		contentPane.add(smartphone_img);
		
		JLabel smartphone_name = new JLabel("Samsung J7 Pro 64 GB");
		smartphone_name.setFont(new Font("Tahoma", Font.BOLD, 18));
		smartphone_name.setBounds(943, 607, 319, 36);
		contentPane.add(smartphone_name);
		
		JLabel smartphone_price = new JLabel("Price: Rs 19,990");
		smartphone_price.setFont(new Font("Dialog", Font.BOLD, 14));
		smartphone_price.setBounds(943, 647, 319, 36);
		contentPane.add(smartphone_price);
		
		JComboBox smarphone_quantity = new JComboBox();
		smarphone_quantity.setFont(new Font("Dialog", Font.BOLD, 14));
		smarphone_quantity.setEditable(true);
		smarphone_quantity.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		smarphone_quantity.setSelectedItem("Select Quantity");
		smarphone_quantity.setBounds(943, 693, 163, 40);
		contentPane.add(smarphone_quantity);
		
		JButton smartphone_cart = new JButton("Add to Cart");
		smartphone_cart.setBackground(new Color(255, 140, 0));
		smartphone_cart.setIcon(new ImageIcon(img8));
		smartphone_cart.setFont(new Font("Tahoma", Font.BOLD, 14));
		smartphone_cart.setBounds(1103, 693, 159, 40);
		contentPane.add(smartphone_cart);
		
		JLabel background = new JLabel("New label");
		Image img10=new ImageIcon(this.getClass().getResource("/background.png")).getImage();
		background.setIcon(new ImageIcon(img10));
		background.setBounds(0, 0, 1312, 748);
		contentPane.add(background);		
	}
}
