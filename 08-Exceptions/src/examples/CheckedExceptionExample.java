package examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample {

	public static void openFile() throws FileNotFoundException {
		new FileInputStream("DoesNotExistX.txt");
	}

	public static void main(String[] args) {

		try {
			openFile();
      System.out.println("Successfully read the contents of a file as a stream of bytes!");
		} catch (FileNotFoundException e) {
      System.out.println("Encountered FileNotFoundException, now printStackTrace!");
			e.printStackTrace();
		}

		System.out.println("The application's Try - Catch block statement has executed!");
	}
}
