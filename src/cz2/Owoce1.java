package cz2;

import java.util.ArrayList;
import java.util.List;

public class Owoce1 {
    public static void main(String[] args) {
        Owoce j=new Jablka(5,10,"czerowny");
        Owoce p = new Pomarancze(7,5,"pomaranczowy");
        Owoce b= new Banany(6,15,"zolty");
        List<Owoce> owoce=new ArrayList<>();
        owoce.add(j);
        owoce.add(p);
        owoce.add(b);
        for(Owoce o:owoce){
            System.out.println(o.pobierzCene());
        }
    }
}
class Jablka implements Owoce{
    int cena;
    int waga;
    String kolor;
    public Jablka(int cena,int waga, String kolor){
        this.cena=cena;
        this.waga=waga;
        this.kolor=kolor;
    }
    @Override
    public int pobierzCene() {
        return cena;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }
}
class Pomarancze implements Owoce{
    int cena;
    int waga;
    String kolor;
    public Pomarancze(int cena,int waga, String kolor){
        this.cena=cena;
        this.waga=waga;
        this.kolor=kolor;
    }
    @Override
    public int pobierzCene() {
        return cena;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }
}
class Banany implements Owoce{
    int cena;
    int waga;
    String kolor;
    public Banany(int cena,int waga, String kolor){
        this.cena=cena;
        this.waga=waga;
        this.kolor=kolor;
    }
    @Override
    public int pobierzCene() {
        return cena;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }
}
interface Owoce{
    int pobierzCene();
    int pobierzWage();
}
