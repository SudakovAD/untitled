package DOM;

import java.util.Scanner;

public class L5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год рождения");
        int x = in.nextInt();
        int v = 2024;

        int b = v-x;
        System.out.println("Вам " + b );


    }
}
