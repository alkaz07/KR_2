package Konev;
import java.util.Scanner;

public class Task03_Hello {

        /*Спросить пользователя "как тебя зовут?"
        прочитать его имя
        Если имя заканчивается на а, я или и, вывести "Приветик!", иначе вывести "Здарова!"*/
        public static void main(String[] args) {
            System.out.println("Напишите своё имя!");
            String userName;
            String finalChar;
            Scanner sc= new Scanner(System.in);
            userName = sc.next();

            finalChar = String.valueOf(userName.charAt(userName.length() - 1));
            if (finalChar.equals("а") || finalChar.equals("я") || finalChar.equals("и"))
            {
                System.out.println("Приветик!");
            }
            else {System.out.println("Здарова!");
            }

        }



    }


