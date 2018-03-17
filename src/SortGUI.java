import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class SortGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortGUI window = new SortGUI();
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
	public SortGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 118, 414, 116);
		frame.getContentPane().add(textPane);
		
		JTextArea txtrChooseYourCar = new JTextArea();
		txtrChooseYourCar.setText("Choose your car characteristic you want to sort out");
		txtrChooseYourCar.setBounds(10, 22, 414, 22);
		frame.getContentPane().add(txtrChooseYourCar);
		
		JButton btnBrand = new JButton("Brand");
		btnBrand.setBounds(20, 64, 61, 23);
		frame.getContentPane().add(btnBrand);
		
		JButton btnPrice = new JButton("Price");
		btnPrice.setBounds(103, 64, 55, 23);
		frame.getContentPane().add(btnPrice);
		
		JButton btnEngineCapacity = new JButton("Engine capacity");
		btnEngineCapacity.setBounds(299, 64, 113, 23);
		frame.getContentPane().add(btnEngineCapacity);
		
		JButton btnYear = new JButton("Year");
		btnYear.setBounds(200, 64, 61, 23);
		frame.getContentPane().add(btnYear);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(81, 98, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
