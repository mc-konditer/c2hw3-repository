package ru.nzyryaniov.c2hw3;

public class Truck extends MotorVehicle{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        super.check();
        checkTrailer();
    }
}
