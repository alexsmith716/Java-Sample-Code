import java.util.Scanner;

// Create a method that prints different statements based on the user’s input according to the following cases.
// Case One: If the input is 1, then print, “Moving Right”
// Case Two: If the input is 2, then print, “Moving Left”
// Case Three: If the input is 3, then print, “Moving Up”
// Case Four: If the input is 4, then print, “Moving Down”
// Case Five: If the input is ‘q’, then exit the program
// Case Six: If the input is anything other than the above, then print, “Try again. Accepatable input: [1 - Move right, 2 - Move Left, 3 - Move Up, 4 - Move Down, q - exit program]”
// The program should employ a continuous loop and only end if the user types in the letter q.

public class Exercise2 {

	public static void main(String[] args) {
		// class instance
		Exercise2 w = new Exercise2();

		// call methods
		w.mover();
	}

	public static void mover() {
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;

		System.out.println("Please type in one of the following:");
		System.out.println("* 1 - Move Right");
		System.out.println("* 2 - Move Left");
		System.out.println("* 3 - Move Up");
		System.out.println("* 4 - Move Down");
		System.out.println("* q - exit program");

		while (scanner.hasNext()) {
			String input = scanner.next();

			switch(input) {
				case "1": {
					System.out.println("Moving Right");
					break;
				}
				case "2": {
					System.out.println("Moving Left");
					break;
				}
				case "3": {
					System.out.println("Moving Up");
					break;
				}
				case "4": {
					System.out.println("Moving Down");
					break;
				}
				case "q": {
					System.out.println("Moving Left"); 
					exit = true;
					break;
				}
				default: {
					System.out.println("Try again. Accepatable input: [1 - Move right, 2 - Move Left, 3 - Move Up, 4 - Move Down, q - exit program]"); 
				}
			}
			if (exit) {
				System.out.println("Exiting program...");
				break;
			}
		}
		scanner.close();
	}
}
