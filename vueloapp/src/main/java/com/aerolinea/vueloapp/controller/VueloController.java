package com.aerolinea.vueloapp.controller;

import com.aerolinea.vueloapp.model.Vuelo;
import com.aerolinea.vueloapp.service.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vuelos")
@CrossOrigin(origins = "http://localhost:3000")
public class VueloController {

    @Autowired
    private VueloService vueloService;

    @GetMapping("/buscar")
    public List<Vuelo> buscarVuelos(
            @RequestParam String origin,
            @RequestParam String destination,
            @RequestParam String classType,
            @RequestParam Integer maxPassengers
    ) {
        return vueloService.buscarVuelos(origin, destination, classType, maxPassengers);
    }
}

