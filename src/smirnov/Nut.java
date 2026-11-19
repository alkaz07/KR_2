package smirnov;

import java.util.Random;

public class Nut {
    private final double mass;

    private Nut(double mass) {
        this.mass = mass;
    }

    static  Nut standardNut() {
        return new Nut(12.5);
    }

    static Nut randomNut() {
        double mass = new Random().nextDouble();
        return new Nut(mass);
    }

    double getMass() {
        return this.mass;
    }
}
