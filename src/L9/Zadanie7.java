package L9;
import java.util.ArrayList;
// В кругу стоят N человек, пронумерованных от 1 до N.
// При ведении счета по кругу вычеркивается каждый второй человек, пока не останется один.
// Составить две программы, моделирующие процесс.
// Одна из программ должна использовать класс ArrayList, а вторая — LinkedList.
// Какая из двух программ работает быстрее?

public class Zadanie7 {
    public static void main(String[] args) {
        int N = 10; // Количество человек в круге
        ArrayList<Integer> circle = new ArrayList<>();

        // Заполняем круг людьми
        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        long startTime = System.nanoTime(); // Начальное время

        int currentIndex = 0;
        while (circle.size() > 1) {
            currentIndex = (currentIndex + 1) % circle.size();
            circle.remove(currentIndex);
        }

        long endTime = System.nanoTime(); // Конечное время
        double duration = (endTime - startTime) / 1_000_000.0; // время работы программы в миллисекундах

        System.out.println("Номер последнего оставшегося человека: " + circle.get(0));
        System.out.println("Время работы программы: " + duration + " мс");
    }
}
