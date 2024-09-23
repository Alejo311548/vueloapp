package com.aerolinea.vueloapp.service;

import com.aerolinea.vueloapp.model.Vuelo;
import com.aerolinea.vueloapp.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueloService {

    @Autowired
    private VueloRepository vueloRepository;

    public List<Vuelo> buscarVuelos(String origin, String destination, String classType, Integer maxPassengers) {
        return vueloRepository.findByOriginAndDestinationAndClassTypeAndMaxPassengersLessThanEqual(
                origin, destination, classType, maxPassengers
        );
    }
}
