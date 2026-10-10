package lukianov.belochka;

import java.util.List;
import java.util.Random;

/**
 * Реализация сборщика орехов ({@link NutGatherer}) Бурундука.
 * <p>
 * Бурундук собирает орехи с орешника и переносит их на склад.
 * При переносе каждый орех с вероятностью 75% попадает на склад,
 * иначе теряется. Бурундук ведает, сколько орехов у него на складе,
 * и каким общим весом.
 * Класс также отслеживает количество потерянных орехов — чисто
 * для научных интересов статистики.
 */
public class Burunduk implements NutGatherer {
    /**
     * Фактор судьбы, определяющий, какому орешку быть потерянным,
     * а какому доставленным на склад.
     */
    static final private Random fortune = new Random();

    /**
     * Количество орешков на складе.
     */
    private int totalNutsStored;
    /**
     * Суммарный вес орешков на складе.
     */
    private double totalWeightStored;
    /**
     * Количество потерянных орешков (для статистики).
     */
    private int totalNutsLost;

    /**
     * Инструментальный метод, имитирующий доставку собранных орешков
     * на склад.
     * <p>
     * Каждый орешек попадает на склад с вероятностью 75%. Также здесь
     * происходит учёт собранных орехов и их веса, а также потерянных
     * орехов.
     *
     * @param harvest список собранных орешков для доставки на склад
     */
    private void transferToStorage(List<Oreshek> harvest) {
        for (Oreshek nut : harvest)
            if (fortune.nextDouble() <= 0.75) {
                totalNutsStored++;
                totalWeightStored += nut.getWeight();
            } else {
                totalNutsLost++;
            }
    }

    /**
     * Метод, вычисляющий эффективность склада Бурундука.
     * <p>
     * Эффективность вычисляется как отношение количества
     * сохранённых орехов к общему числу собранных орехов
     * (сохранённых и потерянных).
     *
     * @return доля успешно сохранённых орехов в диапазоне [0.0, 1.0];
     *         0, если орехи ещё вовсе не собирались
     */
    public double getStorageEfficiency() {
        int totalNutsGathered = totalNutsStored + totalNutsLost;
        return totalNutsGathered != 0 ?
                (double) totalNutsStored / totalNutsGathered :
                0;
    }

    /**
     * Собирает орехи с указанного орешника и переносит их на склад.
     * <p>
     * Как требуется контрактом, после сбора список орехов орешника
     * опорожняется.
     *
     * @param tree орешник, с которого производится сбор орехов
     */
    @Override
    public void gatherFromTree(Oreshnik tree) {
        List<Oreshek> harvest = tree.getOreshki();
        transferToStorage(harvest);
        tree.getOreshki().clear();
    }

    /**
     * Показывает сверхспособность Бурундука, состоящую в том, что он
     * сообщает в консоль, сколько орехов поступило к нему на склад,
     * и какой суммарной массой в граммах.
     */
    @Override
    public void showSuperpower() {
        IO.println("У меня на складе %d орехов, общей массой %.1f грамм!"
                .formatted(totalNutsStored, totalWeightStored));
    }
}
