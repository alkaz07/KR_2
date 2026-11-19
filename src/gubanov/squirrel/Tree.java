package gubanov.squirrel;

public class Tree
{
  public Nut[] growNutArray(int nutCount)
  {
    Nut[] nuts = new Nut[nutCount];
    for (int i = 0; i < nutCount; i++)
    {
      nuts[i] = new Nut();
    }

    return nuts;
  }
}