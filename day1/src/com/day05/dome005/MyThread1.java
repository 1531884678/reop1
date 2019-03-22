package com.day05.dome005;

/**
 * @author 冯朋举
 * @date 2018/12/16 17:57
 */
public class MyThread1 extends Thread {
    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.println(getName() + ":" + sum);
            }

        }
    }
}