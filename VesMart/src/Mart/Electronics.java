package Mart;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

@SuppressWarnings("serial")
public class Electronics extends JFrame implements ActionListener{

	public JPanel contentPane;
	public JLabel Laptop_name,Fridge_name,earphone_name,washingmachine_name,TV_name,smartphone_name;
	public JComboBox laptop_quantity,Fridge_quantity,earphones_quantity,washing_machine_quantity,TV_quantity,smartphone_quantity;
	public JButton Laptop_cart,Fridge_cart,earphones_cart,washing_machine_cart,TV_cart,smartphone_cart;
	
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
		 
		int userId = loginves.userId;
		
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
		cart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conn c = new Conn();
				String query1 = "select Price from Cart where UserId = "+userId;	
				try {
					ResultSet rs = c.st.executeQuery(query1);
					int itemPrice;
					while(rs.next()) {
						itemPrice = rs.getInt("Price");
						loginves.OrderTotal+=itemPrice;
					}
				} catch (SQLException e1) {

					e1.printStackTrace();
				}
				
				
				
				if(loginves.OrderTotal==0) {
					JOptionPane.showMessageDialog(null,"Cart is empty ! Please add items to cart. ");
					new Home().frame.setVisible(true);	
				}else {
					new Cart().setVisible(true);
				}
				setVisible(false);				
				}

		});
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
		
		Laptop_name = new JLabel("Lenovo Ideapad Slim 3i");
		Laptop_name.setFont(new Font("Tahoma", Font.BOLD, 18));
		Laptop_name.setBounds(55, 252, 319, 36);
		contentPane.add(Laptop_name);
		

		JLabel Laptop_Price = new JLabel("Price: Rs 40,000");
		Laptop_Price.setFont(new Font("Dialog", Font.BOLD, 14));
		Laptop_Price.setBounds(55, 285, 319, 36);
		contentPane.add(Laptop_Price);
		
	    laptop_quantity = new JComboBox();
		laptop_quantity.setFont(new Font("Dialog", Font.BOLD, 14));
		laptop_quantity.setEditable(true);
		laptop_quantity.setModel(new DefaultComboBoxModel(new Integer[] {1,2,3,4,5}));
		laptop_quantity.setSelectedItem("Select Quantity");
		laptop_quantity.setBounds(55, 331, 160, 40);
		contentPane.add(laptop_quantity);
		
		Image img8=new ImageIcon(this.getClass().getResource("/Cartsmall.png")).getImage();
		
		Laptop_cart = new JButton("Add to Cart");
		Laptop_cart.setBackground(new Color(255, 140, 0));
		Laptop_cart.setIcon(new ImageIcon(img8));
		Laptop_cart.setFont(new Font("Tahoma", Font.BOLD, 14));
		Laptop_cart.addActionListener(this);
		Laptop_cart.setBounds(215, 331, 159, 40);
		contentPane.add(Laptop_cart);
		
		JLabel Fridge_img = new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/Fridge.png")).getImage();
		Fridge_img.setIcon(new ImageIcon(img2));
		Fridge_img.setBounds(577, 60, 140, 183);
		contentPane.add(Fridge_img);
		
		Fridge_name = new JLabel("Samsung 215 L Refridgerator");
		Fridge_name.setFont(new Font("Tahoma", Font.BOLD, 18));
		Fridge_name.setBounds(496, 252, 319, 36);
		contentPane.add(Fridge_name);
		
		JLabel Fridge_price = new JLabel("Price : Rs 16,626");
		Fridge_price.setFont(new Font("Dialog", Font.BOLD, 14));
		Fridge_price.setBounds(496, 287, 319, 36);
		contentPane.add(Fridge_price);
		
		Fridge_quantity = new JComboBox();
		Fridge_quantity.setFont(new Font("Dialog", Font.BOLD, 14));
		Fridge_quantity.setEditable(true);
		Fridge_quantity.setModel(new DefaultComboBoxModel(new Integer[] {1,2,3,4,5}));
		Fridge_quantity.setSelectedItem("Select Quantity");
		Fridge_quantity.setBounds(496, 331, 163, 40);
		contentPane.add(Fridge_quantity);
		
		Fridge_cart = new JButton("Add to Cart");
		Fridge_cart.setBackground(new Color(255, 140, 0));
		Fridge_cart.setIcon(new ImageIcon(img8));
		Fridge_cart.setFont(new Font("Tahoma", Font.BOLD, 14));
		Fridge_cart.addActionListener(this);
		Fridge_cart.setBounds(656, 331, 159, 40);
		contentPane.add(Fridge_cart);
		
		
		JLabel earphone_img = new JLabel("");
		earphone_img.setForeground(new Color(128, 128, 128));
		earphone_img.setBackground(new Color(128, 128, 128));
		Image img3=new ImageIcon(this.getClass().getResource("/earphones.png")).getImage();
		earphone_img.setIcon(new ImageIcon(img3));
		earphone_img.setBounds(943, 60, 319, 183);
		contentPane.add(earphone_img);
		
		earphone_name = new JLabel("Boat Bassheads Wired Earphone");
		earphone_name.setFont(new Font("Tahoma", Font.BOLD, 18));
		earphone_name.setBounds(943, 253, 319, 36);
		contentPane.add(earphone_name);
		
		JLabel earphone_price = new JLabel("Price: Rs 999");
		earphone_price.setFont(new Font("Dialog", Font.BOLD, 14));
		earphone_price.setBounds(943, 287, 319, 36);
		contentPane.add(earphone_price);
		
		earphones_quantity = new JComboBox();
		earphones_quantity.setFont(new Font("Dialog", Font.BOLD, 14));
		earphones_quantity.setEditable(true);
		earphones_quantity.setModel(new DefaultComboBoxModel(new Integer[] {1,2,3,4,5}));
		earphones_quantity.setSelectedItem("Select Quantity");
		earphones_quantity.setBounds(943, 331, 163, 40);
		contentPane.add(earphones_quantity);
		
		earphones_cart = new JButton("Add to Cart");
		earphones_cart.setBackground(new Color(255, 140, 0));
		earphones_cart.setIcon(new ImageIcon(img8));
		earphones_cart.setFont(new Font("Tahoma", Font.BOLD, 14));
		earphones_cart.setBounds(1103, 331, 159, 40);
		earphones_cart.addActionListener(this);
		contentPane.add(earphones_cart);
		
		JLabel Washing_maching_img = new JLabel("");
		Image img4=new ImageIcon(this.getClass().getResource("/Washing machine.png")).getImage();
		Washing_maching_img.setIcon(new ImageIcon(img4));
		Washing_maching_img.setBounds(141, 414, 140, 183);
		contentPane.add(Washing_maching_img);
		
		washingmachine_name = new JLabel("Godrej 5 star Washing machine");
		washingmachine_name.setFont(new Font("Tahoma", Font.BOLD, 18));
		washingmachine_name.setBounds(55, 607, 319, 36);
		contentPane.add(washingmachine_name);
		
		JLabel washingmachine_price = new JLabel("Price: Rs 16,500");
		washingmachine_price.setFont(new Font("Dialog", Font.BOLD, 14));
		washingmachine_price.setBounds(55, 647, 319, 36);
		contentPane.add(washingmachine_price);
		
		washing_machine_quantity = new JComboBox();
		washing_machine_quantity.setFont(new Font("Dialog", Font.BOLD, 14));
		washing_machine_quantity.setEditable(true);
		washing_machine_quantity.setModel(new DefaultComboBoxModel(new Integer[] {1,2,3,4,5}));
		washing_machine_quantity.setSelectedItem("Select Quantity");
		washing_machine_quantity.setBounds(55, 693, 163, 40);
		contentPane.add(washing_machine_quantity);
		
		washing_machine_cart = new JButton("Add to Cart");
		washing_machine_cart.setBackground(new Color(255, 140, 0));
		washing_machine_cart.setIcon(new ImageIcon(img8));
		washing_machine_cart.setFont(new Font("Tahoma", Font.BOLD, 14));
		washing_machine_cart.setBounds(215, 693, 159, 40);
		washing_machine_cart.addActionListener(this);
		contentPane.add(washing_machine_cart);
		
		JLabel TV_img = new JLabel("");
		Image img5=new ImageIcon(this.getClass().getResource("/TV.png")).getImage();
		TV_img.setIcon(new ImageIcon(img5));
		TV_img.setBounds(496, 414, 319, 183);
		contentPane.add(TV_img);
		
		TV_name = new JLabel("LG 32 inches HD LED Smart TV");
		TV_name.setFont(new Font("Tahoma", Font.BOLD, 18));
		TV_name.setBounds(496, 607, 319, 36);
		contentPane.add(TV_name);
		
		JLabel TV_price = new JLabel("Price: Rs 21,000");
		TV_price.setFont(new Font("Dialog", Font.BOLD, 14));
		TV_price.setBounds(496, 647, 319, 36);
		contentPane.add(TV_price);
		
		TV_quantity = new JComboBox();
		TV_quantity.setFont(new Font("Dialog", Font.BOLD, 14));
		TV_quantity.setEditable(true);
		TV_quantity.setModel(new DefaultComboBoxModel(new Integer[] {1,2,3,4,5}));
		TV_quantity.setSelectedItem("Select Quantity");
		TV_quantity.setBounds(496, 693, 163, 40);
		contentPane.add(TV_quantity);
		
		TV_cart = new JButton("Add to Cart");
		TV_cart.setBackground(new Color(255, 140, 0));
		TV_cart.setIcon(new ImageIcon(img8));
		TV_cart.setFont(new Font("Tahoma", Font.BOLD, 14));
		TV_cart.setBounds(656, 693, 159, 40);
		TV_cart.addActionListener(this);
		contentPane.add(TV_cart);
		
		JLabel smartphone_img = new JLabel("");
		Image img6=new ImageIcon(this.getClass().getResource("/smartphone.png")).getImage();
		smartphone_img.setIcon(new ImageIcon(img6));
		smartphone_img.setBounds(1030, 414, 159, 183);
		contentPane.add(smartphone_img);
		
		smartphone_name = new JLabel("Samsung J7 Pro 64 GB");
		smartphone_name.setFont(new Font("Tahoma", Font.BOLD, 18));
		smartphone_name.setBounds(943, 607, 319, 36);
		contentPane.add(smartphone_name);
		
		JLabel smartphone_price = new JLabel("Price: Rs 19,990");
		smartphone_price.setFont(new Font("Dialog", Font.BOLD, 14));
		smartphone_price.setBounds(943, 647, 319, 36);
		contentPane.add(smartphone_price);
		
		smartphone_quantity = new JComboBox();
		smartphone_quantity.setFont(new Font("Dialog", Font.BOLD, 14));
		smartphone_quantity.setEditable(true);
		smartphone_quantity.setModel(new DefaultComboBoxModel(new Integer[] {1,2,3,4,5}));
		smartphone_quantity.setSelectedItem("Select Quantity");
		smartphone_quantity.setBounds(943, 693, 163, 40);
		contentPane.add(smartphone_quantity);
		
		smartphone_cart = new JButton("Add to Cart");
		smartphone_cart.setBackground(new Color(255, 140, 0));
		smartphone_cart.setIcon(new ImageIcon(img8));
		smartphone_cart.setFont(new Font("Tahoma", Font.BOLD, 14));
		smartphone_cart.setBounds(1103, 693, 159, 40);
		smartphone_cart.addActionListener(this);
		contentPane.add(smartphone_cart);
		
		JLabel background = new JLabel("New label");
		Image img10=new ImageIcon(this.getClass().getResource("/background.png")).getImage();
		background.setIcon(new ImageIcon(img10));
		background.setBounds(0, 0, 1312, 748);
		contentPane.add(background);		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String s1,query;
		int quantity,price = 0,quant = 0;
		ResultSet rs;
		Conn c1=new Conn();
		int userId = loginves.userId;
		
		if(ae.getSource()==Laptop_cart)
		{
			s1=Laptop_name.getText();
			quantity=(int) laptop_quantity.getSelectedItem();
			query="select * from Items where Itemname='"+s1+"'";
			try {
				rs=c1.st.executeQuery(query);
				if(rs.next())
				{
					price=Integer.parseInt(rs.getString("Price"))*quantity;
					quant=rs.getInt("Quantity");
				}
				
			
				if(quant-quantity<0)
				{
					JOptionPane.showMessageDialog(null,"Out Of Stock");
				}
				else
				{
					query="insert into Cart values(?,?,?,?)";
					c1.ps=c1.con.prepareStatement(query);
					c1.ps.setInt(1,userId);
					c1.ps.setString(2,s1);
					c1.ps.setInt(3,quantity);
					c1.ps.setString(4,String.valueOf(price));
					c1.ps.executeUpdate();
					
					query="update Items set Quantity="+(quant-quantity)+" where Itemname='"+s1+"'";
					c1.st.executeUpdate(query);
					
					JOptionPane.showMessageDialog(null,"Items Added Successfully");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==Fridge_cart)
		{
			s1=Fridge_name.getText();
			quantity=(int) Fridge_quantity.getSelectedItem();
			query="select * from Items where Itemname='"+s1+"'";
			try {
				rs=c1.st.executeQuery(query);
				if(rs.next())
				{
					price=Integer.parseInt(rs.getString("Price"))*quantity;
					quant=rs.getInt("Quantity");
				}
				
				if(quant-quantity<0)
				{
					JOptionPane.showMessageDialog(null,"Out Of Stock");
				}
				else
				{
				
					query="insert into Cart values(?,?,?,?)";
					c1.ps=c1.con.prepareStatement(query);
					c1.ps.setInt(1,userId);
					c1.ps.setString(2,s1);
					c1.ps.setInt(3,quantity);
					c1.ps.setString(4,String.valueOf(price));
					c1.ps.executeUpdate();
					
					query="update Items set Quantity="+(quant-quantity)+" where Itemname='"+s1+"'";
					c1.st.executeUpdate(query);
					
					JOptionPane.showMessageDialog(null,"Items Added Successfully");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			else if(ae.getSource()==earphones_cart)
			{
				s1=earphone_name.getText();
				quantity=(int) earphones_quantity.getSelectedItem();
				query="select * from Items where Itemname='"+s1+"'";
				try {
					rs=c1.st.executeQuery(query);
					if(rs.next())
					{
						price=Integer.parseInt(rs.getString("Price"))*quantity;
						quant=rs.getInt("Quantity");
					}
					
					if(quant-quantity<0)
					{
						JOptionPane.showMessageDialog(null,"Out Of Stock");
					}
					else
					{
						
						query="insert into Cart values(?,?,?,?)";
						c1.ps=c1.con.prepareStatement(query);
						c1.ps.setInt(1,userId);
						c1.ps.setString(2,s1);
						c1.ps.setInt(3,quantity);
						c1.ps.setString(4,String.valueOf(price));
						c1.ps.executeUpdate();
						
						query="update Items set Quantity="+(quant-quantity)+" where Itemname='"+s1+"'";
						c1.st.executeUpdate(query);
						
						JOptionPane.showMessageDialog(null,"Items Added Successfully");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		else if(ae.getSource()==washing_machine_cart)
		{
			s1=washingmachine_name.getText();
			quantity=(int) washing_machine_quantity.getSelectedItem();
			query="select * from Items where Itemname='"+s1+"'";
			try {
				rs=c1.st.executeQuery(query);
				if(rs.next())
				{
					price=Integer.parseInt(rs.getString("Price"))*quantity;
					quant=rs.getInt("Quantity");
				}
				
				if(quant-quantity<0)
				{
					JOptionPane.showMessageDialog(null,"Out Of Stock");
				}
				else
				{
			
					query="insert into Cart values(?,?,?,?)";
					c1.ps=c1.con.prepareStatement(query);
					c1.ps.setInt(1,userId);
					c1.ps.setString(2,s1);
					c1.ps.setInt(3,quantity);
					c1.ps.setString(4,String.valueOf(price));
					c1.ps.executeUpdate();
					
					query="update Items set Quantity="+(quant-quantity)+" where Itemname='"+s1+"'";
					c1.st.executeUpdate(query);
					
					JOptionPane.showMessageDialog(null,"Items Added Successfully");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==TV_cart)
		{
			s1=TV_name.getText();
			quantity=(int) TV_quantity.getSelectedItem();
			query="select * from Items where Itemname='"+s1+"'";
			try {
				rs=c1.st.executeQuery(query);
				if(rs.next())
				{
					price=Integer.parseInt(rs.getString("Price"))*quantity;
					quant=rs.getInt("Quantity");
				}
				
				if(quant-quantity<0)
				{
					JOptionPane.showMessageDialog(null,"Out Of Stock");
				}
				else
				{
					
					query="insert into Cart values(?,?,?,?)";
					c1.ps=c1.con.prepareStatement(query);
					c1.ps.setInt(1,userId);
					c1.ps.setString(2,s1);
					c1.ps.setInt(3,quantity);
					c1.ps.setString(4,String.valueOf(price));
					c1.ps.executeUpdate();
					
					query="update Items set Quantity="+(quant-quantity)+" where Itemname='"+s1+"'";
					c1.st.executeUpdate(query);
					
					JOptionPane.showMessageDialog(null,"Items Added Successfully");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==smartphone_cart)
		{
			s1=smartphone_name.getText();
			quantity=(int) smartphone_quantity.getSelectedItem();
			query="select * from Items where Itemname='"+s1+"'";
			try {
				rs=c1.st.executeQuery(query);
				if(rs.next())
				{
					price=Integer.parseInt(rs.getString("Price"))*quantity;
					quant=rs.getInt("Quantity");
				}
				
				if(quant-quantity<0)
				{
					JOptionPane.showMessageDialog(null,"Out Of Stock");
				}
				else
				{
					
					query="insert into Cart values(?,?,?,?)";
					c1.ps=c1.con.prepareStatement(query);
					c1.ps.setInt(1,userId);
					c1.ps.setString(2,s1);
					c1.ps.setInt(3,quantity);
					c1.ps.setString(4,String.valueOf(price));
					c1.ps.executeUpdate();
					
					query="update Items set Quantity="+(quant-quantity)+" where Itemname='"+s1+"'";
					c1.st.executeUpdate(query);
					
					JOptionPane.showMessageDialog(null,"Items Added Successfully");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}