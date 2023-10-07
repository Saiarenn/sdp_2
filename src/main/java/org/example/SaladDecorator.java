package org.example;

public class SaladDecorator extends BurgerDecorator{

    public SaladDecorator(IBurger burger) {
        super(burger);
    }

    @Override
    public double cost() {
        return super.cost() + 0.25;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with extra salad";
    }
}
