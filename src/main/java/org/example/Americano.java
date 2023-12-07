package org.example;

public class Americano implements Beverage {
    private Beverage espresso;
    private Beverage water;

    public Americano(Beverage espresso, Beverage water) {
                this.espresso = espresso;
                this.water = water;
    }

    @Override
    public String getName() {
        return "Americano";
    }

    @Override
    public int getPrice() {
        return espresso.getPrice() + water.getPrice();
    }
}
