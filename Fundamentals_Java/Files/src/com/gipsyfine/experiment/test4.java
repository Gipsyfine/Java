package com.gipsyfine.experiment;

import java.util.Scanner;
public class test4 {public static void main(String[] args)
{
    int year;
    System.out.println("请输入年份");
    Scanner input = new Scanner(System.in);
    year = input.nextInt();
    getInfo(year);
}
    public static void getInfo(int year) {
        char[] god={'甲', '乙','丙', '丁', '戊', '己', '庚', '辛', '壬', '癸'};
        char[] land={'子', '丑', '寅', '卯', '辰', '巳', '午', '未', '申', '酉', '戌', '亥'};
        char[] shengxiao={'鼠', '牛', '虎', '兔', '龙', '蛇', '马', '羊', '猴', '鸡', '狗', '猪'};
        int g=(year-3)%10;
        int l=(year-3)%12;
        int s=(year-3)%12;
        System.out.println(year+"年是"+god[g-1]+land[l-1]+"年"+"生肖是"+shengxiao[s-1]);
    }
}
