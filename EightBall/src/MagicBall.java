import java.util.Random;
import java.util.Scanner;

public class MagicBall {

	public static void main(String[] args) {
		System.out.println("Ask me a Question :)");
		Scanner scan = new Scanner(System.in);
		scan.next();
		scan.close();
		
		Random rand = new Random();
		int r = rand.nextInt(5);
				
				if(r == 0)
				{
					System.out.println("Yeah!");
					
				}
				else if(r == 1)
				{
					System.out.println("Nah!");
				}
				else if(r == 2)
				{
					System.out.println("Maybe");
				}
				else if(r == 3)
				{
					System.out.println("Depends");
				}
				else if(r == 4)
				{
					System.out.println("IDK Sorry");
				}
		
		

	}

}
