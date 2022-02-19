package com.tianyuan.factory.factorymethod.order;


import com.tianyuan.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 工厂方法模式设计方案：将披萨项目的实例化功能抽象成抽象方法，在不同的口味点餐子类中具体实现。
 * 工厂方法模式：定义了一个创建对象的抽象方法，由子类决定要实例化的类。工厂方法模式将对象的实例化推迟到子类。
 */
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
