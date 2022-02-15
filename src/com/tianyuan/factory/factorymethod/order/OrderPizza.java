package com.tianyuan.factory.factorymethod.order;


import com.tianyuan.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    // 定义一个抽象方法，createPizza,让各个工厂子类实现
    abstract Pizza createPizza(String orderType);

    //构造器
    public OrderPizza() {
        String orderType;
        do {
            orderType = getType();
            Pizza pizza = createPizza(orderType);
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

//    public void setFactory(SimpleFactory simpleFactory) {
//        String orderType = "";//用户输入披萨名称
//        this.simpleFactory = simpleFactory; //设置简单工厂对象
//
//        do {
//            orderType = getType();
//            pizza = simpleFactory.createPizza(orderType);
//            if (pizza != null) { //订购成功
//                pizza.prepare();
//                pizza.bake();
//                pizza.cut();
//                pizza.box();
//            } else {
//                System.out.println("订购披萨失败");
//                break;
//            }
//        } while (true);
//    }

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
