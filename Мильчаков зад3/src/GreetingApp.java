import java.util.Scanner;

public class GreetingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Как тебя зовут? ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Ты не ввёл имя!");
            return;
        }

        char lastChar = Character.toLowerCase(name.charAt(name.length() - 1));

        if (lastChar == 'а' || lastChar == 'я' || lastChar == 'и') {
            System.out.println("Приветик!");
        } else {
            System.out.println("Здарова!");
        }

    }
}