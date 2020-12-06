package cz2;

import java.util.ArrayList;

public class Firma {
    public static void main(String[] args) {
        Pracownik p = new Pracownik("Lukasz","Tomczyk",29);

        Pracownik p1 = new Pracownik("Jan","Tokarski",43);
        
        ArrayList<Pracownik> lista = new ArrayList<>();
        lista.add(p);
        lista.add(p1);
        for(Pracownik pp:lista){
            pp.getImie();
            pp.getNazwisko();
            pp.getWiek();
            pp.danePracownika();
        }
    }
}
class Pracownik{
    String imie;
    String nazwisko;
    int wiek;
    public Pracownik(String imie, String nazwisko, int wiek){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.wiek=wiek;
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public int getWiek(){
        return wiek;
    }
    public void setImie(String imie){
        this.imie=imie;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko=nazwisko;
    }
    public void setWiek(int wiek){
        this.wiek=wiek;
    }
    public void danePracownika(){
        System.out.println(getImie()+" "+getNazwisko()+" : "+getWiek()+" lat");
    }
}
