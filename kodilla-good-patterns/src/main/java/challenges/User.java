package challenges;

public class User {

    private String userName;
    private int userId;
    private String userEmail;

    public User(String userName, int userId, String userEmail) {
        this.userName = userName;
        this.userId = userId;
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
