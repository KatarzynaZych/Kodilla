package challengeOne;

public class OrderRequest {

    private Shop shop;
    private String product;
    private double productQuantity;

    public OrderRequest(Shop shop, String product, double productQuantity) {
        this.shop = shop;
        this.product = product;
        this.productQuantity = productQuantity;
    }

    public Shop getShop() {
        return new ExtraFoodShop();
    }

    public String getProduct() {
        return product;
    }

    public double getProductQuantity() {
        return productQuantity;
    }
}
