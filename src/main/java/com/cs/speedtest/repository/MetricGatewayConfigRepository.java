/*
 * Created on 2022-06-09 ( Date ISO 2022-06-09 - Time 21:05:06 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.cs.speedtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cs.speedtest.entities.MetricGatewayConfig;

/**
 * Spring data Jpa repository for "MetricGatewayConfig" <br>
 * 
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
@Repository
public interface MetricGatewayConfigRepository extends JpaRepository<MetricGatewayConfig, String> {
}