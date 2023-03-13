package com.gipsyfine.example;

public class Example26 {
	public static void main(String[] args) {
		int[] arr = new int[3];                       // 定义一个长度为3的数组
		arr[0] = 5;	                                     // 为数组的第一个元素赋值
		System.out.println("arr[0]=" + arr[0]);	// 访问数组的元素
		arr = null;		                                 // 将变量arr置为null
		System.out.println("arr[0]=" + arr[0]); 	// 访问数组的元素
	}
}

// 错误信息：NullPointerException
// 表示空指针异常，即访问了一个不存在的对象
// 出现这个错误的原因是将变量arr置为null，而后又访问了变量arr所引用的对象，因此会出现空指针异常。

