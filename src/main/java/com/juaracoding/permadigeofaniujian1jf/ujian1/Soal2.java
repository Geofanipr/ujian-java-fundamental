package com.juaracoding.permadigeofaniujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama film: ");
        String movieName = scanner.nextLine();
        String movieNameInCapital = movieName.toUpperCase();
        System.out.println("Nama film dalam huruf besar: " + movieNameInCapital);
        scanner.close();
    }
}
