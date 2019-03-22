package com.day02.dome02;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        Test01<Integer> l = new Test01<>();
        l.in(2);
        l.in(3);
        l.in(4);
        l.in(5);
        Integer im = l.im();
        Integer im1 = l.im();
        Integer im2 = l.im();
        Integer im3 = l.im();
        System.out.println(im);
        System.out.println(im1);
        System.out.println(im2);
        System.out.println(im3);
    }
}
