public class Dog extends Animal {
    private static int countDog = 0;

    public Dog(int runLength, int swimLength) {
        super(runLength, swimLength);
        countDog++;
    }

    public static int getCountDog() {
        return countDog;
    }

    public void isRunning() {
        if (this.runLength <= 500) {
            System.out.println(" пробежал " + runLength + "м");
        } else {
            System.out.println(" не пробежал дистанцию");
        }
    }

    public void isSwiming() {
        if (this.swimLength <= 10) {
            System.out.println(" проплыл " + swimLength + "м");
        } else {
            System.out.println(" не сможет проплыть дистанцию");
        }
    }
}

