package com.day05.dome005;

/**
 * @author 冯朋举
 * @date 2018/12/16 18:50
 */
public class Test11 {
    public static void main(String[] args) {
        MyThread2 myThread2=new MyThread2("a");
        MyThread3 myThread3=new MyThread3("b");
        MyThread4 myThread4=new MyThread4("c");
        myThread2.start();
        myThread3.start();
        myThread4.start();
    }
}
