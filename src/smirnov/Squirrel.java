package smirnov;

public class Squirrel {
    void pickupNuts(Nut[] nuts) {
        double totalMass = 0;
        for (Nut nut: nuts) {
            System.out.println("ура, еще орех!");
            totalMass += nut.getMass();
        }
        System.out.printf("Набралось %.1f", totalMass);
    }

    void main() {
        Tree tree = new Tree();
        Nut[] nuts = tree.growNutArray(15);
        Squirrel squirrel = new Squirrel();
        squirrel.pickupNuts(nuts);
    }
}
