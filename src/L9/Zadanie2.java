package L9;
import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число в десятичной системе: ");
        int decimal = scanner.nextInt();
        scanner.close();

        String binary = decimalToBinary(decimal);

        System.out.println(decimal + " в двоичной системе: " + binary);
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        } else {
            return decimalToBinary(decimal / 2) + decimal % 2;
        }
    }
}

