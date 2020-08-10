package factRecu;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		
		int x;
		System.out.print("Enter the Number:");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		System.out.print("The factorial of " + x + " is ");
		System.out.println(fact(x));
	

	}
	public static int fact(int n)
	{
		if (n == 0)
		{
			return 1;
		}
		else
		{
			return n * fact(n-1);
		}
	}
}
