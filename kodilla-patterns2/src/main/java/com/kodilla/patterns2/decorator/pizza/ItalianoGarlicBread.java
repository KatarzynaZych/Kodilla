package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ItalianoGarlicBread extends AbstractPizzaOrderDecorator {

    public ItalianoGarlicBread(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getTopping() {
        return super.getTopping() + " and Italiano Garlic Bread";
    }
}
