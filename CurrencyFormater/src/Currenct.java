import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Currenct {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.print("Enter Amount in Indian Rupees: ");
		Scanner scan = new Scanner(System.in);
		double payment = scan.nextDouble();
		
		
		String US = NumberFormat.getCurrencyInstance(Locale.US).format(payment / 70);
		
		//String France = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		//String UK = NumberFormat.getCurrencyInstance(Locale.UK).format(payment);
		
		System.out.print("Please wait, Getting Current rates");
		
		TimeUnit.SECONDS.sleep(1);
		System.out.print(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.print(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.print(".");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("\n \n US: " + US);
		//System.out.println("India:" + India);
		//System.out.println("France:" + France);
		//System.out.println("UK:" + UK);

	}

}
