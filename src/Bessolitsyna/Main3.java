package Bessolitsyna;

import java.util.Scanner;

// Спросить пользователя "как тебя зовут?"
//прочитать его имя
//Если имя заканчивается на а, я или и, вывести "Приветик!", иначе вывести "Здарова!"
public class Main3 {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();

        if (name.endsWith("а") || name.endsWith("я") || name.endsWith("и") ||
                name.endsWith("А") || name.endsWith("Я") || name.endsWith("И")) {
            System.out.println("Приветик!");
        } else {
            System.out.println("Здарова!");
        }

        scanner.close();
    }
}

