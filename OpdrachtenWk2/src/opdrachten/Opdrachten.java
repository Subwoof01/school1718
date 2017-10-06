package opdrachten;

import java.util.Scanner;

public class Opdrachten {
	
	static Scanner userIn = new Scanner(System.in);
	
    private static void Opdracht1() {
    
    	System.out.print("Enter the first number: ");
        double num1 = userIn.nextDouble();
        System.out.print("Enter the secon number: ");
        double num2 = userIn.nextDouble();
        
        if (num1 <= num2) {
        	System.out.println("Biggest number: " + num2);
        	System.out.println("Smallest number: " + num1);
        } else if (num1 >= num2) {
        	System.out.println("Biggest number: " + num1);
        	System.out.println("Smallest number: " + num2);
        }
    }
    
    private static void Opdracht2() {
    	
    	System.out.print("Enter number: ");
    	double number = userIn.nextDouble();
    	
    	if (number == 1) {
    		System.out.println("Klaveren");
    	} else if (number == 2) {
    		System.out.println("Ruiten");
    	} else if (number == 3) {
    		System.out.println("Harten");
    	} else if (number == 4) {
    		System.out.println("Schoppen");
    	} else {
    		System.out.print("Invalid input! Please enter one of the following: 1, 2, 3 or 4.");
    		Opdracht2();
    	}
    }
    
    private static void Opdracht3() {
    	
    	System.out.println("Enter 3 numbers: ");
    	
    	double number1 = userIn.nextDouble();
    	double number2 = userIn.nextDouble();
    	double number3 = userIn.nextDouble();
    	
    	if (number3 <= number1 && number3 <= number2) {
    		System.out.println("Number three is the smallest number.");
    	} else {
    		System.out.println("Number three is not the smallest number.");
    	}
    }
    
    private static void Opdracht4() {
    	
    	System.out.print("Enter amount of working hours: ");
    	int hours = userIn.nextInt();
    	System.out.print("Enter the machines age in years: ");
    	int age = userIn.nextInt();
    	System.out.print("Enter the amount of malfunctions per year: ");
    	int malfunctions = userIn.nextInt();
    	
    	if (hours > 10000 || age >= 7 || malfunctions > 25) {
    		System.out.println("This machine should be replaced.");
    	}
    }
    
    private static void Opdracht5() {
    	
    	double salary = userIn.nextDouble();
    	
    	double newSalary = salary * 1.05;
    	double difference = newSalary - salary;
    	
    	if (difference < 75) {
    		newSalary = salary + 75;
    		System.out.println("Old salary: " + salary);
    		System.out.println("Increase: " + 75.0);
    		System.out.println("New salary: " + newSalary);
    	} else {
    		System.out.println("Old salary: " + salary);
    		System.out.println("Increase: " + difference);
    		System.out.println("New salary: " + newSalary);
    	}
    }
    
    private static void Opdracht6() {
    	
    	int contribution = 0;
    	
    	String sports = userIn.nextLine();
    	
    	if (sports.equalsIgnoreCase("V")) {
    		contribution = contribution + 175;
    	} else if (sports.equalsIgnoreCase("H")) {
    		contribution = contribution + 225;
    	} else {
    		System.out.println("Please enter a valid character (V or H).");
    		Opdracht6();
    	}
    	
    	int age = userIn.nextInt();
    	
    	if (age > 40) {
    		contribution = contribution - 25;
    	}
    	
    	int membership = userIn.nextInt();
    	
    	if (membership > 10) {
    		contribution = contribution - 20;
    	}
    	
    	System.out.println("Contribution: " + contribution);
    }
    
    public static void main(String[] args) {
        //Opdracht1();
        //Opdracht2();
    	//Opdracht3();
    	//Opdracht4();
    	//Opdracht5();
    	//Opdracht6();
    }
}
