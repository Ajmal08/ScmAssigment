import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Font;
import java.awt.SystemColor;

public class SortGUI {

	private JFrame frame;
	public static ArrayList<Car> cars = new ArrayList<Car>();

	/**
	 * Launch the application.
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */

	public static void SortGUI() throws NumberFormatException, IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortGUI window = new SortGUI();
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
			
			
			for(Car x: cars){
				
				System.out.println(x);
			}

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
	public SortGUI() throws NumberFormatException, IOException {
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
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 451, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnBrand = new JButton("Brand");
		btnBrand.setBackground(SystemColor.textHighlight);
		btnBrand.setBounds(20, 64, 73, 23);
		frame.getContentPane().add(btnBrand);

		JList<String> list = new JList<String>();
		list.setBounds(20, 110, 392, 301);
		frame.getContentPane().add(list);

		JButton btnPrice = new JButton("Price");
		btnPrice.setBackground(SystemColor.textHighlight);
		btnPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Sorting list for price
				Collections.sort(cars, Car.PriceComparator);
				String x = "";
				ArrayList<String> myarray = new ArrayList<>();

				//storing price details from car object into a string call x
				for (Car str : cars) {
					x = str.getModel() + " " + str.getMake() + " " + str.getEngineCapacity() + " " + str.getPrice()
							+ " " + str.getRegid();
					//add string x to myarray
					myarray.add(x);
				}
				
				//Creating a new array of String to populate the JList
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

		btnPrice.setBounds(103, 64, 79, 23);
		frame.getContentPane().add(btnPrice);

		JButton btnEngineCapacity = new JButton("Engine capacity");
		btnEngineCapacity.setBackground(SystemColor.textHighlight);
		btnEngineCapacity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Sorting list for Engine Capacity
				Collections.sort(cars, Car.EngineComparator);
				String x = "";
				ArrayList<String> myarray = new ArrayList<>();

				for (Car str : cars) {
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

		btnEngineCapacity.setBounds(299, 64, 113, 23);
		frame.getContentPane().add(btnEngineCapacity);

		JButton btnYear = new JButton("Year");
		btnYear.setBackground(SystemColor.textHighlight);
		btnYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Sorting list for year
				Collections.sort(cars, Car.YearComparator);
				String x = "";
				ArrayList<String> myarray = new ArrayList<>();

				for (Car str : cars) {
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

		btnYear.setBounds(205, 64, 73, 23);
		frame.getContentPane().add(btnYear);

		JLabel lblNewLabel = new JLabel("Choose your car characteristic you want to sort out");
		lblNewLabel.setFont(new Font("Rockwell Nova", Font.PLAIN, 15));
		lblNewLabel.setBounds(20, 29, 381, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnBack.setBounds(163, 427, 89, 23);
		frame.getContentPane().add(btnBack);

		btnBrand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Sorting list for brand
				Collections.sort(cars, Car.BrandComparator);
				String x = "";
				ArrayList<String> myarray = new ArrayList<>();

				for (Car str : cars) {
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
