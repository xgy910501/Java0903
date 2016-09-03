package com.xue.test;

/**
 * Created by Administrator on 2016/9/3.
 * 变量
 */
public class BianLiang {
    static final double PI = 3.14;
    public static void main(String [] args){
//        int money = 1000;
//        boolean bool = true; 布尔类型只能声明true，false；
//        bool = false;
//        float flo = 12.3f;
        double score = 98.5;//声明变量赋值
        String name = "张三";
        char sex = '男';
        //打印输出
        System.out.println("成绩："+score);
        System.out.println("姓名："+name);
        System.out.println("性别："+sex);

        double a = 10;
        int b = (int) 10.0;
        System.out.println(Integer.MAX_VALUE+"\t"+Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE+"\t"+Double.MIN_VALUE);
        System.out.println(Float.MAX_VALUE+"\t"+Float.MIN_VALUE);

    }
}
