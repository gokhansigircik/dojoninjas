package com.gokhan.dojoninjas.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokhan.dojoninjas.models.DojoNinja;
import com.gokhan.dojoninjas.repositories.DojoNinjaRepository;


@Service
public class DojoNinjaService {
    @Autowired
    DojoNinjaRepository dojoninjaRepository;

    // returns all expenses
    public List<DojoNinja> allDojoNinjas() {
        return dojoninjaRepository.findAll();
    }

    // creates an expense
    public DojoNinja createDojoNinja(DojoNinja dojoninja) {
        return dojoninjaRepository.save(dojoninja);
    }

    // edit an expense
    public void updateDojoNinja(DojoNinja dojoninja) {
        dojoninjaRepository.save(dojoninja);
    }

    // retrieves an expense
    public DojoNinja finddojoninja(Long id) {
        Optional<DojoNinja> optionalDojoNinja = dojoninjaRepository.findById(id);
        if (optionalDojoNinja.isPresent()) {
            return optionalDojoNinja.get();
        } else {
            return null;
        }
    }

        // delete an expense
        public void deleteDojoNinja(DojoNinja dojoninja) {
          dojoninjaRepository.delete(dojoninja);
      }


    public void deleteDojoNinja(Long id) {
    }
}

