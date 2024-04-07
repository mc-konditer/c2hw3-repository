package ru.nzyryaniov.c2hw3;

public class Main {

    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle("GT", 2);
        Vehicle car = new Car("Subaru", 4);
        Truck truck = new Truck("Freightliner", 6);


        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bicycle);
        serviceStation.check(car);
        serviceStation.check(truck);


    }

}
