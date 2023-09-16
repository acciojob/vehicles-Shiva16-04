package com.driver;

public class Boat implements WaterVehicle{
    private String name="The Black Pearl";
    private int capacity=500;
    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
