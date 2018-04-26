
public class DoWhileEx {

	public static void main(String[] args) {
		int num = 5;
		System.out.println(num++); // will print 5 because print num and then add once

		System.out.println();// adding a space here.
		int num2 = 7;
		System.out.println(--num2);// will print 6 if put decerment at frount because it will do the calculation
									// first.

		/*
		 * VARIABLE DECLARED OUTSIDE OF THE LOOP SO THE WHILE CONDITION CAN SEE IT
		 */
		int counter = 100;
		/*
		 * The do loop will always execute the code between the do brackets at
		 */ do {
			System.out.println("Counter: " + counter--);
			// System.out.println("Counter: " + --counter); be careful here it hit 0 before
			// check the condition
			// counter--;
		} while (counter > 0);

	}

}
