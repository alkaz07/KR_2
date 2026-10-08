import java.util.Arrays;

public class Belochka_AL {

    static void main() {
        Belochka belochka = new Belochka();
        Derevo derevo = new Derevo();
        Oreshek[] massivOrekhov = derevo.vyrasitMassivOrekhov(15);
        belochka.gatherOreshki(massivOrekhov);
    }

}
class Oreshek {
    private final double weight = 12.5;

    public double getWeight() {
        return weight;
    }
}

class Derevo {
    public Oreshek[] vyrasitMassivOrekhov(int count) {
        Oreshek[] oreshki = new Oreshek[count];
        Arrays.setAll(oreshki, _ -> new Oreshek());
        return oreshki;
    }
}

class Belochka {
    private double totalWeightGathered;

    public void gatherOreshki(Oreshek[] oreshki) {
        for (Oreshek oreshek : oreshki) {
            totalWeightGathered += oreshek.getWeight();
            System.out.println("ура, еще орех!");
        }
        System.out.println("Коллеги! Я с гордостью сообщаю, что насобирала орешков общим весом "
                + totalWeightGathered);
    }
}