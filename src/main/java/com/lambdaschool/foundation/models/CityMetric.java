package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "citymetric")
@IdClass(CityMetricId.class)
public class CityMetric
        extends Auditable
        implements Serializable
{
    @Id
    @ManyToOne
    @NotNull
    @JoinColumn(name = "cityid")
    @JsonIgnoreProperties(value = "metric",
            allowSetters = true)
    private City city;

    @Id
    @ManyToOne
    @NotNull
    @JoinColumn(name = "metricid")
    @JsonIgnoreProperties(value = "city",
            allowSetters = true)
    private Metric metric;


//    @NotNull
//    @Column(unique = true)
    private double score;


    public CityMetric()
    {
    }

    public CityMetric(@NotNull City city, @NotNull Metric metric, @NotNull double score)
    {
        this.city = city;
        this.metric = metric;
        this.score = score;
    }

    public City getCity()
    {
        return city;
    }

    public void setCity(City city)
    {
        this.city = city;
    }

    public Metric getMetric()
    {
        return metric;
    }

    public void setMetric(Metric metric)
    {
        this.metric = metric;
    }


    public double getScore()
    {
        return score;
    }

    public void setScore(double score)
    {
        this.score = score;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityMetric that = (CityMetric) o;
        return city.equals(that.city) &&
                metric.equals(that.metric);
    }

    @Override
    public int hashCode()
    {
//        return Objects.hash(city, metric);
        return 37;
    }
}
