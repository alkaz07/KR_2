package sergeev.nikita.squirrelandchipmunk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tree {
    private static final Random RND = new Random();
    private final List<Nut> listNuts = new ArrayList<>();
    private int levelOfTree = 0;
    private int numberNuts = 0;

    public int getLevelOfTree() {
        return levelOfTree;
    }

    public void levelUpOfTree() {
        levelOfTree = levelOfTree + 1;
    }

    public List<Nut> getGrowNut() {
        int max = levelOfTree + 1;
        int sizeOfList = RND.nextInt(max);

        for (int i = 0; i < sizeOfList; i++) {
            listNuts.add(new Nut());
        }

        return listNuts;
    }

    public int getNumberNuts() {
        numberNuts = listNuts.size();
        return numberNuts;
    }

    public List<Nut> getNuts() {
        return listNuts;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "levelOfTree= " + levelOfTree +
                ", numberNuts= " + numberNuts +
                ", listNuts= " + listNuts +
                '}';
    }
}