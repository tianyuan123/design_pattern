package com.tianyuan.factory.simplefactory.order;

import com.tianyuan.factory.simplefactory.pizza.CheesePizza;
import com.tianyuan.factory.simplefactory.pizza.GreekPizza;
import com.tianyuan.factory.simplefactory.pizza.PepperPizza;
import com.tianyuan.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//简单工厂类
public class SimpleFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }
}
