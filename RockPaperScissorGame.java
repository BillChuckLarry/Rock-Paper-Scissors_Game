package day4;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {

	public static void main(String[] args)

	{
		// game play logic for Rock Paper Scissors

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("0 = Rock, 1 = Paper, 2 = Scissors");
		int userChoice = scanner.nextInt();
		System.out.println(userChoice);

		// Validate input for User's choice

		if (userChoice < 0 || userChoice > 2) {
			System.out.println("Invalid Choice. Please run again and enter numbers 0 - 2 only!!");
			return; // exits the program
		}

		// Generate computer random choice between 0, 1 or 2

		int computerChoice = new Random().nextInt(3);
		System.out.println(computerChoice);

		// Determine winner of RPS game!!

		if (userChoice == computerChoice) {
			System.out.println("Result: Game is a tie");
		}

		// User wins

		else if ((userChoice == 0 && computerChoice == 2) || (userChoice == 1 && computerChoice == 0)
				|| (userChoice == 2 && computerChoice == 1))

		{
			System.out.println("You win the game! Congratulations on winning RPS");
		}

		else {
			System.out.println("Computer wins and your have lost the game. So sorry!!");
		}
	}

}
