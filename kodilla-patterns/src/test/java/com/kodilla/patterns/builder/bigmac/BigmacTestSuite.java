package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBigmac(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("with sesame")
                .burgers(2)
                .sauce("standard")
                .ingredient("onion")
                .ingredient("beckon")
                .ingredient("chili peppers")
                .ingredient("cheese")
                .build();

        System.out.println(bigmac);

        //When
        int howManyBurgersHasBurger = bigmac.getBurgers();
        int howManyIngredientsHasBurger = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(2,howManyBurgersHasBurger);
        Assert.assertEquals(4,howManyIngredientsHasBurger);
    }
}
