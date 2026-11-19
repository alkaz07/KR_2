package gubanov.squirrel;

public class Squirrel
{
  private double totalNutWeight;

  public Squirrel()
  {
    totalNutWeight = 0;
  }

  private void scream()
  {
    System.out.println("Ура, еще орех!");
  }

  public void gatherNuts(Nut[] nuts)
  {
    for (Nut nut : nuts)
    {
      scream();
      totalNutWeight += nut.getWeight();
    }
  }

  public void printTotalNutWeightProudly()
  {
    System.out.printf("Общий вес собранных орехов - целых %.1f!\n", totalNutWeight);
  }
}