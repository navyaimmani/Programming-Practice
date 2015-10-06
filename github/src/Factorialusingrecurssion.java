import java.util.Scanner;


public class Factorialusingrecurssion {

	private static int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		 int num = scanner.nextInt();
	      System.out.println("Enter the number:");
		int factorial = fact(num);
	      System.out.println("Factorial of entered number is: "+factorial);
	   }
	   static int fact(int n)
	   {
	       int output;
	       if(n==1){
	         return 1;
	       }
	       
	       output = fact(n-1)* n;
	       return output;
	   }
	}
	}

}
