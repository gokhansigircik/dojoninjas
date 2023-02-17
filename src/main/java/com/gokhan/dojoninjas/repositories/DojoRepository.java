package com.gokhan.dojoninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gokhan.dojoninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long>{
  List<Dojo> findAll();
}
