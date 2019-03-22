package com.day04.dome004;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*四、往一个Map集合中添加若干元素。获取Map中的所有value，
并使用增强for和迭代器遍历输出每个value。
//tips: 参阅Map接口中values()方法
*/
public class Test04 {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,11);
        map.put(2,22);
        map.put(3,33);
        map.put(4,44);
        map.put(5,55);
        map.put(6,66);
        //使用values()将值存入Collection类型集合
        Collection<Integer> values = map.values();
        //获取迭代器
        Iterator<Integer> it = values.iterator();
        //遍历
        while (it.hasNext()){
            Integer next = it.next();
            System.out.println(next);
        }
        System.out.println("----------------------------------------------------");
        //增强for循环
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
