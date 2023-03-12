package com.gipsyfine.example;

public class Example11 {
    public static void main(String[] args) {
        int week = 2;
//        switch (week) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                // 当 week 满足值 1、2、3、4、5中任意一个时，处理方式相同
//                System.out.println("今天是工作日");
//                break;
//            case 6:
//            case 7:
//                // 当 week 满足值 6、7中任意一个时，处理方式相同
//                System.out.println("今天是休息日");
//                break;
//            default:
//                System.out.println("输入的数字不正确");
//                break;
//        }

        // 增强版的switch语句
        switch (week) {
            case 1, 2, 3, 4, 5 -> System.out.println("今天是工作日");
            case 6, 7 -> System.out.println("今天是休息日");
            default -> System.out.println("输入的数字不正确");
        }
    }
}