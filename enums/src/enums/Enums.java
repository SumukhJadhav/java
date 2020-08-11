package enums;

import enums.Levels;

enum Levels{
	EASY, MEDIUM , DIFFICULT;
}
public class Enums {

	public static void main(String[] args) {
		Levels l = Levels.EASY;
		switch(l)
		{
		case EASY:
			System.out.println("EAZY PEEZY");
			break;
			
		case MEDIUM:
			System.out.println("Medium level");
			break;
		
		case DIFFICULT:
			System.out.println("TOUGH!!!");
			break;
		}

	}

}
