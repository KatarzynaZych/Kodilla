package challengeOne;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductBase {

    public HashMap<String,Double> productListExtra() {

        HashMap<String, Double> extraProduct = new HashMap<String, Double>();
        extraProduct.put("apples",1000.0);
        extraProduct.put("tomatoes",100.5);
        extraProduct.put("milk",38.5);

        return extraProduct;
    }

    public HashMap<String,Double> productListGluten() {

        HashMap<String, Double> glutenProduct = new HashMap<String, Double>();
        glutenProduct.put("pasta",1000.0);
        glutenProduct.put("bread",100.0);
        glutenProduct.put("chicken soup",38.5);

        return glutenProduct;
    }
    public HashMap<String,Double> productListHealthy() {

        HashMap<String, Double> healthyProduct = new HashMap<String, Double>();
        healthyProduct.put("oranges",1000.0);
        healthyProduct.put("beef",100.0);
        healthyProduct.put("greek salad",38.5);

        return healthyProduct;
    }

}
