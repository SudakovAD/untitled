package L9;

import java.util.Scanner;

public class Zadanie8_2 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;
    static Node tail;

    public static void main(String[] args) {
        createHeadRec();
        System.out.println("Список после создания с вводом с головы: " + toStringRec(head));
        createTailRec();
        System.out.println("Список после создания с вводом с хвоста: " + toStringRec(head));
    }

    // Метод для ввода с головы с использованием рекурсии
    static void createHeadRec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов списка: ");
        int n = scanner.nextInt();
        System.out.println("Введите элементы списка:");
        head = createHeadRecHelper(scanner, n);
    }

    static Node createHeadRecHelper(Scanner scanner, int n) {
        if (n <= 0) {
            return null;
        }
        int data = scanner.nextInt();
        Node newNode = new Node(data);
        newNode.next = createHeadRecHelper(scanner, n - 1);
        return newNode;
    }

    // Метод для ввода с хвоста с использованием рекурсии
    static void createTailRec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов списка: ");
        int n = scanner.nextInt();
        System.out.println("Введите элементы списка:");
        tail = null;
        head = createTailRecHelper(scanner, n);
    }

    static Node createTailRecHelper(Scanner scanner, int n) {
        if (n <= 0) {
            return tail;
        }
        int data = scanner.nextInt();
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        return createTailRecHelper(scanner, n - 1);
    }

    // Метод для вывода с использованием рекурсии
    static String toStringRec(Node node) {
        if (node == null) {
            return "";
        }
        if (node.next == null) {
            return String.valueOf(node.data);
        }
        return node.data + " -> " + toStringRec(node.next);
    }
}

