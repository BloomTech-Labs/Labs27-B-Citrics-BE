package com.lambdaschool.foundation.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "city")
public class City extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cityid;


//    @Column(unique = true)
    private String cityName;


//    @Column(unique = true)
    private String state;


//    @Column(unique = true)
    private double lat;


//    @Column(unique = true)
    private double lon;


//    @Column(unique = true)
    private String zipcode;


    @OneToMany(mappedBy = "city",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JsonIgnoreProperties(value = "city",
            allowSetters = true)
    private Set<CityMetric> cityMetrics = new HashSet<>();




    public City()
    {
    }

    public City(String cityName, String state, double lat, double lon, String zipcode)
    {
        this.cityName = cityName;
        this.state = state;
        this.lat = lat;
        this.lon = lon;
        this.zipcode = zipcode;
    }

    public long getCityid()
    {
        return cityid;
    }

    public void setCityid(long cityid)
    {
        this.cityid = cityid;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getZipcode()
    {
        return zipcode;
    }

    public void setZipcode(String zipcode)
    {
        this.zipcode = zipcode;
    }


    public double getLat()
    {
        return lat;
    }

    public void setLat(double lat)
    {
        this.lat = lat;
    }

    public double getLon()
    {
        return lon;
    }

    public void setLon(double lon)
    {
        this.lon = lon;
    }

    public Set<CityMetric> getCityMetrics()
    {
        return cityMetrics;
    }

    public void setCityMetrics(Set<CityMetric> cityMetrics)
    {
        this.cityMetrics = cityMetrics;
    }
}
