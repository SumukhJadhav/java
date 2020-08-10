import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileReader3000 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("/C:/Users/sumuk/OneDrive/Desktop/Lets.txt");
		Scanner scan = new Scanner(file);
		
		
		String fileContent = "";
		while(scan.hasNextLine()) {
		System.out.println(scan.nextLine());
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}
		
		
		FileWriter writer = new FileWriter("/C:/Users/sumuk/OneDrive/Desktop/Go.txt");
		writer.write(fileContent);
		writer.close();
	}

}
