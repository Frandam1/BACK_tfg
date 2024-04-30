package com.diario.controller;

import com.diario.entities.Diario;
import com.diario.persistence.DiarioEntryRepository;
import com.diario.service.DiarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/diario")
public class DiarioController {

    @Autowired
    private DiarioService diarioService;

    @PostMapping
    public Diario crearEntrada(@RequestBody Diario entrada) {
        return diarioService.saveEntry(entrada);
    }
}
//
//    @GetMapping("/{userId}")
//    public List<Diario> getEntradas(@PathVariable Long userId){
//        return diarioService.getEntriesByIserId(userId);
//    }
//}
