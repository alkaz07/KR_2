package gubanov.squirrel.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tree
{
  private int level;
  ArrayList<Nut> nuts;

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

  public ArrayList<Nut> getNuts()
  {
    return nuts;
  }

  public boolean hasNuts()
  {
    return !nuts.isEmpty();
  }

  public Nut gatherNut()
  {
    if (!hasNuts())
    {
      return null;
    }

    Random random = new Random();
    int index = random.nextInt(0, nuts.size());

    return nuts.remove(index);
  }
}