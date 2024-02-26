package assignment1;

public class Swapping1 {

	public static void main(String[] args) {
		int a = 20;
		int b = 80;

		// swapping
		a = a + b; // (20+80=100) a=100
		b = a - b; // (100-80=20) b=20
		a = a - b; // (100-20=80) a=80

		System.out.println("value of A = " + a);
		System.out.println("value of B = " + b);
	}

}
