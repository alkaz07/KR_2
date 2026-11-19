import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    // ввод
    Scanner scanner=new Scanner(System.in);
    System.out.printf("Как тебя зовут?");
    String name = scanner.nextLine();
    // проверка
    if (name.endsWith("а")||name.endsWith("я")||name.endsWith("и"))
        System.out.printf("Приветик!");
        else  {
        System.out.printf("Здарова!");
        }
    }
}

