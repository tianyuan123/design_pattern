package com.tianyuan.factory.absfactory.pizza;

public abstract class Pizza {
    protected String name; //披萨名称

    public abstract void prepare();

    public void bake(){
        System.out.println(name + "baking;");
    }

    public void cut(){
        System.out.println(name +"cutting;");
    }

    public void box(){
        System.out.println(name + "boxing;");
    }

    public void setName(String name){
        this.name = name;
    }
}
