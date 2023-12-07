package L1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        String d = in.nextLine();

        System.out.println("Введите количество дней в этом месяце :" );
        String a = in.nextLine();

        System.out.println( d + " " + "содержит"+ " " + a + " " + "дней.");
        in.close();
    }
}
