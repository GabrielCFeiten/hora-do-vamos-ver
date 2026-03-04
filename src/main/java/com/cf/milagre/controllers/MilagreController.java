package com.cf.milagre.controllers;

import com.cf.milagre.models.MilagreModel;
import com.cf.milagre.services.MilagreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/milagre")
public class MilagreController {

    @Autowired
    private MilagreService milagreService;

    @GetMapping
    public List<MilagreModel> findAllMilagre(){
        return milagreService.findAllMilagre();
    }

    @PostMapping
    public MilagreModel createMilagre(@RequestBody MilagreModel milagreModel) {
        return milagreService.createMilagre(milagreModel);
    }

    @DeleteMapping("/{id}")
    public void deleteMilagre(@PathVariable Long id){
        milagreService.deleteMilagreById(id);
    }

    @PutMapping("/{id}")
    public MilagreModel updateMilagre(@PathVariable Long id, @RequestBody MilagreModel milagreModel) {
        return milagreService.updateMilagre(id, milagreModel);
    }


}
