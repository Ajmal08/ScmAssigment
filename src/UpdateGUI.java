import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

import javax.swing.DefaultListModel;
import javax.swing.JList;

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

	/**
	 * Launch the application.
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateGUI window = new UpdateGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
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

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	/**
	 * Create the application.
	 */
	public UpdateGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUpdateCarDetails = new JLabel("Update Car Details");
		lblUpdateCarDetails.setBounds(147, 11, 118, 14);
		frame.getContentPane().add(lblUpdateCarDetails);
		
		JLabel lblRegistrationId = new JLabel("Registration ID");
		lblRegistrationId.setBounds(10, 150, 89, 14);
		frame.getContentPane().add(lblRegistrationId);
		
		JLabel lblMake = new JLabel("Make");
		lblMake.setBounds(10, 194, 46, 14);
		frame.getContentPane().add(lblMake);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(10, 219, 46, 14);
		frame.getContentPane().add(lblModel);
		
		JLabel lblColour = new JLabel("Colour");
		lblColour.setBounds(10, 244, 46, 14);
		frame.getContentPane().add(lblColour);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(10, 269, 46, 14);
		frame.getContentPane().add(lblType);
		
		JLabel lblEngineCapacity = new JLabel("Engine Capacity");
		lblEngineCapacity.setBounds(10, 294, 120, 14);
		frame.getContentPane().add(lblEngineCapacity);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(10, 319, 46, 14);
		frame.getContentPane().add(lblYear);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(10, 344, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		textField = new JTextField();
		textField.setBounds(140, 147, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 191, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(140, 216, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(140, 241, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(140, 266, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(140, 291, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(140, 316, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(140, 341, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblEnterTheId = new JLabel("Enter the ID for Update");
		lblEnterTheId.setBounds(10, 125, 135, 14);
		frame.getContentPane().add(lblEnterTheId);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setBounds(236, 146, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		//Search data by entering ID
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
		
				
				String userinput=textField.getText();
				
				
				 ArrayList<Car> searched = new ArrayList<Car>();
				
				 String x = "";
				
				for(Car mycar:cars) {
					if(mycar.getRegid()==Integer.valueOf(userinput)) {
						searched.add(mycar);
												
					}
				}
				
				ArrayList<String> myarray = new ArrayList<>();
				
				for (Car str : searched) {
		
		
					textField.setText(Integer.toString(str.getRegid())); 
					textField_1.setText(str.getMake());
					textField_2.setText(str.getModel());
					textField_3.setText(str.getColour());
					textField_4.setText(str.getType());
					textField_5.setText(Integer.toString( str.getEngineCapacity()));
					textField_6.setText(Integer.toString( str.getYear()));
					textField_7.setText(Integer.toString( str.getPrice()));
				
					myarray.add(x);
				}

		
		
			}
		});
		
		
		//Update is clicked
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete row
				
				String userinput=textField.getText();
				
				
				 ArrayList<Car> searched = new ArrayList<Car>();
				
				 String x = "";
				
				for(Car mycar:cars) {
					if(mycar.getRegid()==Integer.valueOf(userinput)) {
						searched.add(mycar);
						//searched.remove(mycar.getRegid());
												
					}
				}
				
				ArrayList<String> myarray = new ArrayList<>();
				
				for (Car str : searched) {
		
		
					textField.setText(Integer.toString(str.getRegid())); 
					textField_1.setText(str.getMake());
					textField_2.setText(str.getModel());
					textField_3.setText(str.getColour());
					textField_4.setText(str.getType());
					textField_5.setText(Integer.toString( str.getEngineCapacity()));
					textField_6.setText(Integer.toString( str.getYear()));
					textField_7.setText(Integer.toString( str.getPrice()));
				
					myarray.add(x);
				}
				
				
				
				
				
				//
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
					
					System.out.println("Updated");
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
		btnUpdate.setBounds(186, 367, 89, 23);
		frame.getContentPane().add(btnUpdate);
		
	}
}
