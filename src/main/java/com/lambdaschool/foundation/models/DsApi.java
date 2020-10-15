package com.lambdaschool.foundation.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DsApi
{
//"city_id": 7,
//  "city": "Oro Valley, Arizona",
//  "population": 44350,
//  "median_age": 52.4,
//  "median_household_income": 85392,
//  "median_individual_income": 45092,
//  "median_home_cost": 311829,
//  "median_rent": 1139,
//  "Cost-of-Living-Index": 91.3

    private long city_id;

    private String city;
    private long population;
    private double median_age;
    private long median_household_income;
    private long median_individual_income;
    private long median_home_cost;
    private long median_rent;
    private double Cost_of_Living_Index;

    public DsApi()
    {
    }

    public DsApi( long city_id, String city, long population, double median_age, long median_household_income, long median_individual_income, long median_home_cost, long median_rent, double cost_of_Living_Index)
    {
        this.city_id = city_id;
        this.population = population;
        this.median_age = median_age;
        this.median_household_income = median_household_income;
        this.median_individual_income = median_individual_income;
        this.median_home_cost = median_home_cost;
        this.median_rent = median_rent;
        this.Cost_of_Living_Index = cost_of_Living_Index;
    }


    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public long getPopulation()
    {
        return population;
    }

    public void setPopulation(long population)
    {
        this.population = population;
    }

    public double getMedian_age()
    {
        return median_age;
    }

    public void setMedian_age(double median_age)
    {
        this.median_age = median_age;
    }

    public long getMedian_household_income()
    {
        return median_household_income;
    }

    public void setMedian_household_income(long median_household_income)
    {
        this.median_household_income = median_household_income;
    }

    public long getMedian_individual_income()
    {
        return median_individual_income;
    }

    public void setMedian_individual_income(long median_individual_income)
    {
        this.median_individual_income = median_individual_income;
    }

    public long getMedian_home_cost()
    {
        return median_home_cost;
    }

    public void setMedian_home_cost(long median_home_cost)
    {
        this.median_home_cost = median_home_cost;
    }

    public long getMedian_rent()
    {
        return median_rent;
    }

    public void setMedian_rent(long median_rent)
    {
        this.median_rent = median_rent;
    }

    public double getCost_of_Living_Index()
    {
        return Cost_of_Living_Index;
    }

    public void setCost_of_Living_Index(double cost_of_Living_Index)
    {
        Cost_of_Living_Index = cost_of_Living_Index;
    }

    public long getCity_id()
    {
        return city_id;
    }

    public void setCity_id(long city_id)
    {
        this.city_id = city_id;
    }
}
