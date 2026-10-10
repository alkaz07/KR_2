package lukianov.belochka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Сценарий исполнения программы, моделирующий сбор орехов в роще от сезона к сезону.
 * <p>
 * Создаётся роща орешника и два сборщика орехов: Белочка и Бурундук,
 * после чего в течение десяти «лет» (сезонов плодоношения) проводятся раунды
 * сбора орехов. В конце каждого раунда каждый сборщик отчитывается о результатах
 * (каждый сообразно своим способностям).
 * По завершении цикла наблюдений выводит итоговую статистику по итоговой
 * эффективности работы склада Бурундука (ожидается в районе 75%).
 */
public class Main {

    /**
     * Проводит один раунд сбора орехов в роще, соответствующий одному
     * сезону плодоношения орешника.
     * <p>
     * Сперва проверяется, что роща не пуста деревьями (иначе сбор
     * прекращается не начавшись).
     * Затем начинается основной цикл. Роща отчитывается о максимальном
     * уровне продуктивности в наступившем сезоне и выращивает орехи на
     * всех деревьях.
     * Деревья и сборщики орехов перемешиваются в случайном порядке,
     * чтобы распределение деревьев в раунде было случайным,
     * а в статистике и честным.
     * <p>
     * Сборщики по очереди собирают орехи со своего дерева, разделив их
     * примерно поровну. По окончанию сбора каждый сборщик
     * демонстрирует свою сверхспособность (рассказывает о результатах).
     *
     * Наконец, сезон завершается, деревья рощи увеличивают свой уровень,
     * чтобы в следующем сезоне производить ещё больше орехов.
     *
     * @param trees     роща орешника, в которой собираются орехи
     * @param habitants сборщики, пришедшие в рощу по орехи
     */
    private static void round(Grove trees, NutGatherer... habitants) {
        if (trees.trees().isEmpty()) {
            IO.println("Нет деревьев, не будет и сбора");
            return;
        }
        trees.reportProductivity();
        trees.growNuts();
        // чтобы случайные деревья всем доставались
        List<Oreshnik> randomizedGrove = new ArrayList<>(trees.trees());
        Collections.shuffle(randomizedGrove);
        // и чтобы сами сборщики в случайном порядке собирали
        List<NutGatherer> randomizedGatherers = new ArrayList<>(List.of(habitants));
        Collections.shuffle(randomizedGatherers);
        // потому что если количество деревьев не кратно,
        // то кому достанется чуть меньше деревьев — это чтоб тоже случайно

        int treeNumber = 0;
        gathering:
        while (true) {
            for (NutGatherer rodent : randomizedGatherers) {
                rodent.gatherFromTree(randomizedGrove.get(treeNumber++));
                // если деревья кончились
                if (treeNumber == randomizedGrove.size()) break gathering;
            }
        }
        // интеллекты упорно предлагали сделать этот перебор ↑ по-другому,
        // но мне всё равно мой вариант кажется самым красивым и надёжным

        randomizedGatherers
                .forEach(NutGatherer::showSuperpower);

        trees.yearPass();
        IO.println();
    }

    public static void main() {

        Grove roscha = new Grove(10);

        NutGatherer[] habitants = {new Belochka(), new Burunduk()};

        for (int i = 1; i <= 10; i++) {
            IO.println("Год " + i);
            round(roscha, habitants);
        }
        for (NutGatherer rodent : habitants) {
            if (rodent instanceof Belochka) {
                IO.println("Белочка нашла примерно 3/4 орешков, которые спрятала, но точно неизвестно!");
            } else if (rodent instanceof Burunduk) {
                IO.println("Учёные вычислили, что эффективность склада Бурундука составила к концу исследования %.2f%%"
                        .formatted(((Burunduk) rodent).getStorageEfficiency() * 100));
            }
        }
    }
}
