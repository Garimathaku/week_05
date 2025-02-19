package com.day2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Arrays;
import java.util.List;

class Employees {
    String name;
    int age;

    public Employees(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ListToJsonArrays {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        List<Employees> employees = Arrays.asList(
                new Employees("Garima", 30),
                new Employees("Ria", 25)
        );

        String jsonArray = gson.toJson(employees);
        System.out.println(jsonArray);
    }
}

