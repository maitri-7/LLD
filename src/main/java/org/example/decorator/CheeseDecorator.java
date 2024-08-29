package org.example.decorator;

public class CheeseDecorator extends ToppingDecorator {
    BasePizza pizza;

    public CheeseDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

    int cost() {
        return pizza.cost() + 10;
    }
}
