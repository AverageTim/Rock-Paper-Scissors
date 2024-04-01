import java.util.Scanner;
import java.util.Random;

public class RPS {
	// Instantiates a scanner and random object
	Scanner input = new Scanner(System.in);
	Random randNum = new Random();
	int wins = 0;
	int losses = 0;
	int ties = 0;
	
	// Play game method
	public void playGame() {
		System.out.println("What are you going to play this round? (Type EXACTLY how the choice is presented) \n1. Rock \n2. Paper \n3. Scissors");
		System.out.println();
		String userChoice = input.next();
			
	// Plays the game
		if (userChoice.equals("Rock")|| userChoice.equals("Paper") || userChoice.equals("Scissors")) {
			int comChoice = randNum.nextInt(3) + 1;
			
	// Player beats computer
			if (comChoice == 1 && userChoice.equals("Paper")) {
				System.out.println("Player: Paper \nComputer: Rock \nYou win!");
				wins++;
			}
			else if (comChoice == 2 && userChoice.equals("Scissors")) {
				System.out.println("Player: Scissors \nComputer: Paper \nYou win!");
				wins++;
			}
			else if (comChoice  == 3 && userChoice.equals("Rock")) {
				System.out.println("Player: Rock \nComputer: Scissors \nYou win!");
				wins++;
			}
			
	// Computer beats player
			else if (comChoice == 1 && userChoice.equals("Scissors")) {
				System.out.println("Player: Scissors \nComputer: Rock \nYou lose!");
				losses++;
			}
			else if (comChoice  == 2 && userChoice.equals("Rock")) {
				System.out.println("Player: Rock \nComputer: Paper \nYou lose!");
				losses++;
			}
			else if (comChoice  == 3 && userChoice.equals("Paper")) {
				System.out.println("Player: Paper \nComputer: Scissors \nYou lose!");
				losses++;
			}

		// Player and computer tie
			else if (comChoice == 1 && userChoice.equals("Rock")) {
				System.out.println("Player: Rock \nComputer: Rock \nTie game!");
				ties++;
			}
			else if (comChoice  == 2 && userChoice.equals("Paper")) {
				System.out.println("Player: Paper \nComputer: Paper \nTie game!");
				ties++;
			}
			else if (comChoice  == 3 && userChoice.equals("Scissors")) {
				System.out.println("Player: Scissors \nComputer: Scissors \nTie game!");
				ties++;
			}

	// End game, play again, and other details
			System.out.println();
			System.out.println("Would you like to play again?");
			String playAgain = input.next();
			System.out.println();
			
			if (playAgain.equals("yes") || playAgain.equals("YES") || playAgain.equals("Yes")) {
				playGame();
			}
			else if (playAgain.equals("no") || playAgain.equals("NO") || playAgain.equals("No")) {
				System.out.println("Ok. Good game! \nYour final score is below (Wins-Losses-Ties) \n" + wins + "-" + losses + "-" + ties);
			}
			else {
				System.out.println("Sorry, that choice does not exist. Restart and try again.");
			}
      
		}		
		else {
			System.out.println("Sorry, that choice does not exist. Restart and try again.");
		}
	}
}
