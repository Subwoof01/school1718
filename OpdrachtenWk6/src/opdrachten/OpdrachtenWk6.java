package opdrachten;

import java.util.Arrays;
import java.util.Scanner;

public class OpdrachtenWk6 {

	public static void Opdracht1and2() {
		int[] zeroStart = new int[500];
		int[] oneStart = new int[500];
		int[] maxStart = new int[500];
		
		for (int i = 0; i < 500; i++) {
			zeroStart[i] = i;
			oneStart[i] = i+1;
			maxStart[i] = 500-i;
		}
		
		System.out.println(Arrays.toString(zeroStart) + "\n" + Arrays.toString(oneStart) + "\n" + Arrays.toString(maxStart));
		
		int zeroSum = 0;
		int oneSum = 0;
		int maxSum = 0;
		
		for (int num : zeroStart) {
			zeroSum += num;
		}
		
		for (int num : oneStart) {
			oneSum += num;
		}
		
		for (int num : maxStart) {
			maxSum += num;
		}
		
		System.out.println("The sum of zeroStart is: " + zeroSum);
		System.out.println("The sum of oneStart is: " + oneSum);
		System.out.println("The sum of maxStart is: " + maxSum);
	}
	
	public static void Opdracht3and4() {
		Scanner scanner = new Scanner(System.in);
		
		char[] word = { 'q','u','a','n','t','u','m' };
		
		char input = (char) scanner.nextLine().charAt(0);
		int index = 0;
		int amount = 0;
		
		for (char c : word) {
			if (c == input) {
				amount++;
				System.out.println("The character '" + input + "' is present at position: " + (index + 1));
			}
			index++;
		}
		
		System.out.println("The character '" + input + "' is present " + amount + " times.");
	}
	
	public static void Opdracht5to9() {
		Scanner scanner = new Scanner(System.in);
		
		char[] word = { 'q','u','a','n','t','u','m' }; // Word to guess.
		char[] guessedChars = { '.', '.','.','.','.','.','.' }; // Output array.
		
		int guessed = 0;
		int errors = 0;
		boolean correct = false;
		
		while (guessed < word.length) { // While the amount of characters guessed is not equal to the length of the word, ask for a new input.
			char input = (char) scanner.nextLine().charAt(0); // Store input as char.
			int index = 0;
			
			for (char c : word) { // Iterate over 'word' and check if character is present.
				if (c == input) {
					guessedChars[index] = c;
					guessed++;
					correct = true;
				}
				index++;
			}
			if (!correct) { // If given char was incorrect, increment errors.
				errors++;
			}
			
			if (errors == 1) {
				System.out.println("|" + "\n" + "|" + "\n" + "|" + "\n" + "|" + "\n" + "|" + "\n");
			} else if (errors == 2) {
				System.out.println("|" + "\n" + "|" + "\n" + "|" + "\n" + "|" + "\n" + "|" + "\n" + "----" + "\n");
			} else if (errors == 3) {
				System.out.println("---------" + "\n" + "|" + "\n" + "|" + "\n" + "|" + "\n" + "|" + "\n" + "|" + "\n" + "----" + "\n");
			} else if (errors == 4) {
				System.out.println("---------" + "\n" + "|       |" + "\n" + "|" + "\n" + "|" + "\n" + "|" + "\n" + "|" + "\n" + "----" + "\n");
			} else if (errors == 5) {
				System.out.println("---------" + "\n" + "|       |" + "\n" + "|       o" + "\n" + "|" + "\n" + "|" + "\n" + "|" + "\n" + "----" + "\n");
			} else if (errors == 6) {
				System.out.println("---------" + "\n" + "|       |" + "\n" + "|       o" + "\n" + "|       O" + "\n" + "|" + "\n" + "|" + "\n" + "----" + "\n");
			} else if (errors == 7) {
				System.out.println("---------" + "\n" + "|       |" + "\n" + "|      \\o" + "\n" + "|       O" + "\n" + "|" + "\n" + "|" + "\n" + "----" + "\n");
			} else if (errors == 8) {
				System.out.println("---------" + "\n" + "|       |" + "\n" + "|      \\o/" + "\n" + "|       O" + "\n" + "|" + "\n" + "|" + "\n" + "----" + "\n");
			} else if (errors == 9) {
				System.out.println("---------" + "\n" + "|       |" + "\n" + "|      \\o/" + "\n" + "|       O" + "\n" + "|      /" + "\n" + "|" + "\n" + "----" + "\n");
			} else if (errors == 10) {
				System.out.println("---------" + "\n" + "|       |" + "\n" + "|      \\o/" + "\n" + "|       O" + "\n" + "|      / \\" + "\n" + "|" + "\n" + "----" + "\n");
			} else if (errors == 11) {
				System.out.println("You died...");
				scanner.close();
				System.exit(0);
			}
			System.out.println(guessedChars);
			correct = false; // Reset correct variable for next iteration.
		}
		scanner.close();
		System.out.println("You won!");
		
	}

	public static void Opdracht10() {
		int[][] tabel = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(Arrays.deepToString(tabel));
		
		for (int i = 0; i < tabel[0].length; i++) {
			for (int j = 0; j < tabel.length; j++) {
				System.out.print(tabel[j][i]);
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		//Opdracht1and2();
		//Opdracht3and4();
		Opdracht5to9();
		//Opdracht10();
	}
}
