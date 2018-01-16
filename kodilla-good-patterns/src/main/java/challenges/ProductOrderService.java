package challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    public boolean order(User user, int orderId, LocalDateTime dateOfOrder){
        System.out.println("New order has been created by " + user.getUserId()+ " on " + dateOfOrder.toString() + ". User ordered " + orderId);

        return true;
    }
}
