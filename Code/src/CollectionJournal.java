public class CollectionJournal {
    public static void main(String[] args) {
        PhoneJournal journal = new PhoneJournal();
        journal.add("Braun", "+78956465721");
        journal.add("Ryomen", "404-40-04");
        journal.add("Braun", "510-51-13");
        System.out.println(journal.get("Ryomen"));
        System.out.println(journal.get("Braun"));
    }
}
