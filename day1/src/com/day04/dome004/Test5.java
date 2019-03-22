package com.day04.dome004;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*五、请使用Map集合存储自定义数据类型Car做键，对应的价格做值。
并使用keySet和entrySet两种方式遍历Map集合。*/
public class Test5 {
    public static void main(String[] args) {
        Map<Car,Integer> map=new HashMap<>();
        map.put(new Car("苹果"),10);
        map.put(new Car("香蕉"),11);
        map.put(new Car("橘子"),22);
        map.put(new Car("橙子"),13);
        map.put(new Car("西瓜"),15);
        //keySet
        Set<Car> cars = map.keySet();
        //获取迭代器
        Iterator<Car> it = cars.iterator();
        while (it.hasNext()){
            Car car = it.next();
            Integer va = map.get(car);
            System.out.println(car+"---->"+va);
        }
        System.out.println("------------------------------");
        //entrySet
        Set<Map.Entry<Car, Integer>> entries = map.entrySet();
        //获取迭代器
        Iterator<Map.Entry<Car, Integer>> ir = entries.iterator();
        while (ir.hasNext()){
            Map.Entry<Car, Integer> next = ir.next();
            Car key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+"---->"+value);
        }
    }
}
