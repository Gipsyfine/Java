package com.gipsyfine.cases.case01;

public class Book {
    private int id;    // 编号
    private String name;  // 书名
    private double price;  // 价格
    private int storage;   // 库存

    // 有参构造
    public Book(int id, String name, double price, int storage) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.storage = storage;
    }

    // 获取书号
    public int getId() {
        return id;
    }

    // 获取书名
    public String getName() {
        return name;
    }

    // 获取价格
    public double getPrice() {
        return price;
    }

    // 获取库存
    public int getStorage() {
        return storage;
    }
}