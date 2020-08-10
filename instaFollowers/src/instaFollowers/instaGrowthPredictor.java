package instaFollowers;

import java.util.Scanner;

public class instaGrowthPredictor {

	public static void main(String[] args) {
		System.out.print("Enter Current Followers:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		System.out.print("Enter Average new Followers per day: ");
		double r = scan.nextInt();
		
		double gr = (float) (r/a);

		int x = 365;
		System.out.println("You will have around " + calculateSubs(a, gr, x) + " by next year :)");

	}
	public static int calculateSubs(int a, double gr, int x)
	{
		return (int) (a * Math.pow((1 + gr) , x));
	}

}
