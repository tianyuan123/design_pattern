package com.tianyuan.factory.simplefactory.order;

/**
 * @author Andy
 * @create 2022-02-13 20:49
 */
public class PizzaStore2 {

    // 简单工厂模式 也叫 静态工厂模式,将工厂方法写成静态的方法，方便调用
    public static void main(String[] args) {
        new OrderPizza2();
    }
}
