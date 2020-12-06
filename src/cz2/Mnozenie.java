package cz2;

public class Mnozenie {
    public static void main(String[] args) {
        mnozenie(5,6);
        mnozenie(5,6,7);
        mnozenie(5,6,7,8);
    }
    public static void mnozenie(int a, int b){
        System.out.println(a*b);
    }
    public static void mnozenie(int a,int b,int c){
        System.out.println(a*b*c);
    }
    public static void mnozenie(int a,int b, int c, int d){
        System.out.println(a*b*c*d);
    }
}
