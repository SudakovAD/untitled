package DOM;

import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели:");
        String x = in.nextLine();
        System.out.println("Введите месяц");
        String x1 = in.nextLine();
        System.out.println("Введите число месяца");
        int x2 = in.nextInt();
        System.out.println("День недели - " + x);
        System.out.println("Число - " + x2);
        System.out.println("Месяц - " + x1);

    }
}
