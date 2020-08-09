package csvReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class csvRead {

	public static void main(String[] args) throws IOException {
		String path = "/C:/Users/sumuk/OneDrive/Desktop/SalesJan2009.csv";
		String line = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while((line = br.readLine()) != null)
			{
				String[] values = line.split(",");
				System.out.println("Name:" + values[4] + " \tCountry:" +values[7]);
			}
		} catch (FileNotFoundException e) {
			
			
		
			e.printStackTrace();
		}
	}

}
