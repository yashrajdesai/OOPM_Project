package Mart;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Home {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1325, 775);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Home");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mntmNewMenuItem);
		
		
		JLabel electronics = new JLabel(""); 
		Image elec=new ImageIcon(this.getClass().getResource("/electronics.png")).getImage();
		electronics.setIcon(new ImageIcon(elec));
		electronics.setBounds(206, 150, 177, 161);
		frame.getContentPane().add(electronics);
		
		JLabel mClothing = new JLabel("");
		Image mCloth=new ImageIcon(this.getClass().getResource("/mens_clothing.png")).getImage();
		mClothing.setIcon(new ImageIcon(mCloth));
		mClothing.setBounds(576, 150, 177, 161);
		frame.getContentPane().add(mClothing); 
		
		
		JLabel wClothing = new JLabel(""); 
		Image wCloth=new ImageIcon(this.getClass().getResource("/womens_clothing.png")).getImage();
		wClothing.setIcon(new ImageIcon(wCloth));
		wClothing.setBounds(960, 150, 177, 161);
		frame.getContentPane().add(wClothing);
		
		JLabel GroceryImg = new JLabel("");
		Image grocery=new ImageIcon(this.getClass().getResource("/grocery.png")).getImage();
		GroceryImg.setIcon(new ImageIcon(grocery));
		GroceryImg.setBounds(406, 383, 177, 161);
		frame.getContentPane().add(GroceryImg);
	
		JLabel BooksImg = new JLabel("Books");
		Image books=new ImageIcon(this.getClass().getResource("/books.png")).getImage();
		BooksImg.setIcon(new ImageIcon(books));
		BooksImg.setBounds(793, 398, 177, 146);
		frame.getContentPane().add(BooksImg);
		
		
		JLabel Electronics = new JLabel("Electronics");
		Electronics.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Electronics.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				System.out.println("I am clicked");
				frame.setVisible(false);
				new Electronics().setVisible(true);
			}
		});
		Electronics.setFont(new Font("Tahoma", Font.BOLD, 26));
		Electronics.setBackground(Color.BLACK);
		Electronics.setForeground(Color.BLACK);
		Electronics.setBounds(227, 321, 167, 39);
		frame.getContentPane().add(Electronics);
		
			
		JLabel Mens = new JLabel("Men's Clothing");
		Mens.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Mens.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				System.out.println("I got clicked!");
			}
		});
		Mens.setFont(new Font("Tahoma", Font.BOLD, 26));
		Mens.setBounds(574, 321, 210, 39);
		frame.getContentPane().add(Mens);
		
		
		
		JLabel Womens = new JLabel("Women's Clothing");
		Womens.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Womens.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("I got clicked!");
			}
		});
		Womens.setFont(new Font("Tahoma", Font.BOLD, 26));
		Womens.setBounds(946, 321, 241, 39);
		frame.getContentPane().add(Womens);
		
		
		JLabel Grocery = new JLabel("Grocery");
		Grocery.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Grocery.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("I got clicked!");
				
			}
		});
		Grocery.setFont(new Font("Tahoma", Font.BOLD, 26));
		Grocery.setBounds(442, 563, 111, 39);
		frame.getContentPane().add(Grocery);
		
		JLabel Books = new JLabel("Books");
		Books.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Books.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("I got clicked!");
			}
		});
		Books.setFont(new Font("Tahoma", Font.BOLD, 26));
		Books.setBounds(848, 563, 91, 39);
		frame.getContentPane().add(Books);

		JLabel background = new JLabel("");
		Image img4=new ImageIcon(this.getClass().getResource("/background.png")).getImage();
		background.setIcon(new ImageIcon(img4));
		background.setBounds(0, 0, 1311, 738);
		frame.getContentPane().add(background);
				
		 
	}
}
