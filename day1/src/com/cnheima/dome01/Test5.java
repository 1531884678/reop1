package com.cnheima.dome01;

public class Test5 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            String str = new StringBuilder(i + "").reverse().toString();
            String str1 = i + "";
            if (str.equals(str1)) {
                System.out.println(i);
            }
        }
        long l1 = System.currentTimeMillis();
        System.out.println((l1-l));
    }
}
