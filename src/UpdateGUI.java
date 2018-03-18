import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import java.awt.Font;
import java.awt.SystemColor;

public class UpdateGUI {

	public static ArrayList<Car> cars = new ArrayList<Car>();//
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	public static int counter;

	/**
	 * Launch the application.
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	
	public static void UpdateGUI() throws NumberFormatException, IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateGUI window = new UpdateGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					e.printStackTrace();
				}
			}
		});
		
		
		
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("CarDetails.txt"));

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {

				// Split the string get from the file according to the spaces
				String[] splited = sCurrentLine.split("\\s+");

				// Add new car to the ArrayList for each new iteration of the
				// while loop

				cars.add(new Car(Integer.parseInt(splited[0]), splited[1], splited[2], splited[3], splited[4],
						Integer.parseInt(splited[5]), Integer.parseInt(splited[6]), Integer.parseInt(splited[7])));

			}
			
			for(Car mycar:cars) {
				System.out.println(mycar);
				
				
			}
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 * 
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public UpdateGUI() throws NumberFormatException, IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	private void initialize() throws NumberFormatException, IOException {

		
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUpdateCarDetails = new JLabel("Update Car Details");
		lblUpdateCarDetails.setBounds(147, 11, 118, 14);
		frame.getContentPane().add(lblUpdateCarDetails);
		
		JLabel lblRegistrationId = new JLabel("Registration ID");
		lblRegistrationId.setForeground(SystemColor.text);
		lblRegistrationId.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		lblRegistrationId.setBounds(26, 150, 150, 14);
		frame.getContentPane().add(lblRegistrationId);
		
		JLabel lblMake = new JLabel("Make");
		lblMake.setForeground(SystemColor.text);
		lblMake.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		lblMake.setBounds(26, 194, 150, 14);
		frame.getContentPane().add(lblMake);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setForeground(SystemColor.text);
		lblModel.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		lblModel.setBounds(26, 219, 150, 14);
		frame.getContentPane().add(lblModel);
		
		JLabel lblColour = new JLabel("Colour");
		lblColour.setForeground(SystemColor.text);
		lblColour.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		lblColour.setBounds(26, 244, 150, 14);
		frame.getContentPane().add(lblColour);
		
		JLabel lblType = new JLabel("Type");
		lblType.setForeground(SystemColor.text);
		lblType.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		lblType.setBounds(26, 269, 150, 14);
		frame.getContentPane().add(lblType);
		
		JLabel lblEngineCapacity = new JLabel("Engine Capacity");
		lblEngineCapacity.setForeground(SystemColor.text);
		lblEngineCapacity.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		lblEngineCapacity.setBounds(26, 294, 150, 14);
		frame.getContentPane().add(lblEngineCapacity);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setForeground(SystemColor.text);
		lblYear.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		lblYear.setBounds(26, 319, 150, 14);
		frame.getContentPane().add(lblYear);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(SystemColor.text);
		lblPrice.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		lblPrice.setBounds(26, 344, 150, 14);
		frame.getContentPane().add(lblPrice);
		
		textField = new JTextField();
		textField.setBounds(206, 149, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(206, 193, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(206, 218, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(206, 243, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(206, 268, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(206, 293, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(206, 318, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(206, 343, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblEnterTheId = new JLabel("Enter the ID for Update");
		lblEnterTheId.setForeground(SystemColor.text);
		lblEnterTheId.setFont(new Font("Bodoni MT Black", Font.BOLD, 16));
		lblEnterTheId.setBounds(26, 102, 273, 20);
		frame.getContentPane().add(lblEnterTheId);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(SystemColor.inactiveCaption);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setBounds(313, 148, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(SystemColor.inactiveCaption);
		btnUpdate.setBounds(206, 417, 89, 23);
		frame.getContentPane().add(btnUpdate);
		
		JLabel labelx = new JLabel("");
		labelx.setForeground(SystemColor.inactiveCaption);
		labelx.setFont(new Font("Bodoni MT Black", Font.BOLD, 13));
		labelx.setBounds(12, 412, 150, 28);
		frame.getContentPane().add(labelx);
		
		//Search data by entering ID
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
			
		
				
				String userinput=textField.getText();
				
				
				 ArrayList<Car> searched = new ArrayList<Car>();
				
				
				
				for(int i=0;i<cars.size();i++) {
					if(cars.get(i).getRegid()==Integer.valueOf(userinput)) {
						searched.add(cars.get(i));
						counter=i;
												
					}
				}
				
				
				
				for (Car str : searched) {
		
		
					textField.setText(Integer.toString(str.getRegid())); 
					textField_1.setText(str.getMake());
					textField_2.setText(str.getModel());
					textField_3.setText(str.getColour());
					textField_4.setText(str.getType());
					textField_5.setText(Integer.toString( str.getEngineCapacity()));
					textField_6.setText(Integer.toString( str.getYear()));
					textField_7.setText(Integer.toString( str.getPrice()));
				
					
				}

		
		
			}
		});
		
		
		//Update is clicked
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//delete row
				
				String a=textField.getText();
				String b=textField_1.getText();
				String c=textField_2.getText();
				String d=textField_3.getText();
				String i=textField_4.getText();
				String f=textField_5.getText();
				String g=textField_6.getText();
				String h=textField_7.getText();
				
				labelx.setText("Update complete");
				
		
				Car x=new Car(Integer.parseInt(a), b, c, d, i,
						Integer.parseInt(f), Integer.parseInt(g), Integer.parseInt(h));
				

				cars.set(counter, x);
				
				//clear notepad
					try{					
					
						PrintWriter pw = new PrintWriter("CarDetails.txt");
						pw.close();			
									}
				
				catch(FileNotFoundException fnfe){
					System.out.println("File Not Found");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
						
				try{
					
					
					
					PrintWriter out = new PrintWriter(new FileWriter("CarDetails.txt", false));;
					for (int z=0;z<cars.size();z++) {
						
					out.format("%s %s %s %s %s %s %s %s",cars.get(z).getRegid(),cars.get(z).getMake(),cars.get(z).getModel(),cars.get(z).getColour(),cars.get(z).getType(),cars.get(z).getEngineCapacity(),cars.get(z).getYear(),cars.get(z).getPrice());
				
					out.println();
					
				}
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
		
		
ImageIO.read(new File("C:/Users/Kushal-PC/git/ScmAssigment/images/pattern.jpg"));
		
		
		BufferedImage image = ImageIO.read(new File("C:/Users/Kushal-PC/git/ScmAssigment/images/pattern.jpg"));
		ImageIcon icon = new ImageIcon(image);
		JLabel label = new JLabel(icon);
			
		label.setBounds(-16, 0, 500, 550);
		frame.getContentPane().add(label);

	
	}
}
