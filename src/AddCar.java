import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.Font;

public class AddCar extends JFrame{
	

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblEngineCapacity;
	private JLabel lblYear;
	private JLabel lblPrice;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JButton btnBack;

	/**
	 * Launch the application. dyvesh mahadeac so
	 */
	
	public static void AddCar() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCar window = new AddCar();
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
	public AddCar() throws IOException {
		initialize();
		//dyv
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 180, 209));
		frame.setBounds(100, 100, 500, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.info);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(210, 62, 203, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.info);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setBounds(210, 106, 203, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.info);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setBounds(210, 152, 203, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.info);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setBounds(210, 202, 203, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(SystemColor.info);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setBounds(210, 252, 203, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		

		JLabel lblRegistrationId = new JLabel("Registration ID");
		lblRegistrationId.setForeground(SystemColor.inactiveCaptionBorder);
		lblRegistrationId.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		lblRegistrationId.setBounds(44, 64, 156, 14);
		frame.getContentPane().add(lblRegistrationId);
		
		JLabel lblMake = new JLabel("Make ");
		lblMake.setForeground(SystemColor.inactiveCaptionBorder);
		lblMake.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		lblMake.setBounds(44, 109, 131, 14);
		frame.getContentPane().add(lblMake);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setForeground(SystemColor.inactiveCaptionBorder);
		lblModel.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		lblModel.setBounds(44, 155, 131, 14);
		frame.getContentPane().add(lblModel);
		
		JLabel lblColour = new JLabel("Colour ");
		lblColour.setForeground(SystemColor.inactiveCaptionBorder);
		lblColour.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		lblColour.setBounds(44, 205, 131, 14);
		frame.getContentPane().add(lblColour);
		
		lblEngineCapacity = new JLabel("Engine Capacity");
		lblEngineCapacity.setForeground(SystemColor.inactiveCaptionBorder);
		lblEngineCapacity.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		lblEngineCapacity.setBounds(44, 301, 156, 14);
		frame.getContentPane().add(lblEngineCapacity);
		
		lblYear = new JLabel("Year");
		lblYear.setForeground(SystemColor.inactiveCaptionBorder);
		lblYear.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		lblYear.setBounds(44, 343, 156, 14);
		frame.getContentPane().add(lblYear);
		
		lblPrice = new JLabel("Price");
		lblPrice.setForeground(SystemColor.inactiveCaptionBorder);
		lblPrice.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		lblPrice.setBounds(44, 389, 156, 14);
		frame.getContentPane().add(lblPrice);
		
		textField_5 = new JTextField();
		textField_5.setBackground(SystemColor.info);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_5.setBounds(210, 298, 203, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBackground(SystemColor.info);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_6.setBounds(210, 340, 203, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBackground(SystemColor.info);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_7.setBounds(210, 386, 203, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblType1 = new JLabel("Type");
		lblType1.setForeground(SystemColor.inactiveCaptionBorder);
		lblType1.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		lblType1.setBounds(44, 255, 131, 14);
		frame.getContentPane().add(lblType1);
		
	

		
		JButton btnSave = new JButton("Register");
		btnSave.setForeground(SystemColor.desktop);
		btnSave.setBackground(SystemColor.inactiveCaption);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				String b=textField_1.getText();
				String c=textField_2.getText();
				String d=textField_3.getText();
				String z=textField_4.getText();
				String f=textField_5.getText();
				String g=textField_6.getText();
				String h=textField_7.getText();
								
				try{					
					
					PrintWriter out = new PrintWriter(new FileWriter("CarDetails.txt", true));
					
					out.format("%s %s %s %s %s %s %s %s",a,b,c,d,z,f,g,h);
					
					System.out.println("Added");
					out.println();
					out.close();
					
					
					
				}
				catch(FileNotFoundException fnfe){
					System.out.println("File Not Found");
				}
				catch(SecurityException se){
					System.out.println("No Permission");
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
		 				}
				
			
			}
		});
		btnSave.setBounds(205, 444, 111, 23);
		frame.getContentPane().add(btnSave);
		
		btnBack = new JButton("Back");
		btnBack.setBackground(SystemColor.inactiveCaption);
		btnBack.setForeground(SystemColor.desktop);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			}
		});
		btnBack.setBounds(205, 478, 111, 23);
		frame.getContentPane().add(btnBack);
		
		ImageIO.read(new File("images\\pattern.jpg"));
		
		
		BufferedImage image = ImageIO.read(new File("images\\pattern.jpg"));
		ImageIcon icon = new ImageIcon(image);
		JLabel label = new JLabel(icon);
			
		label.setBounds(-16, 0, 500, 550);
		frame.getContentPane().add(label);

	}
}
