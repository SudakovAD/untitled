package L9;
import java.util.LinkedList;

public class Zadanie7_2 {
    public static void main(String[] args) {
        int N = 10;
        LinkedList<Integer> circle = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        long startTime = System.nanoTime(); // Начальное время

        int currentIndex = 0;
        while (circle.size() > 1) {
            currentIndex = (currentIndex + 1) % circle.size();
            circle.remove(currentIndex);
        }

        long endTime = System.nanoTime(); // конечное время
        double duration = (endTime - startTime) / 1_000_000.0; // Время работы программы в миллисекундах

        System.out.println("Номер последнего оставшегося человека: " + circle.get(0));
        System.out.println("Время работы программы: " + duration + " мс");
    }
}
