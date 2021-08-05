import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String result = "";

		System.out.print("Type some text and hit Enter: ");

		result = scanner.nextLine();
		scanner.close();

		System.out.println("Result: " + result);
	}
}
