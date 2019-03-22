package com.day02.dome02;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> box = new ArrayList<>();
        box.add("大王");
        box.add("小王");
        String[] arr1 = {"♥", "♦", "♠", "♣"};
        String[] arr2 = {"K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2", "A"};
        for (String s : arr1) {
            for (String s1 : arr2) {
                box.add(s + s1);
            }
        }
        Collections.shuffle(box);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < box.size(); i++) {
            if (i >= box.size() - 3) {
                dipai.add(box.get(i));
            } else {
                if (i % 3 == 0) {
                    list1.add(box.get(i));
                } else if (i % 3 == 1) {
                    list2.add(box.get(i));
                } else if (i % 3 == 2) {
                    list3.add(box.get(i));
                }
            }
        }
        System.out.println("玩家1：" + list1);
        System.out.println("玩家2：" + list2);
        System.out.println("玩家3：" + list3);
        System.out.println("底牌：" + dipai);
    }
}
