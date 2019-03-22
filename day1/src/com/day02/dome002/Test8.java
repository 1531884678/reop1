package com.day02.dome002;

import java.util.ArrayList;

/*八、定义一个方法listTest(ArrayList<Integer> al, Integer s)，
要求返回s在al里面第一次出现的索引，如果s没出现过返回-1*/
public class Test8 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(listTest(al, 3));
    }

    public static int listTest(ArrayList<Integer> al, int s) {
        int a =al.indexOf(s);

        return a;
    }
}
