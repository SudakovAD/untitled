package DOM;

import java.util.Scanner;

public class L4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите месяц:");
        String x = in.nextLine();
        System.out.println("Введите количество дней в месяце:");
        int x1 = in.nextInt();
        System.out.println("В месяце  " + x + "," + x1 + " дней");
    }
}
