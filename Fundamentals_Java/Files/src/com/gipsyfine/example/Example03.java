package com.gipsyfine.example;

public class Example03 {
    public static void main(String[] args) {
        byte b1 = 3;          // 定义一个 byte 类型的变量
        byte b2 = 4;
        // byte b3 = b1 + b2; // 编译错误，因为 b1 + b2 的值是 int 类型
        byte b3 = (byte) (b1 + b2); // 正确，因为 (b1 + b2) 的值是 int 类型
        System.out.println("b3=" + b3);
    }
}
