package gubanov.squirrel.hard;

import java.util.ArrayList;
import java.util.List;

public class Main4
{
  public static void main()
  {
    Tree tree = new Tree(2);
    tree.growNuts();
    ArrayList<Nut> nuts = tree.getNuts();

    for (Nut nut : nuts)
    {
      System.out.println(nut.getWeight());
    }
  }
}