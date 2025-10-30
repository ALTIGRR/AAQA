public class Park {

    public class Attraction {
        private String name;
        private String worktime;
        private int price;

        public Attraction(String name, String worktime, int price) {
            this.name = name;
            this.worktime = worktime;
            this.price = price;
        }

        public void prinInfo() {
            System.out.println("Название: " + name + ", Время работы: " + worktime + ", Цена билета: " + price + " RUB");
        }
    }
}


