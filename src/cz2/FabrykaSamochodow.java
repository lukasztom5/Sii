package cz2;

public class FabrykaSamochodow {
    public static void main(String[] args) {

    }
}
interface Samochod{
    int maxPredkosc();
}
class BMW implements Samochod{
    int cena;
    int maxPredkosc=320;
    String color;
    public BMW(int cena,int maxPredkosc,String color){
        this.cena=cena;
        this.maxPredkosc=maxPredkosc;
        this.color=color;
    }
    @Override
    public int maxPredkosc() {
        return maxPredkosc;
    }
}
class Audi implements Samochod{
    int cena;
    int maxPredkosc=325;
    String color;
    public Audi(int cena,int maxPredkosc,String color){
        this.cena=cena;
        this.maxPredkosc=maxPredkosc;
        this.color=color;
    }
    @Override
    public int maxPredkosc() {
        return maxPredkosc;
    }
}
class Mercedes implements Samochod{
    int cena;
    int maxPredkosc=315;
    String color;
    public Mercedes(int cena,int maxPredkosc,String color){
        this.cena=cena;
        this.maxPredkosc=maxPredkosc;
        this.color=color;
    }
    @Override
    public int maxPredkosc() {
        return maxPredkosc;
    }
}
