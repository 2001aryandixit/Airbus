package com.airbus.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airbus.entity.Aircraft;

public interface AircraftRepo extends JpaRepository<Aircraft, Integer>{

}
