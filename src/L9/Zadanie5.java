package L9;
//Построить однонаправленный список из предварительно созданных независимых элементов (узлов),
// у которых значением поля будет целое число, равное номеру элемента,
// и вывести значения полей на экран
public class Zadanie5 {
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static void main(String[] args) {
            int n = 5;
            Node head = buildList(n);
            printList(head);
        }

        static Node buildList(int n) {
            Node head = null;
            Node current = null;
            for (int i = 1; i <= n; i++) {
                Node newNode = new Node(i);
                if (head == null) {
                    head = newNode;
                } else {
                    current.next = newNode;
                }
                current = newNode;
            }
            return head;
        }

        static void printList(Node head) {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }

}
