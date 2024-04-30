package com.diario.persistence;

import com.diario.entities.Diario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiarioEntryRepository extends JpaRepository <Diario, Long>{

    //List<Diario> findByUserId(Long userId);
}
