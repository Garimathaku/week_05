package com.day2;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJson {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        String json = "{\"name\":\"Garima\", \"age\":21}";

        // Parse JSON
        JsonNode node = objectMapper.readTree(json);

        // Validate required fields
        if (node.has("name") && node.has("age")) {
            System.out.println("Valid JSON Structure");
        } else {
            System.out.println("Invalid JSON Structure");
        }
    }
}

