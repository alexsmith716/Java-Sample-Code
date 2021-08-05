import java.util.Scanner;

// Create a method that uses a Scanner to parse any input from the console (System.in) and prints out the number of vowels in the line.

public class Exercise1 {

	public static void main(String[] args) {
		// class instance
		Exercise1 w = new Exercise1();

		// call methods
		w.printVowels();
	}

	public static void printVowels() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type in a line and hit Enter.");
	
		String line = scanner.nextLine();
		int count = 0;
	
		for (int i = 0; i < line.length(); i++) {
			char letter = line.charAt(i);
			if (isVowel(letter)) {
				count++; 
			}
		}
	
		System.out.println("The number of vowels: " + count);
		scanner.close();
	}
	
	public static boolean isVowel(char letter) {
		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
			return true;
		}
	
		return false;
	}
}
