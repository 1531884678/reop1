package com.cnheima.dome01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入出生年月日：");
        String next = sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        long parse = sdf.parse(next).getTime();
        long date = new Date().getTime();
        System.out.println((date-parse)/(1000L*60*60*24));
    }
}
