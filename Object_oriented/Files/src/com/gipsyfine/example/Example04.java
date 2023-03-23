package com.gipsyfine.example;

class Student04 {
    private String name;                        // 声明姓名属性 // 实例化默认为null
    private int age;                            // 声明年龄属性 // 实例化默认为0

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("您输入的年龄有误！");
        } else {
            this.age = age;
        }
    }

    public void read() {
        System.out.println("大家好，我是" + name + "，年龄" + age);
    }
}

public class Example04 {
    public static void main(String[] args) {
        Student04 stu = new Student04();        // 创建学生对象
        stu.setName("张三");                    // 为对象的name属性赋值
        stu.setAge(-18);                    // 为对象的age属性赋值
        stu.read();                                // 调用对象的方法
    }
}
