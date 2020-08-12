package finallyTest;

public class finallyClass {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		try
		{
			System.out.println(a/b);
		} catch (Exception e){
			System.out.println(e);
			System.out.println("Exception occured");
		} finally {
			System.out.println("\n-------------------------");
			System.out.println("Executed");
			System.out.println("-------------------------");
		}
		
	}

}
