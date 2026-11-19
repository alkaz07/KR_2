package Plyusnina4;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();                 // Создается 1 Объект Дерево
        Squirrel squirrel = new Squirrel();     // Создается 1 Объект Белочка
        int count = 15;                         // Количество орехов = 15
        Nut[] nuts = tree.grownNutsArray(count);// вызов метода создания массива орехов (передаем количество=15)
        squirrel.collectNuts(nuts);             // вызов метода белочка собирает орехи
    }
}

class Nut {                                     // Класс Орешек
    private final double weight = 12.5;         // поле вес нельзя изменять, это константа

    public double getWeight() {                 // геттер
        return weight;                          // возврат веса
    }
}

class Tree {                                   // Класс Дерево
    //метод - вырастить массив орехов
    public Nut[] grownNutsArray(int count) {   //принимаемый параметр (количество орехов)
            Nut[] nuts = new Nut[count];
            for (int i = 0; i < count; i++) {
                nuts[i] = new Nut();
            }
            return nuts;                        // возврат массива орехов
    }
}

class Squirrel  {                               // Класс Белочка
        public void collectNuts(Nut[] nuts) {   // Метод - сбор орехов (принимает массив орехов)
            double totalWeight = 0.0;           //переменная суммарный вес
            for (int i = 0; i< nuts.length; i++) {
                System.out.println("Ура! Еще орех!");
                totalWeight += nuts[i].getWeight(); //к суммарному весу прибавляется вес следующего ореха (можно 12.5)
            }
            System.out.println("Белочка гордо сообщает, какой общий вес она насобирала: "+totalWeight+" г.");
        }
}