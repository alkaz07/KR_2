package gubanov.squirrel.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tree
{
  private int level;
  private ArrayList<Nut> nuts;

  public Tree(int level)
  {
    this.level = level > 0 ? level : 1;
    nuts = new ArrayList<>();
  }

  private void raiseLevel()
  {
    level++;
  }

  public void growNuts()
  {
    Random random = new Random();
    int nutCount = random.nextInt(1, level + 1);

    for (int i = 0; i < nutCount; i++)
    {
      nuts.add(new Nut());
    }

    raiseLevel();
  }

  public int getNutCount()
  {
    return nuts.size();
  }

  public boolean hasNuts()
  {
    return getNutCount() > 0;
  }

  public Nut getNut(int index)
  {
    return nuts.remove(index);
  }

  public ArrayList<Nut> getNuts()
  {
    return nuts;
  }
}