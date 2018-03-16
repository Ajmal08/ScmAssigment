import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class AddCar {

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

	/**
	 * Launch the application. dyvesh mahadeac so
	 */
	
	
	public static void main(String[] args) {
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
	 */
	public AddCar() {
		initialize();
		//dyv
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 755, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(327, 62, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(327, 106, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(327, 152, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(327, 202, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(327, 252, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		

		JLabel lblType = new JLabel("Type");
		lblType.setBounds(271, 65, 46, 14);
		frame.getContentPane().add(lblType);
		
		

		JLabel lblRegistrationId = new JLabel("Registration ID");
		lblRegistrationId.setBounds(178, 65, 101, 14);
		frame.getContentPane().add(lblRegistrationId);
		
		JLabel lblMake = new JLabel("Make ");
		lblMake.setBounds(189, 109, 46, 14);
		frame.getContentPane().add(lblMake);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(178, 155, 46, 14);
		frame.getContentPane().add(lblModel);
		
		JLabel lblColour = new JLabel("Colour ");
		lblColour.setBounds(178, 205, 46, 14);
		frame.getContentPane().add(lblColour);
		
		lblEngineCapacity = new JLabel("Engine Capacity");
		lblEngineCapacity.setBounds(167, 301, 94, 14);
		frame.getContentPane().add(lblEngineCapacity);
		
		lblYear = new JLabel("Year");
		lblYear.setBounds(167, 326, 46, 14);
		frame.getContentPane().add(lblYear);
		
		lblPrice = new JLabel("Price");
		lblPrice.setBounds(167, 351, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		textField_5 = new JTextField();
		textField_5.setBounds(327, 298, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(327, 326, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(327, 357, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblType1 = new JLabel("Type");
		lblType1.setBounds(178, 255, 46, 14);
		frame.getContentPane().add(lblType1);

		
		JButton btnSave = new JButton("Save");
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
		btnSave.setBounds(190, 423, 89, 23);
		frame.getContentPane().add(btnSave);

	}
}
