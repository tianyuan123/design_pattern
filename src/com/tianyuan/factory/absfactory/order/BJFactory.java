package com.tianyuan.factory.absfactory.order;

import com.tianyuan.factory.absfactory.pizza.BJCheesePizza;
import com.tianyuan.factory.absfactory.pizza.BJPepperPizza;
import com.tianyuan.factory.absfactory.pizza.Pizza;

/**
 * @author Andy
 * @create 2022-02-19 16:00
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("abc使用的是抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
