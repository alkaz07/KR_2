import java.util.Scanner;

public class SuvorinTask3 {
    public static void main(String[] args) {
        String name = askName();
        printName(name);
    }

    static String askName() {
        System.out.println("как тебя зовут?");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    static void printName(String name) {
        char endChar = name.charAt(name.length() - 1);
        switch (endChar) {
            case 'а':
            case 'я':
            case 'и':
                System.out.println("Приветик!");
                break;
            default:
                System.out.println("Здарова!");
                break;
        }
    }
}