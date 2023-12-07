package org.example;

public interface Beverage {
    String getName();

    int getPrice();

    default void printPrice(){
        System.out.println(getName() + "가격은" + getPrice() + "입니다.");
    }
}
