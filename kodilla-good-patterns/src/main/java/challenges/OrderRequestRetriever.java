package challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){

        User user = new User("John Kowalsky", 1200548, "john.kowalsky@yoohoo.com");
        int orderId = 100001;
        LocalDateTime dateOfOrder = LocalDateTime.of(2017,12,21,12,00);

        return new OrderRequest(user,orderId,dateOfOrder);

    }
}
