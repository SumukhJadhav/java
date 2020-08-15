import java.util.Random;

public class Fortunes {
	
	static String[] fortunes = {"Hello moto", "Get a life", "Sup dawg", "Craxy shot", "What tell", "You tell",
			"Airtel", "Hotel", "Mocktail", "Life is a bitch", "death", "Single"};
			
	

	public static void main(String[] args) {
		
		Random rand = new Random();
		int r = rand.nextInt(fortunes.length);
		
		System.out.println(fortunes.length);
		System.out.println(fortunes[r]);

	}

}
