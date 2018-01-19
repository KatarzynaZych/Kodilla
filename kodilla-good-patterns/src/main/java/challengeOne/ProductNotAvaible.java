package challengeOne;

public class ProductNotAvaible implements Shop {


    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("The product is not available in any shop.");

        return false;
    }

    @Override
    public String getShopName() {
        return null;
    }
}
