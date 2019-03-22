package com.day03.dome003;

import java.util.ArrayList;
import java.util.Random;

/*十二、双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
红色球号码从1—33中选择；
蓝色球号码从1—16中选择；
请随机生成一注双色球号码。（要求同色号码不重复）*/
public class Test12 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < 6; i++) {
            int i1 = ran.nextInt(33) + 1;
            if (!list.contains(i1)) {
                list.add(i1);
            }
        }
        list.add(ran.nextInt(16) + 1);
        System.out.println(list);
    }
}
