package challenges;

import java.time.LocalDateTime;
import java.util.HashMap;

public class ProductOrderRepository implements OrderRepository {

    public void createOrder(User user, int itemId, LocalDateTime dateOfOrder) {

        System.out.println("New order has been add to the repository.");
    }

}
