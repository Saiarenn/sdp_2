package org.example;

public class Hamburger implements IBurger{
    @Override
    public double cost() {
        return 5.0;
    }

    @Override
    public String getDescription() {
        return "Hamburger";
    }
}
