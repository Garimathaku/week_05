package com.day2;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getters (Jackson needs them for serialization)
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
}

public class CarToJSON {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        Car car = new Car("BMW", "Model B", 2025);
        String carJson = objectMapper.writeValueAsString(car);

        System.out.println(carJson);
    }
}

