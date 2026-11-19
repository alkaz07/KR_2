package Deminov;

public class Main3 {
    static void main(String[] args) {
        String name = IO.readln("Как тебя зовут? ").trim().toLowerCase();
        if (name.charAt(name.length() - 1) == 'а' || name.charAt(name.length() - 1) == 'я'
                || name.charAt(name.length() - 1) == 'э') {
            IO.println("Приветик!");
        } else {
            IO.println("Здарова!");
        }
    }
}