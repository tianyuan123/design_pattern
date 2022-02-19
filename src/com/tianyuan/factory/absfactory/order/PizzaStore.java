package com.tianyuan.factory.absfactory.order;

/**
 * @author Andy
 * @create 2022-02-19 16:27
 */
public class PizzaStore {
    public static void main(String[] args) {
        //new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }
}
