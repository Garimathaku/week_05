package com.day2;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

class Employee {
    private String name;
    private int age;
  //constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}
//Main class
public class ListToJsonArray {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        List<Employee> employees = Arrays.asList(
                new Employee("Garima", 21),
                new Employee("Ria", 25)
        );

        String jsonArray = objectMapper.writeValueAsString(employees);
        System.out.println(jsonArray);
    }
}

