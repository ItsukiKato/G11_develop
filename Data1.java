package com.example.demo;

public class Data1 {
	private String task;
    public String name;
    public int end_day;
    public int end_month;
    public int end_year;
    private int weight;

    // コンストラクタ
    Data1(String task, String name, int end_day, int end_month, int end_year, int weight) {
    	this.task = task;
        this.name = name;
        this.end_day = end_day;
        this.end_month = end_month;
        this.end_year = end_year;
        this.weight = weight;
    }

    // ゲッター
    public String getTask() {
        return task;
    }
    
    public String getName() {
        return name;
    }

    public String getEndDay() {
        return Integer.valueOf(end_day).toString();
    }

    public String getEndMonth() {
        return Integer.valueOf(end_month).toString();
    }

    public String getEndYear() {
        return Integer.valueOf(end_year).toString();
    }
    
    public int getWeight() {
        return weight;
    }

    // セッター
    void setTask(String task) {
    	this.task = task;
    }
    
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
