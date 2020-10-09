package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "metric")
public class Metric extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long metricid;

    @NotNull
    @Column(unique = true)
    private long population;

    @NotNull
    @Column(unique = true)
    private  long crimeRate;

    @ManyToOne
    @JoinColumn(name = "cityid")
    @JsonIgnoreProperties(value = "metric",
            allowSetters = true)
    private City city;

    public Metric()
    {
    }


    public Metric(@NotNull long population, @NotNull long crimeRate, City city)
    {
        this.population = population;
        this.crimeRate = crimeRate;
        this.city = city;
    }

    public long getMetricid()
    {
        return metricid;
    }

    public void setMetricid(long metricid)
    {
        this.metricid = metricid;
    }

    public long getPopulation()
    {
        return population;
    }

    public void setPopulation(long population)
    {
        this.population = population;
    }

    public long getCrimeRate()
    {
        return crimeRate;
    }

    public void setCrimeRate(long crimeRate)
    {
        this.crimeRate = crimeRate;
    }

    public City getCity()
    {
        return city;
    }

    public void setCity(City city)
    {
        this.city = city;
    }
}
