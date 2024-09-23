package com.aerolinea.vueloapp.repository;

import com.aerolinea.vueloapp.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Long> {
    List<Vuelo> findByOriginAndDestinationAndClassTypeAndMaxPassengersLessThanEqual(
            String origin,
            String destination,
            String classType,
            Integer maxPassengers
    );
}
