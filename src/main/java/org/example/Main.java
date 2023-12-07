package org.example;

public class Main {
    public static void main(String[] args) {
        //기존 객체 물, 우유, 에스프레소 객체 생성 없이 만들 수 있음. Decorator 디자인 패턴
        Beverage water = new Water();
        water.printPrice();

        Beverage milk = new Milk();
        milk.printPrice();

        Beverage chocolateSyrup = new ChocolateSyrup();
        chocolateSyrup.printPrice();

        Beverage espresso = new Espresso();
        espresso.printPrice();

        Beverage americano = new Americano(espresso, water);
        americano.printPrice();

        Beverage caffeLatte = new CaffeLatte(espresso, milk);
        caffeLatte.printPrice();

        Beverage mocha = new CaffeMocha(caffeLatte, 500);
        mocha.printPrice();

    }
}