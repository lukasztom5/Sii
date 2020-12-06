package com;

public class wyjatek {
    public static void main(String[] args) {
        try {
            int tablica[] = {1, 2, 3, 4, 5};
            for (int i = 0; i <= tablica.length; i++){
                System.out.println(tablica[i]);
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("Indeks poza zakresem "+e.getMessage());
        }
    }
}
