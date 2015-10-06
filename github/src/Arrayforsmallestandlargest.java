
public class Arrayforsmallestandlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int numbers[] = new int[]{12,23,34,45,56,67,78,89,90,100};
       
       
        int smallest = numbers[0];
        int largetst = numbers[0];
       
        for(int i=1; i< numbers.length; i++)
        {
                if(numbers[i] > largetst)
                        largetst = numbers[i];
                else if (numbers[i] < smallest)
                        smallest = numbers[i];
               
        }
       
        System.out.println("Largest Number is : " + largetst);
        System.out.println("Smallest Number is : " + smallest);
	}

}
