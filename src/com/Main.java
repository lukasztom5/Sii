package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        System.out.println("test");

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę a");
        int a = input.nextInt();
        System.out.println("Podaj liczbę b");
        int b = input.nextInt();
        if(a>b){
            System.out.println("a jest większe od b");
        }
        else if(a==b){
            System.out.println("a i b są równe");
        }
        else{
            System.out.println("a jest mniejsze od b");
        }
        input.close();

    }
}
