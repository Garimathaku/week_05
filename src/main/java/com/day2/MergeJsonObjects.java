package com.day2;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonObjects {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        // First JSON Object
        String json1 = "{\"name\":\"Garima\", \"age\":21}";
        JsonNode node1 = objectMapper.readTree(json1);

        // Second JSON Object
        String json2 = "{\"city\":\"Delhi\", \"email\":\"garima@gmail.com\"}";
        JsonNode node2 = objectMapper.readTree(json2);

        // Merging the objects
        ObjectNode mergedNode = objectMapper.createObjectNode();
        mergedNode.setAll((ObjectNode) node1);
        mergedNode.setAll((ObjectNode) node2);

        String mergedJson = objectMapper.writeValueAsString(mergedNode);
        System.out.println(mergedJson);
    }
}

