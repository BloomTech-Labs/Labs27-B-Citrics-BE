package com.lambdaschool.foundation.repository;

import com.lambdaschool.foundation.models.City;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CityRepository extends CrudRepository<City, Long>
{
    City findByName(String name);

    List<City> findByCityNameContaining(String cityname);

    List<City> findByStateNameContaining(String state);
}
