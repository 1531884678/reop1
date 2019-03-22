package com.day05.dome005;

/**
 * @author 冯朋举
 * @date 2018/12/16 18:41
 */
public class MyThread3 extends Thread {
    public MyThread3(String name) {
        super(name);
    }

    @Override
    public void run() {
        long l = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String b="黑马程序员";
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
