package com.juaracoding.permadigeofaniujian1jf.ujian1;

public class Soal3 {

    public static void main(String[] args) {
        int numberOfTickets = 6;
        String dayType = "weekend";
        int ticketPrice;
        if (dayType.equals("weekday")){
            ticketPrice = 35000;
        } else if (dayType.equals("weekend")){
            ticketPrice = 45000;
        } else {
            System.out.println("Jenis hari tidak valid.");
            return;
        }
        int totalPrice = numberOfTickets * ticketPrice;
        if (numberOfTickets > 5){
            totalPrice = (int) (totalPrice * 0.9); //diskon 10%
        }
        System.out.println("Jumlah tiket: " + numberOfTickets);
        System.out.println("Total harga (dengan diskon): " + totalPrice);
    }
}
