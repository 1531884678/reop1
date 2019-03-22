package com.day05.dome005;

/**
 * @author 冯朋举
 * @date 2018/12/16 17:56
 */
public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i%2==1){
                sum+=i;
                System.out.println(getName() +":"+ sum);
            }

        }
    }
}
