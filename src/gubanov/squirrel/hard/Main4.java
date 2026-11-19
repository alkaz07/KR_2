package gubanov.squirrel.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main4
{
  public static void main()
  {
    final int MAX_TREE_LEVEL = 10;

    Random random = new Random();
    int treeNumber = random.nextInt(5, 10);
    Tree[] wood = new Tree[treeNumber];

    for (int i = 0; i < treeNumber; i++)
    {
      int level = random.nextInt(0, MAX_TREE_LEVEL + 1);
      Tree tree = new Tree(level);

      tree.growNuts();
      wood[i] = tree;
    }

    // First half of the wood is gathered by a squirrel
    int halfAWood = treeNumber / 2;
    Squirrel squirrel = new Squirrel();

    for (int i = 0; i < halfAWood; i++)
    {
      Tree tree = wood[i];
      squirrel.gatherHarvest(tree);
    }

    // Second  half of the wood is gathered by a chipmunk
    Chipmunk chipmunk = new Chipmunk();
    for (int i = halfAWood; i < treeNumber; i++)
    {
      Tree tree = wood[i];
      chipmunk.gatherHarvest(tree);
    }

    System.out.printf("Размер рощи = %d деревьев\n", treeNumber);
    System.out.printf("Белка: количество собранных орехов = %d, суммарный вес = %.1f граммов\n", squirrel.getCollectedNutCount(), squirrel.getTotalCollectedNutWeight());
    System.out.printf("Бурундук: количество сорванных орехов = %d, количество сохранённых орехов = %d, суммарный вес сохранённых орехов= %.1f граммов\n",
      chipmunk.getGatheredNutCount(), chipmunk.getCollectedNutCount(), chipmunk.getTotalCollectedNutWeight());
  }
}