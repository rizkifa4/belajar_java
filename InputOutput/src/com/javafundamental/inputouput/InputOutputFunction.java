package com.javafundamental.inputouput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Sederhana");
        System.out.print("Masukkan Angka Pertama = ");
        int nilai1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua = ");
        int nilai2 = scanner.nextInt();
        int hasil = nilai1 + nilai2;
        System.out.println("Hasilnya adalah " + hasil);
    }
}
