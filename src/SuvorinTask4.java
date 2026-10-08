public class SuvorinTask4 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Nut[] nutsArray = tree.growNutsArray(15);

        Squirrel squirrel = new Squirrel();
        squirrel.pickNuts(nutsArray);
    }
}

public class Nut {
    final float weight;

    Nut() {
        this.weight = 12.5F;
    };
}

public class Squirrel {
    public void pickNuts(Nut[] array) {
        float finalWeight = 0F;
        for (int i = 0; i < array.length; i++) {
            System.out.println("ура, еще орех!");
            finalWeight += array[i].weight;
        }
        System.out.println("Я насобирала " + finalWeight + " грамм орешков!");
    }
}

public class Tree {
    Nut[] growNutsArray(int nuts) {
        Nut[] nutsArray = new Nut[nuts];
        for (int i = 0; i < nuts; i++) {
            nutsArray[i] = new Nut();
        }

        return nutsArray;
    }
}
