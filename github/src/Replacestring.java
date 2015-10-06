import java.util.Scanner;


public class Replacestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
	    String s = sc.nextLine();
	    String originalString = s;

	    for (int i = 0; i < s.length(); i++) {
	      char c = s.charAt(i);
	      if ((c == 'A') || (c == 'a') || (c == 'B') || (c == 'b') || (c == 'C') || (c == 'c')
	          || (c == 'D') || (c == 'd') ) {
	        String front = s.substring(0, i);
	        String back = s.substring(i + 1);
	        s = front + "*" + back;
	      }
	    }
	    System.out.println(originalString);
	    System.out.println(s);
	}

}
