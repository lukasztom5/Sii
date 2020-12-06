package com;

import java.util.Scanner;

public class Bomba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int licznik = input.nextInt();
        while(licznik>=1){
            System.out.println("Bomba wybuchnie za "+ licznik+" s!");
            licznik--;
        }
        System.out.println("Boom!");
        System.out.println("Podaj liczbe");
        int licznik1=input.nextInt();
        do{
            System.out.println("Bomba wybuchnie za "+ licznik1+" s!");
            licznik1--;
        }while(licznik1>0);
        System.out.println("Boom!");
    }
}
