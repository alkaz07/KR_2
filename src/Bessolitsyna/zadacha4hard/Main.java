package Bessolitsyna.zadacha4hard;

import Bessolitsyna.zadacha4hard.Nut;
import Bessolitsyna.zadacha4hard.Squirel;
import Bessolitsyna.zadacha4hard.Tree;
import Bessolitsyna.zadacha4hard.Chipmunk;

import java.util.ArrayList;
import java.util.List;

//Создать класс Орех. При создании экземпляры класса получают случайный вес от 1,5 до 15 грамм
//Создать класс дерево. Сделать ему метод "вырастить орехи", который создает на дереве список со случайным количеством орехов.
// Максимальное количество выращиваемых орехов за раз зависит от уровня дерева, уровень повышается на 1 соответствующим методом.
//Дать возможность посторонним объектам получить доступ к списку орехов дерева.
//
//Создать класс Белочка. У белочки есть способность собирать орехи с дерева. Найдя очередной орех, белочка гордо сообщает об этом в консоль.
//Сверхспособность белочки - подсчитать, сколько всего орехов она собрала и каков их суммарный вес...
// Но сами орехи она при этом прячет неизвестно куда, и найти потом не может(
//
//Создать класс Бурундук. У него тоже есть способность собирать орехи с дерева, но он их с вероятностью 75% доносит до склада.
//Сверхспособность бурундука - подсчитать, сколько орехов лежит на складе и каков их суммарный вес.
//
//---------------------------------------------
//Вырастить небольшую рощу (список из нескольких деревьев разного уровня)
//С половины деревьев собрать орехи белкой, второй половины - бурундуком
public class Main {

    public static void main(String[] args) {
        List <Tree> grove = new ArrayList<>();

        double minW = 1.5;
        double maxW = 15;

        int [] levels = {1,2,3,4};
                for (int lvl : levels) {
                    Tree t = new Tree(minW, maxW,lvl);
                    grove.add(t);
                }


        System.out.println("В этой чудесной роще растут разные деревья!");

        for (Tree t: grove) {
         t.growNuts();
        }

        Squirel squirel = new Squirel();
        Chipmunk chipmunk = new Chipmunk();

        int half = grove.size()/2;

        System.out.println("Белочка отправилась на поиски орешков");

        for (int i = 0; i < half; i++) {
            squirel.collectNuts(grove.get(i));
        }
            squirel.showResults();

            System.out.println("И бурундук отправился на поиски орешков");

            for (int i = half; i < grove.size(); i++) {
                chipmunk.collectNuts(grove.get(i));
            }
                chipmunk.showResults();
            }
        }


