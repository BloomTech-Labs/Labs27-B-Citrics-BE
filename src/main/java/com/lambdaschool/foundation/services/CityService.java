package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.City;
import com.lambdaschool.foundation.models.User;

import java.util.List;

public interface CityService
{
    List<City> findAll();


    City findCityById(long id);

    City findByName(String name);

    List<City> findByCityNameContaining(String cityname);
    List<City> findByStateNameContaining(String state);

}
