package krasotkin;
import java.util.Scanner;

public class Krasotkin {

    void main(){
        Squirrel s = new Squirrel();
        Scanner sc = new Scanner(System.in);
        IO.println("Введите кол-во орешков");
        int N = sc.nextInt();

        Tree tree = new Tree();
        tree.nuts = tree.growNut(N);
        s.getNuts(tree);
    }
}
