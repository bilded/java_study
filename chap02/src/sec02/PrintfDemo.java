package sec02;

public class PrintfDemo {

	public static void main(String[] args) {
		int x = 5;
		double pi = 3.14;

		System.out.printf("x = %5d and pi = %5.2f\n", x, pi);
		System.out.printf("x = %-5d and pi = %-5.2f\n", x, pi);
		System.out.print("x = □□□□□ and pi = □□□□□");
	}

}
