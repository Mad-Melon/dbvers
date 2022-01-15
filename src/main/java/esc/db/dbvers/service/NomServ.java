package esc.db.dbvers.service;

import esc.db.dbvers.model.Nomenclature;
import esc.db.dbvers.repository.NomRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NomServ {
    private final NomRepo nomRepo;

    public Nomenclature getNom(Long id){

        return nomRepo.getById(id);
    }
}
