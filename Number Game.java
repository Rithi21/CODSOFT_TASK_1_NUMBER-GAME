
import java.util.Scanner;

public class Main {

	// Function that implements the
	// number guessing game
	public static void guessNumberGame()
	{
		// Scanner Class
		Scanner sc = new Scanner(System.in);

		// Generate the numbers
		int number = 1 + (int)(100* Math.random());

		// Given n trials
		System.out.println("Enter the number of trails:");
		int n=sc.nextInt();

		int i, guess;

		System.out.println("A number is chosen"+ " between 1 to 100."+ "Guess the number"+ " within " +n+ " trials.");

		// Iterate over n Trials
		for (i = 0; i < n; i++) {

			System.out.println("Guess the number:");

			// Take input for guessing
			guess = sc.nextInt();

			// If the number is guessed
			if (number == guess) {
				System.out.println("Congratulations!" + " You guessed the number.");
				break;
			}
			else if (number > guess && i != n - 1) {
				System.out.println(	"The number is "+ "greater than " + guess);
			}
			else if (number < guess && i != n - 1) {
			    System.out.println("The number is"+ " less than " + guess);
			}
		}

		if (i == n) {
			System.out.println(
				"You have exhausted"+ " n trials.");

			System.out.println("The number was " + number);
		}
	}

	// Driver Code
	public static void main(String arg[])
	{

		// Function Call
		guessNumberGame();
	}
}
