public class Park {
    private Attraction attraction;
    public class Attraction {
        private String name, worktime;
        private int price;
        public Attraction(String name, String worktime, int price){
            this.name = name;
            this.worktime = worktime;
            this.price = price;
        }
        public void getValues() {
            System.out.println("Название: " + name + ", Время раоты: " + worktime +  ", Цена билета: " + price);
        }
    }
}


