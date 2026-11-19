package vorzev;

import java.util.Scanner;

// Package пытался, не понял, решил не стоять на месте. Убрал строку

public class NameCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Как тебя зовут?");

        // Считываем строку, убираем пробелы по краям (привычка) и переводим единый регистр чтобы без ошибок сравнивало.
        String name = scanner.nextLine().trim().toLowerCase();

        // Проверяем окончание имени. Мы вроде на уроках EndsWith не трогали, но я его с прошлой учебы люблю.

        if (name.endsWith("а") || name.endsWith("я") || name.endsWith("и")) {
            System.out.println("Приветик!");
        } else {
            System.out.println("Здарова!");
        }
        scanner.close();
    }
}