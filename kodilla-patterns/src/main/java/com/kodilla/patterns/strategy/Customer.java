package com.kodilla.patterns.strategy;

public class Customer {

    //pole, do którego będziemy przypisywali właściwy obiekt implementujący interfejs BuyPredictor
    protected BuyPredictor buyPredictor;
    final private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String predict(){
        return buyPredictor.predictWhatToBuy();
    }

    public void setBuyingStrategy(BuyPredictor buyPredictor){
        this.buyPredictor = buyPredictor;
    }
}
