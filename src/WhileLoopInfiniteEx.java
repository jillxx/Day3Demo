
public class WhileLoopInfiniteEx {

	public static void main(String[] args) {
		// this code will run endlessly unless we add a stop condition
		while (true) {

			int randomNum = (int) (Math.random() * 10);// will generate a number between 0 and 9

			System.out.println(randomNum);

			// to break ou of this loop we added a conditional statement with break keyword.
			if (randomNum == 7) {
				System.out.println("number 7 has been found!");
				break;
			}
		}
		System.out.println();// this is just for formatting and distinction between examples
		
		//continue example
		for (int i = 0; i < 5; i++) {
			int randomNum = (int) (Math.random() * 10);// will generate a number between 0 and 9
           
			System.out.println("Random: " + randomNum);
		
			if (randomNum > 7) {
				System.out.println("invalid number --go to the top of the loop");
				continue;
			}
           System.out.println(randomNum); // only going to print if it's <= 7
		
		
		
		}

	}

}
