import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    // Расстояние до точки (0, 0)
    public double distanceToOrigin() {
        return Math.hypot(x, y);
    }

    @Override
    public String toString() {
        return String.format("(%.1f; %.1f), r = %.3f", x, y, distanceToOrigin());
    }
}

public class Main {
    public static void main(String[] args) {
        
        List<Point> points = new ArrayList<>(List.of(
                new Point(3, 4),
                new Point(-1, 1),
                new Point(0, 5),
                new Point(2, 2),
                new Point(-6, 8),
                new Point(1, 0)
        ));

        System.out.println("Исходный список:");
        points.forEach(System.out::println);

        points.sort(Comparator.comparingDouble(Point::distanceToOrigin));

        System.out.println("\nОтсортированный список:");
        for (int i = 0; i < points.size(); i++) {
            System.out.printf("%d) %s%n", i + 1, points.get(i));
        }

        int count = points.size();

        double sum = 0;
        for (Point p : points) {
            sum += p.distanceToOrigin();
        }
        double average = sum / count;

        double min = points.get(0).distanceToOrigin();
        double max = points.get(count - 1).distanceToOrigin();

        System.out.println("\n=== Подсчёт ===");
        System.out.println("Всего точек:         " + count);
        System.out.printf("Сумма расстояний:    %.3f%n", sum);
        System.out.printf("Среднее расстояние:  %.3f%n", average);
        System.out.printf("Минимум (ближняя):   %.3f%n", min);
        System.out.printf("Максимум (дальняя):  %.3f%n", max);
    }
}