package com.gipsyfine.cases.case01;

public class OrderItem {
    private Book book;
    private int num;

    // 有参构造方法
    public OrderItem(Book book, int num) {
        this.book = book;
        this.num = num;
    }

    // 获取图书对象
    public Book getBook() {
        return book;
    }

    // 获取订购图书数量
    public int getNum() {
        return num;
    }
}
