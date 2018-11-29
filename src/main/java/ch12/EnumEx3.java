package ch12;

import java.util.Comparator;

enum Transportation {
    BUS(100) {int fare(int distance) {return distance*BASIC_FARE;}},
    TRAIN(150) {int fare(int distance) {return distance*BASIC_FARE;}},
    SHIP(100) {int fare(int distance) {return distance*BASIC_FARE;}},
    AIRPLANE(300) {int fare(int distance) {return distance*BASIC_FARE;}};

    protected final int BASIC_FARE;

    Transportation(int basicFare) {
        BASIC_FARE = basicFare;
    }

    public int getBASIC_FARE() {
        return BASIC_FARE;
    }
    abstract int fare(int distance);
}


public class EnumEx3 {
    public static void main(String[] args) {
        System.out.println("bus fare ="+ Transportation.BUS.fare(100));
        System.out.println("TRAIN fare ="+ Transportation.TRAIN.fare(100));
        System.out.println("SHIP fare ="+ Transportation.SHIP.fare(100));
        System.out.println("AIRPLANE fare ="+ Transportation.AIRPLANE.fare(100));

        System.out.println("BUS BASIC fare ="+ Transportation.BUS.getBASIC_FARE());
        System.out.println("TRAIN BASIC fare ="+ Transportation.TRAIN.getBASIC_FARE());
        System.out.println("SHIP BASIC fare ="+ Transportation.SHIP.getBASIC_FARE());
        System.out.println("AIRPLANE BASIC fare ="+ Transportation.AIRPLANE.getBASIC_FARE());
    }

}
