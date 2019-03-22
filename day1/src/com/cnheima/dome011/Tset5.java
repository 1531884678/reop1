package com.cnheima.dome011;
/*分别使用String的+=和StringBuilder的append方法对字符串做100000次拼接，
计算String拼接100000次花费时间与StringBuilder拼接100000次所花费时间并打印*/
public class Tset5 {
    public static void main(String[] args) {
        long str = str();
        long string = string();
        System.out.println("String拼接所花费时间:"+str);
        System.out.println("StringBuilder拼接所花费时间:"+string);
    }

    private static long str() {
        long l = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str+="我爱黑马";
        }
        long l1 = System.currentTimeMillis();
        return (l1-l);
    }
    private static long string() {
        long l = System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("我爱黑马1");
        }
        long l1 = System.currentTimeMillis();
        return (l1-l);
    }
}
