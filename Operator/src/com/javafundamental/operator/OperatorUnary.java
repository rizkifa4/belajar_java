package com.javafundamental.operator;

public class OperatorUnary {
    public static void main(String[] args) {
        System.out.println("Opertor Unary Plus");
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        System.out.println("Hasil +5 = " + hasil);

        System.out.println("Opertor Unary Plus");
        int nilaiAwal2 = 5;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("Hasil -5 = " + nilaiAwal2);

        System.out.println("Operator Penambahan ");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("Hasil 5++ = " + nilaiAwal3);

        System.out.println("Hasil Pengurangan");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("Hasil 5-- = " + nilaiAwal4);

        System.out.println("Opreator Komplemen logika");
        boolean sukses = false;
        System.out.println("Hasil !false = " + !sukses);
    }
}
