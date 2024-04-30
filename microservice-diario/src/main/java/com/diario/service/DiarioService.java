package com.diario.service;

import com.diario.entities.Diario;
import com.diario.persistence.DiarioEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiarioService {

    @Autowired
    private DiarioEntryRepository diarioEntryRepository;

    public Diario saveEntry(Diario entrada){
        return diarioEntryRepository.save(entrada);
    }

//    public List<Diario> getEntriesByIserId(Long userId){
//        return diarioEntryRepository.findByUserId(userId);
//    }
}
