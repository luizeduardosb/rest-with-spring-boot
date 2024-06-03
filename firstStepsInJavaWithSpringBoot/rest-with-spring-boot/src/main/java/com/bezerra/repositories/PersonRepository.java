package com.bezerra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezerra.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{}
