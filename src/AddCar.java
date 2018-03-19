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
	private JTextField RegId;
	private JTextField Make;
	private JTextField Model;
	private JTextField colour;
	private JTextField Type;
	private JLabel lblEngineCapacity;
	private JLabel lblYear;
	private JLabel lblPrice;
	private JTextField Engine;
	private JTextField Year;
	private JTextField Price;
	private JButton btnBack;

	/**
	 * Launch the application. 
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
		
		//Input field for Registration id 
		RegId = new JTextField();
		RegId.setBackground(SystemColor.info);
		RegId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RegId.setBounds(210, 62, 203, 20);
		frame.getContentPane().add(RegId);
		RegId.setColumns(10);
		
		//Input field for Make
		Make = new JTextField();
		Make.setBackground(SystemColor.info);
		Make.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Make.setBounds(210, 106, 203, 20);
		frame.getContentPane().add(Make);
		Make.setColumns(10);
		
		//Input field for Model
		Model = new JTextField();
		Model.setBackground(SystemColor.info);
		Model.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Model.setBounds(210, 152, 203, 20);
		frame.getContentPane().add(Model);
		Model.setColumns(10);
		
		colour = new JTextField();
		colour.setBackground(SystemColor.info);
		colour.setFont(new Font("Tahoma", Font.PLAIN, 14));
		colour.setBounds(210, 202, 203, 20);
		frame.getContentPane().add(colour);
		colour.setColumns(10);
		
		//Input field for Type
		Type = new JTextField();
		Type.setBackground(SystemColor.info);
		Type.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Type.setBounds(210, 252, 203, 20);
		frame.getContentPane().add(Type);
		Type.setColumns(10);
		
		

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
		
		
		//Input field for Engine
		Engine = new JTextField();
		Engine.setBackground(SystemColor.info);
		Engine.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Engine.setBounds(210, 298, 203, 20);
		frame.getContentPane().add(Engine);
		Engine.setColumns(10);
		
		Year = new JTextField();
		Year.setBackground(SystemColor.info);
		Year.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Year.setBounds(210, 340, 203, 20);
		frame.getContentPane().add(Year);
		Year.setColumns(10);
		
		Price = new JTextField();
		Price.setBackground(SystemColor.info);
		Price.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Price.setBounds(210, 386, 203, 20);
		frame.getContentPane().add(Price);
		Price.setColumns(10);
		
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
				String a=RegId.getText();
				String b=Make.getText();
				String c=Model.getText();
				String d=colour.getText();
				String z=Type.getText();
				String f=Engine.getText();
				String g=Year.getText();
				String h=Price.getText();
				
				validate(a,b,c,d,z,f,g,h);
				
				
								
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

			private void validate(String a, String b, String c, String d, String z, String f, String g, String h) {
				// TODO Auto-generated method stub
				
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
