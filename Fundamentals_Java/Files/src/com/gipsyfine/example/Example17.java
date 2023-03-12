package com.gipsyfine.example;

public class Example17 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 9; i++) { // 外层循环
            for (j = 1; j <= i; j++) {
                if (i > 4) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
