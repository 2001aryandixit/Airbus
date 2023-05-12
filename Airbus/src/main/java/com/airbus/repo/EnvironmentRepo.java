package com.airbus.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airbus.entity.EnvironmentalMetrics;

public interface EnvironmentRepo extends JpaRepository<EnvironmentalMetrics, Integer>{

}
