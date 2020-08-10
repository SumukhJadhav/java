package subsPred;

import java.util.Scanner;

public class subscriberPrediction {

	public static void main(String[] args) {
		System.out.print("Enter Current Subscribers:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		System.out.print("Enter Average new subscribers per day: ");
		double r = scan.nextInt();
		
		double gr = (float) (r/a);

		int x = 365;
		System.out.println("Your Subscribers in an year would be around " + calculateSubs(a, gr, x));

	}
	public static int calculateSubs(int a, double gr, int x)
	{
		return (int) (a * Math.pow((1 + gr) , x));
	}
	
}
