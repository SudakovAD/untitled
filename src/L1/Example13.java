package L1;
import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, d, c;
        System.out.println("Введите число:");
        a = num.nextInt();
        System.out.println("Введите число:");
        d = num.nextInt();
        c = a + d;
        System.out.println("Результат = " + c);
    }

}