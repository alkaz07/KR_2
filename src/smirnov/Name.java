package smirnov;

//Спросить пользователя "как тебя зовут?"
//прочитать его имя
//Если имя заканчивается на а, я или и, вывести "Приветик!", иначе вывести "Здарова!"

import java.util.Scanner;

public class Name {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String normalizedName = name.trim().toLowerCase();
        if (normalizedName.endsWith("a") || normalizedName.endsWith("я") || normalizedName.endsWith("и")) {
            System.out.println( "Приветик!");
        } else {
           System.out.println("Здарова!");
        }
    }
}
