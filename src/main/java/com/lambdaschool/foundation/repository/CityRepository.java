package com.lambdaschool.foundation.repository;

import com.lambdaschool.foundation.models.City;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CityRepository extends CrudRepository<City, Long>
{

    City findByCityName(String name);


    List<City> findByCityNameContaining(String cityName);


    List<City> findByStateContaining(String state);


    City findByLatandLong(Double lat, Double lng);

}
