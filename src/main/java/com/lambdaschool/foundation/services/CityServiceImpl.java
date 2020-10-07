package com.lambdaschool.foundation.services;


import com.lambdaschool.foundation.exceptions.ResourceNotFoundException;
import com.lambdaschool.foundation.models.*;
import com.lambdaschool.foundation.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "CityService")
public class CityServiceImpl implements CityService
{

    @Autowired
    private CityRepository cityRepo;

    @Override
    public List<City> findAll()
    {
        List<City> list = new ArrayList<>();

        cityRepo.findAll()
                .iterator()
                .forEachRemaining(list::add);
        return list;

    }

    @Override
    public City save(City city) {
        City newCity = new City();

        if (city.getCityid() != 0)
        {
            cityRepo.findById(city.getCityid())
                    .orElseThrow(() -> new ResourceNotFoundException("User id " + city.getCityid() + " not found!"));
            newCity.setCityid(city.getCityid());
        }

        newCity.setCityName(city.getCityName());
        newCity.setZipcode(city.getZipcode());
        newCity.setState((city.getState()));

        return cityRepo.save(newCity);
    }

    @Override
    public City findCityById(long id)throws
            ResourceNotFoundException
    {
        return cityRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("City " + id + " not found!"));
    }

    @Override
    public City findByCityName(String name)
    {
        return cityRepo.findByCityName(name);
    }

    @Override
    public List<City> findByCityNameContaining(String cityName)
    {
        return cityRepo.findByCityNameContaining(cityName);
    }

    @Override
    public List<City> findByStateContaining(String state)
    {
        return cityRepo.findByStateContaining(state);
    }


}
