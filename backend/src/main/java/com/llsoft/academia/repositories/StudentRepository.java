package com.llsoft.academia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.llsoft.academia.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
