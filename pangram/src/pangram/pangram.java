package pangram;

import java.util.Scanner;

public class pangram {

	public static void main(String[] args) {
	System.out.print("Type a sentence: ");
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		
		//String S = "The quick brown fox jumps over the lazy dog";
		
		boolean[] mark = new boolean[26];
		boolean pangram = true;
		int index = 0;
		
		//System.out.println(S.length());
		
		for(int i=0; i< S.length() ; i++)
		{
			char cur = S.charAt(i);
			
			if(cur >= 'A' && cur<= 'Z')
			{
				index = cur - 'A';
			}else if(cur >= 'A' && cur<= 'Z')
			{
				index = cur - 'a';
			}
			mark[index] = true;
		}
		for(int i = 0; i<mark.length; i++)
		{
			if (mark[i] == false)
					{
				pangram = false;
			}
		}
		if(pangram)
		{
			System.out.println("It's a pangram");
		}else
		{
			System.out.println("Not a pangram :(");
		}
	}

}
