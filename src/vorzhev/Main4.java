package vorzhev;

class Nut {
    // final чтобы вес был запрещен к изменению.
    private final double weight = 12.5;
    public double getWeight() {
        return weight;
    }
}
class Tree {
    // Выращиваем орехи простым цикром.
    public Nut[] growNutsArray(int count) {
        Nut[] nuts = new Nut[count];
        for (int i = 0; i < count; i++) {
            nuts[i] = new Nut(); // Заполняем каждую ячейку новым объектом Орешка
        }
        return nuts;
    }
}

class Squirrel {
    // Собираем Орешки из массива
    public void collectNuts(Nut[] nuts) {
        double totalWeight = 0;

        for (Nut nut : nuts) {
            if (nut != null) { // Защита от пустых ячеек в массиве
                System.out.println("Ура, еще орех!");
                totalWeight += nut.getWeight();
            }
        }
        System.out.println("Я гордо сообщаю, что насобирала орехов общим весом: " + totalWeight);
    }
}
public class Main4 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Squirrel squirrel = new Squirrel();

        // Дерево на 15 орехов, простите что вынес в конец, я либо с статиками запутался, либо что в первом варианте
        // Потому и пришлось main в конце. Частично очень хотел попробовать через такой class попробовать сделать.
        Nut[] harvest = tree.growNutsArray(15);
        squirrel.collectNuts(harvest);
    }
}