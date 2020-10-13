package com.lambdaschool.foundation.services;


import com.lambdaschool.foundation.exceptions.ResourceNotFoundException;
import com.lambdaschool.foundation.models.City;
import com.lambdaschool.foundation.models.CityMetric;
import com.lambdaschool.foundation.models.Metric;
import com.lambdaschool.foundation.repository.MetricRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "MetricService")
public class MetricServiceImpl implements MetricService
{
    @Autowired
    private MetricRepository metricRepository;

    @Autowired
    private CityService cityService;

    @Override
    public List<Metric> findall()
    {
        List<Metric> list = new ArrayList<>();

        metricRepository.findAll()
                .iterator()
                .forEachRemaining(list::add);
        return list;
    }

    // TODO
    @Override
    public Metric save(Metric metric) {
        Metric newMetric = new Metric();

        if (metric.getMetricid() != 0)
        {
            metricRepository.findById(metric.getMetricid())
                    .orElseThrow(() -> new ResourceNotFoundException("Role id " + metric.getMetricid()+ " not found!"));
            newMetric.setMetricid(metric.getMetricid());
        }

        newMetric.setLabel(metric.getLabel());
        newMetric.setScoreType(metric.getScoreType());

        for (CityMetric cm : metric.getCityMetrics())
        {
            City addCity = cityService.findCityById(cm.getCity()
                    .getCityid());
            newMetric.getCityMetrics()
                    .add(new CityMetric(addCity, newMetric, cm.getScore()));
        }

        return metricRepository.save(newMetric);
    }

    @Override
    public Metric findById(Long id)
    {
        return metricRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Role id " + id + " not found!"));
    }
}
