package sergeev.nikita.squirrel;

public class Nut {
    private final double weight = 12.5;

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