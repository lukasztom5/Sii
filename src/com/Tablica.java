package com;

import java.util.Scanner;

public class Tablica {
    public static void main(String[] args) {
       /* String[] imie = new String[5];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<imie.length;i++){
            System.out.println("Podaj imie");
            imie[i]=input.next();
        }

        for(int i=0;i<imie.length;i++){
            System.out.println("Witaj "+imie[i]);
        }*/
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj długość tablicy");
        int tablica[]=new int[input.nextInt()];
        int i = 0;
        while(i<tablica.length){
            tablica[i]=i+1;
            System.out.println("tablica["+i+"] = "+tablica[i]);
            i++;
        }

        input.close();
    }
}
