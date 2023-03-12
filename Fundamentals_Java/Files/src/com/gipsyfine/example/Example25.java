package com.gipsyfine.example;

public class Example25 {
	public static void main(String[] args) {
		int[] arr = new int[4];                     // 定义一个长度为4的数组
		System.out.println("arr[0]=" + arr[4]); // 通过索引4访问数组元素
	}
}

// 错误信息：ArrayIndexOutOfBoundsException
// 表示数组越界异常，即访问数组中不存在的元素
// 出现这个错误的原因是数组的长度为4，索引范围为0~3，而使用索引 4 访问数组元素时超出了数组的索引范围。