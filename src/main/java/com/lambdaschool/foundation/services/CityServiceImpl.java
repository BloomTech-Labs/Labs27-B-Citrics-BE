package com.lambdaschool.foundation.services;


import com.lambdaschool.foundation.exceptions.ResourceNotFoundException;
import com.lambdaschool.foundation.models.*;
import com.lambdaschool.foundation.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
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

//    @Override
//    public City save(City city)
//    {
//        City newCity = new City();
//
//        if (city.getCityid() != 0)
//        {
//            cityRepo.findById(city.getCityid())
//                    .orElseThrow(() -> new ResourceNotFoundException("User id " + city.getCityid() + " not found!"));
//            newCity.setCityid(city.getCityid());
//        }
//
//        newCity.setCityName(city.getCityName());
//        newCity.setState((city.getState()));
//        newCity.setLat(city.getLat());
//        newCity.setLat(city.getLon());
//        newCity.setMedian_age(city.getMedian_age());
//        newCity.setMedian_home_cost(city.getMedian_home_cost());
//        newCity.setMedian_household_income(city.getMedian_household_income());
//        newCity.setMedian_individual_income(city.getMedian_individual_income());
//        newCity.setPopulation(city.getPopulation());
//        newCity.setMedian_rent(city.getMedian_rent());
//
//
//        return cityRepo.save(newCity);
//    }

    @Override
    public City findCityById(Long id)
    {
        return cityRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("City " + id + " not found!"));
    }

    @Override
    public City findByCityName(String name)
    {
        return cityRepo.findByCity(name);
    }

    @Override
    public List<City> findByCityNameContaining(String cityName)
    {
        return cityRepo.findByCityContaining(cityName);
    }

    @Override
    public List<City> findByStateContaining(String state)
    {
        return cityRepo.findByStatenameContaining(state);
    }

//    @Override
//    public City findByLatandLon(double lat, double lon)
//    {
//        return cityRepo.findByLatAndLon(lat, lon);
//    }

    @Override
    public DsApi getDS(Long id)
    {

        String api = "http://citrics-ds.eba-jvvvymfn.us-east-1.elasticbeanstalk.com/";
        String requestLong = api + id;

        City newCity = new City();

        RestTemplate restTemplate = new RestTemplate();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        restTemplate.getMessageConverters().add(converter);

        ParameterizedTypeReference<DsApi> responsetype = new ParameterizedTypeReference<>()
        {
        };

        DsApi entity = restTemplate.getForObject(requestLong, DsApi.class);

        return entity;

    }
}
