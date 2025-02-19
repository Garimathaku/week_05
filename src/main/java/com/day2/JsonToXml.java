package com.day2;

import org.json.JSONObject;
import org.json.XML;

public class JsonToXml {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"Garima\", \"age\":21}";
        JSONObject json = new JSONObject(jsonString);
        String xml = XML.toString(json);
        System.out.println(xml);
    }
}

