package challengeOne;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    public boolean order(OrderRequest orderRequest, LocalDateTime dateOfOrder){

        System.out.println("New order has been created on " + dateOfOrder.toString() + " .");

        return true;
    }
}
