package com.train;


import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter number of tickets: ");
        int OneWay = s.nextInt();

        System.out.print("How many round-trip tickets: ");
        int RoundTrip = s.nextInt();


        ticket t = new ticket(OneWay, RoundTrip);
        t.print();

    }

}
