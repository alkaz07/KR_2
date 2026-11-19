package gubanov.squirrel.hard;

public class Squirrel
{
  private int nutCount;
  private double totalNutWeight;

  public Squirrel()
  {
    nutCount = 0;
    totalNutWeight = 0;
  }

  private void scream()
  {
    System.out.println("Ура, еще орех!");
  }

  public void gatherNut(Tree tree)
  {
    Nut nut = tree.gatherNut();
    if (nut == null)
    {
      // Empty tree
      return;
    }

    scream();
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