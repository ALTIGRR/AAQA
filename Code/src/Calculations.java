public class Calculations {
    private int x;
    private int z;

    public Calculations(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public int sum() {
        return x + z;
    }

    public int subtraction() {
        return x - z;
    }

    public int multiplication() {
        return x * z;
    }

    public float division() {
        return (float) x / (float) z;
    }
}
