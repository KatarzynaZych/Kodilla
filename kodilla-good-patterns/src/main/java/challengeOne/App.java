package challengeOne;

import java.time.LocalDateTime;

public class App {

    public static void main(String[] ars){

        String requestedProduct = "apples";

        ProductMap productMap = new ProductMap();
        Shop shop = productMap.shopFinder(requestedProduct);
        OrderRequest orderRequest = new OrderRequest(shop,requestedProduct,5);

        OrderProcessor orderProcessor = new OrderProcessor(orderRequest.getShop(), new ContactService(),new ProductOrderService());
        orderProcessor.orderProcess(orderRequest, LocalDateTime.now());

    }
}
