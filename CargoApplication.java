package com.example.interviewassignment.cargo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.configurationprocessor.json.JSONException;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.LinkedList;

@SpringBootApplication
public class CargoApplication {

    public static void main(String[] args) throws IOException, JSONException {
        SpringApplication.run(CargoApplication.class, args);
    }

}
