package com.example.interviewassignment.cargo;

import com.fasterxml.jackson.annotation.*;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "built",
        "name",
        "lengthMeters",
        "beamMeters",
        "maxTEU",
        "owner",
        "grossTonnage"
})
public class Ship {
    @JsonProperty
    private int id;
    @JsonProperty
    private int built;
    @JsonProperty
    private String name;
    @JsonProperty
    private Double lengthMeters;
    @JsonProperty
    private Double beamMeters;
    @JsonProperty
    private long maxTEU;
    @JsonProperty
    private String owner;
    @JsonProperty
    private String grossTonnage;

    @JsonCreator
    public Ship(@JsonProperty("id") int id, @JsonProperty("built") int built, @JsonProperty("name") String name, @JsonProperty("lengthMeters") Double lengthMeters, @JsonProperty("beamMeters") Double beamMeters, @JsonProperty("maxTEU") long maxTEU, @JsonProperty("owner") String owner, @JsonProperty("grossTonnage") String grossTonnage) {
        this.id = id;
        this.built = built;
        this.name = name;
        this.lengthMeters = lengthMeters;
        this.beamMeters = beamMeters;
        this.maxTEU = maxTEU;
        this.owner = owner;
        this.grossTonnage = grossTonnage;

    }

    public int getId() {
        return id;
    }

    public int getBuilt() {
        return built;
    }

    public String getName() {
        return name;
    }

    public Double getLengthMeters() {
        return lengthMeters;
    }

    public Double getBeamMeters() {
        return beamMeters;
    }

    public long getMaxTEU() {
        return maxTEU;
    }

    public String getOwner() {
        return owner;
    }

    public String getGrossTonnage() {
        return grossTonnage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(this.owner, o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.owner);
    }
}

