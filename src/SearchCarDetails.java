import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class SearchCarDetails  {

	private JPanel contentPane;

	
	private JFrame frame;
	//arraylist containing car objects
	public static ArrayList<Car> cars = new ArrayList<Car>();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void SearchCarDetails() throws NumberFormatException, IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchCarDetails window = new SearchCarDetails();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					e.printStackTrace();
				}
			}
		});
		
		
		//read from file populate arraylist
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

	public SearchCarDetails()  throws NumberFormatException, IOException {
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
		contentPane = new JPanel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSearchForCar = new JLabel("Search For Car Details");
		lblSearchForCar.setForeground(SystemColor.text);
		lblSearchForCar.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 25));
		lblSearchForCar.setBounds(93, 28, 330, 50);
		frame.getContentPane().add(lblSearchForCar);
		
		JLabel lblInsertCarModel = new JLabel("Search By Year:");
		lblInsertCarModel.setForeground(SystemColor.text);
		lblInsertCarModel.setFont(new Font("Bodoni MT Black", Font.PLAIN, 16));
		lblInsertCarModel.setBounds(45, 102, 158, 16);
		frame.getContentPane().add(lblInsertCarModel);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.info);
		textField.setBounds(203, 100, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setBounds(351, 100, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JList list = new JList();
		list.setBackground(SystemColor.info);
		list.setBounds(10, 201, 464, 211);
		frame.getContentPane().add(list);
		
		JLabel lblNewLabel = new JLabel("Search By Model:");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Bodoni MT Black", Font.PLAIN, 16));
		lblNewLabel.setBounds(29, 152, 158, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.info);
		textField_1.setBounds(203, 151, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setBackground(SystemColor.inactiveCaption);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(351, 151, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(SystemColor.inactiveCaption);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnBack.setBounds(210, 449, 89, 23);
		frame.getContentPane().add(btnBack);
		
		
		
		//search by car details by year
		
		 btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				String userinput=textField.getText();
				
				
				 ArrayList<Car> searched = new ArrayList<Car>();
				
				 String x = "";
				 
				 //search for car details from arraylist
				
				for(Car mycar:cars) {
					if(mycar.getYear()==Integer.valueOf(userinput)) {
						searched.add(mycar);
												
					}
				}
				
				ArrayList<String> myarray = new ArrayList<>();
				
				//string of car details 
				
				for (Car str : searched) {
					x = "Model:- "+str.getModel() + "-- Make:- " + str.getMake() + "-- Engine:- " + str.getEngineCapacity() + "-- Price:- " + str.getPrice()
					+ "-- ID:- " + str.getRegid() + "-- Year:- " +str.getYear() ;
					myarray.add(x);
				}

				String[] thearray = new String[myarray.size()];
				for (int i = 0; i < thearray.length; i++) {
					thearray[i] = myarray.get(i);
				}
				
				//convert into defaultlistmodel to populate jlist

				DefaultListModel<String> test = new DefaultListModel<String>();

				for (int i = 0; i < thearray.length; ++i) {
					test.addElement(thearray[i]);
				}
				//assign jlist

				list.setModel(test);
						
		
		
			}
		});
		 
		 
		 //search by model
		 
		 btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {				
					
					String userinput=textField_1.getText();
					
					
					 ArrayList<Car> searched = new ArrayList<Car>();
					
					 String x = "";
					
					for(Car mycar:cars) {
						String thevalue=mycar.getModel();
						if(thevalue.equals(userinput)) {
							System.out.println();
							searched.add(mycar);
													
						}
					}
					
					ArrayList<String> myarray = new ArrayList<>();
					
					for (Car str : searched) {
						x = str.getModel() + " " + str.getMake() + " " + str.getEngineCapacity() + " " + str.getPrice()
								+ " " + str.getRegid();
						myarray.add(x);
					}

					String[] thearray = new String[myarray.size()];
					for (int i = 0; i < thearray.length; i++) {
						thearray[i] = myarray.get(i);
					}

					DefaultListModel<String> test = new DefaultListModel<String>();

					for (int i = 0; i < thearray.length; ++i) {
						test.addElement(thearray[i]);
					}

					list.setModel(test);
							
			
			
				}
			});
		 
		 ImageIO.read(new File("images\\pattern.jpg"));
			
			
			BufferedImage image = ImageIO.read(new File("images\\pattern.jpg"));
			ImageIcon icon = new ImageIcon(image);
			JLabel label = new JLabel(icon);
				
			label.setBounds(-16, 0, 500, 550);
			frame.getContentPane().add(label);
		 
		 
	}
}
