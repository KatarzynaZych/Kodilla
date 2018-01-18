package challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    private static int orderId = 10000;
    private static int userId = 1;

    public OrderRequest retrieve(String userName, String userEmail){

        User user = new User(userName, userId++, userEmail);

        return new OrderRequest(user, orderId++, LocalDateTime.now());

    }
}
