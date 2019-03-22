package com.day05.dome005;

/**
 * @author 冯朋举
 * @date 2018/12/16 18:42
 */
public class MyThread4 extends Thread {
    public MyThread4(String name) {
        super(name);
    }

    @Override
    public void run() {
        Integer a = 0;
        String b = "";
        long l = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            a = i;
            b = "黑马程序员";
           String c=b+a;
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
