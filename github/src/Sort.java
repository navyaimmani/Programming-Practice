import java.util.Arrays;


public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] aryNums;
		aryNums= new int[5];
		
		
		aryNums[0] = 10;
			
        aryNums[1] = 20;
	
		aryNums[2] = 50;
				
		aryNums[3] = 30;
				
		aryNums[4] = 40;
		
		Arrays.sort(aryNums);
		int i;
		for (i=0;i<aryNums.length; i++)
		{
			System.out.println("num:"+	aryNums[i]);
		}
		}
		
		
	}


