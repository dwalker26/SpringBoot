package com.example.interviewassignment.cargo;

import com.fasterxml.jackson.annotation.*;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"ships"
})
public class Ships {
    @JsonCreator
    public Ships(@JsonProperty("ships") LinkedList<Ship> ships) {
        this.ships = ships;
    }

    @JsonProperty
    public LinkedList<Ship> ships;

    public LinkedList<Ship> getAllShips() {
        return ships;
    }
}
