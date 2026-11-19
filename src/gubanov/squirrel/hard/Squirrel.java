package gubanov.squirrel.hard;

public class Squirrel extends NutGatherer
{
  private void scream()
  {
    System.out.println("Ура, еще орех!");
  }

  @Override
  public void collectNut(Nut nut)
  {
    scream();
    updateNutStatistics(nut);
  }
}