package challengeOne;

public class ExtraFoodShop implements Shop {

    @Override
    public boolean process(OrderRequest orderRequest) {
            System.out.println("The product: " + orderRequest.getProduct() + " is available in ExtraFoodShop.");
            return true;

    }

    @Override
    public String getShopName() {
        return "ExtraFoodShop";
    }
}