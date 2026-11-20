package Bessolitsyna.zadacha4hard;

public class Nut {
    final double weightNut;

    public Nut(double min, double max) {
        this.weightNut =  min +(Math.random()*(max-min));
    }

    public double getWeightNut() {
        return weightNut;
    }
}
