package com.day04.dome004;

import java.util.*;

/*八、定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）出现的次数。
例如：集合中有”abc”、”bcd”两个元素，
程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”*/
public class Test8 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        //获取迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            //获取key
            String next = it.next();
            //fori循环key
            for (int i = 0; i < next.length(); i++) {
                //用charAt得到单个字符
                char c = next.charAt(i);
                //判断map集合是否含有字符
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
        System.out.println(map);
    }
}
