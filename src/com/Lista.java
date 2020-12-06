package com;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<Integer>();
        for(int i=0;i<=100;i++){
            liczby.add(i);
        }
        for (int i: liczby)
        {
            if(liczby.get(i) %2==0){
                System.out.println(liczby.get(i)*2);
            }
        }
    }
}
