package com.lambdaschool.foundation.models;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CityMetricId
    implements Serializable
{

    private long city;

    private long metric;

    public CityMetricId()
    {
    }


    public CityMetricId(long city, long metric)
    {
        this.city = city;
        this.metric = metric;
    }


    public long getCity()
    {
        return city;
    }

    public void setCity(long city)
    {
        this.city = city;
    }

    public long getMetric()
    {
        return metric;
    }

    public void setMetric(long metric)
    {
        this.metric = metric;
    }


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityMetricId that = (CityMetricId) o;
        return city == that.city &&
                metric == that.metric;
    }

    @Override
    public int hashCode()
    {
//        return Objects.hash(city, metric);
        return 37;
    }
}
