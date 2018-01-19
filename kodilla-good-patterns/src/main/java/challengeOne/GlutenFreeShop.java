package challengeOne;

public class GlutenFreeShop implements Shop {

    ProductBase productBase = new ProductBase();

    @Override
    public boolean process(OrderRequest orderRequest) {
        if (productBase.productListGluten().containsKey(orderRequest.getProduct())) {
            System.out.println("The product: " + orderRequest.getProduct() + " is available in GlutenFreeShop.");
            return true;
        } else {
            System.out.println("The product is not available in GlutenFreeShop.");
            return false;
        }
    }

    @Override
    public String getShopName() {
        return "GlutenFreeShop";
    }
}
