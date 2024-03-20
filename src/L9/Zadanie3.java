package L9;
import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        inputArray(array, 0, scanner);

        System.out.println("Введенный массив:");
        outputArray(array, 0);

        scanner.close();
    }

    // метод для ввода элементов массива
    public static void inputArray(int[] array, int index, Scanner scanner) {
        if (index < array.length) {
            array[index] = scanner.nextInt();
            inputArray(array, index + 1, scanner);
        }
    }

    // метод для вывода элементов массива
    public static void outputArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index] + " ");
            outputArray(array, index + 1);
        } else {
            System.out.println();
        }
    }
}

