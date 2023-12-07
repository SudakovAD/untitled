package L1;

import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Фамилия: ");
        String name = in.nextLine();
        System.out.println("Имя: ");
        String age = in.nextLine();
        System.out.println("Отчество: ");
        String height = in.nextLine();

        System.out.println("Привет");
        System.out.println(name + "" +  age + "" +  height);

        in.close();
    }
}
