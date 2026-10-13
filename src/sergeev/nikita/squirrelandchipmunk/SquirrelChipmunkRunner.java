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
        Squirrel squirrel = new Squirrel();
        Chipmunk chipmunk = new Chipmunk();
        Grove grove = new Grove();

        List<Tree> treeList = grove.getListGrove(5);
        squirrel.resetCount();
        chipmunk.resetCount();

        for (int i = 0; i < treeList.size(); i++) {
            Tree treeFromList = treeList.get(i);

            if (i % 2 == 0) {
                System.out.println("SQUIRREL. Tree №: " + i);
                squirrel.calculateNuts(treeFromList);
            } else {
                System.out.println("CHIPMUNK. Tree №: " + i);
                chipmunk.transferToStore(treeFromList);
            }
        }
        System.out.println("+++++++++++++++++TOTAL+++++++++++++++++++++++++++");
        System.out.println("SQUIRREL: " + squirrel);
        System.out.println("CHIPMUNK: " + chipmunk);

    }
}

