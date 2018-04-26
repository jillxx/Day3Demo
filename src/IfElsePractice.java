import java.util.Scanner;

public class IfElsePractice {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = scan.nextInt();
		if (age >= 18) {// if-else check from top to down. if first true. will not check the rest loop
			System.out.println("Congrats! you can legally vote!");
		} else if (age >= 16){// has to be a boolean expreession
			System.out.println("Head to voter education");
		}
		else {
			System.out.println("Go do some research!");
			
		}

		
		
		scan.close();
	}

}
