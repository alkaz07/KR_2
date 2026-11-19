package gubanov.squirrel.hard;

import java.util.ArrayList;
import java.util.List;

public class Main4
{
  public static void main()
  {
    Tree tree = new Tree(2);
    ArrayList<Nut> nuts = tree.growNuts();

    for (int i = 0; i < nuts.size(); i++)
    {
      System.out.println(nuts.get(i).getWeight());
    }
  }
}