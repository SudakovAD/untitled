import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class NanoSec {
    public static void main(String[] args) {
        int n = 10000000; // Количество элементов

        // Добавление элементов в HashSet
        long startTimeHashSet = System.nanoTime();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hashSet.add(i);
        }
        long endTimeHashSet = System.nanoTime();
        double durationHashSet = (endTimeHashSet - startTimeHashSet) / 1e6; // Перевод времени в миллисекунды
        System.out.println("Добавление элементов в HashSet: " + durationHashSet + " мс");

        // Измеряем время выполнения операции добавления элемента в середину HashSet
        long startTimeHashSetMid = System.nanoTime();
        hashSet.add(n / 2); // Добавляем элемент в середину
        long endTimeHashSetMid = System.nanoTime();
        double durationHashSetMid = (endTimeHashSetMid - startTimeHashSetMid) / 1e6;
        System.out.println("Добавление элемента в середину HashSet: " + durationHashSetMid + " мс");

        // Добавление элемента в конец HashSet
        long startTimeHashSetEnd = System.nanoTime();
        hashSet.add(n); // Добавляем элемент в конец
        long endTimeHashSetEnd = System.nanoTime();
        double durationHashSetEnd = (endTimeHashSetEnd - startTimeHashSetEnd) / 1e6;
        System.out.println("Добавление элемента в конец HashSet: " + durationHashSetEnd + " мс");

        // Добавление элементов в LinkedHashMap
        long startTimeLinkedHashMap = System.nanoTime();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            linkedHashMap.put(i, i);
        }
        long endTimeLinkedHashMap = System.nanoTime();
        double durationLinkedHashMap = (endTimeLinkedHashMap - startTimeLinkedHashMap) / 1e6; // Перевод времени в миллисекунды
        System.out.println("Добавление элементов в LinkedHashMap: " + durationLinkedHashMap + " мс");

        // Измеряем время выполнения операции добавления элемента в середину LinkedHashMap
        long startTimeLinkedHashMapMid = System.nanoTime();
        linkedHashMap.put(n / 2, n / 2); // Добавляем элемент в середину
        long endTimeLinkedHashMapMid = System.nanoTime();
        double durationLinkedHashMapMid = (endTimeLinkedHashMapMid - startTimeLinkedHashMapMid) / 1e6;
        System.out.println("Добавление элемента в середину LinkedHashMap: " + durationLinkedHashMapMid + " мс");

        // Добавление элемента в конец LinkedHashMap
        long startTimeLinkedHashMapEnd = System.nanoTime();
        linkedHashMap.put(n, n); // Добавляем элемент в конец
        long endTimeLinkedHashMapEnd = System.nanoTime();
        double durationLinkedHashMapEnd = (endTimeLinkedHashMapEnd - startTimeLinkedHashMapEnd) / 1e6;
        System.out.println("Добавление элемента в конец LinkedHashMap: " + durationLinkedHashMapEnd + " мс");

        // Добавление элементов в ArrayList
        long startTimeArrayList = System.nanoTime();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        long endTimeArrayList = System.nanoTime();
        double durationArrayList = (endTimeArrayList - startTimeArrayList) / 1e6; // Перевод времени в миллисекунды
        System.out.println("Добавление элементов в ArrayList: " + durationArrayList + " мс");

        // Измеряем время выполнения операции добавления элемента в середину ArrayList
        long startTimeArrayListMid = System.nanoTime();
        arrayList.add(n / 2, n); // Добавляем элемент в середину
        long endTimeArrayListMid = System.nanoTime();
        double durationArrayListMid = (endTimeArrayListMid - startTimeArrayListMid) / 1e6;
        System.out.println("Добавление элемента в середину ArrayList: " + durationArrayListMid + " мс");

        // Добавление элемента в конец ArrayList
        long startTimeArrayListEnd = System.nanoTime();
        arrayList.add(n); // Добавляем элемент в конец
        long endTimeArrayListEnd = System.nanoTime();
        double durationArrayListEnd = (endTimeArrayListEnd - startTimeArrayListEnd) / 1e6;
        System.out.println("Добавление элемента в конец ArrayList: " + durationArrayListEnd + " мс");

        // Удаление элемента из начала HashSet
        long startTimeHashSetRemoveFirst = System.nanoTime();
        hashSet.remove(0); // Удаляем элемент из начала
        long endTimeHashSetRemoveFirst = System.nanoTime();
        double durationHashSetRemoveFirst = (endTimeHashSetRemoveFirst - startTimeHashSetRemoveFirst) / 1e6;
        System.out.println("Удаление элемента из начала HashSet: " + durationHashSetRemoveFirst + " мс");

        // Удаление элемента из конца HashSet
        long startTimeHashSetRemoveLast = System.nanoTime();
        int lastElementHashSet = n - 1;
        hashSet.remove(lastElementHashSet); // Удаляем элемент из конца
        long endTimeHashSetRemoveLast = System.nanoTime();
        double durationHashSetRemoveLast = (endTimeHashSetRemoveLast - startTimeHashSetRemoveLast) / 1e6;
        System.out.println("Удаление элемента из конца HashSet: " + durationHashSetRemoveLast + " мс");

        // Удаление элемента из середины HashSet
        long startTimeHashSetRemoveMid = System.nanoTime();
        int midElementHashSet = n / 2;
        hashSet.remove(midElementHashSet); // Удаляем элемент из середины
        long endTimeHashSetRemoveMid = System.nanoTime();
        double durationHashSetRemoveMid = (endTimeHashSetRemoveMid - startTimeHashSetRemoveMid) / 1e6;
        System.out.println("Удаление элемента из середины HashSet: " + durationHashSetRemoveMid + " мс");

        // Удаление элемента из начала LinkedHashMap
        long startTimeLinkedHashMapRemoveFirst = System.nanoTime();
        linkedHashMap.remove(0); // Удаляем элемент из начала
        long endTimeLinkedHashMapRemoveFirst = System.nanoTime();
        double durationLinkedHashMapRemoveFirst = (endTimeLinkedHashMapRemoveFirst - startTimeLinkedHashMapRemoveFirst) / 1e6;
        System.out.println("Удаление элемента из начала LinkedHashMap: " + durationLinkedHashMapRemoveFirst + " мс");

        // Удаление элемента из конца LinkedHashMap
        long startTimeLinkedHashMapRemoveLast = System.nanoTime();
        int lastElementLinkedHashMap = n - 1;
        linkedHashMap.remove(lastElementLinkedHashMap); // Удаляем элемент из конца
        long endTimeLinkedHashMapRemoveLast = System.nanoTime();
        double durationLinkedHashMapRemoveLast = (endTimeLinkedHashMapRemoveLast - startTimeLinkedHashMapRemoveLast) / 1e6;
        System.out.println("Удаление элемента из конца LinkedHashMap: " + durationLinkedHashMapRemoveLast + " мс");

        // Удаление элемента из середины LinkedHashMap
        long startTimeLinkedHashMapRemoveMid = System.nanoTime();
        int midElementLinkedHashMap = n / 2;
        linkedHashMap.remove(midElementLinkedHashMap); // Удаляем элемент из середины
        long endTimeLinkedHashMapRemoveMid = System.nanoTime();
        double durationLinkedHashMapRemoveMid = (endTimeLinkedHashMapRemoveMid - startTimeLinkedHashMapRemoveMid) / 1e6;
        System.out.println("Удаление элемента из середины LinkedHashMap: " + durationLinkedHashMapRemoveMid + " мс");

        // Удаление элемента из начала ArrayList
        long startTimeArrayListRemoveFirst = System.nanoTime();
        arrayList.remove(0); // Удаляем элемент из начала
        long endTimeArrayListRemoveFirst = System.nanoTime();
        double durationArrayListRemoveFirst = (endTimeArrayListRemoveFirst - startTimeArrayListRemoveFirst) / 1e6;
        System.out.println("Удаление элемента из начала ArrayList: " + durationArrayListRemoveFirst + " мс");

        // Удаление элемента из конца ArrayList
        long startTimeArrayListRemoveLast = System.nanoTime();
        int lastElementArrayList = n - 1;
        arrayList.remove(lastElementArrayList); // Удаляем элемент из конца
        long endTimeArrayListRemoveLast = System.nanoTime();
        double durationArrayListRemoveLast = (endTimeArrayListRemoveLast - startTimeArrayListRemoveLast) / 1e6;
        System.out.println("Удаление элемента из конца ArrayList: " + durationArrayListRemoveLast + " мс");

        // Удаление элемента из середины ArrayList
        long startTimeArrayListRemoveMid = System.nanoTime();
        int midElementArrayList = n / 2;
        arrayList.remove(midElementArrayList); // Удаляем элемент из середины
        long endTimeArrayListRemoveMid = System.nanoTime();
        double durationArrayListRemoveMid = (endTimeArrayListRemoveMid - startTimeArrayListRemoveMid) / 1e6;
        System.out.println("Удаление элемента из середины ArrayList: " + durationArrayListRemoveMid + " мс");

    }
}
