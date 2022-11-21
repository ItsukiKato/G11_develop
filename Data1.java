package com.example.demo;

public class Data1 {
    private String name;
    private int end_day;
    private int end_month;
    private int end_year;
    private int weight;

    // コンストラクタ
    Data1(String name, int end_day, int end_month, int end_year, int weight) {
        this.name = name;
        this.end_day = end_day;
        this.end_month = end_month;
        this.end_year = end_year;
        this.weight = weight;
    }

    // ゲッター
    String getName() {
        return name;
    }

    String getEndDay() {
        return Integer.valueOf(end_day).toString();
    }

    String getEndMonth() {
        return Integer.valueOf(end_month).toString();
    }

    String getEndYear() {
        return Integer.valueOf(end_year).toString();
    }

    int getWeight() {
        return weight;
    }

    // セッター
    void setName(String name) {
        this.name = name;
    }

    void setEndDay(int end_day) {
        this.end_day = end_day;
    }

    void setEndMonth(int end_month) {
        this.end_month = end_month;
    }

    void setEndYear(int end_year) {
        this.end_year = end_year;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }
}
