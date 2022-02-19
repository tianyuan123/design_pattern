package com.tianyuan.factory.absfactory.order;

import com.tianyuan.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Andy
 * @create 2022-02-19 16:15
 */
public class OrderPizza {

    AbsFactory factory;

    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }

    private void setFactory(AbsFactory absFactory){
        Pizza pizza = null;
        String orderType = "";
        do {
            orderType = getType();
             pizza = absFactory.createPizza(orderType);
             if (pizza != null){
                 pizza.prepare();
                 pizza.bake();
                 pizza.cut();
                 pizza.box();
             }else{
                 System.out.println("订购失败");
                 break;
             }
        }while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
