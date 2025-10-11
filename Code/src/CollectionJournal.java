public class CollectionJournal {
    public static void main(String[] args) {
        PhoneJournal journal = new PhoneJournal();
        try {
            journal.add("Braun", "+78956465721");
            journal.add("Ryomen", "404-40-04");
            journal.add("Braun", "510-51-13");
            journal.add("Rise", "404-40-04");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Ryomen:" + journal.get("Ryomen"));
        System.out.println("Braun:" + journal.get("Braun"));
        System.out.println("Rise:" + journal.get("Rise"));
    }
}
