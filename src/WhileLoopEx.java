import java.util.Scanner;

public class WhileLoopEx {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {
			// your code should start here
			System.out.println("Do some stuff");

			// this is where your code should end if you are using this as a template
			System.out.println("Do you want to ocontinue?(y/n)");
			cont = scnr.nextLine();
		}

		// let the user know that the program has ended
		System.out.println("Goodbye");

		scnr.close();

	}

}
