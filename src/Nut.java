public class Nut {
    private final double weight;

    public Nut() {
        this.weight = 12.5;
    }

    public double getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        Squirrel squirrel = new Squirrel();

        Nut[] nuts = tree.growNutsArray(15);
        squirrel.collectNuts(nuts);
    }
}

class Tree {
    public Nut[] growNutsArray(int count) {
        Nut[] nuts = new Nut[count];
        for (int i = 0; i < count; i++) {
            nuts[i] = new Nut();
        }
        return nuts;
    }
}

class Squirrel {
    public void collectNuts(Nut[] nuts) {
        double totalWeight = 0;

        for (Nut nut : nuts) {
            if (nut != null) {
                System.out.println("Ура, еще орех!");
                totalWeight += nut.getWeight();
            }
        }

        System.out.println("Я насобирала орехов весом: " + totalWeight);
    }
}
