package com.aerolinea.vueloapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



import java.util.Date;


@Entity

public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String origin;
    private String destination;
    private Date startDate;
    private Date endDate;
    private Double maxPrice;
    private String luggageType;
    private String classType;
    private Integer maxPassengers;


    public Vuelo() {
    }


    public Vuelo(Long id, String origin, String destination, Date startDate, Date endDate, Double maxPrice, String luggageType, String classType, Integer maxPassengers) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
        this.maxPrice = maxPrice;
        this.luggageType = luggageType;
        this.classType = classType;
        this.maxPassengers = maxPassengers;
    }

    // toString() override
    @Override
    public String toString() {
        return "Vuelo{" +
                "id=" + id +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", maxPrice=" + maxPrice +
                ", luggageType='" + luggageType + '\'' +
                ", classType='" + classType + '\'' +
                ", maxPassengers=" + maxPassengers +
                '}';
    }
}

