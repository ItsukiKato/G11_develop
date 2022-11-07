import java.util.*;

public class Weighting {
    private String name;
    private int end_day;
    private int end_month;
    private int end_year;

    // 重みつけメソッド
    public static int weighting(String name, int end_day, int end_month, int end_year, int current_day) {

        // 引数の文字列を操作して一致するものがあったらその数値を返す。
        int a = 0;
        int b = 0;
        int y = 0;

        int end_date_int = (end_month - 1) * 30 + end_day;

        // 文字から、適当なワードが含んでいたらそれに対する重りを対応させる。

        if (name.contains("中間"))
            a = 30;

        else if (name.contains("小"))
            a = 10;

        else if (name.contains("期末"))
            a = 50;

        // 現在の日付と締切日の差をとって、差が長いほど重みを付け加える。

        int sub = end_date_int - current_day;

        if (sub >= 30)
            b = 50;

        else if (sub >= 10 && sub < 30)
            b = 30;

        else if (sub >= 0 && sub < 10)
            b = 10;

        return y = a + b;
    }

}
