package com.example.interviewassignment.cargo;

import org.springframework.boot.configurationprocessor.json.JSONException;

import java.io.IOException;
import java.util.LinkedList;

public interface JsonUnmarshaller<A> {
    LinkedList<A> createObjects() throws IOException, JSONException;
}

