package sergeev.nikita.squirrelandchipmunk;

//Создать класс Орех. При создании экземпляры класса получают случайный вес от 1,5 до 15 грамм
//Создать класс дерево. Сделать ему метод "вырастить орехи",
// который создает на дереве список со случайным количеством орехов.
// Максимальное количество выращиваемых орехов за раз зависит от уровня дерева,
// уровень повышается на 1 соответствующим методом
//Дать возможность посторонним объектам получить доступ к списку орехов дерева
//Создать класс Белочка. У белочки есть способность собирать орехи с дерева.
// Найдя очередной орех, белочка  гордо сообщает об этом в консоль.
//Сверхспособность белочки - подсчитать, сколько всего орехов она собрала и каков их суммарный вес...
//Но сами орехи она при этом прячет неизвестно куда, и найти потом не может(
//Создать класс Бурундук. У него тоже есть способность собирать орехи с дерева,
// но он их с вероятностью 75% доносит до склада.
//Сверхспособность бурундука - подсчитать, сколько орехов лежит на складе и каков их суммарный вес.
//
//Вырастить небольшую рощу (список из  нескольких деревьев разного уровня)
//С половины деревьев собрать орехи белкой, второй половины - бурундуком

import java.util.List;

public class SquirrelChipmunkRunner {
    static void main() {
        System.out.println(new Nut());
        Tree tree = new Tree();
        System.out.println("Пустое дерево: " + tree);

        tree.getGrowNut(1);

        System.out.println("Вырастили орех: " + tree);
        tree.levelUpOfTree();

        tree.getGrowNut(2);

        System.out.println("Прокачали дерево и вырастили орехи: " + tree);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("=============Squirrel=========");
        Squirrel squirrel = new Squirrel(tree);
        squirrel.calculateNuts();
        System.out.println(squirrel);
        System.out.println("=============Chipmunk=========");
        Chipmunk chipmunk = new Chipmunk(tree);
        chipmunk.transferToStore();
        chipmunk.calculateNuts();
        System.out.println(chipmunk);
        System.out.println("=============Grove=========");
        Grove grove = new Grove();
        List<Tree> treeList = grove.getListGrove(5);

        for (int i = 0; i < treeList.size(); i++) {
            if (i % 2 != 0 || i == 0) {
                squirrel.calculateNuts();
            } else {
                chipmunk.transferToStore();
                chipmunk.calculateNuts();
            }
        }
    }
}

