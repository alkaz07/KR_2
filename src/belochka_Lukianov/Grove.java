package belochka_Lukianov;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public record Grove(List<Oreshnik> trees) {
    public Grove(int trees) {
        this(new ArrayList<>(trees));
        IntStream.range(0, trees)
                .mapToObj(_ -> new Oreshnik())
                .forEach(this.trees::add);
    }

    public void yearPass() {
        trees.forEach(Oreshnik::upgrade);
    }

    public void growNuts() {
        trees.forEach(Oreshnik::growNuts);
    }

    public void reportProductivity() {
        String report = trees.stream()
                .map(Oreshnik::getLevel)
                .map(String::valueOf)
                .collect(Collectors.joining(" - "));
        IO.println("В этой роще растут прекрасные орешники," +
                " максимальная продуктивность деревьев следующая:");
        IO.println(report);
    }

    public int size() {
        return trees.size();
    }
}

