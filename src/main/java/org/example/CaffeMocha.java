package org.example;

public class CaffeMocha implements Beverage {
    private Beverage caffeLatte;
    private int chocolateSyrup;
    public CaffeMocha(Beverage caffeLatte, int chocolateSyrup) {
        this.caffeLatte = caffeLatte;
        this.chocolateSyrup = chocolateSyrup;
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public int getPrice() {
        return chocolateSyrup + caffeLatte.getPrice();
    }
}
