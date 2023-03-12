package com.gipsyfine.example;

public class Example09 {
    public static void main(String[] args) {
        int grade = 75; // 定义学生成绩
        if (grade > 80)
        {
            // 如果成绩大于80分，则输出优秀
            System.out.println("该成绩的等级为优");
        }
        else if (grade > 70)
        {
            System.out.println("该成绩的等级为良");
        }
        else if (grade > 60)
        {
            System.out.println("该成绩的等级为中");
        }
        else
        {
            System.out.println("该成绩的等级为差");
        }

        // 三元运算符
        // 语法：(条件表达式) ? 表达式1 : 表达式2
        // 如果条件表达式为true，则返回表达式1的值，否则返回表达式2的值
        int x = 0;
        int y = 1;
        int max;
        max = x > y ? x : y;
        System.out.println("max = " + max);

    }
}
