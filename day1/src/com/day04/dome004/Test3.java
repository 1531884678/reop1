package com.day04.dome004;

import java.util.HashMap;
import java.util.Map;

/*三、请使用Map集合的方法完成添加元素，根据键删除，以及根据键获取值操作。*/
public class Test3 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        //添加
        map.put(1, 11);
        map.put(2, 22);
        map.put(3, 33);
        System.out.println(map);
        //修改
        Integer put = map.put(1, 44);
        System.out.println(put);
        //删除
        Integer remove = map.remove(1);
        System.out.println(remove);
        //根据键获取值操作
        for (Integer it : map.keySet()) {
            Integer v = map.get(it);
            System.out.println(it + "::" + v);
        }
    }
}
