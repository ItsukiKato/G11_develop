import java.util.Scanner;

public class Data1Tester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("課題の数を入力せよ:");
        int number_of_task = stdIn.nextInt();

        Data1[] data = new Data1[number_of_task];

        for (int i = 0; i < number_of_task; i++) {
            data[i] = new Data1("null", "null");
        }

        for (int i = 0; i < number_of_task; i++) {
            System.out.print(i + 1 + "番目の課題名:");
            String name = stdIn.next();

            System.out.print(i + 1 + "番目の締切日:");
            String end_date = stdIn.next();

            data[i] = new Data1(name, end_date);
        }

        for (int i = 0; i < number_of_task; i++) {
            System.out.println(i + 1 + "番目の課題:" + data[i].getName() + "締切日:" + data[i].getEndDate());
        }

    }
}
