package smirnov;

import java.util.Random;

public class Main {
    void main() {
        Tree[] trees = new Tree[10];
        for (int i=0; i < trees.length; i++) {
            trees[i] = new Tree();
            trees[i].growRandomNutArray();
        }

        Harvester[] harvesters = new Harvester[2];
        harvesters[0] = new Squirrel();
        harvesters[1] = new ChipMunk();

        for (Tree tree: trees) {
            Nut[] nuts = tree.getNuts();
            int dice = new Random().nextInt(2);

            harvesters[dice].pickupNuts(nuts);
        }
    }
}
