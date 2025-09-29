public class Animal {
    protected static int countAnimals = 0;
    protected int runLength, swimLength;

    public Animal(int runLength, int swimLength) {
        this.runLength = runLength;
        this.swimLength = swimLength;
    }

    public Animal() {
        countAnimals++;
    }

    public static int getCountAnimals() {
        return countAnimals;
    }
}
