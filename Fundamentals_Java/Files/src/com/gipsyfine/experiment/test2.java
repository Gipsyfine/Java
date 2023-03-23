package com.gipsyfine.experiment;

public class test2 {
    public static void main(String[] args) {
        int i, j, k, sum = 0;
        for (i = 1; i <= 10; i++) {
            k = 1;
            for (j = 1; j <= i; j++) {
                k = k * j;
            }
            sum = sum + k;
        }
        System.out.println("1！+2！+3！+……+10！= " + sum);
    }
}
