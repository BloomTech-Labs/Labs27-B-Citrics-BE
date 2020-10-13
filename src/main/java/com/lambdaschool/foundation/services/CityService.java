package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.City;

import java.util.List;

public interface CityService
{
    List<City> findAll();

    City save(City city);

    City findCityById(Long id);

    City findByCityName(String name);

//    City findByStateName(String state);



}
