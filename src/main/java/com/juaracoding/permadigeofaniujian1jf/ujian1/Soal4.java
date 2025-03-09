package com.juaracoding.permadigeofaniujian1jf.ujian1;

import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] movieList = new String[5];
        System.out.println("Daftar film bioskop:");
        for (int i = 0; i < movieList.length; i++) {
            System.out.println("Masukkan nama film " + (i + 1) + ": ");
            movieList[i] = scanner.nextLine();
        }
        System.out.println("\nFilm yang ingin ditonton:");
        for (int i = 0; i < movieList.length; i++) {
            System.out.println((i + 1) + ". " + movieList[i]);
        }
        scanner.close();
    }
}
