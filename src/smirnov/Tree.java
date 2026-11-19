package smirnov;

import java.util.Iterator;
import java.util.Random;

public class Tree {
    private int level = 0;

    private Nut[] nuts;

    void growStandardNutArray(int nutAmount) {
        Nut[] nuts = new Nut[nutAmount];
        for (int i = 0; i < nutAmount; i++) {
            nuts[i] = Nut.standardNut();
        }
        this.nuts = nuts;
    }

    void growRandomNutArray() {
        int nutAmount = new Random().nextInt(10 * (this.level+1));
        Nut[] nuts = new Nut[nutAmount];
        for (int i = 0; i < nutAmount; i++) {
            nuts[i] = Nut.randomNut();
        }
        this.nuts = nuts;
    }

    public void levelUp() {
        this.level += 1;
    }

    public Nut[] getNuts() {
        Nut[] nuts = this.nuts;
        this.nuts = new Nut[0];
        return nuts;
    }
}
