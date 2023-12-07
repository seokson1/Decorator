package org.example;

public class ChocolateSyrup implements Beverage {
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
