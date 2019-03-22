package com.day04.dome04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //录入字符串
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        //创建集合储存记录个数
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < next.length(); i++) {
            //获取每个索引的值
            char c = next.charAt(i);
            //判断字母是否存在
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
