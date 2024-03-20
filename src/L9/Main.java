import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 10000000; // Количество элементов

        // Добавление элементов в HashSet
        long startTimeHashSet = System.currentTimeMillis();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hashSet.add(i);
        }
        long endTimeHashSet = System.currentTimeMillis();
        double durationHashSet = (endTimeHashSet - startTimeHashSet) / 1000.0; // Перевод времени в секунды
        System.out.println("Добавление элементов в HashSet: " + durationHashSet + " сек");

        // Измеряем время выполнения операции добавления элемента в середину HashSet
        long startTimeHashSetMid = System.currentTimeMillis();
        hashSet.add(n / 2); // Добавляем элемент в середину
        long endTimeHashSetMid = System.currentTimeMillis();
        double durationHashSetMid = (endTimeHashSetMid - startTimeHashSetMid);
        System.out.println("Добавление элемента в середину HashSet: " + durationHashSetMid + " мсек");

        // Добавление элемента в конец HashSet
        long startTimeHashSetEnd = System.currentTimeMillis();
        hashSet.add(n); // Добавляем элемент в конец
        long endTimeHashSetEnd = System.currentTimeMillis();
        double durationHashSetEnd = (endTimeHashSetEnd - startTimeHashSetEnd);
        System.out.println("Добавление элемента в конец HashSet: " + durationHashSetEnd + " мсек");

        // Добавление элементов в LinkedHashMap
        long startTimeLinkedHashMap = System.currentTimeMillis();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            linkedHashMap.put(i, i);
        }
        long endTimeLinkedHashMap = System.currentTimeMillis();
        double durationLinkedHashMap = (endTimeLinkedHashMap - startTimeLinkedHashMap) / 1000.0; // Перевод времени в секунды
        System.out.println("Добавление элементов в LinkedHashMap: " + durationLinkedHashMap + " сек");

        // Измеряем время выполнения операции добавления элемента в середину LinkedHashMap
        long startTimeLinkedHashMapMid = System.currentTimeMillis();
        linkedHashMap.put(n / 2, n / 2); // Добавляем элемент в середину
        long endTimeLinkedHashMapMid = System.currentTimeMillis();
        double durationLinkedHashMapMid = (endTimeLinkedHashMapMid - startTimeLinkedHashMapMid);
        System.out.println("Добавление элемента в середину LinkedHashMap: " + durationLinkedHashMapMid + " мсек");

        // Добавление элемента в конец LinkedHashMap
        long startTimeLinkedHashMapEnd = System.currentTimeMillis();
        linkedHashMap.put(n, n); // Добавляем элемент в конец
        long endTimeLinkedHashMapEnd = System.currentTimeMillis();
        double durationLinkedHashMapEnd = (endTimeLinkedHashMapEnd - startTimeLinkedHashMapEnd);
        System.out.println("Добавление элемента в конец LinkedHashMap: " + durationLinkedHashMapEnd + " мсек");

        // Добавление элементов в ArrayList
        long startTimeArrayList = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        long endTimeArrayList = System.currentTimeMillis();
        double durationArrayList = (endTimeArrayList - startTimeArrayList) / 1000.0; // Перевод времени в секунды
        System.out.println("Добавление элементов в ArrayList: " + durationArrayList + " сек");

        // Измеряем время выполнения операции добавления элемента в середину ArrayList
        long startTimeArrayListMid = System.currentTimeMillis();
        arrayList.add(n / 2, n); // Добавляем элемент в середину
        long endTimeArrayListMid = System.currentTimeMillis();
        double durationArrayListMid = (endTimeArrayListMid - startTimeArrayListMid);
        System.out.println("Добавление элемента в середину ArrayList: " + durationArrayListMid + " мсек");

        // Добавление элемента в конец ArrayList
        long startTimeArrayListEnd = System.currentTimeMillis();
        arrayList.add(n); // Добавляем элемент в конец
        long endTimeArrayListEnd = System.currentTimeMillis();
        double durationArrayListEnd = (endTimeArrayListEnd - startTimeArrayListEnd);
        System.out.println("Добавление элемента в конец ArrayList: " + durationArrayListEnd + " мсек");

        // Удаление элемента из начала HashSet
        long startTimeHashSetRemoveFirst = System.currentTimeMillis();
        hashSet.remove(0); // Удаляем элемент из начала
        long endTimeHashSetRemoveFirst = System.currentTimeMillis();
        double durationHashSetRemoveFirst = (endTimeHashSetRemoveFirst - startTimeHashSetRemoveFirst);
        System.out.println("Удаление элемента из начала HashSet: " + durationHashSetRemoveFirst + " мсек");

        // Удаление элемента из конца HashSet
        long startTimeHashSetRemoveLast = System.currentTimeMillis();
        int lastElementHashSet = n - 1;
        hashSet.remove(lastElementHashSet); // Удаляем элемент из конца
        long endTimeHashSetRemoveLast = System.currentTimeMillis();
        double durationHashSetRemoveLast = (endTimeHashSetRemoveLast - startTimeHashSetRemoveLast);
        System.out.println("Удаление элемента из конца HashSet: " + durationHashSetRemoveLast + " мсек");

        // Удаление элемента из середины HashSet
        long startTimeHashSetRemoveMid = System.currentTimeMillis();
        int midElementHashSet = n / 2;
        hashSet.remove(midElementHashSet); // Удаляем элемент из середины
        long endTimeHashSetRemoveMid = System.currentTimeMillis();
        double durationHashSetRemoveMid = (endTimeHashSetRemoveMid - startTimeHashSetRemoveMid);
        System.out.println("Удаление элемента из середины HashSet: " + durationHashSetRemoveMid + " мсек");

        // Удаление элемента из начала LinkedHashMap
        long startTimeLinkedHashMapRemoveFirst = System.currentTimeMillis();
        linkedHashMap.remove(0); // Удаляем элемент из начала
        long endTimeLinkedHashMapRemoveFirst = System.currentTimeMillis();
        double durationLinkedHashMapRemoveFirst = (endTimeLinkedHashMapRemoveFirst - startTimeLinkedHashMapRemoveFirst);
        System.out.println("Удаление элемента из начала LinkedHashMap: " + durationLinkedHashMapRemoveFirst + " мсек");

        // Удаление элемента из конца LinkedHashMap
        long startTimeLinkedHashMapRemoveLast = System.currentTimeMillis();
        int lastElementLinkedHashMap = n - 1;
        linkedHashMap.remove(lastElementLinkedHashMap); // Удаляем элемент из конца
        long endTimeLinkedHashMapRemoveLast = System.currentTimeMillis();
        double durationLinkedHashMapRemoveLast = (endTimeLinkedHashMapRemoveLast - startTimeLinkedHashMapRemoveLast);
        System.out.println("Удаление элемента из конца LinkedHashMap: " + durationLinkedHashMapRemoveLast + " мсек");

        // Удаление элемента из середины LinkedHashMap
        long startTimeLinkedHashMapRemoveMid = System.currentTimeMillis();
        int midElementLinkedHashMap = n / 2;
        linkedHashMap.remove(midElementLinkedHashMap); // Удаляем элемент из середины
        long endTimeLinkedHashMapRemoveMid = System.currentTimeMillis();
        double durationLinkedHashMapRemoveMid = (endTimeLinkedHashMapRemoveMid - startTimeLinkedHashMapRemoveMid);
        System.out.println("Удаление элемента из середины LinkedHashMap: " + durationLinkedHashMapRemoveMid + " мсек");

        // Удаление элемента из начала ArrayList
        long startTimeArrayListRemoveFirst = System.currentTimeMillis();
        arrayList.remove(0); // Удаляем элемент из начала
        long endTimeArrayListRemoveFirst = System.currentTimeMillis();
        double durationArrayListRemoveFirst = (endTimeArrayListRemoveFirst - startTimeArrayListRemoveFirst);
        System.out.println("Удаление элемента из начала ArrayList: " + durationArrayListRemoveFirst + " мсек");

        // Удаление элемента из конца ArrayList
        long startTimeArrayListRemoveLast = System.currentTimeMillis();
        int lastElementArrayList = n - 1;
        arrayList.remove(lastElementArrayList); // Удаляем элемент из конца
        long endTimeArrayListRemoveLast = System.currentTimeMillis();
        double durationArrayListRemoveLast = (endTimeArrayListRemoveLast - startTimeArrayListRemoveLast);
        System.out.println("Удаление элемента из конца ArrayList: " + durationArrayListRemoveLast + " мсек");

        // Удаление элемента из середины ArrayList
        long startTimeArrayListRemoveMid = System.currentTimeMillis();
        int midElementArrayList = n / 2;
        arrayList.remove(midElementArrayList); // Удаляем элемент из середины
        long endTimeArrayListRemoveMid = System.currentTimeMillis();
        double durationArrayListRemoveMid = (endTimeArrayListRemoveMid - startTimeArrayListRemoveMid);
        System.out.println("Удаление элемента из середины ArrayList: " + durationArrayListRemoveMid + " мсек");

        // Получение элемента по индексу из ArrayList
        long startTimeArrayListGet = System.currentTimeMillis();
        int index = n / 2; // Получаем элемент по середине списка
        int element = arrayList.get(index);
        long endTimeArrayListGet = System.currentTimeMillis();
        double durationArrayListGet = (endTimeArrayListGet - startTimeArrayListGet);
        System.out.println("Получение элемента по индексу из ArrayList: " + durationArrayListGet + " мсек");

    }
}
