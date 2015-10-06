
public class Swapwithout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 200;
        int b = 400;
        System.out.println("Before swap:");
        System.out.println("a value: "+a);
        System.out.println("b value: "+b);
        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap:");
        System.out.println("b value: "+a);
        System.out.println("a value: "+b);

	}

}
