/*
 * Created on 2022-06-09 ( Date ISO 2022-06-09 - Time 21:05:06 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.cs.speedtest.service;

import java.util.List;
import java.util.Optional;

import com.cs.speedtest.entities.GatewayTestResult;
import com.cs.speedtest.repository.GatewayTestResultRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Spring persistence service for "GatewayTestResult" <br>
 * @author Telosys (http://www.telosys.org/) version 3.3.0
 */
@Service
@Transactional
public class GatewayTestResultPersistenceService  {

	@Autowired
	private GatewayTestResultRepository gatewayTestResultRepository;


	public GatewayTestResult findById(String guid) {

		Optional<GatewayTestResult> optionalEntity = gatewayTestResultRepository.findById(guid);
		if ( optionalEntity.isPresent() ) {
			return optionalEntity.get();
		}
		return null ;

	}

	public List<GatewayTestResult> findAll() {
		//return mapper.mapEntityToRecord(gatewayTestResultRepository.findAll());

		List<GatewayTestResult> entities = gatewayTestResultRepository.findAll() ;
		List<GatewayTestResult> records = new java.util.LinkedList<GatewayTestResult>();
		for ( GatewayTestResult entity : entities ) {
			records.add(entity) ;
		}
		return records ;

	}

	public long countAll() {
		return gatewayTestResultRepository.count();
	}

	public GatewayTestResult save(GatewayTestResult record) {
//		return mapper.map(gatewayTestResultRepository.save(mapper.map(record)));
		GatewayTestResult saved = gatewayTestResultRepository.save(record );
		return saved;

	}

	public boolean update(GatewayTestResult record) {

		if ( exists(record) ) {
			gatewayTestResultRepository.save(record);
			return true;
		}
		return false;
	}

	public GatewayTestResult create(GatewayTestResult record) {
		GatewayTestResult saved = gatewayTestResultRepository.save(record );
		return saved;

	}

	public boolean deleteById(String guid) {
		final Optional<GatewayTestResult> optinalEntity = gatewayTestResultRepository.findById(guid);
		if( ! optinalEntity.isPresent() ) {
			return false;
		}

		else {
			gatewayTestResultRepository.delete(optinalEntity.get());
			return true;
		}
	}

	public boolean delete(GatewayTestResult record) {
		if(record == null) {
			return false;
		}
		return deleteById( record.getGuid() );

	}

	public boolean exists(String guid) {
		return gatewayTestResultRepository.findById(guid).isPresent();
	}

	public boolean exists(GatewayTestResult record) {
		return record == null ? false : gatewayTestResultRepository.findById(record.getGuid()).isPresent();
	}

}
