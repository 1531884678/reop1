package com.day04.dome04;

import java.util.*;

public class Test {
    public static void main(String[] args) {
       /* HashMap<Integer, String> hashMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        List<String> colors = List.of("♥", "♣", "♦", "♠");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        int count = 0;
        hashMap.put(count, "大王");
        list.add(count);
        count++;
        hashMap.put(count, "小王");
        list.add(count);
        count++;

        for (String number : numbers) {
            for (String color : colors) {
                String str = color + number;
                list.add(count);
                hashMap.put(count++, str);
            }
        }
        Collections.shuffle(list);
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i >= 51) {
                dipai.add(list.get(i));
            } else {
                if (i % 3 == 0) {
                    player01.add(list.get(i));
                } else if (i % 3 == 1) {
                    player02.add(list.get(i));
                } else if (i % 3 == 2) {
                    player03.add(list.get(i));
                }
            }
        }
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(dipai);
        getNum("张三：", hashMap, player01);
        getNum("李氏：", hashMap, player02);
        getNum("王五：", hashMap, player03);
        getNum("底牌：", hashMap, dipai);*/
    }

    public static void getNum(String name, HashMap<Integer, String> hashMap, ArrayList<Integer> list) {
        System.out.print(name + " ");
        for (Integer it : list) {
            String value = hashMap.get(it);
            System.out.print(value);
        }
        System.out.println();
    }
}
