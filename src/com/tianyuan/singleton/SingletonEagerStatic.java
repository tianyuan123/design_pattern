package com.tianyuan.singleton;

public class SingletonEagerStatic {
    public static void main(String[] args) {

    }
}

// 饿汉式（静态变量）
class Signleton {

    //1.构造器私有化，外部不能new
    private Signleton() {
    }

    //2.本类内部创建对象实例
    private final static Signleton instance = new Signleton();

    //3.提供一个公有的静态方法，返回实例对象
    public static Signleton getInstance() {
        return instance;
    }

}