package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Z4 {
    public static void pierwsze(int liczba){

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = input.nextInt();
        ArrayList<Integer> liczby = new ArrayList<Integer>();
        for(int i=2;i<=liczba;i++){
            liczby.add(i);
        }
        for(int i=0;i<liczby.size();i++){
            for (int j = 1; j <= liczby.get(i); j++) {
                if (liczby.get(i)%j==0 && (j!=1) && (j!=liczby.get(i))) {
                    liczby.remove(i);
                }
            }
        }
        System.out.println(liczby);
        }
}
