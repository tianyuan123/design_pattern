package com.tianyuan.factory.factorymethod.order;

/**
 * @author Andy
 * @create 2022-02-13 21:52
 */
public class PizzaStore {
    public static void main(String[] args) {
        String loc = "bj";
        //创建北京口味的各种Pizza
        if ("bj".equals(loc)){
            new BJOrderPizza();
        }else{
            //创建伦敦口味的各种Pizza
            new LDOrderPizza();
        }
    }
}
