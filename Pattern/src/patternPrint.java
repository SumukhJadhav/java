import java.util.Scanner;
public class patternPrint {

	public static void main(String[] args) {
		System.out.print("Enter the number of stars:");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		for(int i = 1; i<=x; i++)
		{
			for (int j = 0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = x - 1; i >0; i-- )
		{
			for(int j = 0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
