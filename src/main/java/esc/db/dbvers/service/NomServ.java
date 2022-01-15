package esc.db.dbvers.service;

import esc.db.dbvers.dto.NomenclatureDto;
import esc.db.dbvers.repository.NomRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NomServ {
    private final NomRepo nomRepo;

    public NomenclatureDto getNom(Long id){

        return new NomenclatureDto(nomRepo.getById(id));
    }
}
