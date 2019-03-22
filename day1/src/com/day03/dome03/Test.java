package com.day03.dome03;

import java.util.HashSet;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> ha=new HashSet<>();
        Random ran=new Random();
        while (ha.size()!=10){
            int i = ran.nextInt(10)+1;
            ha.add(i);
        }
        System.out.println(ha);
    }
}
