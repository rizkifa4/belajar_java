package com.javafundamental.inputouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {

    public static void main(String[] args) {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program Penjumlahan sederhanda");
        int nilai1 = 0;
        int nilai2 = 0;
        try {
            System.out.print("Masukkan nilai 1 = ");
            nilai1 = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukkan nilai 2 = ");
            nilai2 = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int hasil = nilai1 + nilai2;
        System.out.println("Hasilnya adalah = " + hasil);
    }
}
