import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneJournal {
    private Map<String, List<String>> journal; //Объект создается как HashMap, но работает через интерфейс Map; Это позволяет использовать все методы интерфейса Map (TreeMap, LinkedHashMap)

    public PhoneJournal() {
        journal = new HashMap<>();
    }

    public void add(String lastName, String phone) {
        List<String> numbers = journal.get(lastName);
        if (numbers == null) {
            numbers = new ArrayList<>();//список нужен для реализации того, что у однофамильцев отображаются все номера с этой фамилией и избежания ошибки NullPointerException.
            journal.put(lastName, numbers);
        }
        numbers.add(phone);
    }

    public List<String> get(String lastName) {
        return journal.get(lastName);
    }
}
