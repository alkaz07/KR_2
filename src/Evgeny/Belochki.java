package Evgeny;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Belochki {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Введите количество найденных орехов");
        //int qty = input.nextInt();

        System.out.println("Средний вес ореха" + Nut(weight));
        System.out.println("Количество орехов:" + Arrays.toString(groveNuts));
        System.out.println("общий вес орехов:" + (weight * groveNuts));
    }
}

class Nut {
    double weight = 12.5;
}

class NutTree {
    public static int[] growGroveNutTrees(int qty) {
        int[] groveNuts = new int[qty];
        Random random = new Random();
        for (int i = 0; i < qty; i++) {
            groveNuts[i] = random.nextInt(10);
        }
        System.out.println("Количество деревьев:" + Arrays.toString(groveNuts));
        return groveNuts;
    }
}

class Belochka {
    public static int[] nutHurvest(int groveNuts, double weight) {
        int[] nuts = new int[groveNuts];
        Random random = new Random();
        for (int i = 0; i < nuts; i++) {
            nuts[i] = random.nextInt(10);
        }
        System.out.println("Ура еще орешек!:" + Arrays.toString(nuts));
        return nuts;

    }
}

/*
Создать класс Орешек с полем вес. Все орешки создаются с весом 12.5. Изменить вес ореха нельзя.
Создать класс Дерево, у которого есть метод ВыраститьМассивОрехов. Параметр метода
это количество, результат - массив Орешков.
Создать класс Белочка, у которой есть метод собирания орехов из массива, выращенного деревом.
 Белочка перебирает каждый орешек в массиве, говорит "ура, еще орех!" и суммирует вес всех
 найденных орехов.
В итоге она гордо сообщает, какой общий вес она насобирала.

Продемонстрировать работу системы с 1 объектом класса Белочка, 1 Деревом и массивом из 15 орехов.
 */