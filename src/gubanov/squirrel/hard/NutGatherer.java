package gubanov.squirrel.hard;

import java.util.Random;

public abstract class NutGatherer
{
  private int collectedNutCount;
  private double totalCollectedNutWeight;

  private Nut gatherNut(Tree tree)
  {
    if (!tree.hasNuts())
    {
      return null;
    }

    Random random = new Random();
    int index = random.nextInt(0, tree.getNutCount());

    return tree.getNut(index);
  }

  public void gatherHarvest(Tree tree)
  {
    while (tree.hasNuts())
    {
      Nut nut = gatherNut(tree);
      if (nut != null)
      {
        collectNut(nut);
      }
    }
  }

  public abstract void collectNut(Nut nut);

  public void updateCollectedNutStatistics(Nut nut)
  {
    collectedNutCount++;
    totalCollectedNutWeight += nut.getWeight();
  }

  public int getCollectedNutCount()
  {
    return collectedNutCount;
  }

  public double getTotalCollectedNutWeight()
  {
    return totalCollectedNutWeight;
  }
}