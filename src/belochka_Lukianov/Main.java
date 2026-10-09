package belochka_Lukianov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

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
