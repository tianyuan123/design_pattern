package com.tianyuan.factory.factorymethod.order;

import com.tianyuan.factory.factorymethod.pizza.*;
import com.tianyuan.factory.simplefactory.pizza.CheesePizza;
import com.tianyuan.factory.simplefactory.pizza.PepperPizza;

/**
 * @author Andy
 * @create 2022-02-13 21:37
 */
public class LDOrderPizza extends OrderPizza{

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheech".equals(orderType)){
            pizza = new LDCheesePizza();
        }else if ("pepper".equals(orderType)){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
