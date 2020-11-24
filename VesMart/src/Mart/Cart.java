package Mart;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cart extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cart frame = new Cart();
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
	public Cart() {
		
		
	    
	    
		int userId = loginves.userId;
		ResultSet rs;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1325, 775);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(149, 124, 1000, 507);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(table);	
		
		
		JLabel lblNewLabel = new JLabel("Order Total : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(877, 641, 106, 31);
		contentPane.add(lblNewLabel);
		
		JLabel Value = new JLabel("New label");
		Value.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Value.setBounds(974, 641, 106, 31);
		
		String total = loginves.OrderTotal+" Rs";
		Value.setText(total);
		contentPane.add(Value);
		
		JButton Buy = new JButton("Buy");
		Buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LocalDateTime myDateObj = LocalDateTime.now();
			    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

			    String Date = myDateObj.format(myFormatObj);
			    
			    System.out.println(Date);
			    
			    Random r=new Random();
				int orderId=Math.abs((r.nextInt()%90000)+10000);
				
				Conn c = new Conn();
				
				
				String query ="INSERT INTO orders (`userId`,`Item_name`,`Quantity`,`Price`) SELECT `userId`,`Itemname`,`Quantity`,`Price` FROM Cart WHERE UserId ="+loginves.userId;
				String query1 = "update orders set orderId="+orderId+" where Date_Time IS NULL"; 
				String query2 = "update orders set Date_Time='"+Date + "' where orderId = "+orderId; 
				String query3 = "delete from Cart where UserId = "+loginves.userId;
				 try {
					c.st.executeUpdate(query);
					c.st.executeUpdate(query1);	
					c.st.executeUpdate(query2);
					c.st.executeUpdate(query3);
					loginves.OrderTotal=0; 
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null,"Ordered placed successfully! Thank You for shopping with us! ");
				new Home().frame.setVisible(true);
				setVisible(false);
			}
		});
		Buy.setBackground(Color.GREEN);
		Buy.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Buy.setBounds(1081, 646, 68, 21);
		contentPane.add(Buy);
		
		JLabel background = new JLabel("New label");
		background.setForeground(Color.GREEN);
		Image img10=new ImageIcon(this.getClass().getResource("/background.png")).getImage();
		background.setIcon(new ImageIcon(img10));
		background.setBounds(0, 0, 1312, 748);
		contentPane.add(background);
		
		
		Conn c = new Conn();
		try {
				String query = "select Itemname,Quantity,Price from Cart where UserId = "+userId;
				rs=c.st.executeQuery(query);
				table.setModel(DbUtils.resultSetToTableModel(rs));
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
