package cz2;

public class klasa {
    public static void main(String[] args) {
        Samochód fiat=new Samochód();
        Samochód kia=new Samochód();
        fiat.jedzie();
        fiat.kolor="czerwony";
    }
}
class Samochód{
    String kolor;
    public void jedzie(){
        System.out.println("Jedzie");
    }
}