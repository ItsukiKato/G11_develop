import java.util.Scanner;

public class Data1Tester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("課題の数を入力せよ:");
        int number_of_task = stdIn.nextInt();

        Data1[] data = new Data1[number_of_task];

        for (int i = 0; i < number_of_task; i++) {
            data[i] = new Data1("null", 0, 0, 0);
        }

        for (int i = 0; i < number_of_task; i++) {
            System.out.print(i + 1 + "番目の課題名:");
            String name = stdIn.next();

            System.out.print(i + 1 + "番目の締切日の年:");
            int end_year = stdIn.nextInt();

            System.out.print(i + 1 + "番目の締切日の月:");
            int end_month = stdIn.nextInt();

            System.out.print(i + 1 + "番目の締切日の日にち:");
            int end_day = stdIn.nextInt();

            data[i] = new Data1(name, end_day, end_month, end_year);

        }

        for (int i = 0; i < number_of_task; i++) {
            System.out.println(i + 1 + "番目の課題:" + data[i].getName() + "締切日:" + data[i].getEndYear() + "年"
                    + data[i].getEndMonth() + "月" + data[i].getEndDay() + "日");
        }

    }
}
