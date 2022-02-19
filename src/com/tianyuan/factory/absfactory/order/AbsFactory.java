package com.tianyuan.factory.absfactory.order;

import com.tianyuan.factory.absfactory.pizza.Pizza;

/**
 * @author Andy
 * @create 2022-02-19 15:48
 */

// 一个抽象工厂模式的抽象层（接口）
public interface AbsFactory {
    // 让下面的工厂子类来具体实现
    public Pizza createPizza(String orderType);
}
