package challengeOne;

public class HealthyShop implements Shop {

    ProductBase productBase = new ProductBase();

    @Override
    public boolean process(OrderRequest orderRequest) {
        if (productBase.productListHealthy().containsKey(orderRequest.getProduct())) {
            System.out.println("The product: " + orderRequest.getProduct() + " is available in HealthyShop.");
            return true;
        } else {
            System.out.println("The product is not available in HealthyShop.");
            return false;
        }
    }

    @Override
    public String getShopName() {
        return "HealthyShop";
    }
}
