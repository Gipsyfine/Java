package com.gipsyfine.example;

public class Example28 {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 6, 3, 9, 8 }; // 定义一个数组
        int max = getMax(arr); // 调用方法，获取数组中的最大值
        System.out.println("max=" + max); // 打印最大值
    }
    static int getMax(int[] arr) { // 定义一个方法，用于获取数组中的最大值
        int max = arr[0]; // 假设数组中的第一个元素是最大值
        for (int i = 1; i < arr.length; i++) { // 从第二个元素开始遍历数组
            if (arr[i] > max) { // 如果当前元素大于max
                max = arr[i]; // 将当前元素赋值给max
            }
        }
        return max; // 返回最大值
    }
}
