import java.util.*;

public class PhoneJournal {
    private Map<String, List<String>> journal;//Объект создается как HashMap, но работает через интерфейс Map; Это позволяет использовать все методы интерфейса Map (TreeMap, LinkedHashMap)
    private Set<String> existNumbers;// Set - интерфейс для создания коллекции уникальных элементов.

    public PhoneJournal() {
        journal = new HashMap<>();
        existNumbers = new HashSet<>();
    }

    public void add(String lastName, String phone) {
        if (existNumbers.contains(phone)) { //Метод contains() — это встроенный метод в Java, который используется для проверки наличия элемента в коллекции.
            throw new IllegalArgumentException("Номер " + phone + " принадлежит другому пользователю.");
        }

        List<String> numbers = journal.get(lastName);
        if (numbers == null) {
            numbers = new ArrayList<>();//список нужен для реализации того, что у однофамильцев отображаются все номера с этой фамилией и избежания ошибки NullPointerException.
            journal.put(lastName, numbers);
        }
        numbers.add(phone);
        existNumbers.add(phone);
    }

    public List<String> get(String lastName) {
        return journal.get(lastName);
    }
}
