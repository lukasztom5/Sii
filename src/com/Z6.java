package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Z6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> liczby=new ArrayList<Integer>();
        int w=input.nextInt();
        liczby.add(w);
        int count=0;
        do{
            System.out.println("Podaj liczbę");
            int n=input.nextInt();
            liczby.add(n);
            if(n==42 && liczby.get(liczby.size()-2)!=42){
                count++;
            }
        }while(count!=3);
        System.out.println(liczby);
    }
}
