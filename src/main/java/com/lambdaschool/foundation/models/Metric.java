package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "metric")
public class Metric extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long metricid;

//    @NotNull
//    @Column(unique = true)
    private String label;

//    @NotNull
//    @Column(unique = true)
    private String scoreType;

    @OneToMany(mappedBy = "metric",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JsonIgnoreProperties(value = "metric",
            allowSetters = true)
    private Set<CityMetric> cityMetrics = new HashSet<>();



    public Metric()
    {
    }

    public Metric(@NotNull String label, @NotNull String scoreType)
    {
        this.label = label;
        this.scoreType = scoreType;
    }

    public long getMetricid()
    {
        return metricid;
    }

    public void setMetricid(long metricid)
    {
        this.metricid = metricid;
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel(String label)
    {
        this.label = label;
    }

    public String getScoreType()
    {
        return scoreType;
    }

    public void setScoreType(String scoreType)
    {
        this.scoreType = scoreType;
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
