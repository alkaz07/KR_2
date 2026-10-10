package suvorin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Tree {

    private int level;
    private final List<Nut> nuts;

    Tree() {
        this.level = 0;
        this.nuts = new ArrayList<>();
    }

    public int getLevel() {
        return level;
    }

    public List<Nut> getNuts() {
        return nuts;
    }

    public void increaseLevel() {
        this.level++;
    }

    public void growNutsArray(int level) {
        Random random = new Random();
        int chance = random.nextInt(2, 3 + level);
        for (int i = 0; i < chance; i++) {
            nuts.add(new Nut());
        }
    }
}