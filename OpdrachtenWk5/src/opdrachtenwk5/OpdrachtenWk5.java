package opdrachtenwk5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OpdrachtenWk5 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void Opdracht1() {
		
		String name = scanner.nextLine();
		int i = 0;
		
		while (i < 10) {
			System.out.println(name);
			i++;
		}
		
		for (int j = 0; j < 10; j++) {
			System.out.println(name);
		}
		
	}
	
	public static void Opdracht2() {
		
		String input = "";
		
		while (!input.equalsIgnoreCase("kip")) {
			input = scanner.nextLine();
		}
		
		System.out.print("zonder kop!");
	}
	
	public static void Opdracht3() {
		int age = scanner.nextInt();
		
		for (int i = 0; i < age; i++) {
			System.out.println("Hoera!");
		}
	}
	
	public static void Opdracht4() {
		int table = scanner.nextInt();
		
		for (int i = 0; i < 12; i++) {
			System.out.println(i + " * " + table + " = " + (i * table));
		}
	}
	
	public static void Opdracht5() {
		double num1 = 0;
		double num2 = 1;
		
		while (num1 != num2) {
			num2 = num1;
			num1 = scanner.nextDouble();
			
		}
		System.out.println("Yay!");
	}
	
	public static void Opdracht6() {
		double zero = 1;
		List<Double> numbers = new ArrayList<>();
		double total = 0;
		double amount = 0;
		
		while (zero != 0) {
			double num = scanner.nextDouble();
			zero = num;
			numbers.add(num);
		}
		
		for (Double number : numbers) {
			total += number;
			amount++;
		}
		
		System.out.println(total / amount);
		
	}
	
	public static void Opdracht7() {
		String input = "";
		
		while (!input.equalsIgnoreCase("z")) {
			input = scanner.nextLine();
			
			if (input.equals("z")) {
				continue;
			}
			
			for (int i = 0; i < 5; i++) {
				System.out.print(input);
			}
			System.out.println();
		}
		
		System.out.println("Done!");
	}

	public static void Opdracht8() {
		int j = 0;
		for (int i = 1; i <= 10; i++) {
			while (j <= 12) {
				System.out.println(j + " * " + i + " = " + (i*j));
				j++;
			}
			j = 0;
		}
	}

	public static void Opdracht9() {
		int number = scanner.nextInt();
		String line = "*";
		int i = 0;
		while (i < number) {
			if (i != 0) {
				line += "*";
			}
			System.out.println(line);
			i++;
		}
	}
	
	public static void Opdracht10() {
		
		int number = scanner.nextInt();
		
		int i = 0;
		
		while (i < number) {
			String line = "*";
			for (int k = 0; k < i; k++) {
				line += "*";
			}
			while (line.length() < number) {
				line += " ";
			}
				
			
			System.out.println(new StringBuilder(line).reverse().toString());
			i++;
		}
	}
	
	public static void Opdracht11() {
		int number = scanner.nextInt();
		
		boolean swap = false;
		String print = "";
		
		for(int i = 0; i <= number; i++){
			while (print.length() <= i) {
				if (!swap){
					print = print + "*";
				}
				else {
					print = print + "+";
				}
				
			}
			while (print.length() <= number) {
				print = print + " ";
			}
			
			String reverse = new StringBuffer(print).reverse().toString();	
			System.out.println(reverse);
			print = "";						
			
			if (!swap) {
				swap = true;
			} else {
				swap = false;
			}
		}
		
		for(int i = number; i >= 0; i--){
			while (print.length() <= i) {	
				if (!swap){				
					print = print + "*";
				}
				else {
					print = print + "+";
				}
			}
			while (print.length() <= number) {
				print = print + " ";
			}
			String reverse = new StringBuffer(print).reverse().toString();
			System.out.println(reverse);
			print = "";	
			
			if (!swap) {
				swap = true;
			} else {
				swap = false;
			}
		}
	}
	
	public static void main(String[] args) {
		//Opdracht1();
		//Opdracht2();
		//Opdracht3();
		//Opdracht4();
		//Opdracht5();
		//Opdracht6();
		//Opdracht7();
		//Opdracht8();
		//Opdracht9();
		//Opdracht10();
		//Opdracht11();
	
	}
}
