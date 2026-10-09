package lukianov.belochka;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Представляет рощу орешника ({@link Oreshnik}).
 * <p>
 * Эта запись оборачивает список деревьев и предоставляет операции
 * для управления ими: симулировать прошествие года, вырастить орехи
 * на всех деревьях, получить отчёт о плодовитости ({@link Oreshnik#level})
 * деревьев, а также узнать о количестве деревьев в роще.
 * </p>
 *
 * @param trees список ореховых деревьев в роще
 */
public record Grove(List<Oreshnik> trees) {
    /**
     * Конструктор, создающий рощу с заданным количеством деревьев.
     * Каждое дерево создаётся со случайным уровнем продуктивности.
     * @param trees сколько деревьев.
     */
    public Grove(int trees) {
        this(new ArrayList<>(trees));
        IntStream.range(0, trees)
                .mapToObj(_ -> new Oreshnik())
                .forEach(this.trees::add);
    }

    /**
     * Симулирует прошествие года в роще.
     * Повышает уровень каждого дерева на 1.
     */
    public void yearPass() {
        trees.forEach(Oreshnik::upgrade);
    }

    /**
     * Выращивает орехи на всех орешниках в роще.
     */
    public void growNuts() {
        trees.forEach(Oreshnik::growNuts);
    }

    /**
     * Выводит в консоль справку о том, каких уровней у нас
     * деревья в этом сезоне.
     */
    public void reportProductivity() {
        String report = trees.stream()
                .map(Oreshnik::getLevel)
                .map(String::valueOf)
                .collect(Collectors.joining(" - "));
        IO.println("В этой роще растут прекрасные орешники," +
                " максимальная продуктивность деревьев следующая:");
        IO.println(report);
    }

    /**
     * Сообщает количество деревьев в роще.
     * @return количество орешников в роще.
     */
    public int size() {
        return trees.size();
    }
}

