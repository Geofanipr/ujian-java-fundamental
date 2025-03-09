package com.juaracoding.permadigeofaniujian1jf.ujian1;

public class Soal5 {

    public static void main(String[] args) {
        int[] ticketPrice = {50000, 60000, 70000, 80000, 90000};
        int totalPrice = 0;
        for (int i = 0; i < ticketPrice.length; i++) {
            System.out.println("Harga tiket film " + (i + 1) + ": " + ticketPrice[i]);
            totalPrice += ticketPrice[i];
        }
        System.out.println("Total harga tiket: " + totalPrice);
    }
}
