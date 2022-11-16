package com.example.demo;

import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class Data1Tester {
	
	
	
    public static void allfunction(String number_of_task1, String name1, String end_year1, String end_month1, String end_day1) {
        Scanner stdIn = new Scanner(System.in);


        GregorianCalendar gcalendar = new GregorianCalendar();

        int current_day2 = gcalendar.get(Calendar.DAY_OF_YEAR);

        // 課題の数を入力する
       // System.out.print("課題の数を入力せよ:");
        int number_of_task = Integer.parseInt(number_of_task1);

        // Data型の配列を用意
        Data1[] data = new Data1[number_of_task];

        // 配列の初期化
        
        /*
        for (int i = 0; i < number_of_task; i++) {
            data[i] = new Data1("null", 0, 0, 0, 0);
        }
        */
        data[0] = new Data1("null", 0, 0, 0, 0);
        

        // ユーザー入力
            //System.out.print(i + 1 + "番目の課題名:");
            String name = name1;

            //System.out.print(i + 1 + "番目の締切日の年:");
            int end_year = Integer.parseInt(end_year1);

            //System.out.print(i + 1 + "番目の締切日の月:");
            int end_month = Integer.parseInt(end_month1);

            //System.out.print(i + 1 + "番目の締切日の日にち:");
            int end_day = Integer.parseInt(end_day1);

            int weight = 0;

            weight = Weighting.weighting(name, end_day, end_month, end_year, current_day2);

            data[0] = new Data1(name, end_day, end_month, end_year, weight);
            
            Map<String,Integer> out = new HashMap<String,Integer>();
            		
            		out.put(name,weight);
            		
            
            
    }
}
