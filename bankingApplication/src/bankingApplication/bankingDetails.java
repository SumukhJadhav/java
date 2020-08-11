package bankingApplication;

import java.util.Scanner;

public class bankingDetails {

	public static void main(String[] args) {
		bankAccount obj1 = new bankAccount();
		obj1.menu();
	}

}

class bankAccount
{
	int balance = 0;
	void menu()
	{
		
		char option = '\0';
		
		System.out.println("/--------------------------/");
		System.out.println("MENU");
		System.out.println("/--------------------------/");

		
		System.out.println("A - Balance");
		System.out.println("B - Withdraw Cash");
		System.out.println("C - Deposit Cash");
		System.out.println("E - Exit");
		
		do
		{
			
		Scanner scan  = new Scanner(System.in);
		
		
		option  = scan.next().charAt(0);
		//char option = Character.toUpperCase(opt);
		
		
			switch (option)
			{
			case 'A':
				System.out.println("Your Balance is " + balance);
				break;
				
			case 'B':
				if (balance <= 0)
				{
					System.out.println("You are broke, 0 balance");
					break;
				}
				else
				{
					System.out.print("How much do you wanna withdraw:");
					int wa = scan.nextInt();
					balance -= wa;
					if(balance < wa) {
						System.out.println("Low balance!");
						break;
					}
					System.out.println(wa + " Withdrawn :)");
					System.out.println("Updated balance:" + balance);
				}
				break;
				
			case 'C':
				System.out.print("Enter the amount you want to deposit:");
				int da = scan.nextInt();
				balance =+ da;
				System.out.println(da + " Deposited!");
				break;
				
			case 'E':
				System.out.println("Thank you!");
				break;
				
			default:
				System.out.println("Invalid Option :(");
				break;
				
			}
		}while (option != 'E' );
		
		
	}
	
}
