public class Misca {
    public static int food;

    public Misca(int food) {
        this.food = food;
    }

    public void foodAmount() {
        System.out.println("В миске: " + food);
    }

    public void moreFood() {
        food += 10;
        System.out.println("В миске: " + food);
    }
}
