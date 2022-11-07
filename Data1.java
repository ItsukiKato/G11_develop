public class Data1 {
    private String name;
    private String end_date;

    // コンストラクタ
    Data1(String name, String end_date) {
        this.name = name;
        this.end_date = end_date;
    }

    // ゲッター
    String getName() {
        return name;
    }

    String getEndDate() {
        return end_date;
    }

    // セッター
    void setName(String name) {
        this.name = name;
    }

    void setEndDate(String end_date) {
        this.end_date = end_date;
    }

}
