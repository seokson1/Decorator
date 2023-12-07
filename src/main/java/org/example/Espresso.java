package org.example;

public class Espresso implements Beverage {

    @Override
    public String getName() {
        return "Espresso";
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
