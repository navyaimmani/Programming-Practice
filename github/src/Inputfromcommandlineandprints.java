import java.util.Scanner;


public class Inputfromcommandlineandprints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    Scanner scanner = new Scanner(System.in);

	   
	    System.out.print("Enter your name: ");

	    
	    String username = scanner.next();

	   
	    System.out.print("Enter your age: ");

	    
	    int age = scanner.nextInt();

	    System.out.println(String.format("%s, your age is %d", username, age));

	}

}
