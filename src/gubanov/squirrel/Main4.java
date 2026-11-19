package gubanov.squirrel;

public class Main4
{
  public static void main()
  {
    final int NUT_COUNT = 15;

    Tree tree = new Tree();
    Nut[] nuts = tree.growNutArray(NUT_COUNT);

    Squirrel squirrel = new Squirrel();
    squirrel.gatherNuts(nuts);
    squirrel.printTotalNutWeightProudly();
  }
}