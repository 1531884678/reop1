package com.day04.dome04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("是德国", "啊师傅");
        map.put("确认其为", "范围");
        map.put("千万人", "而通过");
        map.put("认为特", "为各位");
        map.put("认为特", "sdg");
        //增
        System.out.println(map);
        String qian = map.remove("千万人");
        System.out.println(qian);
        String s = map.get("是德国");
        System.out.println(s);
        boolean b = map.containsKey("确认其为");
        System.out.println(b);
        System.out.println("-=-=-=-=-=-==-=-=-=-=-=-=-=");
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String v = map.get(key);
            System.out.println(key + "::" + v);
        }
        System.out.println("-=-=-=-=-=-==-=-=-=-=-=-=-=");
        for (String key : set) {
            String v = map.get(key);
            System.out.println(key + "::" + v);
        }
        System.out.println("-=-=-=-=-=-==-=-=-=-=-=-=-=");
        for (String key : map.keySet()) {
            String v = map.get(key);
            System.out.println(key + "::" + v);
        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, String> entry = iterator1.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "::" + value);
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "::" + value);
        }
    }
}
