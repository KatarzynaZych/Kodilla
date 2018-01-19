package challengeOne;

import java.util.HashMap;

public class ProductMap {

    private Shop ProductNotAvaible;

    public Shop shopFinder(String requestedProduct) {

        HashMap<String, Shop> shopMap = new HashMap<String, Shop>();

        shopMap.put("apples", new ExtraFoodShop());
        shopMap.put("tomatoes", new ExtraFoodShop());
        shopMap.put("milk", new ExtraFoodShop());
        shopMap.put("pasta", new GlutenFreeShop());
        shopMap.put("bread", new GlutenFreeShop());
        shopMap.put("chicken soup", new GlutenFreeShop());
        shopMap.put("oranges", new HealthyShop());
        shopMap.put("beef", new HealthyShop());
        shopMap.put("greek salad", new HealthyShop());


        if (shopMap.containsKey(requestedProduct)) {
            return shopMap.get(requestedProduct);
        } else {
            return new ProductNotAvaible();
        }
    }
}
