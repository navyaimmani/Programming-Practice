
public class Printspatternbelow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 for (int i=0; i<6; i++)
		  {
		     for (int j=0; j<6-i; j++)
		     {
		        System.out.print(" ");
		     


		     }
		     for (int j=0; j<i*2+1; j++)
		    {
		       System.out.print("*");
		    }
		     System.out.println("");
		  
	}
}
}

