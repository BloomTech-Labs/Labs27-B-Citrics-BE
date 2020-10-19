package com.lambdaschool.foundation.repository;

import com.lambdaschool.foundation.models.City;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CityRepository extends CrudRepository<City, Long>
{

    City findByCity(String city);


    List<City> findByCityContaining(String city);


    List<City> findByStatenameContaining(String statename);


//    City findByLatAndLon(double lat, double lon);

}
