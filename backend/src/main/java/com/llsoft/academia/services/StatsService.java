package com.llsoft.academia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llsoft.academia.entities.Stats;
import com.llsoft.academia.repositories.StatsRepository;

@Service
public class StatsService {

	@Autowired
	private StatsRepository repository;

	public List<Stats> findAll() {
		return repository.findAll();
	}
	
	public Stats findById(Long id) {
		Optional<Stats> obj = repository.findById(id);
		return obj.get();
	}
}
