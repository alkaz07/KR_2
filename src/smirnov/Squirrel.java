package smirnov;

public class Squirrel implements Harvester {
    int pickedNutAmount = 0;
    double pickedNutMass = 0;

    public void pickupNut(Nut nut) {
        System.out.println("ура, еще орех!");
        this.pickedNutAmount++;
        this.pickedNutMass += nut.getMass();
    }

    public void pickupNuts(Nut[] nuts) {
        for (Nut nut: nuts) {
            this.pickupNut(nut);
        }
        System.out.printf("Набралось %d орехов, массой %.2f", this.pickedNutAmount, this.pickedNutMass);
    }

    void main() {
        Tree tree = new Tree();
        tree.growStandardNutArray(15);
        Nut[] nuts = tree.getNuts();
        Squirrel squirrel = new Squirrel();
        squirrel.pickupNuts(nuts);
    }
}
