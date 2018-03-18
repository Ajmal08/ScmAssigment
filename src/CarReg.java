import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

public class CarReg {

	JFrame frame;

	/**
	 * Launch the application.
	 * hellow world new a
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarReg window = new CarReg();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public CarReg() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 500,550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(177, 340, 124, 23);
		frame.getContentPane().add(btnSearch);
		
		JButton btnUpdate = new JButton("Update ");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnUpdate.setBounds(177, 396, 124, 23);
		btnUpdate.addActionListener(new ActionListener() {	//when button  sort is clicked
			public void actionPerformed(ActionEvent e) {
				
				try {
					UpdateGUI frame =new UpdateGUI();
					frame.UpdateGUI();
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}});
		
		frame.getContentPane().add(btnUpdate);
		
		
		JButton btnAdd = new JButton("Add");
		
		
		
		
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					AddCar frame =new AddCar();
					AddCar.AddCar();
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}});

		btnAdd.setBounds(177, 196, 124, 23);
		frame.getContentPane().add(btnAdd);
		
		// open AddCar class
		
		
		
		
		
		
		JButton btnSort = new JButton("Sort");
		btnSort.setBounds(177, 267, 124, 23);
		

		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					SortGUI frame =new SortGUI();
					frame.SortGUI();
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}});
		
		
		frame.getContentPane().add(btnSort);
		
		JLabel lblCarRegistration = new JLabel("Car Registration");
		lblCarRegistration.setForeground(SystemColor.inactiveCaptionBorder);
		lblCarRegistration.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 25));
		lblCarRegistration.setBounds(131, 31, 274, 43);
		frame.getContentPane().add(lblCarRegistration);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(177, 459, 124, 23);
		frame.getContentPane().add(btnExit);
	
		
		
		
		
		ImageIO.read(new File("images\\logo.png"));
		
		
		BufferedImage image1 = ImageIO.read(new File("images\\logo.png"));
		ImageIcon icon1 = new ImageIcon(image1);
		JLabel label1 = new JLabel(icon1);
			
		label1.setBounds(-16, -131, 500, 550);
		frame.getContentPane().add(label1);
		
		
		
		
		
		
		
		ImageIO.read(new File("images\\pattern.jpg"));
		
	
		BufferedImage image = ImageIO.read(new File("images\\pattern.jpg"));
		ImageIcon icon = new ImageIcon(image);
		JLabel label = new JLabel(icon);
			
		label.setBounds(-16, 0, 500, 550);
		frame.getContentPane().add(label);
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					SearchCarDetails frame =new SearchCarDetails();
					frame.SearchCarDetails();
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}});
		
		
	}
}
