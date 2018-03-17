import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class SearchCarDetails  {

	private JPanel contentPane;

	
	private JFrame frame;
	public static ArrayList<Car> cars = new ArrayList<Car>();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void SearchCarDetails() {
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
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 592, 475);
		contentPane = new JPanel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSearchForCar = new JLabel("Search For Car Details");
		lblSearchForCar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSearchForCar.setBounds(132, 28, 262, 50);
		frame.getContentPane().add(lblSearchForCar);
		
		JLabel lblInsertCarModel = new JLabel("Search By Year:");
		lblInsertCarModel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInsertCarModel.setBounds(45, 102, 114, 16);
		frame.getContentPane().add(lblInsertCarModel);
		
		textField = new JTextField();
		textField.setBounds(203, 100, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(379, 99, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(45, 201, 424, 153);
		frame.getContentPane().add(list);
		
		JLabel lblNewLabel = new JLabel("Search By Model:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(45, 153, 114, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(203, 151, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(379, 150, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		//search by year
		
		 btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				String userinput=textField.getText();
				
				
				 ArrayList<Car> searched = new ArrayList<Car>();
				
				 String x = "";
				
				for(Car mycar:cars) {
					if(mycar.getYear()==Integer.valueOf(userinput)) {
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
		 
		 
	}
}
