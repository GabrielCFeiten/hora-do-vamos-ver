package com.cf.milagre.services;

import com.cf.milagre.models.MilagreModel;
import com.cf.milagre.repositories.MilagreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MilagreService {

    private MilagreRepository milagreRepository;

    // GET (TODOS)
    public List<MilagreModel> findAllMilagre() {
        return milagreRepository.findAll();
    }

    // POST

    public MilagreModel createMilagre(MilagreModel milagreModel) {
        return milagreRepository.save(milagreModel);
    }

    // DELETE
    public void deleteMilagreById(Long id) {
        milagreRepository.deleteById(id);
    }

    // UPDATE
    public MilagreModel updateMilagre(MilagreModel milagreModel) {
        MilagreModel newMilagre = milagreRepository.findById(milagreModel.getId()).get();
        newMilagre.setNome(milagreModel.getNome());

        return milagreRepository.save(newMilagre);
    }


}
