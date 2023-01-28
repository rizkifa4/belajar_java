package com.javafundamental.objek;

public class main {
    public static void main(String[] args) {
       Hewan Kucing = new Hewan("Kucing");
       Hewan Harimau = new Hewan("Harimau");

       Kucing.beratHewan(10);
       Kucing.jumlahKakiHewan(4);
       Kucing.cetakHewan();

       Harimau.beratHewan(100);
       Harimau.jumlahKakiHewan(4);
       Harimau.cetakHewan();
    }
}
