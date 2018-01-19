package challengeOne;

import java.time.LocalDateTime;

public class App {

    public static void main(String[] ars){

        OrderRequest orderRequest = new OrderRequest(new ExtraFoodShop(),"apples", 5);
        OrderProcessor orderProcessor1 = new OrderProcessor(new ExtraFoodShop(), new ContactService(),new ProductOrderService());
        orderProcessor1.orderProcess(orderRequest, LocalDateTime.now());

    }
}
