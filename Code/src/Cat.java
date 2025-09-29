public class Cat extends Animal {
    protected static int countCat = 0;
    private int runCat;
    private int needEat;
    private boolean notHungry = false;

    public Cat(int runLength, int swimLength, int needEat) {
        this.runCat = runLength;
        this.needEat = needEat;
        countCat++;
    }

    public static int getCountCat() {
        return countCat;
    }

    public void isRunning() {
        if (this.runCat <= 200) {
            System.out.println(" пробежал " + runCat + "м");
        } else {
            System.out.println(" не пробежал дистанцию");
        }
    }

    public void isSwiming() {
        System.out.println("  Коты не умеют плавать");
    }

    public void tryToEat() {
        int food = Misca.food;
        if (food >= needEat) {
            Misca.food = food - needEat;
            notHungry = true;
            System.out.println("Кот поел, сытость: " + notHungry);
        } else if (food < needEat) {
            notHungry = false;
            System.out.println("Коту мало еды, сытость: " + notHungry);
        }
    }
}
