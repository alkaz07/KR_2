package gubanov.squirrel.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tree
{
  private int level;

  public Tree(int level)
  {
    this.level = level > 0 ? level : 1;
  }

  private void raiseLevel()
  {
    level++;
  }

  public ArrayList<Nut> growNuts()
  {
    Random random = new Random();
    int nutCount = random.nextInt(1, level + 1);

    ArrayList<Nut> nuts = new ArrayList<>(nutCount);
    for (int i = 0; i < nutCount; i++)
    {
      nuts.add(new Nut());
    }

    raiseLevel();
    return nuts;
  }
}