package belochka_Lukianov;

import java.util.Random;

public class Oreshek {
    private final static Random genetics = new Random();
    private final static double NUT_MIN_WEIGHT = 1.5;
    private final static double NUT_MAX_WEIGHT = 12.5;

    private final double weight;

    public Oreshek() {
        weight = NUT_MIN_WEIGHT
                + genetics.nextDouble() * (NUT_MAX_WEIGHT - NUT_MIN_WEIGHT);
    }

    public double getWeight() {
        return weight;
    }
}
