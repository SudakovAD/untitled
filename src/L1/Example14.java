package L1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int b,a, d, c;
        System.out.println("Введите число:");
        a = num.nextInt();
        d = a - 1;
        c = a + 1;

        System.out.println("Результат = " + "1" + " " + d + " " + a + " " +c );
    }
}