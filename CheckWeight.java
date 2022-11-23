import java.util.Calendar;
import java.util.GregorianCalendar;

public class CheckWeight {

    public static void main(String[] args) {

        GregorianCalendar gcalendar = new GregorianCalendar();

        int current_day2 = gcalendar.get(Calendar.DAY_OF_YEAR);

        int weight1 = Weighting.weighting("期末レポート", 30, 11, 2022, current_day2, "課題");

        int weight2 = Weighting.weighting("中間レポート", 30, 11, 2022, current_day2, "課題");

        int weight3 = Weighting.weighting("モンハン3rd", 12, 1, 2023, current_day2, "その他");

        int weight4 = Weighting.weighting("友人とゴルフ", 8, 12, 2022, current_day2, "運動");

        System.out.println("WeightTester");
        System.out.println("weight1 = " + weight1);
        System.out.println("weight2 = " + weight2);
        System.out.println("weight3 = " + weight3);
        System.out.println("weight4 = " + weight4);

    }
}