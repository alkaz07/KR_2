package Bessolitsyna.zadacha4hard;

import java.util.List;

public class Squirel {
int totalNuts = 0;
double totalWeight = 0;

    public void collectNuts(Tree tree) {
        List<Nut> treeNuts = tree.getNuts();
        for (Nut nut : treeNuts) {

            totalWeight = totalWeight + nut.getWeightNut();
            System.out.printf("ура, еще орех! (Вес: %.2f граммов)%n", nut.weightNut);
            totalNuts++;
            totalWeight += nut.weightNut;
        }
    }
        public void showResults() {
            System.out.printf ("Белочка собрала %d орехов, общим весом %.2f граммов. Но она не помнит, где их спрятала!%n", totalNuts, totalWeight);
    }
}

