package com.day03.dome003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*七、向list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫*/
public class Test7 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"张三","李氏","王五","二丫","钱六","孙七");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)=="二丫"){
                list.set(i,"王小丫");
            }
        }
        System.out.println(list);
    }
}
