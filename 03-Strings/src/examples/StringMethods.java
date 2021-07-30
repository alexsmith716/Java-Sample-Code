package examples;

public class StringMethods {

	public static void main(String[] args) {

		String string1 = "hello";
		String string2 = new String("Hello");
		String str = "This is a new String";

		System.out.println("String.length():\t\t" +     string1.length());
		System.out.println("String.toUpperCase():\t\t" +  string1.toUpperCase());
		System.out.println("String.toLowerCase():\t\t" +  string1.toLowerCase());
		System.out.println("String.indexOf('e'):\t\t" +   string1.indexOf('e'));
		System.out.println("String.lastIndexOf('l'):\t" +   string1.lastIndexOf('l'));
		System.out.println("String.chatAt(4):\t\t" +    string1.charAt(4));
		System.out.println("\nstring1.equals(string2):\t\t" +     string1.equals(string2));
		System.out.println("string1.equalsIgnoreCase(string2):\t" + string1.equalsIgnoreCase(string2));

		System.out.println(str);
		//toLowerCase() - used to convert each letter to lowercase
		str  = str.toLowerCase();
		System.out.println(str.toLowerCase());
		//charAt(int index) - used to find the letter at the specified index
		System.out.println(str.charAt(5));
		//equalsIgnoreCase - used to test if another String is equivalent regard less of capitalization
		System.out.println(str.equalsIgnoreCase("THiS Is A nEW STRinG"));
		System.out.println(str.equalsIgnoreCase("this is a new string"));
		//substring - returns a smaller section of the original String starting at the specified index
		System.out.println(str.substring(4));
	}
}
