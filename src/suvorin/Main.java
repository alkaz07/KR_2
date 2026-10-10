package suvorin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Main {

    public static void main(String[] args) {
        Squirrel squirrel = new Squirrel();
        Chipmunk chipmunk = new Chipmunk();
        List<Tree> grove = growGrove(10);
        // Белка собирает орехи с чётных деревьев, бурундук с нечётных
        for (int i = 0; i < grove.size(); i++) {
            if (i % 2 == 0) {
                squirrel.pickNuts(grove.get(i).getNuts());
            } else {
                chipmunk.pickNuts(grove.get(i).getNuts());
            }
        }
    }

    public static List<Tree> growGrove(int treesCount) {
        Random random = new Random();
        List<Tree> grove = new ArrayList<>();

        for (int i = 0; i < treesCount; i++) {
            Tree tree = new Tree();
            int level = random.nextInt(1, 10);
            for (int j = 0; j < level; j++) {
                tree.increaseLevel();
                tree.growNutsArray(tree.getLevel());
            }
            grove.add(tree);
        }

        return grove;
    }
}

