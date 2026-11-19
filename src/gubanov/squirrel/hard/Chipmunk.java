package gubanov.squirrel.hard;

import java.util.Random;

public class Chipmunk extends NutGatherer
{
  @Override
  public void collectNut(Nut nut)
  {
    // A nut is collected with a 75% probability
    Random random = new Random();
    if (random.nextDouble() < 0.75)
    {
      updateNutStatistics(nut);
    }
  }
}