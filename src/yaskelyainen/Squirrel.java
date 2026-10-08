package yaskelyainen;

public class Squirrel {
    public void pickNuts(Nut[] nuts){
        double total = 0;
        for (int i = 0; i < nuts.length; i++) {
            System.out.println("ура, еще орех!");
            total += nuts[i].getWeight();
        }
        System.out.println("Собрала " + total);
    }
}
