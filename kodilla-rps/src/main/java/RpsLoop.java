import java.util.Random;
import java.util.Scanner;
import java.util.WeakHashMap;

public class RpsLoop {

    private int userScore = 0;
    private int computerScore = 0;

    public String mainGame(int numberOfRounds){

        boolean end = false;

        while (!end){

            Random randomGenerator = new Random();
            int computerMove = randomGenerator.nextInt(2)+1;

            System.out.println("Enter your move: ");
            Scanner scanner = new Scanner(System.in);
            int userMove = scanner.nextInt();

            if (userMove == 1 && computerMove == 1 ) {
                userScore++;
                computerScore++;
                System.out.println("The round ended in a draw");
            } else if (userMove == 1 && computerMove == 2 ){
                userScore++;
                System.out.println("You won the round");
            } else if (userMove== 1 && computerMove == 3 ){
                computerScore++;
                System.out.println("The computer won the round");
            } else if(userMove == 2 && computerMove == 2 ) {
                userScore++;
                computerScore++;
                System.out.println("The round ended in a draw");
            } else if (userMove == 2 && computerMove == 1 ){
                computerScore++;
                System.out.println("The computer won the round");
            } else if (userMove == 2 && computerMove == 3 ){
                userScore++;
                System.out.println("You won the round");
            }else if(userMove == 3 && computerMove == 3 ) {
                userScore++;
                computerScore++;
                System.out.println("The round ended in a draw");
            } else if (userMove == 3 && computerMove == 1 ){
                userScore++;
                System.out.println("You won the round");
            } else if (userMove == 3 && computerMove == 2 ){
                computerScore++;
                System.out.println("The computer won the round");
            }

            if (numberOfRounds == userScore || numberOfRounds == computerScore){

                end = true;
                if (userScore>computerScore){
                    System.out.println("Congratulations ! You're winner !");
                }else if(userScore<computerScore){
                    System.out.println("Sorry but you lost :( ");
                }else {
                    System.out.println("The game ended in a draw");
                }
                System.out.println(" You vs. Computer " + userScore + " : " + computerScore);

            } else {
                end = false;
                System.out.println("Results You vs. Computer " + userScore + " : " + computerScore);
            }
        }
        return "Results You vs. Computer " + userScore + " : " + computerScore;
    }
}
