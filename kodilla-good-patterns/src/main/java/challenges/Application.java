package challenges;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve("Jarek Kowalski","jake@op.pl");

        OrderProcessor orderProcessor = new OrderProcessor(new ContactService(),new ProductOrderService(),new ProductOrderRepository());
        orderProcessor.process(orderRequest);

    }
}
