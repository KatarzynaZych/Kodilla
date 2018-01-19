package challengeOne;

public class ExtraFoodShop implements Shop {

    ProductBase productBase = new ProductBase();

    @Override
    public boolean process(OrderRequest orderRequest) {
        if (productBase.productListExtra().containsKey(orderRequest.getProduct())) {
            System.out.println("The product: " + orderRequest.getProduct() + " is available in ExtraFoodShop.");
            return true;
        } else {
            System.out.println("The product is not available in ExtraFoodShop.");
            return false;
        }
    }

    @Override
    public String getShopName() {
        return "ExtraFoodShop";
    }
}