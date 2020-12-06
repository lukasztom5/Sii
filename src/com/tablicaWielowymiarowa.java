package com;

public class tablicaWielowymiarowa {
    public static void main(String[] args) {
        int tablica[][]=new int[2][3];
        int z=0;
        for(int i=0;i<tablica.length;i++){
            for(int j=0;j<tablica[i].length;j++){
                tablica[i][j] = z;
                System.out.println("Tablica["+i+"]["+j+"] = "+z);
                z++;
            }
        }
    }
}
