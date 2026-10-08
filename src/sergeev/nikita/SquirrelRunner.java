package sergeev.nikita;

//    Создать класс Орешек с полем вес. Все орешки создаются с весом 12.5. Изменить вес ореха нельзя.
//    Создать класс Дерево, у которого есть метод ВыраститьМассивОрехов. Параметр метода
//    это количество, результат - массив Орешков.
//    Создать класс Белочка, у которой есть метод собирания орехов из массива, выращенного деревом.
//    Белочка перебирает каждый орешек в массиве, говорит "ура, еще орех!" и суммирует вес всех найденных орехов.
//    В итоге она гордо сообщает, какой общий вес она насобирала.
//
//    Продемонстрировать работу системы с 1 объектом класса Белочка, 1 Деревом и массивом из 15 орехов.
public class SquirrelRunner {
    static void main() {
        Nut nut = new Nut();
        System.out.println(nut.toString());
        Tree tree = new Tree();
        tree.getGrowNutArray(15);
        System.out.println(tree.toString());
        Squirrel squirrel = new Squirrel();
        squirrel.getSumNutsFromArray(tree.getGrowNutArray(15));
        System.out.println(squirrel.toString());

    }

    static public class Nut {
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

    static public class Tree {
        private Nut nut = new Nut();
        private int numberNuts;

        public int[] getGrowNutArray(int numberNuts) {
            int[] nutsArray = new int[numberNuts];

            for (int i = 0; i < numberNuts; i++) {
                nutsArray[i] = (int) nut.getWeight();
            }

            return nutsArray;
        }

        public String toString() {
            return "Tree{" +
                    "nut=" + nut +
                    ", numberNuts=" + numberNuts +
                    '}';
        }
    }

    static public class Squirrel {
        Tree tree;

        public double getSumNutsFromArray(int numberNuts) {
            int[] arrayNuts = new Tree().getGrowNutArray(numberNuts);
            double sumWeight = 0;

            for (int i = 0; i < arrayNuts.length; i++) {
                System.out.println("ура, еще орех!");
                sumWeight = sumWeight + arrayNuts[i];
            }

            return sumWeight;
        }

        @Override
        public String toString() {
            return "Squirrel{" +
                    "tree=" + tree +
                    '}';
        }
    }
}

