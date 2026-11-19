package sergeyByul;

public class Main4 {
    public static void main(String[] args) {
        Tree tree = new Tree(); // дерево
        Squirrel squirrel = new Squirrel(); // белочка
        Nut[] harvest = tree.growNutsArray(15);  // 15 на дереве
        squirrel.collectNuts(harvest); // Белка собирает
    }
}

// Класс Орешек
class Nut {
    private final double weight; // потому что нельзя изменять!

    public Nut() {
        this.weight = 12.5;
    }

    public double getWeight() {
        return weight;
    }
}

// Класс Дерево
class Tree {
    // Выращиваем орехи
    public Nut[] growNutsArray(int count) {
        Nut[] nuts = new Nut[count];
        for (int i = 0; i < count; i++) {
            nuts[i] = new Nut();
        }
        return nuts;
    }
}

// Класс Белочка
class Squirrel {

    public void collectNuts(Nut[] nuts) { // Белка собирает орехи
        double totalWeight = 0;

        for (Nut nut : nuts) {
            if (nut != null) { // Проверка на случай пустых ячеек в массиве
                System.out.println("Ура, еще орех!");
                totalWeight += nut.getWeight();
            }
        }

        System.out.println("Я гордо заявляю, что насобирала орехов общим весом: " + totalWeight);
    }
}
