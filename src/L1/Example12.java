package L1;
import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, d;
        System.out.println("Введите ваш возраст:");
        a = num.nextInt();
        d = a - 2023;


        System.out.println("Ваш год рождения: " + d );
    }

}
