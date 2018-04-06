package com.kodilla.patterns2.com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void PizzaDecoratorCostTestSuite(){
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ChickenFeastPizza(pizzaOrder);
        pizzaOrder = new ExtraMozzarellaCheese(pizzaOrder);
        pizzaOrder = new HawaiianPizza(pizzaOrder);
        pizzaOrder = new ItalianoGarlicBread(pizzaOrder);
        //when
        BigDecimal theCost = pizzaOrder.getCost();
        System.out.println("£ " + theCost);
        //then
        Assert.assertEquals(new BigDecimal(41),theCost);
    }

    @Test
    public void PizzaDecoratorToppingsTestSuite(){
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ChickenFeastPizza(pizzaOrder);
        pizzaOrder = new ExtraMozzarellaCheese(pizzaOrder);
        pizzaOrder = new HawaiianPizza(pizzaOrder);
        pizzaOrder = new ItalianoGarlicBread(pizzaOrder);
        //when
        String toppings = pizzaOrder.getTopping();
        System.out.println(toppings);
        //then
        Assert.assertEquals("Classic crust with tomato sauce and cheese and chicken and sweetcorn and mushrooms and extra mozzarella cheese and pineapple and ham and Italiano Garlic Bread",toppings);
    }
}
