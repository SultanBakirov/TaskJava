package com.company.Homework_19;

public class Main {
    public static void main(String[] args) {
        Flat flat = new Flat(6,"AL.KEN 78");
        Hotel hotel = new Hotel(2, "Bokonbaeva 12");
        Dormitory dormitory = new Dormitory(3, "Komunisticheskaya 88");

        Rent[] live = {flat, hotel, dormitory};
        for (Rent rent: live) {
            System.out.println(rent);
            rent.paid();
        }
    }
}
