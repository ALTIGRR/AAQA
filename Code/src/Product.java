public class Product {

    private String name, release_date, company, country;
    private int price;
    private boolean booking_status;

    public Product(String name, String release_date, String company, String country, int price, boolean booking_status) {
        this.name = name;
        this.release_date = release_date;
        this.company = company;
        this.country = country;
        this.price = price;
        this.booking_status = booking_status;
    }

    public void getValues() {
        System.out.println("Название: " + name + ", Дата производства: " + release_date + ", Производитель: " + company + ", Страна производства: " + country + ", Цена: " + price + " RUB" + ", Статус бронирования: " + booking_status);
    }
}
