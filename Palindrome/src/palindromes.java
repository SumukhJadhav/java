import java.util.Scanner;

public class palindromes {

	public static void main(String[] args) {
		System.out.print("Enter a word:");
		Scanner scan = new Scanner(System.in);
		
		String og = scan.next();
		
		String dp = "";
		
		for(int i = og.length() - 1; i >= 0; i--)
		{
			dp += og.charAt(i);
		}
		
		boolean x = false;
		if(og.equals(dp))
		{
			x = true;
			System.out.println("It's a palindrome!");
		}
		else
		{
			System.out.println("Not a palindorme :(");
		}
	}
	
	

}
