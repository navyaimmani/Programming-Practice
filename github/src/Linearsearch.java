import java.util.Scanner;


public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i, n, search, array[];
		 
	   
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter number of elements");
	    n = in.nextInt(); 
	    array = new int[n];
	 
	    System.out.println("Enter " + n + " integers");
	 
	    for (i = 0; i < n; i++)
	      array[i] = in.nextInt();
	 
	    System.out.println("Enter value to find");
	    search = in.nextInt();
	 
	    for (i = 0; i < n; i++)
	    {
	      if (array[i] == search)    
	      {
	         System.out.println(search + " is present at location " + (i + 1) + ".");
	          break;
	      }
	   }
	   if (i == n) 
	      System.out.println(search + " is not present in array.");
	  }
	}


