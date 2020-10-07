package com.lambdaschool.foundation.services;


import com.lambdaschool.foundation.exceptions.ResourceNotFoundException;
import com.lambdaschool.foundation.models.City;
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
    public City findCityById(long id)throws
            ResourceNotFoundException
    {
        return cityRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("City " + id + " not found!"));
    }

    @Override
    public City findByName(String cityName)
    {
        return null;
    }

    @Override
    public List<City> findByCityNameContaining(String cityName)
    {
        return null;
    }

    @Override
    public List<City> findByStateNameContaining(String state)
    {
        return null;
    }
}
