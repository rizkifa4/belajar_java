package com.javafundamental.propertimetode;

public class Hewan {

    // Properti atau fields
    // Inisiasi dengan nilai inisial
    double tinggi = 30;
    double berat = 3;

    // Inisiasi melalui konstruktor
    int umur;

    Hewan(int umur) {
        this.umur = umur;
    }

    void lari(){
        System.out.println("Berlari-lari..");
    }

    void jalan(){
        System.out.println("Jalan-jalan");
    }

    void makan(){
        System.out.println("nyum nyum nyum");
    }

    double getBerat() {
        return berat;
    }
    double getTinggi() {
        return tinggi;
    }
    int getUmur() {
        return umur;
    }
}
