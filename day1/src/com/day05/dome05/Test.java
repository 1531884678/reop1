package com.day05.dome05;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Random ran = new Random();
        int count = 0;
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while (count < 6) {
            int a = ran.nextInt(3) + 7;
            int b = ran.nextInt(3) + 7;
            int c = ran.nextInt(3) + 7;
            if (!list.contains("" + a + b + c))
                if (a != b && a != c && b != c) {
                    list.add("" + a + b + c);
                    count++;
                }
        }
        System.out.println(list);
        Collections.sort(list);
        for (String s : list) {
            sb.append(s + " ");
        }
        System.out.println(sb);
    }
}
