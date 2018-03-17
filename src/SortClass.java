import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortClass {
	
	static ArrayList<Car> cars = new ArrayList<Car>();
	
public static void ReadFile() throws IOException{

	BufferedReader br;
	try {
		br = new BufferedReader(new FileReader("CarDetails.txt"));
		
		String sCurrentLine;

		while ((sCurrentLine = br.readLine()) != null) {
			
			//Split the string get from the file according to the spaces
			String[] splited = sCurrentLine.split("\\s+");
			
			//Add new car to the ArrayList for each new iteration of the while loop
			
		     cars.add(new Car(Integer.parseInt(splited[0]), splited[1], splited[2], splited[3], splited[4], Integer.parseInt(splited[5]), Integer.parseInt(splited[6]), Integer.parseInt(splited[7]))) ;    
			
			System.out.println(sCurrentLine);
		
		}   
		
		
		//Sorting list for brand
		 Collections.sort(cars, Car.BrandComparator);

		   for(Car str: cars){
				System.out.println(str);
		   }
		
		    
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	
	/*class ButtonListener implements ActionListener {
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			 if (e.getActionCommand().equals("btnBrand")) {
			      System.out.println("Button1 has been clicked");
			    }
			 
			 if (e.getActionCommand().equals("btnPrice")) {
			      System.out.println("c has been clicked");
			    }
			 
			 if (e.getActionCommand().equals("btnEngineCapacity")) {
			      System.out.println("Butccton1 has been clicked");
			    }
			 
			 if (e.getActionCommand().equals("btnYear")) {
			      System.out.println("Bucccctton1 has been clicked");
			    }
		}
	    
	}
	*/
}
}

	


