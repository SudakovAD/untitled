package L9;
import java.util.HashMap;
import java.util.Map;

// Заполнить HashMap 10 объектами <Integer, String>.
// Найти строки у которых ключ> 5. Если ключ = 0, вывести строки через запятую.
// Перемножить все ключи, где длина строки>5.

public class Zadanie6 {
    public static void main(String[] args) {
        // Создание HashMap
        Map<Integer, String> map = new HashMap<>();

        // Заполняем HashMap 10 объектами <Integer, String>
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(0, "ноль");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "восемь");
        map.put(9, "девятка");
        map.put(10, "10");

        // Поиск строк, у которых ключ > 5
        StringBuilder keysZero = new StringBuilder();
        int productOfKeys = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (key > 5) {
                System.out.println("Ключ: " + key + ", Значение: " + value);
            }
            if (key == 0) {
                if (keysZero.length() > 0) {
                    keysZero.append(", ");
                }
                keysZero.append(value);
            }
            if (value.length() > 5) {
                productOfKeys *= key;
            }
        }

        // Вывод строк, где ключ = 0
        if (keysZero.length() > 0) {
            System.out.println("Строки с ключом = 0: " + keysZero.toString());
        } else {
            System.out.println("Нет строк, где ключь = 0.");
        }

        // Вывод произведения ключей, где длина строки > 5
        System.out.println("Произведение ключей, где длина строки > 5 равно " + productOfKeys);
    }
}
