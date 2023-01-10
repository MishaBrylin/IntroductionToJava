import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
public class Task02 {
    public static void main(String[] args) {
        List<String> name = List.of("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов");
        List<String> name2 = new ArrayList<>();
        Map<String, Integer> name3 = new HashMap<>();
        for (int i = 0; i < name.size(); i++) {
            name2.addAll(Arrays.asList(name.get(i).split(" ")));
        }

        for (int i = 1; i < name2.size(); i++) {
            name2.remove(i);

        }

        int count = 1;
        for (int i = 0; i < name2.size(); i += 1) {
            count = 1;
            name3.put(name2.get(i), count);

            for (int j = i + 1; j < name2.size(); j += 1) {
                if (name3.containsKey(name2.get(j))) {
                    count++;
                    name3.put(name2.get(j), count);
                    name2.remove(j);
                    j--;
                }

            }
        }

        for (Map.Entry<String, Integer> entry : name3.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println("Имя " + entry.getKey() + " повторяется " + entry.getValue() + " раз");
            }

        }

        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : name3.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : name3.entrySet()) {
                String key = entry.getKey();
                if (name3.get(key) == i) {
                    sortedNameMap.put(key, name3.get(key));
                }
            }
        }

        System.out.println(name3);
        System.out.println(sortedNameMap);

    }
}
