package com.infosys.streamset.orchestrator.repository;

import com.infosys.streamset.orchestrator.entity.Person;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

  Person findByName(String name);
}