package gubanov.squirrel.hard;

import java.util.ArrayList;
import java.util.List;

public class Main4
{
  public static void main()
  {
    Tree tree = new Tree(3);
    tree.growNuts();

    Squirrel squirrel = new Squirrel();
    squirrel.gatherNut(tree);
  }
}