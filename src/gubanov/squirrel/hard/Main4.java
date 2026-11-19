package gubanov.squirrel.hard;

import java.util.ArrayList;
import java.util.List;

public class Main4
{
  public static void main()
  {
    Tree tree = new Tree(3);
    tree.growNuts();

    Nut nut = tree.gatherNut();
    while (nut != null)
    {
      System.out.println(nut.getWeight());
      nut = tree.gatherNut();
    }
  }
}