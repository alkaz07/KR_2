package sergeyByul;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main4Extended {
    public static void main(String[] args) {
        // Выращиваем небольшую рощу из 5 деревьев разного уровня
        List<TreeExt> grove = new ArrayList<>();
        grove.add(new TreeExt(1));
        grove.add(new TreeExt(4));
        grove.add(new TreeExt(3));
        grove.add(new TreeExt(5));
        grove.add(new TreeExt(2));


        System.out.println("\n--- Выращиваем урожай в роще ---");
        for (TreeExt tree : grove) {
            tree.growNutsExt();
        }

        // Повысим уровень первому дереву для проверки метода
        grove.get(0).levelUpExt();
        grove.get(0).growNutsExt();


        SquirrelExt squirrel = new SquirrelExt();
        ChipmunkExt chipmunk = new ChipmunkExt();

        int halfSize = grove.size() / 2;

        System.out.println("\n--- Белочка собирает орехи с первой половины деревьев ---");
        System.out.println("Количество деревьев сбора Белочкой " + halfSize);
        for (int i = 0; i < halfSize; i++) {
            squirrel.gatherNutsExt(grove.get(i));
        }

        System.out.println("\n--- Бурундук собирает орехи со второй половины деревьев ---");
        System.out.println("Количество деревьев сбора Бурундуком " + (grove.size()-halfSize));
        for (int i = halfSize; i < grove.size(); i++) {
            chipmunk.gatherNutsExt(grove.get(i));
        }

        System.out.println("\n--- Итоги сбора (используем сверхспособности) ---");
        squirrel.useSuperpowerExt();
        chipmunk.useSuperpowerExt();
    }

}

class NutExt {
    private final double weight;

    public NutExt() {
        Random random = new Random();
        // Генерируем случайный вес от 1.5 до 15.0 грамм
        double rawWeight = 1.5 + (15.0 - 1.5) * random.nextDouble();
        // Округляем до двух знаков после запятой для аккуратного вывода
        this.weight = Math.round(rawWeight * 100.0) / 100.0;
    }

    public double getWeightExt() {
        return weight;
    }
}

// 2. Класс Дерево
class TreeExt {
    private int level;
    private final List<NutExt> nuts;
    private final Random random;

    public TreeExt(int initialLevel) {
        this.level = Math.max(1, initialLevel);
        this.nuts = new ArrayList<>();
        this.random = new Random();
    }

    public void levelUpExt() {
        this.level++;
        System.out.println("Дерево выросло! Текущий уровень: " + this.level);
    }

    public void growNutsExt() {
        // Максимальное количество орехов зависит от уровня (например, уровень * 5)
        int maxNuts = this.level * 5;
        int nutsToGrow = random.nextInt(maxNuts) + 1;

        for (int i = 0; i < nutsToGrow; i++) {
            nuts.add(new NutExt());
        }
        System.out.println("На дереве (уровень " + level + ") выросло орехов: " + nutsToGrow + " шт.");
    }

    // Доступ к списку орехов дерева для посторонних объектов
    public List<NutExt> getNutsExt() {
        return nuts;
    }
}

// 3. Класс Белочка
class SquirrelExt {
    private int collectedCount = 0;
    private double totalWeight = 0.0;

    public void gatherNutsExt(TreeExt tree) {
        List<NutExt> treeNuts = tree.getNutsExt();
        Iterator<NutExt> iterator = treeNuts.iterator();

        while (iterator.hasNext()) {
            NutExt nut = iterator.next();
            collectedCount++;
            totalWeight += nut.getWeightExt();

            // Убираем орех с дерева (белочка прячет его неизвестно куда)
            iterator.remove();

            System.out.printf("Белочка гордо сообщает: Ура, я нашла орех весом %.2f г!%n", nut.getWeightExt());
        }
    }

    // Сверхспособность белочки
    public void useSuperpowerExt() {
        System.out.printf("[Сверхспособность Белочки] Всего собрано орехов: %d шт., суммарный вес: %.2f г. (Но где они лежат — загадка!)%n",
                collectedCount, totalWeight);
    }
}

// 4. Класс Бурундук
class ChipmunkExt {
    // Склад бурундука хранит сами объекты орехов
    private final List<NutExt> warehouse = new ArrayList<>();
    private final Random random = new Random();

    public void gatherNutsExt(TreeExt tree) {
        List<NutExt> treeNuts = tree.getNutsExt();
        Iterator<NutExt> iterator = treeNuts.iterator();

        while (iterator.hasNext()) {
            NutExt nut = iterator.next();
            iterator.remove(); // Орех в любом случае снят с дерева

            // Вероятность 75% донести до склада
            if (random.nextDouble() < 0.75) {
                warehouse.add(nut);
                System.out.printf("Бурундук донес "+warehouse.size()+"-й орех (%.2f г) до склада.%n", nut.getWeightExt());
            } else {
                System.out.printf("Бурундук по пути потерял орех (%.2f г)...%n", nut.getWeightExt());
            }
        }
    }

    // Сверхспособность бурундука
    public void useSuperpowerExt() {
        double totalWeight = 0.0;
        for (NutExt nut : warehouse) {
            totalWeight += nut.getWeightExt();
        }
        System.out.printf("[Сверхспособность Бурундука] На складе лежит орехов: %d шт., их суммарный вес: %.2f г.%n",
                warehouse.size(), totalWeight);
    }
}
