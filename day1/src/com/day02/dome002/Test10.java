package com.day02.dome002;

import java.util.ArrayList;
import java.util.Random;

/*十、产生10个1-100的随机数，并放到一个数组中，
把数组中大于等于10的数字放到一个list集合中，并打印到控制台*/
public class Test10 {
    public static void main(String[] args) {
        int[] array = getArray();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10) {
                list.add(array[i]);
            }
        }
        for (Integer in : list) {
            System.out.print(in + " ");
        }
    }

    private static int[] getArray() {
        Random ran = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100) + 1;
        }
        return arr;
    }
}
