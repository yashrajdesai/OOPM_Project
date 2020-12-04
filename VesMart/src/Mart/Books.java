package Mart;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class Books extends JFrame implements ActionListener{

	public JPanel contentPane;
	public JLabel book1_name,book2_name,book3_name,book4_name,book5_name,book6_name;
	public JComboBox book1_quantity,book2_quantity,book3_quantity,book4_quantity,book5_quantity,book6_quantity;
	public JButton book1_cart,book2_cart,book3_cart,book4_cart,book5_cart,book6_cart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Books frame = new Books();
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
	public Books() {
		
		int userId = loginves.userId;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1325, 775);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Back = new JButton("BACK");
		Back.setBackground(new Color(0, 128, 128));
		Back.setForeground(new Color(0, 0, 0));
		Back.setFont(new Font("Tahoma", Font.BOLD, 24));
		Back.setBounds(0, 0, 173, 45);
		Image img=new ImageIcon(this.getClass().getResource("/Back.png")).getImage();
		Back.setIcon(new ImageIcon(img));
		contentPane.add(Back);
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new Home().frame.setVisible(true);	
			setVisible(false);
			}
		});
		
		JButton Cart = new JButton("CART");
		Cart.addActionListener(new ActionListener() {
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
		Cart.setBackground(new Color(0, 128, 128));
		Cart.setForeground(new Color(0, 0, 0));
		Cart.setFont(new Font("Tahoma", Font.BOLD, 24));
		Cart.setBounds(1140, 0, 171, 45);
		img=new ImageIcon(this.getClass().getResource("/Cart.png")).getImage();
		Cart.setIcon(new ImageIcon(img));
		contentPane.add(Cart);
		
		JLabel book1_img = new JLabel("");
		book1_img.setBounds(88, 47, 180, 269);
		contentPane.add(book1_img);
		Image img1=new ImageIcon(this.getClass().getResource("/book1.jpg")).getImage();
		book1_img.setIcon(new ImageIcon(img1));
		
		book1_name = new JLabel("The Theory Of Everything");
		book1_name.setFont(new Font("Tahoma", Font.BOLD, 18));
		book1_name.setBounds(55, 313, 278, 37);
		contentPane.add(book1_name);
		
		JLabel book1_price = new JLabel("Price: Rs 169");
		book1_price.setFont(new Font("Tahoma", Font.BOLD, 15));
		book1_price.setBounds(55, 342, 128, 29);
		contentPane.add(book1_price);
		
		book1_quantity = new JComboBox();
		book1_quantity.setFont(new Font("Tahoma", Font.BOLD, 16));
		book1_quantity.setModel(new DefaultComboBoxModel(new Integer[] {1,2,3,4,5}));
		book1_quantity.setEditable(true);
		book1_quantity.setSelectedItem("Select Quantity");
		book1_quantity.setBounds(55, 372, 162, 29);
		contentPane.add(book1_quantity);
		
		book1_cart = new JButton("Add To Cart");
		book1_cart.setBackground(new Color(255, 140, 0));
		book1_cart.setFont(new Font("Tahoma", Font.BOLD, 16));
		book1_cart.setBounds(217, 368, 173, 37);
		img1=new ImageIcon(this.getClass().getResource("/Cartsmall.png")).getImage();
		book1_cart.setIcon(new ImageIcon(img1));
		contentPane.add(book1_cart);
		
		JLabel book2_img = new JLabel("");
		book2_img.setBounds(512, 47, 180, 269);
		contentPane.add(book2_img);
		Image img2=new ImageIcon(this.getClass().getResource("/book2.jpg")).getImage();
		book2_img.setIcon(new ImageIcon(img2));
		
		book2_name = new JLabel("One Arranged Murder");
		book2_name.setFont(new Font("Tahoma", Font.BOLD, 20));
		book2_name.setBounds(485, 312, 228, 37);
		contentPane.add(book2_name);
		
		JLabel book2_price = new JLabel("Price: Rs 150");
		book2_price.setFont(new Font("Tahoma", Font.BOLD, 16));
		book2_price.setBounds(485, 342, 118, 29);
		contentPane.add(book2_price);
		
		book2_quantity = new JComboBox();
		book2_quantity.setFont(new Font("Tahoma", Font.BOLD, 16));
		book2_quantity.setModel(new DefaultComboBoxModel(new Integer[] {1,2,3,4,5}));
		book2_quantity.setEditable(true);
		book2_quantity.setSelectedItem("Select Quantity");
		book2_quantity.setBounds(474, 372, 162, 29);
		contentPane.add(book2_quantity);
		
		book2_cart = new JButton("Add To Cart");
		book2_cart.setBackground(new Color(255, 140, 0));
		book2_cart.setFont(new Font("Tahoma", Font.BOLD, 16));
		book2_cart.setBounds(634, 368, 162, 37);
		img2=new ImageIcon(this.getClass().getResource("/Cartsmall.png")).getImage();
		book2_cart.setIcon(new ImageIcon(img2));
		contentPane.add(book2_cart);
		
		JLabel book3_img = new JLabel("");
		book3_img.setBounds(970, 47, 188, 269);
		contentPane.add(book3_img);
		Image img3=new ImageIcon(this.getClass().getResource("/book3.jpg")).getImage();
		book3_img.setIcon(new ImageIcon(img3));
		
		book3_name = new JLabel("Think Like A Monk");
		book3_name.setFont(new Font("Tahoma", Font.BOLD, 20));
		book3_name.setBounds(962, 312, 228, 37);
		contentPane.add(book3_name);
		
		JLabel book3_price = new JLabel("Price: Rs 325");
		book3_price.setFont(new Font("Tahoma", Font.BOLD, 16));
		book3_price.setBounds(962, 342, 128, 29);
		contentPane.add(book3_price);
		
		book3_quantity = new JComboBox();
		book3_quantity.setFont(new Font("Tahoma", Font.BOLD, 16));
		book3_quantity.setEditable(true);
		book3_quantity.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		book3_quantity.setBounds(928, 372, 162, 29);
		book3_quantity.setSelectedItem("Select Quantity");
		contentPane.add(book3_quantity);
		
		book3_cart = new JButton("Add To Cart");
		book3_cart.setBackground(new Color(255, 140, 0));
		book3_cart.setFont(new Font("Tahoma", Font.BOLD, 16));
		book3_cart.setBounds(1089, 368, 173, 37);
		img3=new ImageIcon(this.getClass().getResource("/Cartsmall.png")).getImage();
		book3_cart.setIcon(new ImageIcon(img3));
		contentPane.add(book3_cart);
		
		JLabel book4_img = new JLabel("");
		book4_img.setBounds(88, 411, 180, 230);
		contentPane.add(book4_img);
		Image img4=new ImageIcon(this.getClass().getResource("/book4.jpg")).getImage();
		book4_img.setIcon(new ImageIcon(img4));
		
		book4_name = new JLabel("The Leader Who Had No Title");
		book4_name.setFont(new Font("Tahoma", Font.BOLD, 20));
		book4_name.setBounds(55, 640, 296, 29);
		contentPane.add(book4_name);
		
		JLabel book4_price = new JLabel("Price: Rs 170");
		book4_price.setFont(new Font("Tahoma", Font.BOLD, 16));
		book4_price.setBounds(55, 664, 118, 22);
		contentPane.add(book4_price);
		
		book4_quantity = new JComboBox();
		book4_quantity.setFont(new Font("Tahoma", Font.BOLD, 16));
		book4_quantity.setModel(new DefaultComboBoxModel(new Integer[] {1,2,3,4,5}));
		book4_quantity.setEditable(true);
		book4_quantity.setSelectedItem("Select Quantity");
		book4_quantity.setBounds(55, 691, 162, 29);
		contentPane.add(book4_quantity);
		
		book4_cart = new JButton("Add To Cart");
		book4_cart.setBackground(new Color(255, 140, 0));
		book4_cart.setFont(new Font("Tahoma", Font.BOLD, 16));
		book4_cart.setBounds(217, 686, 173, 39);
		img4=new ImageIcon(this.getClass().getResource("/Cartsmall.png")).getImage();
		book4_cart.setIcon(new ImageIcon(img4));
		contentPane.add(book4_cart);
		
		JLabel book5_img = new JLabel("New label");
		book5_img.setBounds(512, 402, 171, 239);
		Image img5=new ImageIcon(this.getClass().getResource("/book5_2.jpg")).getImage();
		book5_img.setIcon(new ImageIcon(img5));
		contentPane.add(book5_img);
		
		book5_name = new JLabel("Great Stories For Children");
		book5_name.setFont(new Font("Tahoma", Font.BOLD, 20));
		book5_name.setEnabled(true);
		book5_name.setBounds(470, 640, 278, 29);
		contentPane.add(book5_name);
		
		JLabel book5_price = new JLabel("Price: Rs 123");
		book5_price.setFont(new Font("Tahoma", Font.BOLD, 16));
		book5_price.setBounds(470, 664, 118, 22);
		contentPane.add(book5_price);
		
		book5_quantity = new JComboBox();
		book5_quantity.setModel(new DefaultComboBoxModel(new Integer[] {1,2,3,4,5}));
		book5_quantity.setFont(new Font("Tahoma", Font.BOLD, 16));
		book5_quantity.setEditable(true);
		book5_quantity.setSelectedItem("Select Quantity");
		book5_quantity.setBounds(474, 691, 162, 27);
		contentPane.add(book5_quantity);
		
		book5_cart = new JButton("Add To Cart");
		book5_cart.setBackground(new Color(255, 140, 0));
		book5_cart.setFont(new Font("Tahoma", Font.BOLD, 16));
		book5_cart.setBounds(634, 688, 162, 34);
		img5=new ImageIcon(this.getClass().getResource("/Cartsmall.png")).getImage();
		book5_cart.setIcon(new ImageIcon(img5));
		contentPane.add(book5_cart);
		
		JLabel book6_img = new JLabel("");
		book6_img.setBounds(970, 411, 188, 230);
		Image img6=new ImageIcon(this.getClass().getResource("/book6_2.jpg")).getImage();
		book6_img.setIcon(new ImageIcon(img6));
		contentPane.add(book6_img);
		
		book6_name = new JLabel("The Complete Novels Of Sherlock Holmes");
		book6_name.setFont(new Font("Tahoma", Font.BOLD, 20));
		book6_name.setBounds(881, 640, 420, 29);
		contentPane.add(book6_name);
		
		JLabel book6_price = new JLabel("Price: Rs 132");
		book6_price.setFont(new Font("Tahoma", Font.BOLD, 16));
		book6_price.setBounds(928, 664, 118, 22);
		contentPane.add(book6_price);
		
		book6_quantity = new JComboBox();
		book6_quantity.setModel(new DefaultComboBoxModel(new Integer[] {1,2,3,4,5}));
		book6_quantity.setFont(new Font("Tahoma", Font.BOLD, 16));
		book6_quantity.setEditable(true);
		book6_quantity.setSelectedItem("Select Quantity");
		book6_quantity.setBounds(928, 691, 162, 27);
		contentPane.add(book6_quantity);
		
		book6_cart = new JButton("Add To Cart");
		book6_cart.setFont(new Font("Tahoma", Font.BOLD, 16));
		book6_cart.setBackground(new Color(255, 140, 0));
		book6_cart.setBounds(1089, 688, 173, 34);
		img6=new ImageIcon(this.getClass().getResource("/Cartsmall.png")).getImage();
		book6_cart.setIcon(new ImageIcon(img6));
		contentPane.add(book6_cart);
		
		JLabel background = new JLabel("");
		background.setBounds(0, 0, 1311, 749);
		Image imgb=new ImageIcon(this.getClass().getResource("/background.png")).getImage();
		background.setIcon(new ImageIcon(imgb));
		contentPane.add(background);
		
		book1_cart.addActionListener(this);
		book2_cart.addActionListener(this);
		book3_cart.addActionListener(this);
		book4_cart.addActionListener(this);
		book5_cart.addActionListener(this);
		book6_cart.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String s1,query;
		int quantity,price = 0,quant = 0;
		ResultSet rs;
		Conn c1=new Conn();
		int userId = loginves.userId;
		
		if(ae.getSource()==book1_cart)
		{
			s1=book1_name.getText();
			quantity=(int) book1_quantity.getSelectedItem();
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
		else if(ae.getSource()==book2_cart)
		{
			s1=book2_name.getText();
			quantity=(int) book2_quantity.getSelectedItem();
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
			else if(ae.getSource()==book3_cart)
			{
				s1=book3_name.getText();
				quantity=(int) book3_quantity.getSelectedItem();
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
		else if(ae.getSource()==book4_cart)
		{
			s1=book4_name.getText();
			quantity=(int) book4_quantity.getSelectedItem();
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
		else if(ae.getSource()==book5_cart)
		{
			s1=book5_name.getText();
			quantity=(int) book5_quantity.getSelectedItem();
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
		else if(ae.getSource()==book6_cart)
		{
			s1=book6_name.getText();
			quantity=(int) book6_quantity.getSelectedItem();
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
