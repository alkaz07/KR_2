package smirnov;

import java.util.ArrayList;
import java.util.Random;

public class ChipMunk implements Harvester {
    private ArrayList<Nut> stockpile = new ArrayList<Nut>();

    public void pickupNut(Nut nut) {
        int dice = new Random().nextInt(0, 100);
        if (dice < 75) {
            stockpile.add(nut);
        }
    }

    public void pickupNuts(Nut[] nuts) {
        for (Nut nut: nuts) {
            this.pickupNut(nut);
        }
        double mass = this.stockpile.stream().map(Nut::getMass).reduce(0.0, Double::sum);
        System.out.printf("На складе %d орехов массой %.2f", this.stockpile.size(), mass);
    }
}
