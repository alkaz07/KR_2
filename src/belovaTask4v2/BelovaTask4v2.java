package belovaTask4v2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BelovaTask4v2 {

    public static void main(String[] args) {
        Grove grove1 = new Grove();
        Tree[] groveArray = grove1.createGrove();
        System.out.println(Arrays.toString(groveArray));

        Squirrel squirrel = new Squirrel();
        Chipmunk chipmunk = new Chipmunk();

    }
}

class Nut {
    private final double weight;
    private final Random random = new Random();

    public Nut() {
        weight = 1.5 + Math.random() * 13.5;
    }

    public double getWeight() {
        return weight;
    }
}

class Tree {
    private int level = 1;
    private final List<Nut> nuts = new ArrayList<>();
    private final Random random = new Random();

    Tree(){
        level = random.nextInt(3);
        growNuts();
    }

    public void increaseLevel() {
        level++;
    }

    public int getLevel() {
        return level;
    }

    public void growNuts() {
        int count = random.nextInt(level + 1);
        for (int i = 0; i < count; i++) {
            nuts.add(new Nut());
        }
    }

    public List<Nut> getNuts() {
        return List.of(nuts.toArray(new Nut[0]));
    }

    public List<Nut> takeNuts() {
        List<Nut> collected = new ArrayList<>(nuts);
        nuts.clear();
        return collected;
    }
}

class Grove {
    private final Random random = new Random();

    public Tree[] createGrove() {
        int countTree = random.nextInt(10);

        Tree[] grove = new Tree[countTree];
        for (int i = 0; i < countTree; i++) {
            grove[i] = new Tree();
        }
        return grove;
    }
}

class Squirrel {
    private int gatherCount;
    private double gatherWeight;

    public void gatherNut(Tree tree) {
        for (Nut nut : tree.takeNuts()) {
            gatherCount++;
            gatherWeight += nut.getWeight();

            System.out.println("Белочка нашла орех весом "+ nut.getWeight()+" грамм");
        }
    }

    public void printResultsSquirrel() {
        System.out.println("Белочка собрала " + gatherCount + " штучек орешков");
        System.out.println("Вес орешков белочки " + gatherWeight + " грамм");
    }
}

class Chipmunk {
    private final Random random = new Random();
    private int gatherCount;
    private double gatherWeight;

    public void gatherNuts(Tree tree) {
        for (Nut nut : tree.takeNuts()) {
            if (random.nextDouble() < 0.75) {
                gatherCount++;
                gatherWeight += nut.getWeight();
                System.out.println("Бурундук принёс орешек " + nut.getWeight() + " грамм");
            } else {
                System.out.println("Бурундук уронил орешек");
            }
        }
    }

    void printResultChipmunk() {
        System.out.println("У бурундучка на складе " + gatherCount+ " орешков");
        System.out.println("Вес орешков бурундучка " + gatherWeight + " грамм");
    }
}
