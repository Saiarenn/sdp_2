package org.example;

public class MeatDecorator extends BurgerDecorator{
    public MeatDecorator(IBurger burger) {
        super(burger);
    }

    @Override
    public double cost() {
        return super.cost() + 2.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with extra meat";
    }
}
