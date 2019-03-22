package com.cnheima.dome011;

/*(1)定义数字字符串数组{"010","3223","666","7890987","123123"}；
	(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，
	第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出；
	(3)如：010 是对称的，3223 是对称的，123123 不是对称的；
	(4)最终打印该数组中对称字符串的个数。
注：判断对称可用reverse(),将此字符序列用其反转形式取代
*/
public class Test6 {
    public static void main(String[] args) {
        String[] chars = {"010", "3223", "666", "7890987", "123123"};
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            String str = new StringBuilder(chars[i]).reverse().toString();
            if (chars[i].equals(str)) {
                System.out.println(chars[i] + " 是对称的");
                count++;
            } else {
                System.out.println(chars[i] + " 不是对称的");
            }
        }
        System.out.println("该数组中对称字符串的个数:" + count);
    }
}
