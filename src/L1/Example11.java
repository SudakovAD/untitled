package L1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {



       System.out.println("Введите ваше имя: ");
        String L = new Scanner(System.in).nextLine();

        System.out.print("Введите год рождения:");
            int year = new Scanner(System.in).nextInt();

            System.out.print("Введите месяц рождения:");
            int month = new Scanner(System.in).nextInt();

            System.out.print("Введите день рождения:");
            int day = new Scanner(System.in).nextInt();

            LocalDate current = LocalDate.now();
            LocalDate burn = LocalDate.of(year, month, day );

            System.out.println("Текущая дата"+ current );

           System.out.println("Ваше имя:"+L );
            System.out.println("Ваш возраст:" + ChronoUnit.YEARS.between(burn,current)  );

            }
}
