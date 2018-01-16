import java.util.Scanner;

public class RpsUser {

    public String getUserName() {

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        return userName;
    }
}
