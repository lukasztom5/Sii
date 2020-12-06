package com;

import java.util.Scanner;

public class Z1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba=input.nextInt();
        int suma=0;
        for(int i=0;i<=liczba;i++){
            if(i%5==0){
                suma=suma+i;
            }
        }
        System.out.println("Suma liczb podzielnych przez 5 od 0 do "+liczba+" wynosi "+suma);
    }
}
