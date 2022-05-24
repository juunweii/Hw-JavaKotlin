package com.train;

public class ticket {
    int OneWayPrice = 1000;
    int RoundTripPrice = 1800;

    int OneWay;
    int RoundTrip;

    public ticket(int OneWay, int RoundTrip) {
        this.OneWay = OneWay;
        this.RoundTrip = RoundTrip;

    }

    public void print(){
        System.out.println("Total tickets: "+OneWay+"\n"+"Round trips: "+RoundTrip+"\n"+"Total: "+(OneWay*OneWayPrice+RoundTrip*RoundTripPrice));
    }
}
