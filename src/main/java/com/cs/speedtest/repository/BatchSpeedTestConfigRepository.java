/*
 * Created on 2022-06-09 ( Date ISO 2022-06-09 - Time 21:04:52 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.cs.speedtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cs.speedtest.entities.BatchSpeedTestConfig;

/**
 * Spring data Jpa repository for "BatchSpeedTestConfig" <br>
 * 
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
@Repository
public interface BatchSpeedTestConfigRepository extends JpaRepository<BatchSpeedTestConfig, String> {
}