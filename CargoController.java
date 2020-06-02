package com.example.interviewassignment.cargo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.LinkedList;

@RestController
public class CargoController {
    LoadShip ships;
    LinkedList<Ship> ownerShips;
    LinkedList<Ship> copyOfShips;

    public CargoController(@Autowired LoadShip ships) throws IOException, JSONException {
        this.ships = ships;
        this.copyOfShips = ships.createObjects();

    }

    @GetMapping(path = "/allShips")
    public LinkedList<Ship> allShips() throws IOException, JSONException {
        return copyOfShips;
    }

    @GetMapping(path = "/singleShip")
    public Ship oneShip(@RequestParam(value = "id") int id) {
        for(Ship ship : copyOfShips){
            if(ship.getId() == id ){
                return ship;
            }
        }
        return null;
    }

    @GetMapping(path = "/ownerShips" )
    public LinkedList<Ship> ownersShips(@RequestParam String owner) {
        LinkedList<Ship> ownerShips = new LinkedList<>();

        for(Ship ship : copyOfShips){
            if(ship.getOwner().equals(owner) ){
                ownerShips.add(ship);
            }
        }
        return ownerShips;
    }


    @DeleteMapping(path = "/deleteShip")
    public void deleteShips(@RequestParam(value = "id") int shipId) {
        for(Ship ship : copyOfShips){
            if(ship.getId() == shipId ){
                copyOfShips.remove(ship);
            }
        }
        return;
    }

}
