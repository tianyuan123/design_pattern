package com.tianyuan.factory.simplefactory.order;

import com.tianyuan.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Andy
 * @create 2022-02-13 20:38
 */
public class OrderPizza2 {
    String orderType = "";//用户输入披萨名称
    public OrderPizza2(){
        do {
            orderType = getType();
            // 静态的方便调用
            Pizza pizza = SimpleFactory.createPizza2(orderType);
            if (pizza != null) { //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
        } while (true);
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
