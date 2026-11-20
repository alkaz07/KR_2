package Bessolitsyna;

public class Squirel {

    public void collectNuts(Nut[] nuts) {
        double totalWeight = 0;
        for (Nut nut : nuts) {

            totalWeight = totalWeight + nut.getWeightNut();
            System.out.println("ура, еще орех!");
        }
        System.out.println("теперь " + totalWeight + " граммов");
    }

    public void showResults() {

    }
}

