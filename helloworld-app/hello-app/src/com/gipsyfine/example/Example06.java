package com.gipsyfine.example;

public class Example06 {
    public static void main(String[] args) {

        // 深入了解 & 和 && 的区别
        int x = 0;
        int y = 0;
        int z = 0;
        boolean a, b;
        a = x > 0 & y++ > 1;
        System.out.println(a);
        System.out.println("y=" + y);
        b = x > 0 && z++ > 1;
        System.out.println(b);
        System.out.println("z=" + z);
    }
}
