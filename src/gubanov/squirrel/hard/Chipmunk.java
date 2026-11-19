package gubanov.squirrel.hard;

import java.util.Random;

public class Chipmunk extends NutGatherer
{
  private int gatheredNutCount;

  public Chipmunk()
  {
    gatheredNutCount = 0;
  }

  @Override
  public void collectNut(Nut nut)
  {
    gatheredNutCount++;

    // A nut is stored with a 75% probability
    Random random = new Random();
    if (random.nextDouble() < 0.75)
    {
      updateCollectedNutStatistics(nut);
    }
  }

  public int getGatheredNutCount()
  {
    return gatheredNutCount;
  }
}