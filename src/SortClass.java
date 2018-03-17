import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SortClass {
	

public static void ReadFile() throws IOException{

	BufferedReader br;
	try {
		br = new BufferedReader(new FileReader("CarDetails.txt"));
		
		String sCurrentLine;

		while ((sCurrentLine = br.readLine()) != null) {
			System.out.println(sCurrentLine);
		
		}
		    
		    
		    
		    
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	    
	}
}

	


