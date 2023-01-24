package com.javafundamental.function;

public class ReturnFunction {
    public static void main(String[] args) {
        double p = 5;
        double l = 10;
        double hasil = hitungLuas(p, l);
        System.out.println("Luasnya adalah " + hasil);
    }

    public static double hitungLuas(double panjang, double lebar){
        double luas = panjang * lebar;
        return luas;
    }
}
