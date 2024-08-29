package org.example.decorator;

public class JalapenoDecorator extends ToppingDecorator {
    BasePizza pizza;

    public JalapenoDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

    int cost() {
        return pizza.cost() + 20;
    }
}
