package com.gokhan.dojoninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokhan.dojoninjas.models.Ninja;
import com.gokhan.dojoninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

@Autowired
  NinjaRepository ninjaRepository;

  public Ninja createNinja(Ninja ninja){
    return ninjaRepository.save(ninja);
  }

  public List<Ninja> allNinja(){
    return ninjaRepository.findAll();
  }

  
}
