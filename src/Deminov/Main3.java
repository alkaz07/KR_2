package Deminov;

public class Main3 {
    static void main(String[] args) {
        String name = IO.readln("Как тебя зовут? ").trim().toLowerCase();;
        if (name.charAt(name.length() - 1) == 'а' || name.charAt(name.length() - 1) == 'я'
                || name.charAt(name.length() - 1) == 'э') {
            IO.println("Приветик!");
        } else {
            IO.println("Здарова!");
        }
        System.out.println("Символ: " + name.charAt(name.length() - 1));
        System.out.println("Код символа: " + (int) name.charAt(name.length() - 1));
        System.out.println("Ожидаемый код: " + (int) 'а');
    }
}