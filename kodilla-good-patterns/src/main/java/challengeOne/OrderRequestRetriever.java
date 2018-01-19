package challengeOne;

public class OrderRequestRetriever {

    private Shop shop;

    public OrderRequest retrieve(String product, double productQuantity){

        return new OrderRequest(shop, product, productQuantity);

    }
}
