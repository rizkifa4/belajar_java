package com.javafundamental.basic;

import com.javafundamental.basic.kendaraan.Kereta;
import com.javafundamental.basic.kendaraan.Mobil;
import com.javafundamental.basic.kendaraan.Motor;
import com.javafundamental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        System.out.println("Halo");

        Gitar.bunyi();

        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);

        String greeting = "Haloo";
        System.out.println(greeting);

        char[] rizkiChars = {'R', 'I', 'Z', 'K', 'I'};
        String rizkiString = new String(rizkiChars);
        System.out.println(rizkiString);

        String rizki = "Rizki";
        int length = rizki.length();
        System.out.println(length);

        char result = rizki.charAt(4);
        System.out.println(result);
    }
}
