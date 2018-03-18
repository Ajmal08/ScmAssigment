import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
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
		frame.setBounds(100, 100, 500, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnBrand = new JButton("Brand");
		btnBrand.setBackground(SystemColor.inactiveCaption);
		btnBrand.setBounds(10, 76, 73, 23);
		frame.getContentPane().add(btnBrand);

		JList<String> list = new JList<String>();
		list.setBackground(SystemColor.info);
		list.setBounds(10, 110, 464, 301);
		frame.getContentPane().add(list);

		JButton btnPrice = new JButton("Price");
		btnPrice.setBackground(SystemColor.inactiveCaption);
		btnPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Sorting list for price
				Collections.sort(cars, Car.PriceComparator);
				String x = "";
				ArrayList<String> myarray = new ArrayList<>();

				//storing price details from car object into a string call x
				for (Car str : cars) {
					x = "Model:- "+str.getModel() + "-- Make:- " + str.getMake() + "-- Engine:- " + str.getEngineCapacity() + "-- Price:- " + str.getPrice()
					+ "-- ID:- " + str.getRegid();
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

		btnPrice.setBounds(126, 76, 79, 23);
		frame.getContentPane().add(btnPrice);

		JButton btnEngineCapacity = new JButton("Engine capacity");
		btnEngineCapacity.setBackground(SystemColor.inactiveCaption);
		btnEngineCapacity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Sorting list for Engine Capacity
				Collections.sort(cars, Car.EngineComparator);
				String x = "";
				ArrayList<String> myarray = new ArrayList<>();

				for (Car str : cars) {
					x = "Model:- "+str.getModel() + "-- Make:- " + str.getMake() + "-- Engine:- " + str.getEngineCapacity() + "-- Price:- " + str.getPrice()
					+ "-- ID:- " + str.getRegid();
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

		btnEngineCapacity.setBounds(361, 76, 113, 23);
		frame.getContentPane().add(btnEngineCapacity);

		JButton btnYear = new JButton("Year");
		btnYear.setBackground(SystemColor.inactiveCaption);
		btnYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Sorting list for year
				Collections.sort(cars, Car.YearComparator);
				String x = "";
				ArrayList<String> myarray = new ArrayList<>();

				for (Car str : cars) {
					x = "Model:- "+str.getModel() + "-- Make:- " + str.getMake() + "-- Engine:- " + str.getEngineCapacity() + "-- Price:- " + str.getPrice()
							+ "-- ID:- " + str.getRegid();
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

		btnYear.setBounds(258, 76, 73, 23);
		frame.getContentPane().add(btnYear);

		JLabel lblNewLabel = new JLabel("Sort Car");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 25));
		lblNewLabel.setBounds(183, 23, 156, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(SystemColor.inactiveCaption);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnBack.setBounds(210, 454, 89, 23);
		frame.getContentPane().add(btnBack);

		btnBrand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Sorting list for brand
				Collections.sort(cars, Car.BrandComparator);
				String x = "";
				ArrayList<String> myarray = new ArrayList<>();

				for (Car str : cars) {
					x = "Model:- "+str.getModel() + "-- Make:- " + str.getMake() + "-- Engine:- " + str.getEngineCapacity() + "-- Price:- " + str.getPrice()
					+ "-- ID:- " + str.getRegid();
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
