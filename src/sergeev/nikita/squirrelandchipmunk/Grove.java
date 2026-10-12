package sergeev.nikita.squirrelandchipmunk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Grove {

    List<Tree> treeList = new ArrayList<>();

    public List<Tree> getListGrove(int numberTree) {
        treeList.clear();

        for (int i = 0; i < numberTree; i++) {
            Tree tree = new Tree();

            for (int j = 0; j < i; j++) {
                tree.levelUpOfTree();
            }

            tree.getGrowNut(numberTree);
            treeList.add(tree);
        }
        return treeList;
    }
}
