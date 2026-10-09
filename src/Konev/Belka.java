package Konev;

public class Belka {

    public void findNuts(Derevo derevo){
        double totalNuts = 0.0;
        for (int i = 0; i < derevo.nuts.length; i++) {
            System.out.println("Нашла орех с номером " +(i+1) + ". " + "Общий вес найденных орехов " +(i+1)*Const.NUTWEIGHT);

            totalNuts += 1;
        }

    }

}
