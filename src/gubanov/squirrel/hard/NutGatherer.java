package gubanov.squirrel.hard;

public abstract class NutGatherer
{
  private int collectedNutCount;
  private double totalCollectedNutWeight;

  public void gatherHarvest(Tree tree)
  {
    while (tree.hasNuts())
    {
      Nut nut = tree.gatherNut();
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