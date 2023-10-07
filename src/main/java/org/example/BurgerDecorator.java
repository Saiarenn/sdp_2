package org.example;

public abstract class BurgerDecorator implements IBurger{
    private IBurger decoratedBurger;

    public BurgerDecorator(IBurger burger) {
        this.decoratedBurger = burger;
    }

    @Override
    public double cost() {
        return decoratedBurger.cost();
    }

    @Override
    public String getDescription() {
        return decoratedBurger.getDescription();
    }
}
