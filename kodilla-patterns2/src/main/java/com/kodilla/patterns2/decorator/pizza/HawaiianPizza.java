package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HawaiianPizza extends AbstractPizzaOrderDecorator {

    public HawaiianPizza(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getTopping() {
        return super.getTopping() + " and pineapple and ham";
    }
}
