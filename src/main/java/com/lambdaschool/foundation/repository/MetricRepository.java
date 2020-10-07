package com.lambdaschool.foundation.repository;

import com.lambdaschool.foundation.models.Metric;
import org.springframework.data.repository.CrudRepository;

public interface MetricRepository extends CrudRepository<Metric, Long>
{
}
