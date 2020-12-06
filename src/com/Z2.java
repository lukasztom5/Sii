package com;

import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        for(int i=999;i>=0;i--){
            if(i%5!=0 && i%2!=0 && i%3!=0 && i%7!=0){
                System.out.println(i);
                break;
            }
        }
    }
}
