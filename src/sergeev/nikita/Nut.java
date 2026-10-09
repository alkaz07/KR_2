package sergeev.nikita;

public class Nut {
    private static final double weight = 12.5;

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Nut{" +
                "weight=" + weight +
                '}';
    }
}