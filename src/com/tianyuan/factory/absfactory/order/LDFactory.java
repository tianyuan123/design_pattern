package com.tianyuan.factory.absfactory.order;

import com.tianyuan.factory.absfactory.pizza.*;

/**
 * @author Andy
 * @create 2022-02-19 16:06
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("abc使用的是抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
