public class Data1 {
    private String name;
    private int end_day;
    private int end_month;
    private int end_year;

    // コンストラクタ
    Data1(String name, int end_day, int end_month, int end_year) {
        this.name = name;
        this.end_day = end_day;
        this.end_month = end_month;
        this.end_year = end_year
    }

    // ゲッター
    String getName() {
        return name;
    }

    int getEndDay() {
        return end_day;
    }

    int getEndMonth() {
        return end_month;
    }
    
    int getEndYear() {
        return end_year;
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
}
