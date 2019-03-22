package com.day04.dome04;

import java.util.ArrayList;
import java.util.Collections;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("大王");
        list.add("小王");
        String[] str1 = {"♥", "♣", "♦", "♠"};
        String[] str2 = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        for (String s : str2) {
            for (String s1 : str1) {
                list.add(s1 + s);
            }
        }
        ArrayList<Integer> in = new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            in.add(i);
        }
//        System.out.println(list);
        Collections.shuffle(in);
        ArrayList<Integer> par1 = new ArrayList<>();
        ArrayList<Integer> par2 = new ArrayList<>();
        ArrayList<Integer> par3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        for (int i = 0; i < in.size(); i++) {
            if (i >= 51) {
                dipai.add(in.get(i));
            } else {
                if (i % 3 == 0) {
                    par1.add(in.get(i));
                } else if (i % 3 == 1) {
                    par2.add(in.get(i));
                } else if (i % 3 == 2) {
                    par3.add(in.get(i));
                }
            }
        }
        Collections.sort(par1);
        Collections.sort(par2);
        Collections.sort(par3);
        Collections.sort(dipai);
        ArrayList<String> box1 = getList(par1, list);
        System.out.println("玩家1 "+box1);
        ArrayList<String> box2 = getList(par2, list);
        System.out.println("玩家2 "+box2);
        ArrayList<String> box3 = getList(par3, list);
        System.out.println("玩家3 "+box3);
        ArrayList<String> di = getList(dipai, list);
        System.out.println("底牌 "+di);
    }

    public static ArrayList<String> getList(ArrayList<Integer> in, ArrayList<String> list) {
        ArrayList<String> list1 = new ArrayList<>();
        for (Integer it : in) {
            String s = list.get(it);
            list1.add(s);
        }
        return list1;
    }
}
