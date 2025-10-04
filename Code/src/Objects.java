public class Objects {
    public static void main(String[] args) {
        Product[] productslist = new Product[5];
        productslist[0] = new Product("CoolCola", "25.08.25", "Очаково", "РФ", 110, false);
        productslist[1] = new Product("Ноутбук Maibenben M645", "14.06.2024", "MAIBENBEN", "Китай", 42990, true);
        productslist[2] = new Product("Клавиатрура A4Tech bloody S510R", "20.02.23", "A4Tech", "Тайвань", 3999, true);
        productslist[3] = new Product("Forza Horizon 4", "02.10.18", "Playground Games (XboxGameStudios)", "USA", 4300, true);
        productslist[4] = new Product("Монитор ASUS 27\"", "13.09.23", "ASUSTeK Computer Inc.", "Тайвань", 15599, false);
        for (int i = 0; i < productslist.length; i++) {
            System.out.println("Товар " + (i + 1) + ":");
            productslist[i].prinInfo();
        }

        Park.Attraction rollerCoaster = new Park().new Attraction("Русские Горки", "с 10 утра до 23:00", 200);
        Park.Attraction autoDrome = new Park().new Attraction("Автодром", "с 10 утра до 23:00", 150);
        System.out.println("\n" + "Аттракционы:");
        rollerCoaster.prinInfo();
        autoDrome.prinInfo();
    }
}
