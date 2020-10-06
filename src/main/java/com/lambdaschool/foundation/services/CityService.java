package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.City;
import com.lambdaschool.foundation.models.User;

import java.util.List;

public interface CityService
{
    List<City> findAll();

    City save(City city);

    City findCityById(long id);

    City findByCityName(String name);

    List<City> findByCityNameContaining(String cityname);

    List<City> findByStateContaining(String state);

}
