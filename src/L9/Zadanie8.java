package L9;

import java.util.Scanner;

public class Zadanie8 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node head;

    // Метод для создания списка с вводом элементов с головы
    static void createHead() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов списка: ");
        int n = scanner.nextInt();
        System.out.println("Введите элементы списка:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    // Метод для создания списка с вводом элементов с хвоста
    static void createTail() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов списка: ");
        int n = scanner.nextInt();
        System.out.println("Введите элементы списка:");
        Node tail = new Node(-1); // Инициализация фиктивного узла для указателя хвоста
        Node temp = tail; // Указатель для добавления новых узлов
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            Node newNode = new Node(data);
            temp.next = newNode;
            temp = newNode;
        }
        head = tail.next; // Пропускаем фиктивный узел и устанавливаем голову списка на следующий узел
    }

    // Метод для вывода элементов списка в виде строки
    static String toString(Node node) {
        StringBuilder result = new StringBuilder();
        while (node != null) {
            result.append(node.data).append(" ");
            node = node.next;
        }
        return result.toString();
    }

    // Метод для добавления элемента в начало списка
    static void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Метод для добавления элемента в конец списка
    static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Метод для вставки элемента в список с указанным номером
    static void insert(int data, int position) {
        if (position == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Неверная позиция");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Неверная позиция");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Метод для удаления элемента с головы списка
    static void removeFirst() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        head = head.next;
    }

    // Метод для удаления последнего элемента списка
    static void removeLast() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Метод для удаления элемента из списка с указанным номером
    static void remove(int position) {
        if (position == 0) {
            removeFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Неверная позиция");
            return;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        createHead();
        System.out.println("Список после создания с вводом с головы: " + toString(head));

        createTail();
        System.out.println("Список после создания с вводом с хвоста: " + toString(head));

        addFirst(100);
        System.out.println("Список после добавления элемента в начало: " + toString(head));

        addLast(200);
        System.out.println("Список после добавления элемента в конец: " + toString(head));

        insert(150, 3);
        System.out.println("Список после вставки элемента по позиции: " + toString(head));

        removeFirst();
        System.out.println("Список после удаления первого элемента: " + toString(head));

        removeLast();
        System.out.println("Список после удаления последнего элемента: " + toString(head));

        remove(2);
        System.out.println("Список после удаления элемента по позиции: " + toString(head));
    }
}

