package com.cnheima.dome01;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        c.set(year, 1, 28);
        c.add(Calendar.DAY_OF_MONTH, +1);
        int i = c.get(Calendar.MONTH);
        if (i == 1) {
            System.out.println("闰年");
        } else {
            System.out.println("平年");
        }
    }
}
