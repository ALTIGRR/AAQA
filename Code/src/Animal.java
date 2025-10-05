public abstract class Animal {
    private static int countAnimals = 0;
    protected int runLength;
    protected int swimLength;

    public Animal(int runLength, int swimLength) {
        this.runLength = runLength;
        this.swimLength = swimLength;
        countAnimals++;
    }

    public static int getCountAnimals() {
        return countAnimals;
    }
}
