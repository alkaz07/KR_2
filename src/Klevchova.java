Package Klevchova;

//import java.util.concurrent.ThreadLocalRandom;
public class Klevchova {
    static void main() {



        BelochkaKl belochkaKl = new BelochkaKl();
        TreeKl treeKl = new TreeKl();
        int kolvo = 15;
        NutKl[] nutKl = treeKl.nutArrayGrow(kolvo);
        belochkaKl.countWeightNut(nutArray);
    }

    public class BelochkaKl {

        void countWeightNut() {
            double sumWeight = 0;
            for (int i = 0; i <= nutArray.lenght; ++i) {

                System.out.println("ура, еще орех!");
                sumWeight += nutArray[i].getWEIGHT_NUT();
            }
            System.out.println("Общий вес собранных орехов: " + sumWeight);
        }
    }

    public class NutKl {
        private final double WEIGHT_NUT = 12.5;

        public double getWEIGHT_NUT() {
            return WEIGHT_NUT;
        }
    }
    public class TreeKl {     // массив орехов
        public NutKl[] nutArrayGrow(int kolvo) {
            NutKl[] nutArray = new NutKl[kolvo];
            for (int i = 0; i < kolvo; i++) {
                nutArray[i] = new NutKl();
            }
            //ThreadLocalRandom.current().nextInt(2);

            return nutArray;
        }
    }
}


