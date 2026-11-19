package gubanov.squirrel.hard;

public abstract class NutGatherer
{
  private int nutCount;
  private double totalNutWeight;

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

  public void updateNutStatistics(Nut nut)
  {
    nutCount++;
    totalNutWeight += nut.getWeight();
  }

  public int getNutCount()
  {
    return nutCount;
  }

  public double getTotalNutWeight()
  {
    return totalNutWeight;
  }
}