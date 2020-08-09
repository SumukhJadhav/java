import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMProgram {
	
	static String[] words = {"Envelope", "Sumukh", "Hello", "World", "Cool", "Kid"};

	public static void main(String[] args) throws InterruptedException {
		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);
		
		Random rand = new Random();
		for(String i: words) {
		System.out.print(words[rand.nextInt(words.length)] + " ");
		}
		System.out.println();
		
		double start = LocalTime.now().toNanoOfDay();
		
		Scanner scan = new Scanner(System.in);
		String typedWords = scan.nextLine();
		
		double end = LocalTime.now().toNanoOfDay();
		
		double elapsedTime = end - start;
		double seconds = elapsedTime / 1000000000.0;
		
		int numChars = typedWords.length();
		
		int wpm = (int) ((((double) numChars / 5 ) / seconds) * 60);
		
		
		System.out.println("You can type an average of " + wpm + " words per minute.");
	}

}
