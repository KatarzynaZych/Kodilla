import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Scissors cuts paper. Paper covers rock. Rock crushes scissors ! \n Enter your username: ");
        RpsUser rpsUser = new RpsUser();
        rpsUser.getUserName(scanner);

        boolean end = false;

        while (!end) {

            System.out.println("Enter the number of rounds: ");
            RpsRounds rpsRounds = new RpsRounds();
            RpsLoop rpsLoop = new RpsLoop();
            rpsLoop.mainGame(rpsRounds.getNumberOfRounds(scanner), scanner);

            end = isEnd(scanner);
        }

        scanner.close();
    }

    private static boolean isEnd(Scanner scanner) {

        System.out.println("\n Enter 'x' to finish game or 'n' to play again :");
        scanner.nextLine();
        String whatNext = scanner.nextLine();

        if (whatNext.equals("x")) {
            System.out.println(" Goodbye !");
            return true;
        } else if (whatNext.equals("n")) {
            return false;
        } else {
            System.out.println("You didn't enter x or n. Good bye! ");
            return true;
        }
    }
}

