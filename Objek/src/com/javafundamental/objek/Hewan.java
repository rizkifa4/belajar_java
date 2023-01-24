package com.javafundamental.objek;

public class Hewan {
    String nama;
    double berat;
    int jumlahKaki;
    public Hewan(String namaHewan){
        nama = namaHewan;
    }

    public void beratHewan(double beratHewan){
        berat = beratHewan;
    }

    public void jumlahKakiHewan(int jumlahKakiHewan){
        jumlahKaki = jumlahKakiHewan;
    }

    public void cetakHewan(){
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Berat Hewan: " + berat + " Kg");
        System.out.println("Jumlah Kaki: " + jumlahKaki);
    }
}
