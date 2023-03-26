package com.gipsyfine.example;

class Student01 {
    String name;                            // 声明姓名属性

    void read() {
        System.out.println("大家好，我是" + name);
    }
}

class Example01 {
    public static void main(String[] args) {
        Student01 stu1 = new Student01();        // 创建第一个Student对象
        Student01 stu2 = new Student01();        // 创建第二个Student对象
        stu1.name = "小明";                    // 为stu1对象的name属性赋值
        stu1.read();                            // 调用对象的方法
        stu2.name = "小华";
        stu2.read();
    }
}

//test
