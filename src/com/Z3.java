package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Z3 {
    public static void main(String[] args) {
        //Dla wczytanej liczby z klawiatury liczby naturalnej n wypisuje jej dzielniki
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = input.nextInt();
        ArrayList<Integer> dzielniki=new ArrayList<Integer>();
        for(int i=1;i<=liczba;i++){
            if(liczba%i==0){
                dzielniki.add(i);
            }
        }
        System.out.println(dzielniki);
    }
}
