package com.gipsyfine.example;

public class Example05 {
    public static void main(String[] args) {
        short s = 3;
        int i = 5;
        s += i; // 虽然变量s和i相加的运算结果为int类型，但通过运算符+=将结果赋值给short类型的变量s，
                // java虚拟机会自动将int类型的运算结果转换为short类型，从而得到s的值为8
        System.out.println("s=" + s);
    }
}
