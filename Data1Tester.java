import java.util.Scanner;
import java.util.*;

public class Data1Tester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 本日の日付を出力,コメントアウトした部分は必要なし
        /*
         * String months[] = { "1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月",
         * "10月", "11月", "12月" };
         * int year;
         * GregorianCalendar gcalendar = new GregorianCalendar();
         * 
         * System.out.print("日付： ");
         * System.out.print(year = gcalendar.get(Calendar.YEAR));
         * System.out.print("年 ");
         * System.out.print(months[gcalendar.get(Calendar.MONTH)]);
         * System.out.println(" " + gcalendar.get(Calendar.DATE) + "日");
         * 
         * int current_year_int = year;
         * int current_month_int = gcalendar.get(Calendar.MONTH);
         * int current_date_int = gcalendar.get(Calendar.DATE);
         * 
         * int current_day1 = (current_month_int * 30) + current_date_int;
         */

        GregorianCalendar gcalendar = new GregorianCalendar();
        int current_day2 = gcalendar.get(Calendar.DAY_OF_YEAR);

        // 確認
        // System.out.println("month" + current_month_int);
        // System.out.println("current_date:" + current_day1);
        // System.out.println("current_date:" + current_day2);

        // 課題の数を入力する
        System.out.print("課題の数を入力せよ:");
        int number_of_task = stdIn.nextInt();

        // Data型の配列を用意
        Data1[] data = new Data1[number_of_task];

        // 配列の初期化
        for (int i = 0; i < number_of_task; i++) {
            data[i] = new Data1("null", 0, 0, 0, 0);
        }

        // ユーザー入力
        for (int i = 0; i < number_of_task; i++) {
            System.out.print(i + 1 + "番目の課題名:");
            String name = stdIn.next();

            System.out.print(i + 1 + "番目の締切日の年:");
            int end_year = stdIn.nextInt();

            System.out.print(i + 1 + "番目の締切日の月:");
            int end_month = stdIn.nextInt();

            System.out.print(i + 1 + "番目の締切日の日にち:");
            int end_day = stdIn.nextInt();

            int weight = 0;

            weight = Weighting.weighting(name, end_day, end_month, end_year, current_day2);

            data[i] = new Data1(name, end_day, end_month, end_year, weight);

        }

        // 出力
        for (int i = 0; i < number_of_task; i++) {
            System.out.println(i + 1 + "番目の課題:" + data[i].getName() + "締切日:" + data[i].getEndYear() + "年"
                    + data[i].getEndMonth() + "月" + data[i].getEndDay() + "日");

            // 重みの確認
            System.out.println(i + 1 + "番目の課題の重み = " + data[i].getWeight());
        }

    }
}
