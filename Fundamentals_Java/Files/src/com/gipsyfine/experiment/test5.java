package com.gipsyfine.experiment;

public class test5 {
    public static void main(String[] args)
{

    calcFee(5);
    calcFee(60);
    calcFee(61);
    calcFee(119);
}
    //基本通话费是 每分钟 2角钱，不足1分钟的部分  按照1分钟计算；长途通话费  每6秒7分钱，不足6秒的部分 按6秒计算
    public static void calcFee(int iSeconds) {
        int minutes = iSeconds/60;
        int second = iSeconds/6;
        if(iSeconds%60>0)
        {
            minutes++;
        }
        //不足一分钟
        if(iSeconds%6>0)
        {
            second++;
        }
        //每六秒
        int min = minutes * 20;
        int max = second * 7;
        int sum = min + max;
        System.out.println("通话时间"+iSeconds+"秒的话费是："+sum+"分钱");
    }
}
