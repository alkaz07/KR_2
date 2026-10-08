public class Main {
    public static void main(String[] args) {
        System.out.println("Проверяем работоспособность");

        String x = "0";
        int y = 10;
        int z = 3;

        while (y < 15) {
            y += z;
            for (z = 5; z > 2; z--) {
                x = x + y + z;
            }
        }

        System.out.println(x);
    }
}