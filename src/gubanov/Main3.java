package gubanov;

import gubanov.squirrel.Nut;

import java.util.Scanner;

public class Main3
{
  public static void main()
  {
    String userName = readUserName();
    boolean isNameLastLetterSpecific = isNameLastLetterSpecific(userName);
    sayHelloToUser(isNameLastLetterSpecific);
  }

  private static String readUserName()
  {
    System.out.println("Как тебя зовут?");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  private static boolean isNameLastLetterSpecific(String userName)
  {
    if (userName.isEmpty())
    {
      return false;
    }

    char lastLetter = userName.toLowerCase().charAt(userName.length() - 1);
    return lastLetter == 'а' || lastLetter == 'и' || lastLetter == 'я';
  }

  private static void sayHelloToUser(boolean isNameLastLetterSpecific)
  {
    String sayHello = isNameLastLetterSpecific ? "Приветик!" : "Здарова!";
    System.out.println(sayHello);
  }

  public static class Tree
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
}