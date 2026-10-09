package krasotkin;

public class Squirrel{
    public void getNuts(Tree tree){
        double total=0.0;
        for (int i = 0; i < tree.nuts.length; i++) {
            IO.println("Ура, орешек");
            total += 12.5;
        }
        IO.println("общий вес орешков: " + total);
    }
}
