package cz2.film;

public class Zaloga {
    String imie;
    String nazwisko;
    Double pensja;

    public Zaloga(String imie, String nazwisko, Double pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Double getPensja() {
        return pensja;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setPensja(Double pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "Zaloga{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pensja=" + pensja +
                '}';
    }
}
