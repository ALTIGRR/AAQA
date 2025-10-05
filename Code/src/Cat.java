public class Cat extends Animal {
    private static int countCat = 0;
    private int needEat;
    private boolean notHungry = false;

    public Cat(int runLength, int needEat) {
        super(runLength, 0);
        this.needEat = needEat;
        countCat++;
    }

    public static int getCountCat() {
        return countCat;
    }

    public void isRunning() {
        if (this.runLength <= 200) {
            System.out.println(" пробежал " + runLength + "м");
        } else {
            System.out.println(" не пробежал дистанцию");
        }
    }

    public void isSwiming() {
        System.out.println("  Коты не умеют плавать");
    }

    public void tryToEat(Misca misca) {
        if (misca.getFood() >= needEat) {
            misca.setFood(misca.getFood() - needEat);
            notHungry = true;
            System.out.println("Кот поел, сытость: " + notHungry);
        } else {
            notHungry = false;
            System.out.println("Коту мало еды, сытость: " + notHungry);
        }
    }
}
