package ru.nzyryaniov.c2hw3;

public abstract class Vehicle implements Maintainable {

    private String modelName;

    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем: " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }

    }
}


