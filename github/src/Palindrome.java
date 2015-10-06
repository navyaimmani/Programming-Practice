import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "dad";
	      if (palindrome (st, 0, st.length() - 1)){
	         System.out.println ("It is a palindrome :)");
	      }
	      else{
	         System.out.println ("Not a palindrome :(");
	      }
	   }

	   private static boolean palindrome (String s, int start, int end)
	   {
	      if (start >= end){
	        return (true);
	      }
	      else{
	        if (s.charAt(start) != s.charAt(end)){
	          return (false);
	        }
	        else{
	          return (palindrome (s, start + 1, end - 1));    
	}
}
	   }
}


	