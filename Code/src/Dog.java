public class Dog extends Animal {
    protected static int countDog = 0;
    private int runDog, swimDog;

    public Dog(int runLength, int swimLength) {
        this.runDog = runLength;
        this.swimDog = swimLength;
        countDog++;
    }

    public static int getCountDog() {
        return countDog;
    }

    public void isRunning() {
        if (this.runDog <= 500) {
            System.out.println(" пробежал " + runDog + "м");
        } else {
            System.out.println(" не пробежал дистанцию");
        }
    }

    public void isSwiming() {
        if (this.swimDog <= 10) {
            System.out.println(" проплыл " + swimDog + "м");
        } else {
            System.out.println(" не сможет проплыть дистанцию");
        }
    }
}

