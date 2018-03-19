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
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(210, 81, 209, 14);
		frame.getContentPane().add(lblNewLabel);
		
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(210, 127, 203, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(210, 177, 203, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(210, 227, 203, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(210, 273, 203, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBounds(210, 315, 203, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBounds(210, 357, 203, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setBounds(210, 407, 203, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setBounds(10, 459, 190, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
	

		
		JButton btnSave = new JButton("Register");
		btnSave.setForeground(SystemColor.desktop);
		btnSave.setBackground(SystemColor.inactiveCaption);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=RegId.getText();
				//Remove space
				a = a.replaceAll("\\s+","");
				String b=Make.getText();
				b = b.replaceAll("\\s+","");
				String c=Model.getText();
				c = c.replaceAll("\\s+","");
				String d=colour.getText();
				d = d.replaceAll("\\s+","");
				String z=Type.getText();
				z = z.replaceAll("\\s+","");
				String f=Engine.getText();
				f = f.replaceAll("\\s+","");
				String g=Year.getText();
				g = g.replaceAll("\\s+","");
				String h=Price.getText();
				h = h.replaceAll("\\s+","");
				
				boolean flag=validate(a,b,c,d,z,f,g,h);
				
				
				
				/*
				if(a.matches("^[0-9]+$")==false) {
					lblNewLabel.setText("Please enter integer only");
					
				}
				else if (a.length() > 12 ) {
					lblNewLabel.setText("Number should be less than 12 digits");
				}
				else {
				
				*/if(flag==true) {
				
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
				
			
								
				
		
			}

			private boolean validate(String a,String b,String c,String d,String z,String f,String g,String h ) {
				// TODO Auto-generated method stub
								
				//for a reg
				if (a == null || a.equals("")) {
					lblNewLabel.setText("Should not be null");										
					return false;
				}else if(a.matches("^[0-9]+$")==false) {
					lblNewLabel.setText("Please enter integer only");
					return false;					
				}
				else if (a.length() > 12 ) {
					lblNewLabel.setText("Number should be less than 12 digits");
					return false;
				}
				
				lblNewLabel.setText("");
				
				//for b				
				if (b == null || b.equals("")) {
					lblNewLabel_1.setText("Should not be null");
										
					return false;
				}else if(b.matches("^[0-9]+$")==true) {
					lblNewLabel_1.setText("Please enter String only");
					return false;					
				}
				else if (b.length() > 12 ) {
					lblNewLabel_1.setText("Number should be less than 12 character");
					return false;
				}
				lblNewLabel_1.setText("");
				
				//for c
				if ( c == null || c.equals("")) {
					lblNewLabel_2.setText("Should not be null");
										
					return false;
				}
				else if (c.length() > 12 ) {
					lblNewLabel_2.setText("Number should be less than 12 characters");
					return false;
				}
				lblNewLabel_2.setText("");
				//for d
				if ( d == null || d.equals("")) {
					lblNewLabel_3.setText("Should not be null");
										
					return false;
				}else if(d.matches("^[0-9]+$")==true) {
					lblNewLabel_3.setText("Please enter character only");
					return false;					
				}
				else if (d.length() > 12 ) {
					lblNewLabel_3.setText("Number should be less than 12 characters");
					return false;
				}
				lblNewLabel_3.setText("");
				//for z
				if ( z == null || z.equals("")) {
					lblNewLabel_4.setText("Should not be null");
										
					return false;
				}else if(z.matches("^[0-9]+$")==true) {
					lblNewLabel_4.setText("Please enter character only");
					return false;					
				}
				else if (z.length() > 12 ) {
					lblNewLabel_4.setText("Number should be less than 12 characters");
					return false;
				}
				lblNewLabel_4.setText("");
				//for f
				if (f == null || f.equals("")) {
					lblNewLabel_5.setText("Should not be null");
										
					return false;
				}else if(f.matches("^[0-9]+$")==false) {
					lblNewLabel_5.setText("Please enter integer only");
					return false;					
				}
				else if (f.length() > 12 ) {
					lblNewLabel_5.setText("Number should be less than 12 digits");
					return false;
				}
				lblNewLabel_5.setText("");
				//for g
				if (g == null || g.equals("")) {
					lblNewLabel_6.setText("Should not be null");
										
					return false;
				}else if(g.matches("^[0-9]+$")==false) {
					lblNewLabel_6.setText("Please enter integer only");
					return false;					
				}
				else if (g.length() != 4 ) {
					lblNewLabel_6.setText("Year should 4 digits long");
					return false;
				}
				lblNewLabel_6.setText("");
				
				//for h
				if (h == null || h.equals("")) {
					lblNewLabel_7.setText("Should not be null");
										
					return false;
				}else if(h.matches("^[0-9]+$")==false) {
					lblNewLabel_7.setText("Please enter integer only");
					return false;					
				}
				else if (h.length() > 30 ) {
					lblNewLabel_7.setText("Too long");
					return false;
				}	
				lblNewLabel_7.setText("");
				
				
				
				
				
				lblNewLabel_8.setText("Record RegId: "+a+" added");
				
				return true;
				
				
				
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
			
		label.setBounds(0, 0, 484, 511);
		frame.getContentPane().add(label);
		
	

	}
}
