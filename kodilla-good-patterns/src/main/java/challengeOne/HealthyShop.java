package challengeOne;

public class HealthyShop implements Shop {

    @Override
    public boolean process(OrderRequest orderRequest) {
            System.out.println("The product: " + orderRequest.getProduct() + " is available in HealthyShop.");
            return true;
    }

    @Override
    public String getShopName() {
        return "HealthyShop";
    }
}
