package com.transport;

import counters.Sails;
import counters.Sorting;
import counters.Wheels;
import land.transport.Paxcar;
import land.transport.Scooter;
import land.transport.Truck;
import sea.transport.Ferry;
import sea.transport.Yacht;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transport> landTransport = new ArrayList<>();

        Scooter scooter = new Scooter("Трековый", "мини", 5000, 2);
        Paxcar paxcar = new Paxcar("Легковушка", "медиум", 13500, 4);
        Truck truck = new Truck("трак", "большой", 23000, 6);

        List<Transport> seaTransport = new ArrayList<>();

        Ferry ferry = new Ferry("байдарка", "small", 12000, 2);
        Yacht yacht = new Yacht("катамаран", "medium", 25000, 15);

        seaTransport.add(yacht);
        seaTransport.add(ferry);
        landTransport.add(scooter);
        landTransport.add(paxcar);
        landTransport.add(truck);

        Wheels wheels = new Wheels();
        System.out.println("Number of wheels is " + wheels.getWheels(landTransport));

        Sails sails = new Sails();
        System.out.println("Number of sails is " + sails.getSails(seaTransport));

        List<Transport> allTransport = new ArrayList<>();
        allTransport.add(yacht);
        allTransport.add(ferry);
        allTransport.add(scooter);
        allTransport.add(paxcar);
        allTransport.add(truck);

        Sorting sort = new Sorting();
        sort.sortByPrice(allTransport);
        for (Transport transport : allTransport) {
            System.out.println("Отсортированный список транспорта:");
            System.out.println(transport.getName() + " : " + transport.getPrice());
        }

        sort.bubbleSorting(allTransport);
        for (Transport str : allTransport) {
            System.out.println("Отсортированный список транспорта(bubble):");
            System.out.println(str.getName() + " : " + str.getPrice());
        }

        sort.insersionSort(allTransport);
        for (Transport pr: allTransport) {
            System.out.println("Отсортированный список транспорта(insertion):");
            System.out.println(pr.getName() + " : " + pr.getPrice());
        }
    }
}