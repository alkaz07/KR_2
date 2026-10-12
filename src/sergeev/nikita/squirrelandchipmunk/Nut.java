package sergeev.nikita.squirrelandchipmunk;

import java.util.Random;

public class Nut {
    private final double weight;
    private static final Random RND = new Random();

    public Nut() {
        this.weight = RND.nextDouble(1.5, 15.1);
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Nut{weight=%.2f}", weight);
    }
}