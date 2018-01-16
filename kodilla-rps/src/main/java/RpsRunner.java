import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args){

        System.out.println("Welcome! Scissors cuts paper. Paper covers rock. Rock crushes scissors ! \n Enter your username: ");
        RpsUser rpsUser = new RpsUser();
        rpsUser.getUserName();

        boolean end = false;
        while (!end) {

            System.out.println("Enter the number of rounds: ");
            RpsRounds rpsRounds = new RpsRounds();
            RpsLoop rpsLoop = new RpsLoop();
            rpsLoop.mainGame(rpsRounds.getNumberOfRounds());

            System.out.println("\n Enter 'x' to finish game or 'n' to play again :");
            Scanner scanner = new Scanner(System.in);
            String whatNext = scanner.nextLine();

                if (whatNext.equals("x")) {
                    System.out.println(" Goodbye !");
                    end = true;
                } else if (whatNext.equals("n")) {
                    end = false;
                }else {
                    System.out.println("You didn't enter x or n. Good bye! ");
                }
            }
    }
}

