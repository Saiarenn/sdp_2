package org.example;

public class Cheeseburger implements IBurger{
    @Override
    public double cost() {
        return 4.0;
    }

    @Override
    public String getDescription() {
        return "Cheeseburger";
    }
}
