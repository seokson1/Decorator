package org.example;

public class Milk implements Beverage {
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public int getPrice() {
        return 1500;
    }
}
