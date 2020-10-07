package com.lambdaschool.foundation.repository;

import com.lambdaschool.foundation.models.City;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CityRepository extends CrudRepository<City, Long>
{
    City findByName(String cityName);

    List<City> findByCityNameContaining(String cityName);

    List<City> findByStateNameContaining(String state);


}
