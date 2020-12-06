package cz2;

public class Rodzina {
    public static void main(String[] args) {
        Dzieci d=new Dzieci("mieszkanie dziadków","dom rodziców",25);
        System.out.println("Dzieci mają "+d.iloscZabawek+" zabawek. Mieszkają z rodzicami w "+d.dom+", a ich dziadkowie w "+d.mieszkanie);
    }
}
class Dziadkowie{
    String mieszkanie;
    public Dziadkowie(String mieszkanie) {
        this.mieszkanie=mieszkanie;
    }
}
class Rodzice extends Dziadkowie{
    String dom;
    Rodzice(String mieszkanie,String dom){
        super(mieszkanie);
        this.dom=dom;
        
    }
}
class Dzieci extends Rodzice{
    int iloscZabawek;
    Dzieci(String mieszkanie,String dom,int iloscZabawek){
        super(mieszkanie,dom);
        this.iloscZabawek=iloscZabawek;
    }
}
