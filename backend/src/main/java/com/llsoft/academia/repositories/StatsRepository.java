package com.llsoft.academia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.llsoft.academia.entities.Stats;

public interface StatsRepository extends JpaRepository<Stats, Long> {

}
