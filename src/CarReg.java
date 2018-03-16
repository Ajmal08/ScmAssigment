import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class CarReg {

	private JFrame frame;

	/**
	 * Launch the application.
	 * hellow world new
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarReg window = new CarReg();
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
	public CarReg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 851, 561);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(346, 311, 124, 23);
		frame.getContentPane().add(btnSearch);
		
		JButton btnUpdate = new JButton("Update ");
		btnUpdate.setBounds(346, 362, 124, 23);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(346, 193, 124, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSort = new JButton("Sort");
		btnSort.setBounds(346, 256, 124, 23);
		frame.getContentPane().add(btnSort);
		
		JLabel lblCarRegistration = new JLabel("Car Registration");
		lblCarRegistration.setBounds(359, 44, 94, 14);
		frame.getContentPane().add(lblCarRegistration);
		
		
	}
}
