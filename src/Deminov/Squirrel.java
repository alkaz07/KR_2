package Deminov;

public class Squirrel {
    public void collectingNuts(Nut[] nuts) {

        double totalWeight = 0;

        for (Nut nut : nuts) {
            System.out.println("Ура, еще орех!");
            totalWeight += nut.getNutWeight();
        }

        System.out.println("Я насобирала орехов общим весом: " + totalWeight);
    }
}
