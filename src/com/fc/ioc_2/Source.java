package com.fc.ioc_2;

public class Source {
    public String fruit;   // 类型
    private String sugar;   // 糖分描述
    public  String size;    // 大小杯

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getFruit() {
        return fruit;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String  show(){
        return fruit+size+sugar;
    }

    /* setter and getter */
}
