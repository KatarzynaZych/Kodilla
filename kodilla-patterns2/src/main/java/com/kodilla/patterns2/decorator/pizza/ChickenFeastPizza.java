package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ChickenFeastPizza extends AbstractPizzaOrderDecorator {

    public ChickenFeastPizza(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(12));
    }

    @Override
    public String getTopping() {
        return super.getTopping() + " and chicken and sweetcorn and mushrooms";
    }
}
