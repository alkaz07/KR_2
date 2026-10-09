package Konev;

// Создать класс Дерево, у которого есть метод ВыраститьМассивОрехов. Параметр метода это количество, результат - массив Орешков.
public class Derevo{
    public Nuts[] nuts;
       public Nuts[] makeNut(int nutsCount) {

        Nuts[] nuts = new Nuts[nutsCount];
        for (int i = 0; i < nutsCount; i++) {
            nuts[i] = new Nuts();
        }
        return nuts;
    }
}

