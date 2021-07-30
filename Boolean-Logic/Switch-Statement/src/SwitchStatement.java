
public class SwitchStatement {

	public static void main(String[] args) {
		int value = 7;

		// switch statements support 'fall through logic'
		// so, whatever case is met first, all other cases below it will run

		switch(value) {
			case 4:
				System.out.println("Case 4");
			default:
				System.out.println("Default case");
			case 5:
				System.out.println("Case 5");
			case 6:
				System.out.println("Case 6");
		}
	}
}

//	public class SwitchStatement {
//	
//		public static void main(String[] args) {
//			int value = 7;
//	
//			switch(value) {
//				case 4:
//					System.out.println("Case 4");
//					break;
//				case 5: 
//					System.out.println("Case 5");
//					break;
//				case 6:
//					System.out.println("Case 6");
//					break;
//				default:
//					System.out.println("Default case");
//					break;
//			}
//		}
//	}
