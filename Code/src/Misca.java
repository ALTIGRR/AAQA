public class Misca {
    public int food;

    public Misca(int food) {
        this.food = food;
    }

    public void foodAmount() {
        System.out.println("В миске: " + food + " еды");
    }

    public void moreFood() {
        food += 10;
        System.out.println("В миске: " + food + " еды");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food >= 0) {
            this.food = food;
        } else {
            System.out.println("Количестсво еды не может быть отрицательным");
        }
    }
}
