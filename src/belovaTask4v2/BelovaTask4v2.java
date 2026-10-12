package belovaTask4v2;
import java.util.*;

public class BelovaTask4v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество деревьев: ");
        int treeCount = scanner.nextInt();

        Grove grove = new Grove();
        Tree[] trees = grove.createGrove(treeCount);

        System.out.println("В роще " + trees.length + " деревьев");

        Squirrel squirrel = new Squirrel();
        Chipmunk chipmunk = new Chipmunk();
        collectFromTrees(trees, squirrel, chipmunk);

        squirrel.printResults();
        chipmunk.printResults();

    }
    private static void collectFromTrees(
            Tree[] trees,
            Squirrel squirrel,
            Chipmunk chipmunk
    ) {
        int squirrelTreeCount = trees.length / 2;

        for (int i = 0; i < trees.length; i++) {
            Tree tree = trees[i];

            System.out.println(
                    "Дерево " + (i + 1) +
                            ", уровень " + tree.getLevel() +
                            ", орехов " + tree.getNuts().size()
            );

            if (i < squirrelTreeCount) {
                squirrel.gatherNuts(tree);
            } else {
                chipmunk.gatherNuts(tree);
            }
        }
    }
}

class Nuts {
    private final double weight;

    public Nuts() {
        double randomWeight = 1.5 + Math.random() * 13.5;
        weight = Math.round(randomWeight * 100.0) / 100.0;
    }

    public double getWeight() {
        return weight;
    }
}

class Tree {
    private int level;
    private final List<Nuts> nuts = new ArrayList<>();
    private final Random random = new Random();

    Tree(int level){
        this.level = level;
    }

    public void increaseLevel() {
        level++;
    }

    public int getLevel() {
        return level;
    }

    public void growNuts() {
        int maxNuts = 10 * (int) Math.pow(2, level - 1);
        int count = random.nextInt(maxNuts) + 1;

        for (int i = 0; i < count; i++) {
            nuts.add(new Nuts());
        }
    }

    public List<Nuts> getNuts() {
        return new ArrayList<>(nuts);
    }
}

class Grove {

    public Tree[] createGrove(int count) {
        Tree[] grove = new Tree[count];

        for (int i = 0; i < count; i++) {
            int level = i + 1;
            grove[i] = new Tree(level);
            grove[i].growNuts();
        }

        return grove;
    }
}

class Squirrel {
    private int gatherCount;
    private double gatherWeight;

    public void gatherNuts(Tree tree) {
        for (Nuts nut : tree.getNuts()) {
            gatherCount++;
            gatherWeight += nut.getWeight();

            System.out.println("Белочка нашла орех весом "+ nut.getWeight()+" грамм");
        }
    }

    public void printResults() {
        System.out.println("Белочка собрала " + gatherCount + " штучек орешков");
        System.out.println("Вес орешков белочки " + gatherWeight + " грамм");
    }
}

class Chipmunk {
    private final Random random = new Random();
    private int gatherCount;
    private double gatherWeight;

    public void gatherNuts(Tree tree) {
        for (Nuts nut : tree.getNuts()) {
            if (random.nextDouble() < 0.75) {
                gatherCount++;
                gatherWeight += nut.getWeight();
                System.out.println("Бурундук принёс орешек " + nut.getWeight() + " грамм");
            } else {
                System.out.println("Бурундук уронил орешек");
            }
        }
    }

    void printResults() {
        System.out.println("У бурундучка на складе " + gatherCount+ " орешков");
        System.out.println("Вес орешков бурундучка " + gatherWeight + " грамм");
    }
}
