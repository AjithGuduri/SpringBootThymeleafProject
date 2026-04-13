package com.vcube.sbthapp01.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.sbthapp01.model.Car;

public interface CarRepo extends JpaRepository<Car, Integer> {
	

}