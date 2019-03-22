package com.cnheima.dome01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        String str="2018年11月23日 23:23:45";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long date = sdf.parse(str).getTime();
        date-=1000L * 60 * 60 * 12;


        /*String dateTime = "2018年12月10日 12:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date time = sdf.parse(dateTime);
        long date=time.getTime();
        date -= 1000L * 60 * 60 * 12;
        time.setTime(date);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(time));*/
    }
}
