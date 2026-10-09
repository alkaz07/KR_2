package perova;

public class Squirrel_4_Perova {
    public static void main() {

        Squirrel squirrel1 = new Squirrel("Белочка");
        Tree tree1 = new Tree();
        Nut[] mas = tree1.masNuts(15);
        squirrel1.getherNuts(mas);
    }

    static class Nut {
        public double getWeight() {
            return 12.5;
        }
    }

    static class Tree {
        public Nut[] masNuts(int count) {
            Nut[] nuts = new Nut[count];
            for (int i = 0; i < count; i++) {
                nuts[i] = new Nut();
            }
            return nuts;
        }
    }

    static class Squirrel {
        String name;

        public Squirrel(String name) {
            this.name = name;
        }

        public void getherNuts(Nut[] mas) {
            double totalMass = 0;
            for (int i = 0; i < mas.length; i++) {
                System.out.println("Ура, еще орех!");
                totalMass += mas[i].getWeight();
            }
            System.out.println("Общий вес собранных орехов: " + totalMass);
        }
    }
}




