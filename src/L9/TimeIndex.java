// Сравнение времени выполнения операции получения элемента по индексу
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Random;
public class TimeIndex {
    public static void main(String[] args) {
        int n = 10000000; // Количество элементов

        // Создаем коллекции для хранения элементов
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Заполняем коллекции случайными значениями
        Random random = new Random();
        for (long i = 0; i < n; i++) {
            int value = random.nextInt();
            hashSet.add(value);
            linkedHashMap.put((int) i, value);
            arrayList.add(value);
        }

        // Измеряем время выполнения операции получения элемента по индексу для HashSet
        long startTimeHashSet = System.nanoTime();
        int index = (int) (n / 2);
        for (int i = 0; i < 10; i++) { // Повторяем операцию несколько раз для усреднения результатов
            hashSet.contains(index);
        }
        long endTimeHashSet = System.nanoTime();
        double durationHashSet = (endTimeHashSet - startTimeHashSet) / 1000.0; // Перевод времени в микросекунды
        System.out.println("Получение элемента по индексу: HashSet" + durationHashSet + " мс");

        // Измеряем время выполнения операции получения элемента по индексу для LinkedHashMap
        long startTimeLinkedHashMap = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            linkedHashMap.get(index);
        }
        long endTimeLinkedHashMap = System.nanoTime();
        double durationLinkedHashMap = (endTimeLinkedHashMap - startTimeLinkedHashMap) / 1000.0; // Перевод времени в микросекунды
        System.out.println("Получение элемента по индексу LinkedHashMap: " + durationLinkedHashMap + " мс");

        // Измеряем время выполнения операции получения элемента по индексу для ArrayList
        long startTimeArrayList = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            arrayList.get(index);
        }
        long endTimeArrayList = System.nanoTime();
        double durationArrayList = (endTimeArrayList - startTimeArrayList) / 1000.0; // Перевод времени в микросекунды
        System.out.println("Получение элемента по индексу ArrayList: " + durationArrayList + " мс");
    }

}
