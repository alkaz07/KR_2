package Aim_KR2;

public class Main33 {
    public static void main(String[] args) {
        // Спросить пользователя "как тебя зовут?"
        //прочитать его имя
        //Если имя заканчивается на а, я или и, вывести "Приветик!",
        //иначе вывести "Здарова!"

        String name = IO.readln("как тебя зовут? ");
        char lastChar = name.charAt(name.length() -1);
         if (lastChar == 'а' || lastChar == 'я' || lastChar == 'и'){
             System.out.println("Приветик");
         } else {
             System.out.println("Здарова");
         }
    }
}
