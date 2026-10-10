package lukianov.belochka;

/**
 * Реализация сборщика орехов {@link NutGatherer}, предоставляющая Белочку,
 * собирающую орешки с орешника и рассказывающую о своих достижениях.
 * <p>
 * Ведёт учёт общего количества собранных орехов и их суммарного веса.
 */
public class Belochka implements NutGatherer {

    /**
     * Общее количество собранных орехов.
     */
    private int totalNutsGathered;
    /**
     * Общий вес собранных орехов.
     */
    private double totalWeightGathered;

    /**
     * Собирает все орешки с указанного дерева.
     * <p>
     * Считает собранных орешки и их суммарный вес, с гордостью
     * сообщает о каждом собранном орешке.
     * Как требуется контрактом, после сбора очищает список орехов на дереве.
     *
     * @param tree дерево ({@link Oreshnik}), с которого собираются орехи
     */
    @Override
    public void gatherFromTree(Oreshnik tree) {
        for (Oreshek nut : tree.getOreshki()) {
            totalNutsGathered++;
            totalWeightGathered += nut.getWeight();
            System.out.println("Коллеги! Я с гордостью сообщаю, что, ура, ещё орех!");
        }
        tree.getOreshki().clear();
    }

    /**
     * Показывает сверхспособность Белочки, состоящую в том, что она
     * сообщает, какое количество орехов собрала и каким общим весом в граммах.
     * При этом отмечает, что не факт, что все эти орехи она потом найдёт.
     */
    @Override
    public void showSuperpower() {
        System.out.printf("Я собрала %d орехов, общим весом в %.1f грамм!" +
                        " Но сколько смогу найти - точно не скажу!%n",
                        totalNutsGathered, totalWeightGathered);
    }
}
