package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.City;

import java.util.List;

public interface CityService
{
    List<City> findAll();

    City save(City city);

    City findCityById(Long id);

    City findByCityName(String name);

    List<City> findByCityNameContaining(String cityName);

    List<City> findByStateContaining(String state);

    City findByLatandLon(double lat, double lon);

}
