package org.example;

public class CheeseDecorator extends BurgerDecorator {
    public CheeseDecorator(IBurger burger) {
        super(burger);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with extra cheese";
    }
}
