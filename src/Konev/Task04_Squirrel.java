package Konev;

import java.util.Scanner;

public class Task04_Squirrel {

    public static void main(String[] args) {

        System.out.println("Введите количество орешков");
        Scanner sc = new Scanner(System.in);
        int nutsCount = sc.nextInt();
        Belka belka = new Belka();
        Derevo derevo = new Derevo();
        derevo.nuts=derevo.makeNut(nutsCount);
        belka.findNuts(derevo);



    }

}



