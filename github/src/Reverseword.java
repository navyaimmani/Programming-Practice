
public class Reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I am Navya" ;
	    String[] str =s.split(" ");
	    StringBuffer buffer = new StringBuffer();
	    for(int i=str.length-1;i>=0;i--)
	    {
	        buffer.append(str[i]);
	        buffer.append(" ");
	    }
	    System.out.println("\nOriginal string: " + s);
	    System.out.println("Reverse word string:"+buffer.toString());
	}

}
