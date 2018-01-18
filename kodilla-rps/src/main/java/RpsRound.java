import java.util.Random;
import java.util.Scanner;

public class RpsRound {

    private Random randomGenerator = new Random();


    public  Results oneRound( Results results, Scanner scanner) {

        int computerMove = randomGenerator.nextInt(2)+1;
        int userScore = results.getUserScore();
        int computerScore = results.getComputerScore();

        System.out.println("Enter your move: ");
        int userMove = scanner.nextInt();

        if (userMove == 1 && computerMove == 1) {
            userScore++;
            computerScore++;
            System.out.println("The round ended in a draw");
        } else if (userMove == 1 && computerMove == 2) {
            userScore++;
            System.out.println("You won the round");
        } else if (userMove == 1 && computerMove == 3) {
            computerScore++;
            System.out.println("The computer won the round");
        } else if (userMove == 2 && computerMove == 2) {
            userScore++;
            computerScore++;
            System.out.println("The round ended in a draw");
        } else if (userMove == 2 && computerMove == 1) {
            computerScore++;
            System.out.println("The computer won the round");
        } else if (userMove == 2 && computerMove == 3) {
            userScore++;
            System.out.println("You won the round");
        } else if (userMove == 3 && computerMove == 3) {
            userScore++;
            computerScore++;
            System.out.println("The round ended in a draw");
        } else if (userMove == 3 && computerMove == 1) {
            userScore++;
            System.out.println("You won the round");
        } else if (userMove == 3 && computerMove == 2) {
            computerScore++;
            System.out.println("The computer won the round");
        }

        return new Results(userScore,computerScore);
    }
}