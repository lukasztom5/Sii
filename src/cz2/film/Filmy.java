package cz2.film;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Filmy {
    static List<Film> filmLista = new ArrayList<>();
    static void wyborOpcji() {
        Scanner input=new Scanner(System.in);
        int counter=0;
        while(counter==0) {
            System.out.println("1 - Dodaj film\n2 - Szukaj filmu po nazwie\n" +
                    "3 - Wypisz filmy z zakresu dat\n4 - Sprawdz w jakich filmach grał dany aktor\n" +
                    "5 - Ile kosztowoło wyprodukowanie filmu");
            System.out.println("Wybierz opcję");
            int wybor = input.nextInt();
            switch (wybor) {
                case 1:
                    break;
                case 2:
                    findMovieByTitle(filmLista);

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Zły wybór");
                    counter++;
            }
        }
    }

    private static void findMovieByTitle(List<Film> filmLista) {
        System.out.println("Podaj tytuł filmu");
        Scanner s=new Scanner(System.in);
        String film= s.nextLine();
        for(Film f:filmLista){
            if(f.getTytul().equals(film)){
                System.out.println(f.toString());
            }
        }
    }
    static void danePrzygotowanie(){
        Rezyser stevenSpielberg=new Rezyser("Steven","Spielberg",2000.00);
        Rezyser jamesCameron=new Rezyser("James","Cameron",3000.00);
        Aktor leonardoDiCaprio=new Aktor("Leonardo","Di Caprio",1000.00);
        Aktor katieWinslet=new Aktor("Kate","Winslet",1100.00);
        Aktor sylvesterStallone=new Aktor("Sylvester","Stallone",1000.00);
        Film titanic=new Film("Titanic",jamesCameron, LocalDate.of(1997,06,06), Arrays.asList(leonardoDiCaprio,katieWinslet),TypFilmu.film_akcji);
        Film rambo=new Film("Rambo",jamesCameron, LocalDate.of(1984,06,12), Arrays.asList(sylvesterStallone),TypFilmu.film_akcji);

        filmLista.add(titanic);
        filmLista.add(rambo);
    }
}
