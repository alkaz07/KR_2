package gubanov.squirrel.hard;

import java.util.ArrayList;
import java.util.List;

public class Main4
{
  public static void main()
  {
    /*Tree tree = new Tree(3);
    tree.growNuts();

    Squirrel squirrel = new Squirrel();
    squirrel.gatherHarvest(tree);

    System.out.printf("Количество орехов = %d, суммарный вес = %.1f", squirrel.getNutCount(), squirrel.getTotalNutWeight());*/

    Tree tree = new Tree(5);
    tree.growNuts();
    int nutCount = tree.getNuts().size();

    Chipmunk chipmunk = new Chipmunk();
    chipmunk.gatherHarvest(tree);

    System.out.printf("Общее количество сорванных орехов = %d\n", nutCount);
    System.out.printf("Количество сохранённых орехов = %d, суммарный вес = %.1f", chipmunk.getNutCount(), chipmunk.getTotalNutWeight());
  }
}