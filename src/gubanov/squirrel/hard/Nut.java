package gubanov.squirrel.hard;

import java.util.Random;

public class Nut
{
  private final double weight;

  public Nut()
  {
    Random random = new Random();
    weight = random.nextDouble(1.5, 15);
  }

  public double getWeight()
  {
    return weight;
  }
}