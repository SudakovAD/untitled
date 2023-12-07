package L1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        String d = in.nextLine();

        System.out.println("Введите месяц: ");
        String a = in.nextLine();

        System.out.println("Введите номер дня: ");
        String b = in.nextLine();



        System.out.println( d + ":" +  b  + ":" + a);

        in.close();
    }
}
