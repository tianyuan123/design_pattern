package com.tianyuan.factory.factorymethod.order;

import com.tianyuan.factory.factorymethod.pizza.BJCheesePizza;
import com.tianyuan.factory.factorymethod.pizza.BJPepperPizza;
import com.tianyuan.factory.factorymethod.pizza.Pizza;

/**
 * @author Andy
 * @create 2022-02-13 21:37
 */
public class BJOrderPizza extends OrderPizza{

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)){
            pizza = new BJCheesePizza();
        }else if ("pepper".equals(orderType)){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
