package cz2.film;

public class Aktor extends Zaloga{

    public Aktor(String imie, String nazwisko, Double pensja) {
        super(imie,nazwisko,pensja*2);
    }
}
