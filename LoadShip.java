package com.example.interviewassignment.cargo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.module.kotlin.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;

@Component
public class LoadShip implements JsonUnmarshaller<Ship> {
    public LoadShip() {
    }
    @Override
    public LinkedList<Ship> createObjects() throws IOException, JSONException {
        ObjectMapper objectMapper = new ObjectMapper();
        String file = new String(Files.readAllBytes(Paths.get("src/main/resources/ships.json")));
        JSONObject jsonShipsObject = new JSONObject(file);
        JSONArray jsonArray = jsonShipsObject.getJSONArray("ships");
        return objectMapper.readValue(jsonArray.toString(), new TypeReference<LinkedList<Ship>>() {
        });
    }
}

