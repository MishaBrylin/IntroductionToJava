
import java.util.HashMap;
import java.util.List;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class Task01 {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneNumber = new HashMap<>();
        phoneNumber.put("Светлана Петрова", List.of("+7515651", "+815616165", "+568686786"));
        phoneNumber.put("Анна Мусина", List.of("+2353476457", "+56785681235"));
        phoneNumber.put("Анна Крутова", List.of("+456456", "+56835678"));
        System.out.println(phoneNumber);

    }

}
