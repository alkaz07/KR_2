Package Klevchova;
//public class Klevchova {

    public static void main() {

        BelochkaKl belochkaKl = new BelochkaKl();
        TreeKl treeKl = new TreeKl();
        int kolvo = 15;
        //NutArray [] nutArray = treeKl.nutArrayGrow(kolvo);

        belochkaKl.countWeightNut(treeKl.nutArrayGrow(kolvo - 1));
    }

    public class NutKl {

        public static final double WEIGHT_NUT = 12.5;
    }

    public static class BelochkaKl {
        double sumWeight;

        public void countWeightNut(int nutArray[]) {
            double sumWeight = 0;
            //int count = 0;

            for (int i = 0; i <= nutArray.length; ++i) {

                System.out.println("ура, еще орех!");

                sumWeight = sumWeight + NutKl.WEIGHT_NUT;
            }


            System.out.println("Общий вес собранных орехов: " + sumWeight);
        }
    }

public static class TreeKl {

    public int[] nutArrayGrow(int kolvo) {
        int n=1;
        int[] nutArray = new int[kolvo];
        for (int i = 1; i < kolvo; i++) {
            nutArray[i] = n;
        }
        //ThreadLocalRandom.current().nextInt(2);

        return nutArray;
    }
}





