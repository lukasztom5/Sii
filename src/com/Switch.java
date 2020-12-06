package com;

import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
       /* int y=9;
        switch(y){
            case 1:
                System.out.println("To jest 1");
                break;
            case 2:
                System.out.println("To jest 2");
                break;
            case 3:
                System.out.println("To jest 3");
                break;
            default:
                System.out.println("To jest inna liczba");
                break;
        }*/
        //Pierwszy
        /*Scanner input = new Scanner(System.in);
        System.out.println("Podaj imie");
        String imie = input.next();
        switch(imie){
            case "Lukasz":
                System.out.println("Cześć Lukasz");
                break;
            case "Marcin":
                System.out.println("Cześć Marcin");
                break;
            case "Monika":
                System.out.println("Cześć Monika");
                break;
            case "Ola":
                System.out.println("Cześć Ola");
                break;
            default:
                System.out.println("Nie znam cię");
                break;
        }
*/
        //Drugi
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj owoc");
        String owoc = input.next();
        System.out.println("Podaj ilość");
        int ilosc = input.nextInt();
        switch(owoc){
            case "jablka":
                owocIlosc(owoc,ilosc);
                break;
            case "banany":
                owocIlosc(owoc,ilosc);
                break;
            case "pomarancze":
                owocIlosc(owoc,ilosc);
                break;
            default:
                System.out.println("Nie ma takiego owocu");
                break;
        }
        input.close();

    }

    private static void owocIlosc(String owoc, int ilosc) {
        if(ilosc<100 && ilosc>0){
            System.out.println(owoc+" : Dla nich jest jeszcze miejsce - jest jeszcze "+(100-ilosc)+" kg miejsca");
        }
        else if(ilosc==100){
            System.out.println(owoc+" : Zajęto całą ilość - "+(100-ilosc)+" kg miejsca");
        }
        else if(ilosc>100){
            System.out.println(owoc+" : Za duża ilość - o "+(ilosc-100)+" kg za duzo");
        }
        else if(ilosc==0){
            System.out.println(owoc+" : Brak towaru - 100 kg miejsca");
        }
        else if(ilosc<0){
            System.out.println(owoc+" : Niewiadoma ilość");
        }
    }
}
