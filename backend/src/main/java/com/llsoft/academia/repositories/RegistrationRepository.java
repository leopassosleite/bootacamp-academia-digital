package com.llsoft.academia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.llsoft.academia.entities.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}
