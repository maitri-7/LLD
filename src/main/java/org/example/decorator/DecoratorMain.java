package org.example.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        BasePizza myPizza = new JalapenoDecorator(new CheeseDecorator(new VegDelightPizza()));
        System.out.println("the cost of my pizza is " + myPizza.cost());
    }
}