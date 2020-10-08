package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.Metric;

import java.util.List;

public interface MetricService
{
    List<Metric> findall();
    Metric save(Metric metric);
}
