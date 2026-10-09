package sergeev.nikita;

public class Squirrel {

    public double getSumNutsFromArray(Nut[] arrayNuts) {
        double sumWeight = 0;

        for (int i = 0; i < arrayNuts.length; i++) {
            System.out.println("ура, еще орех!");
            sumWeight = sumWeight + arrayNuts[i].getWeight();
        }

        System.out.println("Насобирала: " + sumWeight);
        return sumWeight;
    }
}