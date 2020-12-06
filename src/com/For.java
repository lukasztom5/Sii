package com;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int licznik = input.nextInt();
        for(int i=licznik;licznik>=1;licznik--){
            System.out.println("Bomba wybuchnie za "+ licznik+" s!");
        }
        System.out.println("Boom!");
    }
}
