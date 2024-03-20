package DOM;

import java.util.Scanner;

public class L6 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Введите ваше имя:");
         String x = in.nextLine();
         System.out.println("Введите ваш год рождения:");
         int x1 = in.nextInt();
         int x2 = 2024;
         int v = x1 - x2;
         System.out.println(x + "вам");

    }
}
