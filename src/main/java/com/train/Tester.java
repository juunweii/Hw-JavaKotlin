package com.train;


import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int OneWay = 0;
        int RoundTrip = 0;

        while(true) {
            System.out.print("Please enter number of tickets: ");
            OneWay = s.nextInt();

            if (OneWay != -1) {
                System.out.print("How many round-trip tickets: ");
                RoundTrip = s.nextInt();

                if(RoundTrip != -1) {
                    ticket t = new ticket(OneWay, RoundTrip);
                    t.print();
                }
                else if(RoundTrip == -1){
                    break;
                }
            }
            else if (OneWay == -1){
                break;
            }
        }
    }

}
