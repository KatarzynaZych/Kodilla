package challengeOne;

import java.time.LocalDateTime;

public class App {

    public static void main(String[] ars){

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve("apples",5);

        OrderProcessor orderProcessor = new OrderProcessor(orderRequest.getShop(), new ContactService(),new ProductOrderService());
        orderProcessor.orderProcess(orderRequest, LocalDateTime.now());

    }
}
