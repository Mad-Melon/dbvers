package esc.db.dbvers.service;

import esc.db.dbvers.dto.NomenclatureCurrentVersionDto;
import esc.db.dbvers.repository.NomRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NomServ {
    private final NomRepo nomRepo;

    public NomenclatureCurrentVersionDto getNom(Long id){

        return new NomenclatureCurrentVersionDto(nomRepo.getById(id));
    }
}
