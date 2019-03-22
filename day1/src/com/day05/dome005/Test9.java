package com.day05.dome005;

/**
 * @author 冯朋举
 * @date 2018/12/16 17:55
 */
public class Test9 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread("奇数");
        MyThread1 myThread1=new MyThread1("偶数");
        myThread.start();
        myThread1.start();
    }
}
