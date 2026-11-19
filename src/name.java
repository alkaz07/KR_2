import java.util.Scanner;
public class name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Как тебя зовут?");
            String name = scanner.nextLine().trim().toLowerCase();

            if (name.matches(".*[аяи]$")) {
                System.out.println("Приветик!");
            } else {
                System.out.println("Здарова!");
            }
        }
    }
}