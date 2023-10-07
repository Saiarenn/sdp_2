package org.example;

public class Main {
    public static void main(String[] args) {
        IBurger hamburger = new MeatDecorator(new CheeseDecorator(new Hamburger()));
        System.out.println(hamburger.getDescription() + " costs " + hamburger.cost() + "$");

        IBurger chesseburger = new SaladDecorator(new CheeseDecorator(new CheeseDecorator(new Cheeseburger())));
        System.out.println(chesseburger.getDescription() + " costs " + chesseburger.cost() + "$");
    }
}

