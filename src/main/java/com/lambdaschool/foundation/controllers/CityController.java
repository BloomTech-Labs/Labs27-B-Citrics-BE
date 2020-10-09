package com.lambdaschool.foundation.controllers;

import com.lambdaschool.foundation.models.City;
import com.lambdaschool.foundation.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    private CityService cityService;

    @PreAuthorize("permitAll()")
    @GetMapping(value = "/cities", produces = "application/json")
    public ResponseEntity<?> listAllCities(){
        List<City> cities = cityService.findAll();

        return new ResponseEntity<>(cities, HttpStatus.OK);
    }

    @PreAuthorize("permitAll()")
    @GetMapping(value = "/city/id/{id}", produces = "application/json")
    public ResponseEntity<?> findCityById(@PathVariable Long id){
        City city = cityService.findCityById(id);

        return new ResponseEntity<>(city, HttpStatus.OK);
    }

    @PreAuthorize("permitAll()")
    @GetMapping(value = "/city/name/{name}", produces = "application/json")
    public ResponseEntity<?> findByCityName(@PathVariable String name){
        City city = cityService.findByCityName(name);

        return new ResponseEntity<>(city, HttpStatus.OK);
    }

    @PreAuthorize("permitAll()")
    @GetMapping(value = "/cities/namelike/{namelike}", produces = "application/json")
    public ResponseEntity<?> findByNameLike(@PathVariable String namelike){
        List<City> cities = cityService.findByCityNameContaining(namelike);

        return new ResponseEntity<>(cities, HttpStatus.OK);
    }

    @PreAuthorize("permitAll()")
    @GetMapping(value = "/cities/state/{state}", produces = "application/json")
    public ResponseEntity<?> findByState(@PathVariable String state){
        String stateUpper = state.toUpperCase();
        List<City> cities = cityService.findByStateContaining(stateUpper);

        return new ResponseEntity<>(cities, HttpStatus.OK);
    }
}
