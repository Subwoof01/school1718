package opdrachten;

import java.util.Scanner;

public class OneToFour {

	public static void opdracht1() {
		System.out.println("Hey, I'm a method!");
	}
	
	public static void opdracht2(String message) {
		System.out.println("This is your message: " + message);
	}
	
	public static void opdracht3(double num1, double num2) {
		double ans = num1 + num2;
		System.out.println(ans);
	}
	
	public static boolean opdracht4(double number) {
		return number>10;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//opdracht1();
		//opdracht2(input.next());
		//opdracht3(input.nextDouble(), input.nextDouble());
		System.out.println(opdracht4(input.nextDouble()));
		input.close();
	}
}
