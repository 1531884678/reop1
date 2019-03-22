package com.day05.dome05;

/**
 * @author 冯朋举
 * @date 2018/12/16 14:47
 */
public class Test2 {
    public static void main(String[] args) {
        int[] rr={1,2,3,4,5};
        men(rr);
    }

    private static void men(int[] x) {
        try {
            System.out.println(x[5]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
