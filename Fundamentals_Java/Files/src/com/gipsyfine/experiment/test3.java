package com.gipsyfine.experiment;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        System.out.println("输入成绩：");
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        if (i > 100 ||  i < -1) {
            System.out.println("成绩无效");
        } else if ((90 <= i) & (i <= 100)) {
            System.out.println("A");
        } else if ((80 <= i) & (i < 90)) {
            System.out.println("B");
        } else if ((70 <= i) & (i < 80)) {
            System.out.println("C");
        } else if ((60 <= i) & (i < 70)) {
            System.out.println("D");
        } else if ((0 <= i) & (i < 60)) {
            System.out.println("F");
        } else if (i == -1) {
            System.out.println("缓考");
        }
    }
}
