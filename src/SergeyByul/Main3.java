package sergeyByul;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Как тебя зовут?");

        String name = scanner.nextLine().trim().toLowerCase(); // убрать пробелы и в нижний регистр
        // заканчиваются ли на "а" "я" "и"
        if (name.endsWith("а") || name.endsWith("я") || name.endsWith("и")) {
            System.out.println("Приветик!");
        } else {
            System.out.println("Здарова!");
        }


    }

}