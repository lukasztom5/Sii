package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę testów");
        int test = input.nextInt();
        ArrayList<Integer> sumy=new ArrayList<Integer>();
        for(int i=1;i<=test;i++){
            System.out.println("Ile liczb zsumować");
            int ile = input.nextInt();
            int suma = 0;
            for(int j=1;j<=ile;j++){
                System.out.println("Podaj liczbę");
                suma=suma+ input.nextInt();
            }
            sumy.add(suma);
        }
        System.out.println("Output");
        for(int i=0;i<sumy.size();i++){
            System.out.println(sumy.get(i));
        }
        input.close();
    }
}
