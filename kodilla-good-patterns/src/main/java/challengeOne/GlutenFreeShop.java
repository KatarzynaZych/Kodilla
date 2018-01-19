package challengeOne;

public class GlutenFreeShop implements Shop {

    @Override
    public boolean process(OrderRequest orderRequest) {
            System.out.println("The product: " + orderRequest.getProduct() + " is available in GlutenFreeShop.");
            return true;
    }

    @Override
    public String getShopName() {
        return "GlutenFreeShop";
    }
}
