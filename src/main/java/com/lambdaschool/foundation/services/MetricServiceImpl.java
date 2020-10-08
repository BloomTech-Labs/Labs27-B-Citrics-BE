package com.lambdaschool.foundation.services;


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
        return metricRepository.save(metric);
    }
}
