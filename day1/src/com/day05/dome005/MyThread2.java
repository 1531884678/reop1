package com.day05.dome005;

/**
 * @author 冯朋举
 * @date 2018/12/16 18:39
 */
public class MyThread2 extends Thread {
    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        Integer a=0;
        long l = System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            a=i;
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
