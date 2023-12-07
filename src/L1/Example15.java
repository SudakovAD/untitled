package L1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int b ,a, d, c;
        System.out.println("Введите 1 число:");
        a = num.nextInt();
        System.out.println("Введите 1 число:");
        b = num.nextInt();

        d = a + b;
        c = a - b;

        System.out.println("Результат суммы = " + d );
        System.out.println("Результат разности = " +c );
    }
}