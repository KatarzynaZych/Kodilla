import java.util.Random;
import java.util.Scanner;
import java.util.WeakHashMap;

public class RpsLoop {

    private int userScore = 0;
    private int computerScore = 0;

    public String mainGame(int numberOfRounds, Scanner scanner){

        boolean end = false;
        Results results = new Results(0,0);

        while (!end){


            RpsRound rpsRound = new RpsRound();

            results = rpsRound.oneRound(results,scanner);

            userScore = results.getUserScore();
            computerScore = results.getComputerScore();

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
