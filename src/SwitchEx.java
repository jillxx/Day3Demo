import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number between 1 and 7: ");

		int num = scan.nextInt();
     
		switch(num) {
		case 1: 
			System.out.println("You entered 1");
			break;
			
		case 2:
		case 4:
		case 6:
			System.out.println("The number entered is even");
			break;
		case 7:
			System.out.println("You entered luck # 7");
			break;
		default:
			System.out.println("The numbere is not between 1 and 7 or is 3 or 5");
		}
		
		
		scan.close();

	}

}
